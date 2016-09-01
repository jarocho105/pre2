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

import com.bydan.erp.nomina.util.DefiProvisionEmpleadoConstantesFunciones;
import com.bydan.erp.nomina.util.DefiProvisionEmpleadoParameterReturnGeneral;
//import com.bydan.erp.nomina.util.DefiProvisionEmpleadoParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.DefiProvisionEmpleadoBean;
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
public class DefiProvisionEmpleadoBeanSwingJInternalFrame extends DefiProvisionEmpleadoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(DefiProvisionEmpleadoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<DefiProvisionEmpleado> defiprovisionempleadoValidator = new ClassValidator<DefiProvisionEmpleado>(DefiProvisionEmpleado.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public DefiProvisionEmpleado defiprovisionempleado;	
	public DefiProvisionEmpleado defiprovisionempleadoAux;
	public DefiProvisionEmpleado defiprovisionempleadoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public DefiProvisionEmpleado defiprovisionempleadoTotales;
	public Long idDefiProvisionEmpleadoActual;
	public Long iIdNuevoDefiProvisionEmpleado=0L;
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

	public String sFinalQueryComboRubroEmplea="";

	public List<RubroEmplea> rubroempleasForeignKey;

	public List<RubroEmplea> getrubroempleasForeignKey() {
		return rubroempleasForeignKey;
	}

	public void setrubroempleasForeignKey(List<RubroEmplea> rubroempleasForeignKey) {
		this.rubroempleasForeignKey = rubroempleasForeignKey;
	}

	//OBJETO FK ACTUAL
	public RubroEmplea rubroempleaForeignKey;

	public RubroEmplea getrubroempleaForeignKey() {
		return rubroempleaForeignKey;
	}

	public void setrubroempleaForeignKey(RubroEmplea rubroempleaForeignKey) {
		this.rubroempleaForeignKey = rubroempleaForeignKey;
	}

	public String sFinalQueryComboFormato="";

	public List<Formato> formatosForeignKey;

	public List<Formato> getformatosForeignKey() {
		return formatosForeignKey;
	}

	public void setformatosForeignKey(List<Formato> formatosForeignKey) {
		this.formatosForeignKey = formatosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Formato formatoForeignKey;

	public Formato getformatoForeignKey() {
		return formatoForeignKey;
	}

	public void setformatoForeignKey(Formato formatoForeignKey) {
		this.formatoForeignKey = formatoForeignKey;
	}

	public String sFinalQueryComboMesInicial="";

	public List<Mes> mesinicialsForeignKey;

	public List<Mes> getmesinicialsForeignKey() {
		return mesinicialsForeignKey;
	}

	public void setmesinicialsForeignKey(List<Mes> mesinicialsForeignKey) {
		this.mesinicialsForeignKey = mesinicialsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Mes mesinicialForeignKey;

	public Mes getmesinicialForeignKey() {
		return mesinicialForeignKey;
	}

	public void setmesinicialForeignKey(Mes mesinicialForeignKey) {
		this.mesinicialForeignKey = mesinicialForeignKey;
	}

	public String sFinalQueryComboMesFinal="";

	public List<Mes> mesfinalsForeignKey;

	public List<Mes> getmesfinalsForeignKey() {
		return mesfinalsForeignKey;
	}

	public void setmesfinalsForeignKey(List<Mes> mesfinalsForeignKey) {
		this.mesfinalsForeignKey = mesfinalsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Mes mesfinalForeignKey;

	public Mes getmesfinalForeignKey() {
		return mesfinalForeignKey;
	}

	public void setmesfinalForeignKey(Mes mesfinalForeignKey) {
		this.mesfinalForeignKey = mesfinalForeignKey;
	}

		
	
	
	
	
	

	public Boolean isTienePermisosProvisionEmpleado=false;

	public Boolean getIsTienePermisosProvisionEmpleado() {
		return isTienePermisosProvisionEmpleado;
	}

	public void setIsTienePermisosProvisionEmpleado(Boolean isTienePermisosProvisionEmpleado) {
		this.isTienePermisosProvisionEmpleado= isTienePermisosProvisionEmpleado;
	}


	public Boolean isTienePermisosCuota=false;

	public Boolean getIsTienePermisosCuota() {
		return isTienePermisosCuota;
	}

	public void setIsTienePermisosCuota(Boolean isTienePermisosCuota) {
		this.isTienePermisosCuota= isTienePermisosCuota;
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
	
	public Boolean isPermisoTodoDefiProvisionEmpleado;
	public Boolean isPermisoNuevoDefiProvisionEmpleado;
	public Boolean isPermisoActualizarDefiProvisionEmpleado;
	public Boolean isPermisoActualizarOriginalDefiProvisionEmpleado;
	public Boolean isPermisoEliminarDefiProvisionEmpleado;
	public Boolean isPermisoGuardarCambiosDefiProvisionEmpleado;
	public Boolean isPermisoConsultaDefiProvisionEmpleado;
	public Boolean isPermisoBusquedaDefiProvisionEmpleado;
	public Boolean isPermisoReporteDefiProvisionEmpleado;
	public Boolean isPermisoPaginacionMedioDefiProvisionEmpleado;
	public Boolean isPermisoPaginacionAltoDefiProvisionEmpleado;
	public Boolean isPermisoPaginacionTodoDefiProvisionEmpleado;
	public Boolean isPermisoCopiarDefiProvisionEmpleado;
	public Boolean isPermisoVerFormDefiProvisionEmpleado;
	public Boolean isPermisoDuplicarDefiProvisionEmpleado;
	public Boolean isPermisoOrdenDefiProvisionEmpleado;
	
	
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
	
	public DefiProvisionEmpleadoParameterReturnGeneral defiprovisionempleadoReturnGeneral;
	public DefiProvisionEmpleadoParameterReturnGeneral defiprovisionempleadoParameterGeneral;
	
	

	public ProvisionEmpleadoLogic provisionempleadoLogic=null;

	public ProvisionEmpleadoLogic getProvisionEmpleadoLogic() {
		return provisionempleadoLogic;
	}

	public void setProvisionEmpleadoLogic(ProvisionEmpleadoLogic provisionempleadoLogic) {
		this.provisionempleadoLogic = provisionempleadoLogic;
	}


	public CuotaLogic cuotaLogic=null;

	public CuotaLogic getCuotaLogic() {
		return cuotaLogic;
	}

	public void setCuotaLogic(CuotaLogic cuotaLogic) {
		this.cuotaLogic = cuotaLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoDefiProvisionEmpleado=false;
	public Boolean esParaAccionDesdeFormularioDefiProvisionEmpleado=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected DefiProvisionEmpleadoSessionBeanAdditional defiprovisionempleadoSessionBeanAdditional=null;
	
	public DefiProvisionEmpleadoSessionBeanAdditional getDefiProvisionEmpleadoSessionBeanAdditional() {
		return this.defiprovisionempleadoSessionBeanAdditional;
	}
	
	public void setDefiProvisionEmpleadoSessionBeanAdditional(DefiProvisionEmpleadoSessionBeanAdditional defiprovisionempleadoSessionBeanAdditional) {
		try {
			this.defiprovisionempleadoSessionBeanAdditional=defiprovisionempleadoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected DefiProvisionEmpleadoBeanSwingJInternalFrameAdditional defiprovisionempleadoBeanSwingJInternalFrameAdditional=null;
	//public class DefiProvisionEmpleadoBeanSwingJInternalFrame
	
	public DefiProvisionEmpleadoBeanSwingJInternalFrameAdditional getDefiProvisionEmpleadoBeanSwingJInternalFrameAdditional() {
		return this.defiprovisionempleadoBeanSwingJInternalFrameAdditional;
	}
	
	public void setDefiProvisionEmpleadoBeanSwingJInternalFrameAdditional(DefiProvisionEmpleadoBeanSwingJInternalFrameAdditional defiprovisionempleadoBeanSwingJInternalFrameAdditional) {
		try {
			this.defiprovisionempleadoBeanSwingJInternalFrameAdditional=defiprovisionempleadoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public DefiProvisionEmpleadoLogic defiprovisionempleadoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public DefiProvisionEmpleado defiprovisionempleadoBean;
	public DefiProvisionEmpleadoConstantesFunciones defiprovisionempleadoConstantesFunciones;
	//public DefiProvisionEmpleadoParameterReturnGeneral defiprovisionempleadoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public RubroEmpleaLogic rubroempleaLogic;
	public FormatoLogic formatoLogic;
	public MesLogic mesinicialLogic;
	public MesLogic mesfinalLogic;
	
	//PARAMETROS
	
	
	//public List<DefiProvisionEmpleado> defiprovisionempleados;	
	//public List<DefiProvisionEmpleado> defiprovisionempleadosEliminados;
	//public List<DefiProvisionEmpleado> defiprovisionempleadosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoDefiProvisionEmpleado=false;
	public Boolean isVisibilidadCeldaDuplicarDefiProvisionEmpleado=true;
	public Boolean isVisibilidadCeldaCopiarDefiProvisionEmpleado=true;
	public Boolean isVisibilidadCeldaVerFormDefiProvisionEmpleado=true;
	public Boolean isVisibilidadCeldaOrdenDefiProvisionEmpleado=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesDefiProvisionEmpleado=false;
	public Boolean isVisibilidadCeldaModificarDefiProvisionEmpleado=false;
	public Boolean isVisibilidadCeldaActualizarDefiProvisionEmpleado=false;
	public Boolean isVisibilidadCeldaEliminarDefiProvisionEmpleado=false;
	public Boolean isVisibilidadCeldaCancelarDefiProvisionEmpleado=false;
	public Boolean isVisibilidadCeldaGuardarDefiProvisionEmpleado=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosDefiProvisionEmpleado=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdFormato=false;
	public Boolean isVisibilidadFK_IdMesFinal=false;
	public Boolean isVisibilidadFK_IdMesInicial=false;
	public Boolean isVisibilidadFK_IdRubroEmplea=false;
	
	public Long getiIdNuevoDefiProvisionEmpleado() {
		return this.iIdNuevoDefiProvisionEmpleado;
	}

	public void setiIdNuevoDefiProvisionEmpleado(Long iIdNuevoDefiProvisionEmpleado) {
		this.iIdNuevoDefiProvisionEmpleado = iIdNuevoDefiProvisionEmpleado;
	}
	
	public Long getidDefiProvisionEmpleadoActual() {
		return this.idDefiProvisionEmpleadoActual;
	}

	public void setidDefiProvisionEmpleadoActual(Long idDefiProvisionEmpleadoActual) {
		this.idDefiProvisionEmpleadoActual = idDefiProvisionEmpleadoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public DefiProvisionEmpleado getdefiprovisionempleado() {
		return this.defiprovisionempleado;
	}

	public void setdefiprovisionempleado(DefiProvisionEmpleado defiprovisionempleado) {
		this.defiprovisionempleado = defiprovisionempleado;
	}
	
	public DefiProvisionEmpleado getdefiprovisionempleadoAux() {
		return this.defiprovisionempleadoAux;
	}

	public void setdefiprovisionempleadoAux(DefiProvisionEmpleado defiprovisionempleadoAux) {
		this.defiprovisionempleadoAux = defiprovisionempleadoAux;
	}				
	
	public DefiProvisionEmpleado getdefiprovisionempleadoAnterior() {
		return this.defiprovisionempleadoAnterior;
	}

	public void setdefiprovisionempleadoAnterior(DefiProvisionEmpleado defiprovisionempleadoAnterior) {
		this.defiprovisionempleadoAnterior = defiprovisionempleadoAnterior;
	}	
	
	public DefiProvisionEmpleado getdefiprovisionempleadoTotales() {
		return this.defiprovisionempleadoTotales;
	}

	public void setdefiprovisionempleadoTotales(DefiProvisionEmpleado defiprovisionempleadoTotales) {
		this.defiprovisionempleadoTotales = defiprovisionempleadoTotales;
	}	
	
	public DefiProvisionEmpleado getdefiprovisionempleadoBean() {
		return this.defiprovisionempleadoBean;
	}

	public void setdefiprovisionempleadoBean(DefiProvisionEmpleado defiprovisionempleadoBean) {
		this.defiprovisionempleadoBean = defiprovisionempleadoBean;
	}	
	
	public DefiProvisionEmpleadoParameterReturnGeneral getdefiprovisionempleadoReturnGeneral() {
		return this.defiprovisionempleadoReturnGeneral;
	}

	public void setdefiprovisionempleadoReturnGeneral(DefiProvisionEmpleadoParameterReturnGeneral defiprovisionempleadoReturnGeneral) {
		this.defiprovisionempleadoReturnGeneral = defiprovisionempleadoReturnGeneral;
	}	
	
	
	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_formatoFK_IdFormato=-1L;

	public Long getid_formatoFK_IdFormato() {
		return this.id_formatoFK_IdFormato;
	}

	public void setid_formatoFK_IdFormato(Long id_formatoFK_IdFormato) {
		this.id_formatoFK_IdFormato = id_formatoFK_IdFormato;
	}

	public Long id_mes_finalFK_IdMesFinal=-1L;

	public Long getid_mes_finalFK_IdMesFinal() {
		return this.id_mes_finalFK_IdMesFinal;
	}

	public void setid_mes_finalFK_IdMesFinal(Long id_mes_finalFK_IdMesFinal) {
		this.id_mes_finalFK_IdMesFinal = id_mes_finalFK_IdMesFinal;
	}

	public Long id_mes_inicialFK_IdMesInicial=-1L;

	public Long getid_mes_inicialFK_IdMesInicial() {
		return this.id_mes_inicialFK_IdMesInicial;
	}

	public void setid_mes_inicialFK_IdMesInicial(Long id_mes_inicialFK_IdMesInicial) {
		this.id_mes_inicialFK_IdMesInicial = id_mes_inicialFK_IdMesInicial;
	}

	public Long id_rubro_empleaFK_IdRubroEmplea=-1L;

	public Long getid_rubro_empleaFK_IdRubroEmplea() {
		return this.id_rubro_empleaFK_IdRubroEmplea;
	}

	public void setid_rubro_empleaFK_IdRubroEmplea(Long id_rubro_empleaFK_IdRubroEmplea) {
		this.id_rubro_empleaFK_IdRubroEmplea = id_rubro_empleaFK_IdRubroEmplea;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public DefiProvisionEmpleadoLogic getDefiProvisionEmpleadoLogic()	{		
		return defiprovisionempleadoLogic;
	}

	public void setDefiProvisionEmpleadoLogic(DefiProvisionEmpleadoLogic defiprovisionempleadoLogic) {
		this.defiprovisionempleadoLogic = defiprovisionempleadoLogic;
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
	
	public Boolean getIsEsNuevoDefiProvisionEmpleado() {
		return isEsNuevoDefiProvisionEmpleado;
	}

	public void setIsEsNuevoDefiProvisionEmpleado(Boolean isEsNuevoDefiProvisionEmpleado) {
		this.isEsNuevoDefiProvisionEmpleado = isEsNuevoDefiProvisionEmpleado;
	}

	public Boolean getEsParaAccionDesdeFormularioDefiProvisionEmpleado() {
		return esParaAccionDesdeFormularioDefiProvisionEmpleado;
	}
	
	public void setEsParaAccionDesdeFormularioDefiProvisionEmpleado(Boolean esParaAccionDesdeFormularioDefiProvisionEmpleado) {
		this.esParaAccionDesdeFormularioDefiProvisionEmpleado = esParaAccionDesdeFormularioDefiProvisionEmpleado;
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

			if(this.defiprovisionempleadoSessionBean==null) {
				this.defiprovisionempleadoSessionBean=new DefiProvisionEmpleadoSessionBean();
			}

			if(!this.defiprovisionempleadoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(defiprovisionempleadoSessionBean.getlidEmpresaActual());
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

	public void cargarCombosRubroEmpleasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.rubroempleasForeignKey=new ArrayList<RubroEmplea>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			RubroEmpleaLogic rubroempleaLogic=new RubroEmpleaLogic();

			//rubroempleaLogic.getRubroEmpleaDataAccess().setIsForForeingKeyData(true);

			if(this.defiprovisionempleadoSessionBean==null) {
				this.defiprovisionempleadoSessionBean=new DefiProvisionEmpleadoSessionBean();
			}

			if(!this.defiprovisionempleadoSessionBean.getisBusquedaDesdeForeignKeySesionRubroEmplea()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//rubroempleaLogic.getRubroEmpleaDataAccess().setIsForForeingKeyData(true);

					rubroempleaLogic.getTodosRubroEmpleasWithConnection(sFinalQuery,new Pagination());

					this.rubroempleasForeignKey=rubroempleaLogic.getRubroEmpleas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaRubroEmplea(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					rubroempleaLogic.getEntityWithConnection(defiprovisionempleadoSessionBean.getlidRubroEmpleaActual());
					this.rubroempleasForeignKey.add(rubroempleaLogic.getRubroEmplea());
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

	public void cargarCombosFormatosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.formatosForeignKey=new ArrayList<Formato>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			FormatoLogic formatoLogic=new FormatoLogic();

			//formatoLogic.getFormatoDataAccess().setIsForForeingKeyData(true);

			if(this.defiprovisionempleadoSessionBean==null) {
				this.defiprovisionempleadoSessionBean=new DefiProvisionEmpleadoSessionBean();
			}

			if(!this.defiprovisionempleadoSessionBean.getisBusquedaDesdeForeignKeySesionFormato()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//formatoLogic.getFormatoDataAccess().setIsForForeingKeyData(true);

					formatoLogic.getTodosFormatosWithConnection(sFinalQuery,new Pagination());

					this.formatosForeignKey=formatoLogic.getFormatos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaFormato(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					formatoLogic.getEntityWithConnection(defiprovisionempleadoSessionBean.getlidFormatoActual());
					this.formatosForeignKey.add(formatoLogic.getFormato());
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

	public void cargarCombosMesInicialsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.mesinicialsForeignKey=new ArrayList<Mes>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			MesLogic mesLogic=new MesLogic();

			//mesLogic.getMesDataAccess().setIsForForeingKeyData(true);

			if(this.defiprovisionempleadoSessionBean==null) {
				this.defiprovisionempleadoSessionBean=new DefiProvisionEmpleadoSessionBean();
			}

			if(!this.defiprovisionempleadoSessionBean.getisBusquedaDesdeForeignKeySesionMesInicial()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//mesinicialLogic.getMesDataAccess().setIsForForeingKeyData(true);

					mesLogic.getTodosMessWithConnection(sFinalQuery,new Pagination());

					this.mesinicialsForeignKey=mesLogic.getMess();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaMesInicial(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					mesLogic.getEntityWithConnection(defiprovisionempleadoSessionBean.getlidMesInicialActual());
					this.mesinicialsForeignKey.add(mesLogic.getMes());
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

	public void cargarCombosMesFinalsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.mesfinalsForeignKey=new ArrayList<Mes>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			MesLogic mesLogic=new MesLogic();

			//mesLogic.getMesDataAccess().setIsForForeingKeyData(true);

			if(this.defiprovisionempleadoSessionBean==null) {
				this.defiprovisionempleadoSessionBean=new DefiProvisionEmpleadoSessionBean();
			}

			if(!this.defiprovisionempleadoSessionBean.getisBusquedaDesdeForeignKeySesionMesFinal()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//mesfinalLogic.getMesDataAccess().setIsForForeingKeyData(true);

					mesLogic.getTodosMessWithConnection(sFinalQuery,new Pagination());

					this.mesfinalsForeignKey=mesLogic.getMess();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaMesFinal(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					mesLogic.getEntityWithConnection(defiprovisionempleadoSessionBean.getlidMesFinalActual());
					this.mesfinalsForeignKey.add(mesLogic.getMes());
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

					if(this.defiprovisionempleado!=null) {
						this.defiprovisionempleado.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormDefiProvisionEmpleado!=null) {
						this.jInternalFrameDetalleFormDefiProvisionEmpleado.jComboBoxid_empresaDefiProvisionEmpleado.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaDefiProvisionEmpleado.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormDefiProvisionEmpleado!=null) {
						if(this.jInternalFrameDetalleFormDefiProvisionEmpleado.jComboBoxid_empresaDefiProvisionEmpleado.getItemCount()>0) {
							this.jInternalFrameDetalleFormDefiProvisionEmpleado.jComboBoxid_empresaDefiProvisionEmpleado.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaDefiProvisionEmpleadoGenerico)throws Exception
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
				jComboBoxid_empresaDefiProvisionEmpleadoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaDefiProvisionEmpleadoGenerico!=null && jComboBoxid_empresaDefiProvisionEmpleadoGenerico.getItemCount()>0) {
					jComboBoxid_empresaDefiProvisionEmpleadoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualRubroEmpleaForeignKey(Long idRubroEmpleaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			RubroEmplea  rubroempleaTemp=null;

			for(RubroEmplea rubroempleaAux:rubroempleasForeignKey) {
				if(rubroempleaAux.getId()!=null && rubroempleaAux.getId().equals(idRubroEmpleaSeleccionado)) {
					rubroempleaTemp=rubroempleaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(rubroempleaTemp!=null) {

					if(this.defiprovisionempleado!=null) {
						this.defiprovisionempleado.setRubroEmplea(rubroempleaTemp);
					}

					if(this.jInternalFrameDetalleFormDefiProvisionEmpleado!=null) {
						this.jInternalFrameDetalleFormDefiProvisionEmpleado.jComboBoxid_rubro_empleaDefiProvisionEmpleado.setSelectedItem(rubroempleaTemp);
					}
				} else {
					//jComboBoxid_rubro_empleaDefiProvisionEmpleado.setSelectedItem(rubroempleaTemp);
					if(this.jInternalFrameDetalleFormDefiProvisionEmpleado!=null) {
						if(this.jInternalFrameDetalleFormDefiProvisionEmpleado.jComboBoxid_rubro_empleaDefiProvisionEmpleado.getItemCount()>0) {
							this.jInternalFrameDetalleFormDefiProvisionEmpleado.jComboBoxid_rubro_empleaDefiProvisionEmpleado.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdRubroEmplea") || sFormularioTipoBusqueda.equals("Todos")){
					if(rubroempleaTemp!=null && jComboBoxid_rubro_empleaFK_IdRubroEmpleaDefiProvisionEmpleado!=null) {
						jComboBoxid_rubro_empleaFK_IdRubroEmpleaDefiProvisionEmpleado.setSelectedItem(rubroempleaTemp);
					} else {
						if(jComboBoxid_rubro_empleaFK_IdRubroEmpleaDefiProvisionEmpleado!=null) {
							//jComboBoxid_rubro_empleaFK_IdRubroEmpleaDefiProvisionEmpleado.setSelectedItem(rubroempleaTemp);
							if(jComboBoxid_rubro_empleaFK_IdRubroEmpleaDefiProvisionEmpleado.getItemCount()>0) {
								jComboBoxid_rubro_empleaFK_IdRubroEmpleaDefiProvisionEmpleado.setSelectedIndex(0);
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

	public String getActualRubroEmpleaForeignKeyDescripcion(Long idRubroEmpleaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			RubroEmplea  rubroempleaTemp=null;

			for(RubroEmplea rubroempleaAux:rubroempleasForeignKey) {
				if(rubroempleaAux.getId()!=null && rubroempleaAux.getId().equals(idRubroEmpleaSeleccionado)) {
					rubroempleaTemp=rubroempleaAux;
					break;
				}
			}


			sDescripcion=RubroEmpleaConstantesFunciones.getRubroEmpleaDescripcion(rubroempleaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualRubroEmpleaForeignKeyGenerico(Long idRubroEmpleaSeleccionado,JComboBox jComboBoxid_rubro_empleaDefiProvisionEmpleadoGenerico)throws Exception
	{
		try
		{
			RubroEmplea  rubroempleaTemp=null;

			for(RubroEmplea rubroempleaAux:rubroempleasForeignKey) {
				if(rubroempleaAux.getId()!=null && rubroempleaAux.getId().equals(idRubroEmpleaSeleccionado)) {
					rubroempleaTemp=rubroempleaAux;
					break;
				}
			}

			if(rubroempleaTemp!=null) {
				jComboBoxid_rubro_empleaDefiProvisionEmpleadoGenerico.setSelectedItem(rubroempleaTemp);
			} else {
				if(jComboBoxid_rubro_empleaDefiProvisionEmpleadoGenerico!=null && jComboBoxid_rubro_empleaDefiProvisionEmpleadoGenerico.getItemCount()>0) {
					jComboBoxid_rubro_empleaDefiProvisionEmpleadoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualFormatoForeignKey(Long idFormatoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Formato  formatoTemp=null;

			for(Formato formatoAux:formatosForeignKey) {
				if(formatoAux.getId()!=null && formatoAux.getId().equals(idFormatoSeleccionado)) {
					formatoTemp=formatoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(formatoTemp!=null) {

					if(this.defiprovisionempleado!=null) {
						this.defiprovisionempleado.setFormato(formatoTemp);
					}

					if(this.jInternalFrameDetalleFormDefiProvisionEmpleado!=null) {
						this.jInternalFrameDetalleFormDefiProvisionEmpleado.jComboBoxid_formatoDefiProvisionEmpleado.setSelectedItem(formatoTemp);
					}
				} else {
					//jComboBoxid_formatoDefiProvisionEmpleado.setSelectedItem(formatoTemp);
					if(this.jInternalFrameDetalleFormDefiProvisionEmpleado!=null) {
						if(this.jInternalFrameDetalleFormDefiProvisionEmpleado.jComboBoxid_formatoDefiProvisionEmpleado.getItemCount()>0) {
							this.jInternalFrameDetalleFormDefiProvisionEmpleado.jComboBoxid_formatoDefiProvisionEmpleado.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdFormato") || sFormularioTipoBusqueda.equals("Todos")){
					if(formatoTemp!=null && jComboBoxid_formatoFK_IdFormatoDefiProvisionEmpleado!=null) {
						jComboBoxid_formatoFK_IdFormatoDefiProvisionEmpleado.setSelectedItem(formatoTemp);
					} else {
						if(jComboBoxid_formatoFK_IdFormatoDefiProvisionEmpleado!=null) {
							//jComboBoxid_formatoFK_IdFormatoDefiProvisionEmpleado.setSelectedItem(formatoTemp);
							if(jComboBoxid_formatoFK_IdFormatoDefiProvisionEmpleado.getItemCount()>0) {
								jComboBoxid_formatoFK_IdFormatoDefiProvisionEmpleado.setSelectedIndex(0);
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

	public String getActualFormatoForeignKeyDescripcion(Long idFormatoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Formato  formatoTemp=null;

			for(Formato formatoAux:formatosForeignKey) {
				if(formatoAux.getId()!=null && formatoAux.getId().equals(idFormatoSeleccionado)) {
					formatoTemp=formatoAux;
					break;
				}
			}


			sDescripcion=FormatoConstantesFunciones.getFormatoDescripcion(formatoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualFormatoForeignKeyGenerico(Long idFormatoSeleccionado,JComboBox jComboBoxid_formatoDefiProvisionEmpleadoGenerico)throws Exception
	{
		try
		{
			Formato  formatoTemp=null;

			for(Formato formatoAux:formatosForeignKey) {
				if(formatoAux.getId()!=null && formatoAux.getId().equals(idFormatoSeleccionado)) {
					formatoTemp=formatoAux;
					break;
				}
			}

			if(formatoTemp!=null) {
				jComboBoxid_formatoDefiProvisionEmpleadoGenerico.setSelectedItem(formatoTemp);
			} else {
				if(jComboBoxid_formatoDefiProvisionEmpleadoGenerico!=null && jComboBoxid_formatoDefiProvisionEmpleadoGenerico.getItemCount()>0) {
					jComboBoxid_formatoDefiProvisionEmpleadoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualMesInicialForeignKey(Long idMesInicialSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Mes  mesinicialTemp=null;

			for(Mes mesinicialAux:mesinicialsForeignKey) {
				if(mesinicialAux.getId()!=null && mesinicialAux.getId().equals(idMesInicialSeleccionado)) {
					mesinicialTemp=mesinicialAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(mesinicialTemp!=null) {

					if(this.defiprovisionempleado!=null) {
						this.defiprovisionempleado.setMesInicial(mesinicialTemp);
					}

					if(this.jInternalFrameDetalleFormDefiProvisionEmpleado!=null) {
						this.jInternalFrameDetalleFormDefiProvisionEmpleado.jComboBoxid_mes_inicialDefiProvisionEmpleado.setSelectedItem(mesinicialTemp);
					}
				} else {
					//jComboBoxid_mes_inicialDefiProvisionEmpleado.setSelectedItem(mesinicialTemp);
					if(this.jInternalFrameDetalleFormDefiProvisionEmpleado!=null) {
						if(this.jInternalFrameDetalleFormDefiProvisionEmpleado.jComboBoxid_mes_inicialDefiProvisionEmpleado.getItemCount()>0) {
							this.jInternalFrameDetalleFormDefiProvisionEmpleado.jComboBoxid_mes_inicialDefiProvisionEmpleado.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdMesInicial") || sFormularioTipoBusqueda.equals("Todos")){
					if(mesinicialTemp!=null && jComboBoxid_mes_inicialFK_IdMesInicialDefiProvisionEmpleado!=null) {
						jComboBoxid_mes_inicialFK_IdMesInicialDefiProvisionEmpleado.setSelectedItem(mesinicialTemp);
					} else {
						if(jComboBoxid_mes_inicialFK_IdMesInicialDefiProvisionEmpleado!=null) {
							//jComboBoxid_mes_inicialFK_IdMesInicialDefiProvisionEmpleado.setSelectedItem(mesinicialTemp);
							if(jComboBoxid_mes_inicialFK_IdMesInicialDefiProvisionEmpleado.getItemCount()>0) {
								jComboBoxid_mes_inicialFK_IdMesInicialDefiProvisionEmpleado.setSelectedIndex(0);
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

	public String getActualMesInicialForeignKeyDescripcion(Long idMesInicialSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Mes  mesinicialTemp=null;

			for(Mes mesinicialAux:mesinicialsForeignKey) {
				if(mesinicialAux.getId()!=null && mesinicialAux.getId().equals(idMesInicialSeleccionado)) {
					mesinicialTemp=mesinicialAux;
					break;
				}
			}


			sDescripcion=MesConstantesFunciones.getMesDescripcion(mesinicialTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualMesInicialForeignKeyGenerico(Long idMesInicialSeleccionado,JComboBox jComboBoxid_mes_inicialDefiProvisionEmpleadoGenerico)throws Exception
	{
		try
		{
			Mes  mesinicialTemp=null;

			for(Mes mesinicialAux:mesinicialsForeignKey) {
				if(mesinicialAux.getId()!=null && mesinicialAux.getId().equals(idMesInicialSeleccionado)) {
					mesinicialTemp=mesinicialAux;
					break;
				}
			}

			if(mesinicialTemp!=null) {
				jComboBoxid_mes_inicialDefiProvisionEmpleadoGenerico.setSelectedItem(mesinicialTemp);
			} else {
				if(jComboBoxid_mes_inicialDefiProvisionEmpleadoGenerico!=null && jComboBoxid_mes_inicialDefiProvisionEmpleadoGenerico.getItemCount()>0) {
					jComboBoxid_mes_inicialDefiProvisionEmpleadoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualMesFinalForeignKey(Long idMesFinalSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Mes  mesfinalTemp=null;

			for(Mes mesfinalAux:mesfinalsForeignKey) {
				if(mesfinalAux.getId()!=null && mesfinalAux.getId().equals(idMesFinalSeleccionado)) {
					mesfinalTemp=mesfinalAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(mesfinalTemp!=null) {

					if(this.defiprovisionempleado!=null) {
						this.defiprovisionempleado.setMesFinal(mesfinalTemp);
					}

					if(this.jInternalFrameDetalleFormDefiProvisionEmpleado!=null) {
						this.jInternalFrameDetalleFormDefiProvisionEmpleado.jComboBoxid_mes_finalDefiProvisionEmpleado.setSelectedItem(mesfinalTemp);
					}
				} else {
					//jComboBoxid_mes_finalDefiProvisionEmpleado.setSelectedItem(mesfinalTemp);
					if(this.jInternalFrameDetalleFormDefiProvisionEmpleado!=null) {
						if(this.jInternalFrameDetalleFormDefiProvisionEmpleado.jComboBoxid_mes_finalDefiProvisionEmpleado.getItemCount()>0) {
							this.jInternalFrameDetalleFormDefiProvisionEmpleado.jComboBoxid_mes_finalDefiProvisionEmpleado.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdMesFinal") || sFormularioTipoBusqueda.equals("Todos")){
					if(mesfinalTemp!=null && jComboBoxid_mes_finalFK_IdMesFinalDefiProvisionEmpleado!=null) {
						jComboBoxid_mes_finalFK_IdMesFinalDefiProvisionEmpleado.setSelectedItem(mesfinalTemp);
					} else {
						if(jComboBoxid_mes_finalFK_IdMesFinalDefiProvisionEmpleado!=null) {
							//jComboBoxid_mes_finalFK_IdMesFinalDefiProvisionEmpleado.setSelectedItem(mesfinalTemp);
							if(jComboBoxid_mes_finalFK_IdMesFinalDefiProvisionEmpleado.getItemCount()>0) {
								jComboBoxid_mes_finalFK_IdMesFinalDefiProvisionEmpleado.setSelectedIndex(0);
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

	public String getActualMesFinalForeignKeyDescripcion(Long idMesFinalSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Mes  mesfinalTemp=null;

			for(Mes mesfinalAux:mesfinalsForeignKey) {
				if(mesfinalAux.getId()!=null && mesfinalAux.getId().equals(idMesFinalSeleccionado)) {
					mesfinalTemp=mesfinalAux;
					break;
				}
			}


			sDescripcion=MesConstantesFunciones.getMesDescripcion(mesfinalTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualMesFinalForeignKeyGenerico(Long idMesFinalSeleccionado,JComboBox jComboBoxid_mes_finalDefiProvisionEmpleadoGenerico)throws Exception
	{
		try
		{
			Mes  mesfinalTemp=null;

			for(Mes mesfinalAux:mesfinalsForeignKey) {
				if(mesfinalAux.getId()!=null && mesfinalAux.getId().equals(idMesFinalSeleccionado)) {
					mesfinalTemp=mesfinalAux;
					break;
				}
			}

			if(mesfinalTemp!=null) {
				jComboBoxid_mes_finalDefiProvisionEmpleadoGenerico.setSelectedItem(mesfinalTemp);
			} else {
				if(jComboBoxid_mes_finalDefiProvisionEmpleadoGenerico!=null && jComboBoxid_mes_finalDefiProvisionEmpleadoGenerico.getItemCount()>0) {
					jComboBoxid_mes_finalDefiProvisionEmpleadoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(DefiProvisionEmpleado defiprovisionempleado,JComboBox jComboBoxid_empresaDefiProvisionEmpleadoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaDefiProvisionEmpleadoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormDefiProvisionEmpleado.jComboBoxid_empresaDefiProvisionEmpleado.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaDefiProvisionEmpleadoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				defiprovisionempleado.setid_empresa(empresaAux.getId());
				defiprovisionempleado.setempresa_descripcion(DefiProvisionEmpleadoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				defiprovisionempleado.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarRubroEmpleaForeignKey(DefiProvisionEmpleado defiprovisionempleado,JComboBox jComboBoxid_rubro_empleaDefiProvisionEmpleadoGenerico)throws Exception
	{
		try
		{
			RubroEmplea  rubroempleaAux=new RubroEmplea();

			if(jComboBoxid_rubro_empleaDefiProvisionEmpleadoGenerico==null) {
				rubroempleaAux=(RubroEmplea)this.jInternalFrameDetalleFormDefiProvisionEmpleado.jComboBoxid_rubro_empleaDefiProvisionEmpleado.getSelectedItem();
			} else {
				rubroempleaAux=(RubroEmplea)jComboBoxid_rubro_empleaDefiProvisionEmpleadoGenerico.getSelectedItem();
			}

			if(rubroempleaAux!=null && rubroempleaAux.getId()!=null) {
				defiprovisionempleado.setid_rubro_emplea(rubroempleaAux.getId());
				defiprovisionempleado.setrubroemplea_descripcion(DefiProvisionEmpleadoConstantesFunciones.getRubroEmpleaDescripcion(rubroempleaAux));
				defiprovisionempleado.setRubroEmplea(rubroempleaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarFormatoForeignKey(DefiProvisionEmpleado defiprovisionempleado,JComboBox jComboBoxid_formatoDefiProvisionEmpleadoGenerico)throws Exception
	{
		try
		{
			Formato  formatoAux=new Formato();

			if(jComboBoxid_formatoDefiProvisionEmpleadoGenerico==null) {
				formatoAux=(Formato)this.jInternalFrameDetalleFormDefiProvisionEmpleado.jComboBoxid_formatoDefiProvisionEmpleado.getSelectedItem();
			} else {
				formatoAux=(Formato)jComboBoxid_formatoDefiProvisionEmpleadoGenerico.getSelectedItem();
			}

			if(formatoAux!=null && formatoAux.getId()!=null) {
				defiprovisionempleado.setid_formato(formatoAux.getId());
				defiprovisionempleado.setformato_descripcion(DefiProvisionEmpleadoConstantesFunciones.getFormatoDescripcion(formatoAux));
				defiprovisionempleado.setFormato(formatoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarMesInicialForeignKey(DefiProvisionEmpleado defiprovisionempleado,JComboBox jComboBoxid_mes_inicialDefiProvisionEmpleadoGenerico)throws Exception
	{
		try
		{
			Mes  mesAux=new Mes();

			if(jComboBoxid_mes_inicialDefiProvisionEmpleadoGenerico==null) {
				mesAux=(Mes)this.jInternalFrameDetalleFormDefiProvisionEmpleado.jComboBoxid_mes_inicialDefiProvisionEmpleado.getSelectedItem();
			} else {
				mesAux=(Mes)jComboBoxid_mes_inicialDefiProvisionEmpleadoGenerico.getSelectedItem();
			}

			if(mesAux!=null && mesAux.getId()!=null) {
				defiprovisionempleado.setid_mes_inicial(mesAux.getId());
				defiprovisionempleado.setmesinicial_descripcion(DefiProvisionEmpleadoConstantesFunciones.getMesInicialDescripcion(mesAux));
				defiprovisionempleado.setMesInicial(mesAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarMesFinalForeignKey(DefiProvisionEmpleado defiprovisionempleado,JComboBox jComboBoxid_mes_finalDefiProvisionEmpleadoGenerico)throws Exception
	{
		try
		{
			Mes  mesAux=new Mes();

			if(jComboBoxid_mes_finalDefiProvisionEmpleadoGenerico==null) {
				mesAux=(Mes)this.jInternalFrameDetalleFormDefiProvisionEmpleado.jComboBoxid_mes_finalDefiProvisionEmpleado.getSelectedItem();
			} else {
				mesAux=(Mes)jComboBoxid_mes_finalDefiProvisionEmpleadoGenerico.getSelectedItem();
			}

			if(mesAux!=null && mesAux.getId()!=null) {
				defiprovisionempleado.setid_mes_final(mesAux.getId());
				defiprovisionempleado.setmesfinal_descripcion(DefiProvisionEmpleadoConstantesFunciones.getMesFinalDescripcion(mesAux));
				defiprovisionempleado.setMesFinal(mesAux);			}
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

					if(!DefiProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDefiProvisionEmpleado!=null) { 
							this.jInternalFrameDetalleFormDefiProvisionEmpleado.jComboBoxid_empresaDefiProvisionEmpleado.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormDefiProvisionEmpleado.jComboBoxid_empresaDefiProvisionEmpleado.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDefiProvisionEmpleado!=null) { 
					}

					if(!DefiProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameRubroEmpleasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingRubroEmplea=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DefiProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDefiProvisionEmpleado!=null) { 
							this.jInternalFrameDetalleFormDefiProvisionEmpleado.jComboBoxid_rubro_empleaDefiProvisionEmpleado.removeAllItems();

							for(RubroEmplea rubroemplea:this.rubroempleasForeignKey) {
								this.jInternalFrameDetalleFormDefiProvisionEmpleado.jComboBoxid_rubro_empleaDefiProvisionEmpleado.addItem(rubroemplea);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDefiProvisionEmpleado!=null) { 
					}

					if(!DefiProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdRubroEmplea") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DefiProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_rubro_empleaFK_IdRubroEmpleaDefiProvisionEmpleado.removeAllItems();

							for(RubroEmplea rubroemplea:this.rubroempleasForeignKey) {
								this.jComboBoxid_rubro_empleaFK_IdRubroEmpleaDefiProvisionEmpleado.addItem(rubroemplea);
							}
						}

						if(!DefiProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameFormatosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingFormato=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DefiProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDefiProvisionEmpleado!=null) { 
							this.jInternalFrameDetalleFormDefiProvisionEmpleado.jComboBoxid_formatoDefiProvisionEmpleado.removeAllItems();

							for(Formato formato:this.formatosForeignKey) {
								this.jInternalFrameDetalleFormDefiProvisionEmpleado.jComboBoxid_formatoDefiProvisionEmpleado.addItem(formato);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDefiProvisionEmpleado!=null) { 
					}

					if(!DefiProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdFormato") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DefiProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_formatoFK_IdFormatoDefiProvisionEmpleado.removeAllItems();

							for(Formato formato:this.formatosForeignKey) {
								this.jComboBoxid_formatoFK_IdFormatoDefiProvisionEmpleado.addItem(formato);
							}
						}

						if(!DefiProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameMesInicialsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingMes=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DefiProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDefiProvisionEmpleado!=null) { 
							this.jInternalFrameDetalleFormDefiProvisionEmpleado.jComboBoxid_mes_inicialDefiProvisionEmpleado.removeAllItems();

							for(Mes mesinicial:this.mesinicialsForeignKey) {
								this.jInternalFrameDetalleFormDefiProvisionEmpleado.jComboBoxid_mes_inicialDefiProvisionEmpleado.addItem(mesinicial);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDefiProvisionEmpleado!=null) { 
					}

					if(!DefiProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdMesInicial") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DefiProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_mes_inicialFK_IdMesInicialDefiProvisionEmpleado.removeAllItems();

							for(Mes mesinicial:this.mesinicialsForeignKey) {
								this.jComboBoxid_mes_inicialFK_IdMesInicialDefiProvisionEmpleado.addItem(mesinicial);
							}
						}

						if(!DefiProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameMesFinalsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingMes=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DefiProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDefiProvisionEmpleado!=null) { 
							this.jInternalFrameDetalleFormDefiProvisionEmpleado.jComboBoxid_mes_finalDefiProvisionEmpleado.removeAllItems();

							for(Mes mesfinal:this.mesfinalsForeignKey) {
								this.jInternalFrameDetalleFormDefiProvisionEmpleado.jComboBoxid_mes_finalDefiProvisionEmpleado.addItem(mesfinal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDefiProvisionEmpleado!=null) { 
					}

					if(!DefiProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdMesFinal") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DefiProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_mes_finalFK_IdMesFinalDefiProvisionEmpleado.removeAllItems();

							for(Mes mesfinal:this.mesfinalsForeignKey) {
								this.jComboBoxid_mes_finalFK_IdMesFinalDefiProvisionEmpleado.addItem(mesfinal);
							}
						}

						if(!DefiProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormDefiProvisionEmpleado!=null) {
							this.jInternalFrameDetalleFormDefiProvisionEmpleado.jComboBoxid_empresaDefiProvisionEmpleado.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormDefiProvisionEmpleado!=null) {
							this.jInternalFrameDetalleFormDefiProvisionEmpleado.jComboBoxid_empresaDefiProvisionEmpleado.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameRubroEmpleaForeignKey(RubroEmplea rubroemplea,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDefiProvisionEmpleado!=null) {
							this.jInternalFrameDetalleFormDefiProvisionEmpleado.jComboBoxid_rubro_empleaDefiProvisionEmpleado.setSelectedItem(rubroemplea);
						}
					} else {
						if(this.jInternalFrameDetalleFormDefiProvisionEmpleado!=null) {
							this.jInternalFrameDetalleFormDefiProvisionEmpleado.jComboBoxid_rubro_empleaDefiProvisionEmpleado.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_rubro_empleaFK_IdRubroEmpleaDefiProvisionEmpleado.setSelectedItem(rubroemplea);
						} else {
							this.jComboBoxid_rubro_empleaFK_IdRubroEmpleaDefiProvisionEmpleado.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameFormatoForeignKey(Formato formato,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDefiProvisionEmpleado!=null) {
							this.jInternalFrameDetalleFormDefiProvisionEmpleado.jComboBoxid_formatoDefiProvisionEmpleado.setSelectedItem(formato);
						}
					} else {
						if(this.jInternalFrameDetalleFormDefiProvisionEmpleado!=null) {
							this.jInternalFrameDetalleFormDefiProvisionEmpleado.jComboBoxid_formatoDefiProvisionEmpleado.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_formatoFK_IdFormatoDefiProvisionEmpleado.setSelectedItem(formato);
						} else {
							this.jComboBoxid_formatoFK_IdFormatoDefiProvisionEmpleado.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameMesInicialForeignKey(Mes mesinicial,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDefiProvisionEmpleado!=null) {
							this.jInternalFrameDetalleFormDefiProvisionEmpleado.jComboBoxid_mes_inicialDefiProvisionEmpleado.setSelectedItem(mesinicial);
						}
					} else {
						if(this.jInternalFrameDetalleFormDefiProvisionEmpleado!=null) {
							this.jInternalFrameDetalleFormDefiProvisionEmpleado.jComboBoxid_mes_inicialDefiProvisionEmpleado.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_mes_inicialFK_IdMesInicialDefiProvisionEmpleado.setSelectedItem(mesinicial);
						} else {
							this.jComboBoxid_mes_inicialFK_IdMesInicialDefiProvisionEmpleado.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameMesFinalForeignKey(Mes mesfinal,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDefiProvisionEmpleado!=null) {
							this.jInternalFrameDetalleFormDefiProvisionEmpleado.jComboBoxid_mes_finalDefiProvisionEmpleado.setSelectedItem(mesfinal);
						}
					} else {
						if(this.jInternalFrameDetalleFormDefiProvisionEmpleado!=null) {
							this.jInternalFrameDetalleFormDefiProvisionEmpleado.jComboBoxid_mes_finalDefiProvisionEmpleado.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_mes_finalFK_IdMesFinalDefiProvisionEmpleado.setSelectedItem(mesfinal);
						} else {
							this.jComboBoxid_mes_finalFK_IdMesFinalDefiProvisionEmpleado.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesDefiProvisionEmpleado() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			DefiProvisionEmpleadoConstantesFunciones.refrescarForeignKeysDescripcionesDefiProvisionEmpleado(this.defiprovisionempleadoLogic.getDefiProvisionEmpleados());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			DefiProvisionEmpleadoConstantesFunciones.refrescarForeignKeysDescripcionesDefiProvisionEmpleado(this.defiprovisionempleados);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(RubroEmplea.class));
		classes.add(new Classe(Formato.class));
		classes.add(new Classe(Mes.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//defiprovisionempleadoLogic.setDefiProvisionEmpleados(this.defiprovisionempleados);
			defiprovisionempleadoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public DefiProvisionEmpleadoParameterReturnGeneral getDefiProvisionEmpleadoParameterGeneral() {
		return this.defiprovisionempleadoParameterGeneral;
	}
	
	public void setDefiProvisionEmpleadoParameterGeneral(DefiProvisionEmpleadoParameterReturnGeneral defiprovisionempleadoParameterGeneral) {
		this.defiprovisionempleadoParameterGeneral = defiprovisionempleadoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoDefiProvisionEmpleado() {
		return isPermisoTodoDefiProvisionEmpleado;
	}

	public void setIsPermisoTodoDefiProvisionEmpleado(Boolean isPermisoTodoDefiProvisionEmpleado) {
		this.isPermisoTodoDefiProvisionEmpleado = isPermisoTodoDefiProvisionEmpleado;
	}

	public Boolean getIsPermisoNuevoDefiProvisionEmpleado() {
		return isPermisoNuevoDefiProvisionEmpleado;
	}

	public void setIsPermisoNuevoDefiProvisionEmpleado(Boolean isPermisoNuevoDefiProvisionEmpleado) {
		this.isPermisoNuevoDefiProvisionEmpleado = isPermisoNuevoDefiProvisionEmpleado;
	}

	public Boolean getIsPermisoActualizarDefiProvisionEmpleado() {
		return isPermisoActualizarDefiProvisionEmpleado;
	}

	public void setIsPermisoActualizarDefiProvisionEmpleado(Boolean isPermisoActualizarDefiProvisionEmpleado) {
		this.isPermisoActualizarDefiProvisionEmpleado = isPermisoActualizarDefiProvisionEmpleado;
	}

	public Boolean getIsPermisoEliminarDefiProvisionEmpleado() {
		return isPermisoEliminarDefiProvisionEmpleado;
	}

	public void setIsPermisoEliminarDefiProvisionEmpleado(Boolean isPermisoEliminarDefiProvisionEmpleado) {
		this.isPermisoEliminarDefiProvisionEmpleado = isPermisoEliminarDefiProvisionEmpleado;
	}

	public Boolean getIsPermisoGuardarCambiosDefiProvisionEmpleado() {
		return isPermisoGuardarCambiosDefiProvisionEmpleado;
	}

	public void setIsPermisoGuardarCambiosDefiProvisionEmpleado(Boolean isPermisoGuardarCambiosDefiProvisionEmpleado) {
		this.isPermisoGuardarCambiosDefiProvisionEmpleado = isPermisoGuardarCambiosDefiProvisionEmpleado;
	}
	
	public Boolean getIsPermisoConsultaDefiProvisionEmpleado() {
		return isPermisoConsultaDefiProvisionEmpleado;
	}

	public void setIsPermisoConsultaDefiProvisionEmpleado(Boolean isPermisoConsultaDefiProvisionEmpleado) {
		this.isPermisoConsultaDefiProvisionEmpleado = isPermisoConsultaDefiProvisionEmpleado;
	}

	public Boolean getIsPermisoBusquedaDefiProvisionEmpleado() {
		return isPermisoBusquedaDefiProvisionEmpleado;
	}

	public void setIsPermisoBusquedaDefiProvisionEmpleado(Boolean isPermisoBusquedaDefiProvisionEmpleado) {
		this.isPermisoBusquedaDefiProvisionEmpleado = isPermisoBusquedaDefiProvisionEmpleado;
	}

	public Boolean getIsPermisoReporteDefiProvisionEmpleado() {
		return isPermisoReporteDefiProvisionEmpleado;
	}

	public void setIsPermisoReporteDefiProvisionEmpleado(Boolean isPermisoReporteDefiProvisionEmpleado) {
		this.isPermisoReporteDefiProvisionEmpleado = isPermisoReporteDefiProvisionEmpleado;
	}
	
	public Boolean getIsPermisoPaginacionMedioDefiProvisionEmpleado() {
		return isPermisoPaginacionMedioDefiProvisionEmpleado;
	}

	public void setIsPermisoPaginacionMedioDefiProvisionEmpleado(Boolean isPermisoPaginacionMedioDefiProvisionEmpleado) {
		this.isPermisoPaginacionMedioDefiProvisionEmpleado = isPermisoPaginacionMedioDefiProvisionEmpleado;
	}
	
	public Boolean getIsPermisoPaginacionTodoDefiProvisionEmpleado() {
		return isPermisoPaginacionTodoDefiProvisionEmpleado;
	}

	public void setIsPermisoPaginacionTodoDefiProvisionEmpleado(Boolean isPermisoPaginacionTodoDefiProvisionEmpleado) {
		this.isPermisoPaginacionTodoDefiProvisionEmpleado = isPermisoPaginacionTodoDefiProvisionEmpleado;
	}
	
	public Boolean getIsPermisoPaginacionAltoDefiProvisionEmpleado() {
		return isPermisoPaginacionAltoDefiProvisionEmpleado;
	}

	public void setIsPermisoPaginacionAltoDefiProvisionEmpleado(Boolean isPermisoPaginacionAltoDefiProvisionEmpleado) {
		this.isPermisoPaginacionAltoDefiProvisionEmpleado = isPermisoPaginacionAltoDefiProvisionEmpleado;
	}
	
	public Boolean getIsPermisoCopiarDefiProvisionEmpleado() {
		return isPermisoCopiarDefiProvisionEmpleado;
	}

	public void setIsPermisoCopiarDefiProvisionEmpleado(Boolean isPermisoCopiarDefiProvisionEmpleado) {
		this.isPermisoCopiarDefiProvisionEmpleado = isPermisoCopiarDefiProvisionEmpleado;
	}
	
	public Boolean getIsPermisoVerFormDefiProvisionEmpleado() {
		return isPermisoVerFormDefiProvisionEmpleado;
	}

	public void setIsPermisoVerFormDefiProvisionEmpleado(Boolean isPermisoVerFormDefiProvisionEmpleado) {
		this.isPermisoVerFormDefiProvisionEmpleado = isPermisoVerFormDefiProvisionEmpleado;
	}
	
	public Boolean getIsPermisoDuplicarDefiProvisionEmpleado() {
		return isPermisoDuplicarDefiProvisionEmpleado;
	}

	public void setIsPermisoDuplicarDefiProvisionEmpleado(Boolean isPermisoDuplicarDefiProvisionEmpleado) {
		this.isPermisoDuplicarDefiProvisionEmpleado = isPermisoDuplicarDefiProvisionEmpleado;
	}
	
	public Boolean getIsPermisoOrdenDefiProvisionEmpleado() {
		return isPermisoOrdenDefiProvisionEmpleado;
	}

	public void setIsPermisoOrdenDefiProvisionEmpleado(Boolean isPermisoOrdenDefiProvisionEmpleado) {
		this.isPermisoOrdenDefiProvisionEmpleado = isPermisoOrdenDefiProvisionEmpleado;
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
	
	public Boolean getIsVisibilidadCeldaNuevoDefiProvisionEmpleado() {
		return isVisibilidadCeldaNuevoDefiProvisionEmpleado;
	}

	public void setIsVisibilidadCeldaNuevoDefiProvisionEmpleado(Boolean isVisibilidadCeldaNuevoDefiProvisionEmpleado) {
		this.isVisibilidadCeldaNuevoDefiProvisionEmpleado = isVisibilidadCeldaNuevoDefiProvisionEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarDefiProvisionEmpleado() {
		return isVisibilidadCeldaDuplicarDefiProvisionEmpleado;
	}

	public void setIsVisibilidadCeldaDuplicarDefiProvisionEmpleado(Boolean isVisibilidadCeldaDuplicarDefiProvisionEmpleado) {
		this.isVisibilidadCeldaDuplicarDefiProvisionEmpleado = isVisibilidadCeldaDuplicarDefiProvisionEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarDefiProvisionEmpleado() {
		return isVisibilidadCeldaCopiarDefiProvisionEmpleado;
	}

	public void setIsVisibilidadCeldaCopiarDefiProvisionEmpleado(Boolean isVisibilidadCeldaCopiarDefiProvisionEmpleado) {
		this.isVisibilidadCeldaCopiarDefiProvisionEmpleado = isVisibilidadCeldaCopiarDefiProvisionEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormDefiProvisionEmpleado() {
		return isVisibilidadCeldaVerFormDefiProvisionEmpleado;
	}

	public void setIsVisibilidadCeldaVerFormDefiProvisionEmpleado(Boolean isVisibilidadCeldaVerFormDefiProvisionEmpleado) {
		this.isVisibilidadCeldaVerFormDefiProvisionEmpleado = isVisibilidadCeldaVerFormDefiProvisionEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenDefiProvisionEmpleado() {
		return isVisibilidadCeldaOrdenDefiProvisionEmpleado;
	}

	public void setIsVisibilidadCeldaOrdenDefiProvisionEmpleado(Boolean isVisibilidadCeldaOrdenDefiProvisionEmpleado) {
		this.isVisibilidadCeldaOrdenDefiProvisionEmpleado = isVisibilidadCeldaOrdenDefiProvisionEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesDefiProvisionEmpleado() {
		return isVisibilidadCeldaNuevoRelacionesDefiProvisionEmpleado;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesDefiProvisionEmpleado(Boolean isVisibilidadCeldaNuevoRelacionesDefiProvisionEmpleado) {
		this.isVisibilidadCeldaNuevoRelacionesDefiProvisionEmpleado = isVisibilidadCeldaNuevoRelacionesDefiProvisionEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaModificarDefiProvisionEmpleado() {
		return isVisibilidadCeldaModificarDefiProvisionEmpleado;
	}

	public void setIsVisibilidadCeldaModificarDefiProvisionEmpleado(Boolean isVisibilidadCeldaModificarDefiProvisionEmpleado) {
		this.isVisibilidadCeldaModificarDefiProvisionEmpleado = isVisibilidadCeldaModificarDefiProvisionEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarDefiProvisionEmpleado() {
		return isVisibilidadCeldaActualizarDefiProvisionEmpleado;
	}

	public void setIsVisibilidadCeldaActualizarDefiProvisionEmpleado(Boolean isVisibilidadCeldaActualizarDefiProvisionEmpleado) {
		this.isVisibilidadCeldaActualizarDefiProvisionEmpleado = isVisibilidadCeldaActualizarDefiProvisionEmpleado;
	}

	public Boolean getIsVisibilidadCeldaEliminarDefiProvisionEmpleado() {
		return isVisibilidadCeldaEliminarDefiProvisionEmpleado;
	}

	public void setIsVisibilidadCeldaEliminarDefiProvisionEmpleado(Boolean isVisibilidadCeldaEliminarDefiProvisionEmpleado) {
		this.isVisibilidadCeldaEliminarDefiProvisionEmpleado = isVisibilidadCeldaEliminarDefiProvisionEmpleado;
	}

	public Boolean getIsVisibilidadCeldaCancelarDefiProvisionEmpleado() {
		return isVisibilidadCeldaCancelarDefiProvisionEmpleado;
	}

	public void setIsVisibilidadCeldaCancelarDefiProvisionEmpleado(Boolean isVisibilidadCeldaCancelarDefiProvisionEmpleado) {
		this.isVisibilidadCeldaCancelarDefiProvisionEmpleado = isVisibilidadCeldaCancelarDefiProvisionEmpleado;
	}

	public Boolean getIsVisibilidadCeldaGuardarDefiProvisionEmpleado() {
		return isVisibilidadCeldaGuardarDefiProvisionEmpleado;
	}

	public void setIsVisibilidadCeldaGuardarDefiProvisionEmpleado(Boolean isVisibilidadCeldaGuardarDefiProvisionEmpleado) {
		this.isVisibilidadCeldaGuardarDefiProvisionEmpleado = isVisibilidadCeldaGuardarDefiProvisionEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosDefiProvisionEmpleado() {
		return isVisibilidadCeldaGuardarCambiosDefiProvisionEmpleado;
	}

	public void setIsVisibilidadCeldaGuardarCambiosDefiProvisionEmpleado(Boolean isVisibilidadCeldaGuardarCambiosDefiProvisionEmpleado) {
		this.isVisibilidadCeldaGuardarCambiosDefiProvisionEmpleado = isVisibilidadCeldaGuardarCambiosDefiProvisionEmpleado;
	}
		
	public DefiProvisionEmpleadoSessionBean getdefiprovisionempleadoSessionBean() {
		return this.defiprovisionempleadoSessionBean;
	}
	
	public void setdefiprovisionempleadoSessionBean(DefiProvisionEmpleadoSessionBean defiprovisionempleadoSessionBean) {
		this.defiprovisionempleadoSessionBean=defiprovisionempleadoSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdFormato() {
		return this.isVisibilidadFK_IdFormato;
	}

	public void setisVisibilidadFK_IdFormato(Boolean isVisibilidadFK_IdFormato) {
		this.isVisibilidadFK_IdFormato=isVisibilidadFK_IdFormato;
	}

	public Boolean getisVisibilidadFK_IdMesFinal() {
		return this.isVisibilidadFK_IdMesFinal;
	}

	public void setisVisibilidadFK_IdMesFinal(Boolean isVisibilidadFK_IdMesFinal) {
		this.isVisibilidadFK_IdMesFinal=isVisibilidadFK_IdMesFinal;
	}

	public Boolean getisVisibilidadFK_IdMesInicial() {
		return this.isVisibilidadFK_IdMesInicial;
	}

	public void setisVisibilidadFK_IdMesInicial(Boolean isVisibilidadFK_IdMesInicial) {
		this.isVisibilidadFK_IdMesInicial=isVisibilidadFK_IdMesInicial;
	}

	public Boolean getisVisibilidadFK_IdRubroEmplea() {
		return this.isVisibilidadFK_IdRubroEmplea;
	}

	public void setisVisibilidadFK_IdRubroEmplea(Boolean isVisibilidadFK_IdRubroEmplea) {
		this.isVisibilidadFK_IdRubroEmplea=isVisibilidadFK_IdRubroEmplea;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysDefiProvisionEmpleado(DefiProvisionEmpleado defiprovisionempleado)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(defiprovisionempleado,null);
				this.setActualParaGuardarRubroEmpleaForeignKey(defiprovisionempleado,null);
				this.setActualParaGuardarFormatoForeignKey(defiprovisionempleado,null);
				this.setActualParaGuardarMesInicialForeignKey(defiprovisionempleado,null);
				this.setActualParaGuardarMesFinalForeignKey(defiprovisionempleado,null);
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
	
	public void bugActualizarReferenciaActual(DefiProvisionEmpleado defiprovisionempleado,DefiProvisionEmpleado defiprovisionempleadoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalDefiProvisionEmpleado(defiprovisionempleado);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		defiprovisionempleadoAux.setId(defiprovisionempleado.getId());
		defiprovisionempleadoAux.setVersionRow(defiprovisionempleado.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessDefiProvisionEmpleado();
		
			int intSelectedRow = this.jTableDatosDefiProvisionEmpleado.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.defiprovisionempleado =(DefiProvisionEmpleado) this.defiprovisionempleadoLogic.getDefiProvisionEmpleados().toArray()[this.jTableDatosDefiProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.defiprovisionempleado =(DefiProvisionEmpleado) this.defiprovisionempleados.toArray()[this.jTableDatosDefiProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(DefiProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualDefiProvisionEmpleado(this.defiprovisionempleado,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysDefiProvisionEmpleado(this.defiprovisionempleado);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = defiprovisionempleadoValidator.getInvalidValues(this.defiprovisionempleado);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			defiprovisionempleadoLogic.setDatosCliente(datosCliente);
			defiprovisionempleadoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				defiprovisionempleadoAux=new  DefiProvisionEmpleado();
				
				defiprovisionempleadoAux.setIsNew(true);
				defiprovisionempleadoAux.setIsChanged(true);
				
				defiprovisionempleadoAux.setDefiProvisionEmpleadoOriginal(this.defiprovisionempleado);
				
				defiprovisionempleadoAux.setId(this.defiprovisionempleado.getId());	
				defiprovisionempleadoAux.setVersionRow(this.defiprovisionempleado.getVersionRow());	
				defiprovisionempleadoAux.setid_empresa(this.defiprovisionempleado.getid_empresa());	
				defiprovisionempleadoAux.setid_rubro_emplea(this.defiprovisionempleado.getid_rubro_emplea());	
				defiprovisionempleadoAux.setid_formato(this.defiprovisionempleado.getid_formato());	
				defiprovisionempleadoAux.setnombre(this.defiprovisionempleado.getnombre());	
				defiprovisionempleadoAux.setdia_inicial(this.defiprovisionempleado.getdia_inicial());	
				defiprovisionempleadoAux.setid_mes_inicial(this.defiprovisionempleado.getid_mes_inicial());	
				defiprovisionempleadoAux.setdia_final(this.defiprovisionempleado.getdia_final());	
				defiprovisionempleadoAux.setid_mes_final(this.defiprovisionempleado.getid_mes_final());	
				defiprovisionempleadoAux.setpara_liquidacion(this.defiprovisionempleado.getpara_liquidacion());	
				defiprovisionempleadoAux.setdescripcion(this.defiprovisionempleado.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.defiprovisionempleadoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(defiprovisionempleadoAux,defiprovisionempleadoLogic.getDefiProvisionEmpleados());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(defiprovisionempleadoAux,defiprovisionempleados);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.defiprovisionempleadoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						defiprovisionempleadoLogic.saveDefiProvisionEmpleados();//WithConnection
						//defiprovisionempleadoLogic.getSetVersionRowDefiProvisionEmpleados();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.defiprovisionempleado,defiprovisionempleadoAux);
					
					this.refrescarForeignKeysDescripcionesDefiProvisionEmpleado();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.defiprovisionempleadoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.provisionempleadoLogic.getProvisionEmpleados().addAll(this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.provisionempleadosEliminados);
							this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaBeanSwingJInternalFrame.cuotaLogic.getCuotas().addAll(this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaBeanSwingJInternalFrame.cuotasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.provisionempleados.addAll(this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.provisionempleadosEliminados);
							this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaBeanSwingJInternalFrame.cuotas.addAll(this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaBeanSwingJInternalFrame.cuotasEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								defiprovisionempleadoLogic.saveDefiProvisionEmpleadoRelaciones(defiprovisionempleadoAux,this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.provisionempleadoLogic.getProvisionEmpleados(),this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaBeanSwingJInternalFrame.cuotaLogic.getCuotas());//WithConnection
								//defiprovisionempleadoLogic.getSetVersionRowDefiProvisionEmpleados();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.defiprovisionempleado,defiprovisionempleadoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.provisionempleadoLogic.setProvisionEmpleados(new ArrayList<ProvisionEmpleado>());
							this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaBeanSwingJInternalFrame.cuotaLogic.setCuotas(new ArrayList<Cuota>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.provisionempleados= new ArrayList<ProvisionEmpleado>();
							this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaBeanSwingJInternalFrame.cuotas= new ArrayList<Cuota>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.quitarFilaTotales();}
							defiprovisionempleadoAux.setProvisionEmpleados(this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.provisionempleadoLogic.getProvisionEmpleados());

							if(this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaBeanSwingJInternalFrame.quitarFilaTotales();}
							defiprovisionempleadoAux.setCuotas(this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaBeanSwingJInternalFrame.cuotaLogic.getCuotas());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.defiprovisionempleadoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(defiprovisionempleadoAux,defiprovisionempleadoLogic.getDefiProvisionEmpleados());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(defiprovisionempleadoAux,defiprovisionempleados);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.defiprovisionempleado,defiprovisionempleadoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				defiprovisionempleadoAux=new  DefiProvisionEmpleado();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado() 
					|| (this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado() && this.defiprovisionempleado.getId()>=0)) {
						
					defiprovisionempleadoAux.setIsNew(false);
				}
				
				defiprovisionempleadoAux.setIsDeleted(false);
			
				defiprovisionempleadoAux.setId(this.defiprovisionempleado.getId());	
				defiprovisionempleadoAux.setVersionRow(this.defiprovisionempleado.getVersionRow());	
				defiprovisionempleadoAux.setid_empresa(this.defiprovisionempleado.getid_empresa());	
				defiprovisionempleadoAux.setid_rubro_emplea(this.defiprovisionempleado.getid_rubro_emplea());	
				defiprovisionempleadoAux.setid_formato(this.defiprovisionempleado.getid_formato());	
				defiprovisionempleadoAux.setnombre(this.defiprovisionempleado.getnombre());	
				defiprovisionempleadoAux.setdia_inicial(this.defiprovisionempleado.getdia_inicial());	
				defiprovisionempleadoAux.setid_mes_inicial(this.defiprovisionempleado.getid_mes_inicial());	
				defiprovisionempleadoAux.setdia_final(this.defiprovisionempleado.getdia_final());	
				defiprovisionempleadoAux.setid_mes_final(this.defiprovisionempleado.getid_mes_final());	
				defiprovisionempleadoAux.setpara_liquidacion(this.defiprovisionempleado.getpara_liquidacion());	
				defiprovisionempleadoAux.setdescripcion(this.defiprovisionempleado.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(defiprovisionempleadoAux,defiprovisionempleadoLogic.getDefiProvisionEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(defiprovisionempleadoAux,defiprovisionempleados);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.defiprovisionempleadoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						defiprovisionempleadoLogic.saveDefiProvisionEmpleados();//WithConnection
						//defiprovisionempleadoLogic.getSetVersionRowDefiProvisionEmpleados();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.defiprovisionempleado,defiprovisionempleadoAux);
					
					this.refrescarForeignKeysDescripcionesDefiProvisionEmpleado();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.defiprovisionempleadoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.provisionempleadoLogic.getProvisionEmpleados().addAll(this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.provisionempleadosEliminados);
							this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaBeanSwingJInternalFrame.cuotaLogic.getCuotas().addAll(this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaBeanSwingJInternalFrame.cuotasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.provisionempleados.addAll(this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.provisionempleadosEliminados);
							this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaBeanSwingJInternalFrame.cuotas.addAll(this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaBeanSwingJInternalFrame.cuotasEliminados);
						}
						//ARCHITECTURE
						
						if(!this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								defiprovisionempleadoLogic.saveDefiProvisionEmpleadoRelaciones(defiprovisionempleadoAux,this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.provisionempleadoLogic.getProvisionEmpleados(),this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaBeanSwingJInternalFrame.cuotaLogic.getCuotas());//WithConnection
								//defiprovisionempleadoLogic.getSetVersionRowDefiProvisionEmpleados();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.defiprovisionempleado,defiprovisionempleadoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.provisionempleadoLogic.setProvisionEmpleados(new ArrayList<ProvisionEmpleado>());
							this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaBeanSwingJInternalFrame.cuotaLogic.setCuotas(new ArrayList<Cuota>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.provisionempleados= new ArrayList<ProvisionEmpleado>();
							this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaBeanSwingJInternalFrame.cuotas= new ArrayList<Cuota>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.quitarFilaTotales();}
							defiprovisionempleadoAux.setProvisionEmpleados(this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.provisionempleadoLogic.getProvisionEmpleados());

							if(this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaBeanSwingJInternalFrame.quitarFilaTotales();}
							defiprovisionempleadoAux.setCuotas(this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaBeanSwingJInternalFrame.cuotaLogic.getCuotas());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.defiprovisionempleadoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(defiprovisionempleadoAux,defiprovisionempleadoLogic.getDefiProvisionEmpleados());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(defiprovisionempleadoAux,defiprovisionempleados);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.defiprovisionempleado,defiprovisionempleadoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				defiprovisionempleadoAux=new  DefiProvisionEmpleado();
				
				defiprovisionempleadoAux.setIsNew(false);
				defiprovisionempleadoAux.setIsChanged(false);
				
				defiprovisionempleadoAux.setIsDeleted(true);
				
				defiprovisionempleadoAux.setId(this.defiprovisionempleado.getId());	
				defiprovisionempleadoAux.setVersionRow(this.defiprovisionempleado.getVersionRow());	
				defiprovisionempleadoAux.setid_empresa(this.defiprovisionempleado.getid_empresa());	
				defiprovisionempleadoAux.setid_rubro_emplea(this.defiprovisionempleado.getid_rubro_emplea());	
				defiprovisionempleadoAux.setid_formato(this.defiprovisionempleado.getid_formato());	
				defiprovisionempleadoAux.setnombre(this.defiprovisionempleado.getnombre());	
				defiprovisionempleadoAux.setdia_inicial(this.defiprovisionempleado.getdia_inicial());	
				defiprovisionempleadoAux.setid_mes_inicial(this.defiprovisionempleado.getid_mes_inicial());	
				defiprovisionempleadoAux.setdia_final(this.defiprovisionempleado.getdia_final());	
				defiprovisionempleadoAux.setid_mes_final(this.defiprovisionempleado.getid_mes_final());	
				defiprovisionempleadoAux.setpara_liquidacion(this.defiprovisionempleado.getpara_liquidacion());	
				defiprovisionempleadoAux.setdescripcion(this.defiprovisionempleado.getdescripcion());	
				
				if(this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.defiprovisionempleadoAux.getId()>=0) {	
						this.defiprovisionempleadosEliminados.add(defiprovisionempleadoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(defiprovisionempleadoAux,defiprovisionempleadoLogic.getDefiProvisionEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(defiprovisionempleadoAux,defiprovisionempleados);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.defiprovisionempleadoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						defiprovisionempleadoLogic.saveDefiProvisionEmpleados();//WithConnection
						//defiprovisionempleadoLogic.getSetVersionRowDefiProvisionEmpleados();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.defiprovisionempleadoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.provisionempleadoLogic.getProvisionEmpleados().addAll(this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.provisionempleadosEliminados);
							this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaBeanSwingJInternalFrame.cuotaLogic.getCuotas().addAll(this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaBeanSwingJInternalFrame.cuotasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.provisionempleados.addAll(this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.provisionempleadosEliminados);
							this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaBeanSwingJInternalFrame.cuotas.addAll(this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaBeanSwingJInternalFrame.cuotasEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								defiprovisionempleadoLogic.saveDefiProvisionEmpleadoRelaciones(defiprovisionempleadoAux,this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.provisionempleadoLogic.getProvisionEmpleados(),this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaBeanSwingJInternalFrame.cuotaLogic.getCuotas());//WithConnection
								//defiprovisionempleadoLogic.getSetVersionRowDefiProvisionEmpleados();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.provisionempleadoLogic.setProvisionEmpleados(new ArrayList<ProvisionEmpleado>());
							this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaBeanSwingJInternalFrame.cuotaLogic.setCuotas(new ArrayList<Cuota>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.provisionempleados= new ArrayList<ProvisionEmpleado>();
							this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaBeanSwingJInternalFrame.cuotas= new ArrayList<Cuota>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.quitarFilaTotales();}
							defiprovisionempleadoAux.setProvisionEmpleados(this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.provisionempleadoLogic.getProvisionEmpleados());

							if(this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaBeanSwingJInternalFrame.quitarFilaTotales();}
							defiprovisionempleadoAux.setCuotas(this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaBeanSwingJInternalFrame.cuotaLogic.getCuotas());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.defiprovisionempleadoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(defiprovisionempleadoAux,defiprovisionempleadoLogic.getDefiProvisionEmpleados());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(defiprovisionempleadoAux,defiprovisionempleados);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.defiprovisionempleadoLogic.getDefiProvisionEmpleados().addAll(this.defiprovisionempleadosEliminados);
					
					defiprovisionempleadoLogic.saveDefiProvisionEmpleados();//WithConnection
					//defiprovisionempleadoLogic.getSetVersionRowDefiProvisionEmpleados();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesDefiProvisionEmpleado();
				
				this.defiprovisionempleadosEliminados= new ArrayList<DefiProvisionEmpleado>();		
			}
			
			if(this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Defi Provision Empleado GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Defi Provision Empleado",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.defiprovisionempleado=defiprovisionempleadoAux;
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
      		//this.finishProcessDefiProvisionEmpleado();
      	}
		
	}	
	
	public void actualizarRelaciones(DefiProvisionEmpleado defiprovisionempleadoLocal) throws Exception {
		
		if(this.defiprovisionempleadoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				defiprovisionempleadoLocal.setProvisionEmpleados(this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.provisionempleadoLogic.getProvisionEmpleados());
				defiprovisionempleadoLocal.setCuotas(this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaBeanSwingJInternalFrame.cuotaLogic.getCuotas());
			
			} else {
			
				defiprovisionempleadoLocal.setProvisionEmpleados(this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.provisionempleados);
				defiprovisionempleadoLocal.setCuotas(this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaBeanSwingJInternalFrame.cuotas);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(DefiProvisionEmpleado defiprovisionempleadoLocal) throws Exception {	
		if(this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				defiprovisionempleadoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(RubroEmpleaDetalleFormJInternalFrame.class)) {
				RubroEmpleaBeanSwingJInternalFrame rubroempleaBeanSwingJInternalFrameLocal=(RubroEmpleaBeanSwingJInternalFrame) ((RubroEmpleaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				rubroempleaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoRubroEmplea(rubroempleaBeanSwingJInternalFrameLocal.getrubroemplea(),true);
				rubroempleaBeanSwingJInternalFrameLocal.actualizarLista(rubroempleaBeanSwingJInternalFrameLocal.rubroemplea,this.rubroempleasForeignKey);

				rubroempleaBeanSwingJInternalFrameLocal.actualizarRelaciones(rubroempleaBeanSwingJInternalFrameLocal.rubroemplea);

				defiprovisionempleadoLocal.setRubroEmplea(rubroempleaBeanSwingJInternalFrameLocal.rubroemplea);

				this.addItemDefectoCombosForeignKeyRubroEmplea();
				this.cargarCombosFrameRubroEmpleasForeignKey("Formulario");
				this.setActualRubroEmpleaForeignKey(rubroempleaBeanSwingJInternalFrameLocal.rubroemplea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(FormatoDetalleFormJInternalFrame.class)) {
				FormatoBeanSwingJInternalFrame formatoBeanSwingJInternalFrameLocal=(FormatoBeanSwingJInternalFrame) ((FormatoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				formatoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoFormato(formatoBeanSwingJInternalFrameLocal.getformato(),true);
				formatoBeanSwingJInternalFrameLocal.actualizarLista(formatoBeanSwingJInternalFrameLocal.formato,this.formatosForeignKey);

				formatoBeanSwingJInternalFrameLocal.actualizarRelaciones(formatoBeanSwingJInternalFrameLocal.formato);

				defiprovisionempleadoLocal.setFormato(formatoBeanSwingJInternalFrameLocal.formato);

				this.addItemDefectoCombosForeignKeyFormato();
				this.cargarCombosFrameFormatosForeignKey("Formulario");
				this.setActualFormatoForeignKey(formatoBeanSwingJInternalFrameLocal.formato.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(MesDetalleFormJInternalFrame.class)) {
				MesBeanSwingJInternalFrame mesinicialBeanSwingJInternalFrameLocal=(MesBeanSwingJInternalFrame) ((MesDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				mesinicialBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoMes(mesinicialBeanSwingJInternalFrameLocal.getmes(),true);
				mesinicialBeanSwingJInternalFrameLocal.actualizarLista(mesinicialBeanSwingJInternalFrameLocal.mes,this.mesinicialsForeignKey);

				mesinicialBeanSwingJInternalFrameLocal.actualizarRelaciones(mesinicialBeanSwingJInternalFrameLocal.mes);

				defiprovisionempleadoLocal.setMesInicial(mesinicialBeanSwingJInternalFrameLocal.mes);

				this.addItemDefectoCombosForeignKeyMesInicial();
				this.cargarCombosFrameMesInicialsForeignKey("Formulario");
				this.setActualMesInicialForeignKey(mesinicialBeanSwingJInternalFrameLocal.mes.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(MesDetalleFormJInternalFrame.class)) {
				MesBeanSwingJInternalFrame mesfinalBeanSwingJInternalFrameLocal=(MesBeanSwingJInternalFrame) ((MesDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				mesfinalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoMes(mesfinalBeanSwingJInternalFrameLocal.getmes(),true);
				mesfinalBeanSwingJInternalFrameLocal.actualizarLista(mesfinalBeanSwingJInternalFrameLocal.mes,this.mesfinalsForeignKey);

				mesfinalBeanSwingJInternalFrameLocal.actualizarRelaciones(mesfinalBeanSwingJInternalFrameLocal.mes);

				defiprovisionempleadoLocal.setMesFinal(mesfinalBeanSwingJInternalFrameLocal.mes);

				this.addItemDefectoCombosForeignKeyMesFinal();
				this.cargarCombosFrameMesFinalsForeignKey("Formulario");
				this.setActualMesFinalForeignKey(mesfinalBeanSwingJInternalFrameLocal.mes.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarDefiProvisionEmpleadoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosDefiProvisionEmpleado.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.defiprovisionempleado =(DefiProvisionEmpleado) this.defiprovisionempleadoLogic.getDefiProvisionEmpleados().toArray()[this.jTableDatosDefiProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.defiprovisionempleado =(DefiProvisionEmpleado) this.defiprovisionempleados.toArray()[this.jTableDatosDefiProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = defiprovisionempleadoValidator.getInvalidValues(this.defiprovisionempleado);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(DefiProvisionEmpleado defiprovisionempleado,List<DefiProvisionEmpleado> defiprovisionempleados) throws Exception {
		try	{		
			DefiProvisionEmpleadoConstantesFunciones.actualizarLista(defiprovisionempleado,defiprovisionempleados,this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(DefiProvisionEmpleado defiprovisionempleado,List<DefiProvisionEmpleado> defiprovisionempleados) throws Exception {
		try	{			
			DefiProvisionEmpleadoConstantesFunciones.actualizarSelectedLista(defiprovisionempleado,defiprovisionempleados);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<DefiProvisionEmpleado> defiprovisionempleadosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				defiprovisionempleadosLocal=this.defiprovisionempleadoLogic.getDefiProvisionEmpleados();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				defiprovisionempleadosLocal=this.defiprovisionempleados;
			}
			//ARCHITECTURE
		
			for(DefiProvisionEmpleado defiprovisionempleadoLocal:defiprovisionempleadosLocal) {
				if(this.permiteMantenimiento(defiprovisionempleadoLocal) && defiprovisionempleadoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+DefiProvisionEmpleadoConstantesFunciones.getDefiProvisionEmpleadoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(DefiProvisionEmpleadoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDefiProvisionEmpleado.jLabelid_empresaDefiProvisionEmpleado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DefiProvisionEmpleadoConstantesFunciones.IDRUBROEMPLEA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDefiProvisionEmpleado.jLabelid_rubro_empleaDefiProvisionEmpleado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DefiProvisionEmpleadoConstantesFunciones.IDFORMATO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDefiProvisionEmpleado.jLabelid_formatoDefiProvisionEmpleado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DefiProvisionEmpleadoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDefiProvisionEmpleado.jLabelnombreDefiProvisionEmpleado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DefiProvisionEmpleadoConstantesFunciones.DIAINICIAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDefiProvisionEmpleado.jLabeldia_inicialDefiProvisionEmpleado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DefiProvisionEmpleadoConstantesFunciones.IDMESINICIAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDefiProvisionEmpleado.jLabelid_mes_inicialDefiProvisionEmpleado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DefiProvisionEmpleadoConstantesFunciones.DIAFINAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDefiProvisionEmpleado.jLabeldia_finalDefiProvisionEmpleado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DefiProvisionEmpleadoConstantesFunciones.IDMESFINAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDefiProvisionEmpleado.jLabelid_mes_finalDefiProvisionEmpleado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DefiProvisionEmpleadoConstantesFunciones.PARALIQUIDACION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDefiProvisionEmpleado.jLabelpara_liquidacionDefiProvisionEmpleado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DefiProvisionEmpleadoConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDefiProvisionEmpleado.jLabeldescripcionDefiProvisionEmpleado,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormDefiProvisionEmpleado!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDefiProvisionEmpleado.jLabelid_empresaDefiProvisionEmpleado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDefiProvisionEmpleado.jLabelid_rubro_empleaDefiProvisionEmpleado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDefiProvisionEmpleado.jLabelid_formatoDefiProvisionEmpleado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDefiProvisionEmpleado.jLabelnombreDefiProvisionEmpleado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDefiProvisionEmpleado.jLabeldia_inicialDefiProvisionEmpleado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDefiProvisionEmpleado.jLabelid_mes_inicialDefiProvisionEmpleado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDefiProvisionEmpleado.jLabeldia_finalDefiProvisionEmpleado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDefiProvisionEmpleado.jLabelid_mes_finalDefiProvisionEmpleado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDefiProvisionEmpleado.jLabelpara_liquidacionDefiProvisionEmpleado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDefiProvisionEmpleado.jLabeldescripcionDefiProvisionEmpleado,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("ProvisionEmpleado")) {
			if(this.defiprovisionempleado==null) {
				this.defiprovisionempleado= new DefiProvisionEmpleado();
			}

			if(this.defiprovisionempleadoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoDefiProvisionEmpleado
				this.setVariablesFormularioToObjetoActualDefiProvisionEmpleado(this.defiprovisionempleado,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysDefiProvisionEmpleado(this.defiprovisionempleado);

				this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.getprovisionempleado().setDefiProvisionEmpleado(this.defiprovisionempleado);
			}

			return;
		}
		 else  if(sTipo.equals("Cuota")) {
			if(this.defiprovisionempleado==null) {
				this.defiprovisionempleado= new DefiProvisionEmpleado();
			}

			if(this.defiprovisionempleadoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoDefiProvisionEmpleado
				this.setVariablesFormularioToObjetoActualDefiProvisionEmpleado(this.defiprovisionempleado,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysDefiProvisionEmpleado(this.defiprovisionempleado);

				this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaBeanSwingJInternalFrame.getcuota().setDefiProvisionEmpleado(this.defiprovisionempleado);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoDefiProvisionEmpleado--;	
		
		
		this.defiprovisionempleadoAux=new DefiProvisionEmpleado();
		
		this.defiprovisionempleadoAux.setId(this.iIdNuevoDefiProvisionEmpleado);
		this.defiprovisionempleadoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.defiprovisionempleadoLogic.getDefiProvisionEmpleados().add(this.defiprovisionempleadoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.defiprovisionempleados.add(this.defiprovisionempleadoAux);
		}
		//ARCHITECTURE
		
		this.defiprovisionempleado=this.defiprovisionempleadoAux;
		
		if(DefiProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioDefiProvisionEmpleado(this.defiprovisionempleado);
			this.setVariablesObjetoActualToFormularioForeignKeyDefiProvisionEmpleado(this.defiprovisionempleado);
		}
				
		//this.setDefaultControlesDefiProvisionEmpleado();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyDefiProvisionEmpleado();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyDefiProvisionEmpleado();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyDefiProvisionEmpleado();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDefiProvisionEmpleado(this.defiprovisionempleadoBean,this.defiprovisionempleado,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysDefiProvisionEmpleado(this.defiprovisionempleado);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.defiprovisionempleadoSessionBean.getConGuardarRelaciones()) {
			classes=DefiProvisionEmpleadoConstantesFunciones.getClassesRelationshipsOfDefiProvisionEmpleado(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.defiprovisionempleadoReturnGeneral=defiprovisionempleadoLogic.procesarEventosDefiProvisionEmpleadosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.defiprovisionempleadoLogic.getDefiProvisionEmpleados(),this.defiprovisionempleado,this.defiprovisionempleadoParameterGeneral,this.isEsNuevoDefiProvisionEmpleado,classes);//this.defiprovisionempleadoLogic.getDefiProvisionEmpleado()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanDefiProvisionEmpleado(this.defiprovisionempleadoReturnGeneral,this.defiprovisionempleadoBean,false);
		
		if(this.defiprovisionempleadoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyDefiProvisionEmpleado(this.defiprovisionempleadoReturnGeneral.getDefiProvisionEmpleado());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioDefiProvisionEmpleado(this.defiprovisionempleadoReturnGeneral.getDefiProvisionEmpleado());
		}
		
		if(this.defiprovisionempleadoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioDefiProvisionEmpleado(this.defiprovisionempleadoReturnGeneral.getDefiProvisionEmpleado(),classes);//this.defiprovisionempleadoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualDefiProvisionEmpleado(this.defiprovisionempleado,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyDefiProvisionEmpleado();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyDefiProvisionEmpleado();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			DefiProvisionEmpleadoBeanSwingJInternalFrameAdditional.RecargarFormDefiProvisionEmpleado(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingDefiProvisionEmpleado(false);
						
			if(defiprovisionempleadoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.provisionempleadoSessionBean.getEsGuardarRelacionado() && ProvisionEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonProvisionEmpleadoActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaBeanSwingJInternalFrame.cuotaSessionBean.getEsGuardarRelacionado() && CuotaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonCuotaActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(DefiProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDefiProvisionEmpleado();
			}
			
			this.actualizarVisualTableDatosDefiProvisionEmpleado();
			
			this.jTableDatosDefiProvisionEmpleado.setRowSelectionInterval(this.getIndiceNuevoDefiProvisionEmpleado(), this.getIndiceNuevoDefiProvisionEmpleado());
			
			this.seleccionarFilaTablaDefiProvisionEmpleadoActual();
						
			this.actualizarEstadoCeldasBotonesDefiProvisionEmpleado("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesDefiProvisionEmpleado(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jTextAreanombreDefiProvisionEmpleado.setEnabled(isHabilitar && this.defiprovisionempleadoConstantesFunciones.activarnombreDefiProvisionEmpleado);
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jTextFielddia_inicialDefiProvisionEmpleado.setEnabled(isHabilitar && this.defiprovisionempleadoConstantesFunciones.activardia_inicialDefiProvisionEmpleado);
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jTextFielddia_finalDefiProvisionEmpleado.setEnabled(isHabilitar && this.defiprovisionempleadoConstantesFunciones.activardia_finalDefiProvisionEmpleado);
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jCheckBoxpara_liquidacionDefiProvisionEmpleado.setEnabled(isHabilitar && this.defiprovisionempleadoConstantesFunciones.activarpara_liquidacionDefiProvisionEmpleado);
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jTextAreadescripcionDefiProvisionEmpleado.setEnabled(isHabilitar && this.defiprovisionempleadoConstantesFunciones.activardescripcionDefiProvisionEmpleado);	
		//
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jComboBoxid_empresaDefiProvisionEmpleado.setEnabled(isHabilitar && this.defiprovisionempleadoConstantesFunciones.activarid_empresaDefiProvisionEmpleado);
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jComboBoxid_rubro_empleaDefiProvisionEmpleado.setEnabled(isHabilitar && this.defiprovisionempleadoConstantesFunciones.activarid_rubro_empleaDefiProvisionEmpleado);
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jComboBoxid_formatoDefiProvisionEmpleado.setEnabled(isHabilitar && this.defiprovisionempleadoConstantesFunciones.activarid_formatoDefiProvisionEmpleado);
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jComboBoxid_mes_inicialDefiProvisionEmpleado.setEnabled(isHabilitar && this.defiprovisionempleadoConstantesFunciones.activarid_mes_inicialDefiProvisionEmpleado);
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jComboBoxid_mes_finalDefiProvisionEmpleado.setEnabled(isHabilitar && this.defiprovisionempleadoConstantesFunciones.activarid_mes_finalDefiProvisionEmpleado);
	};
	
	public void setDefaultControlesDefiProvisionEmpleado() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoDefiProvisionEmpleado(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.defiprovisionempleadoSessionBean.setConGuardarRelaciones(true);			
			this.defiprovisionempleadoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormDefiProvisionEmpleado.jTabbedPaneRelacionesDefiProvisionEmpleado.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.provisionempleadoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaBeanSwingJInternalFrame.cuotaSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.defiprovisionempleadoSessionBean.setConGuardarRelaciones(false);			
			this.defiprovisionempleadoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormDefiProvisionEmpleado.jTabbedPaneRelacionesDefiProvisionEmpleado.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.provisionempleadoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaBeanSwingJInternalFrame.cuotaSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoDefiProvisionEmpleado() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DefiProvisionEmpleado defiprovisionempleadoAux:this.defiprovisionempleadoLogic.getDefiProvisionEmpleados()) {
				if(defiprovisionempleadoAux.getId().equals(this.iIdNuevoDefiProvisionEmpleado)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DefiProvisionEmpleado defiprovisionempleadoAux:this.defiprovisionempleados) {
				if(defiprovisionempleadoAux.getId().equals(this.iIdNuevoDefiProvisionEmpleado)) {
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
	
	public int getIndiceActualDefiProvisionEmpleado(DefiProvisionEmpleado defiprovisionempleado,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DefiProvisionEmpleado defiprovisionempleadoAux:this.defiprovisionempleadoLogic.getDefiProvisionEmpleados()) {
				if(defiprovisionempleadoAux.getId().equals(defiprovisionempleado.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DefiProvisionEmpleado defiprovisionempleadoAux:this.defiprovisionempleados) {
				if(defiprovisionempleadoAux.getId().equals(defiprovisionempleado.getId())) {
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
	
	public void setCamposBaseDesdeOriginalDefiProvisionEmpleado(DefiProvisionEmpleado defiprovisionempleadoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DefiProvisionEmpleado defiprovisionempleadoAux:this.defiprovisionempleadoLogic.getDefiProvisionEmpleados()) {
				if(defiprovisionempleadoAux.getDefiProvisionEmpleadoOriginal().getId().equals(defiprovisionempleadoOriginal.getId())) {
					existe=true;
					defiprovisionempleadoOriginal.setId(defiprovisionempleadoAux.getId());
					defiprovisionempleadoOriginal.setVersionRow(defiprovisionempleadoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DefiProvisionEmpleado defiprovisionempleadoAux:this.defiprovisionempleados) {
				if(defiprovisionempleadoAux.getDefiProvisionEmpleadoOriginal().getId().equals(defiprovisionempleadoOriginal.getId())) {
					existe=true;
					defiprovisionempleadoOriginal.setId(defiprovisionempleadoAux.getId());
					defiprovisionempleadoOriginal.setVersionRow(defiprovisionempleadoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosDefiProvisionEmpleado(Boolean esParaCancelar) throws Exception {
		defiprovisionempleadosAux=new ArrayList<DefiProvisionEmpleado>();
		defiprovisionempleadoAux=new DefiProvisionEmpleado();
		
		if(!this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(DefiProvisionEmpleado defiprovisionempleadoAux:this.defiprovisionempleadoLogic.getDefiProvisionEmpleados()) {
					if(defiprovisionempleadoAux.getId()<0) {
						defiprovisionempleadosAux.add(defiprovisionempleadoAux);
					}		
				}
				this.iIdNuevoDefiProvisionEmpleado=0L;
				this.defiprovisionempleadoLogic.getDefiProvisionEmpleados().removeAll(defiprovisionempleadosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DefiProvisionEmpleado defiprovisionempleadoAux:this.defiprovisionempleados) {
					if(defiprovisionempleadoAux.getId()<0) {
						defiprovisionempleadosAux.add(defiprovisionempleadoAux);
					}		
				}
				this.iIdNuevoDefiProvisionEmpleado=0L;
				this.defiprovisionempleados.removeAll(defiprovisionempleadosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoDefiProvisionEmpleado 
					&& this.defiprovisionempleadoLogic.getDefiProvisionEmpleados().size()>0
					) {
					defiprovisionempleadoAux=this.defiprovisionempleadoLogic.getDefiProvisionEmpleados().get(this.defiprovisionempleadoLogic.getDefiProvisionEmpleados().size() - 1);
				
					if(defiprovisionempleadoAux.getId()<0) {
						this.defiprovisionempleadoLogic.getDefiProvisionEmpleados().remove(defiprovisionempleadoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoDefiProvisionEmpleado && this.defiprovisionempleados.size()>0) {
					defiprovisionempleadoAux=this.defiprovisionempleados.get(this.defiprovisionempleados.size() - 1);
				
					if(defiprovisionempleadoAux.getId()<0) {
						this.defiprovisionempleados.remove(defiprovisionempleadoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoDefiProvisionEmpleado(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(defiprovisionempleado.getId()<0) {
				this.defiprovisionempleadoLogic.getDefiProvisionEmpleados().remove(this.defiprovisionempleado);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(defiprovisionempleado.getId()<0) {
				this.defiprovisionempleados.remove(this.defiprovisionempleado);
			}
		}			
	}
	
	public void setEstadosInicialesDefiProvisionEmpleado(List<DefiProvisionEmpleado> defiprovisionempleadosAux) throws Exception {
		DefiProvisionEmpleadoConstantesFunciones.setEstadosInicialesDefiProvisionEmpleado(defiprovisionempleadosAux);
	}
	
	public void setEstadosInicialesDefiProvisionEmpleado(DefiProvisionEmpleado defiprovisionempleadoAux) throws Exception {
		DefiProvisionEmpleadoConstantesFunciones.setEstadosInicialesDefiProvisionEmpleado(defiprovisionempleadoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarDefiProvisionEmpleadoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesDefiProvisionEmpleado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarDefiProvisionEmpleadoActual()) {
				if(!this.isEsNuevoDefiProvisionEmpleado) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesDefiProvisionEmpleado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoDefiProvisionEmpleado=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarDefiProvisionEmpleadoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Defi Provision Empleado ?", "MANTENIMIENTO DE Defi Provision Empleado", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesDefiProvisionEmpleado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(DefiProvisionEmpleado defiprovisionempleado) throws Exception {
		DefiProvisionEmpleadoConstantesFunciones.seleccionarAsignar(this.defiprovisionempleado,defiprovisionempleado);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarDefiProvisionEmpleado=this.isPermisoActualizarOriginalDefiProvisionEmpleado;
			
			
			this.seleccionarAsignar(defiprovisionempleado);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			DefiProvisionEmpleadoConstantesFunciones.quitarEspaciosDefiProvisionEmpleado(this.defiprovisionempleado,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesDefiProvisionEmpleado("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.defiprovisionempleadoSessionBean.setsFuncionBusquedaRapida(this.defiprovisionempleadoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoDefiProvisionEmpleado) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosDefiProvisionEmpleado(esParaCancelar);				
				this.cancelarNuevoDefiProvisionEmpleado(esParaCancelar);								
			}
			
			this.defiprovisionempleado=new DefiProvisionEmpleado();
			
			this.inicializarDefiProvisionEmpleado();
			
			this.actualizarEstadoCeldasBotonesDefiProvisionEmpleado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarDefiProvisionEmpleado() throws Exception {
		try {
			DefiProvisionEmpleadoConstantesFunciones.inicializarDefiProvisionEmpleado(this.defiprovisionempleado);
			
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
			FuncionesSwing.manageException(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.defiprovisionempleadoLogic.getDefiProvisionEmpleados().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteDefiProvisionEmpleados(String sAccionBusqueda,List<DefiProvisionEmpleado> defiprovisionempleadosParaReportes) throws Exception {
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
					sPathReporteFinal="DefiProvisionEmpleado"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="DefiProvisionEmpleadoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("DefiProvisionEmpleadoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="DefiProvisionEmpleado"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Defi Provision Empleados");		
		parameters.put("busquedapor", DefiProvisionEmpleadoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(ProvisionEmpleado.class));
			classes.add(new Classe(Cuota.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					DefiProvisionEmpleadoLogic defiprovisionempleadoLogicAuxiliar=new DefiProvisionEmpleadoLogic();
					defiprovisionempleadoLogicAuxiliar.setDatosCliente(defiprovisionempleadoLogic.getDatosCliente());				
					defiprovisionempleadoLogicAuxiliar.setDefiProvisionEmpleados(defiprovisionempleadosParaReportes);
					
					defiprovisionempleadoLogicAuxiliar.cargarRelacionesLoteForeignKeyDefiProvisionEmpleadoWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					defiprovisionempleadosParaReportes=defiprovisionempleadoLogicAuxiliar.getDefiProvisionEmpleados();
					
					//defiprovisionempleadoLogic.getNewConnexionToDeep();
					
					//for (DefiProvisionEmpleado defiprovisionempleado:defiprovisionempleadosParaReportes) {
					//	defiprovisionempleadoLogic.deepLoad(defiprovisionempleado, false, DeepLoadType.INCLUDE, classes);
					//}						
					//defiprovisionempleadoLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//defiprovisionempleadoLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileProvisionEmpleado = AuxiliarReportes.class.getResourceAsStream("ProvisionEmpleadoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_provisionempleado", reportFileProvisionEmpleado);

			InputStream reportFileCuota = AuxiliarReportes.class.getResourceAsStream("CuotaDetalleRelacionesDesign.jasper");
			parameters.put("subreport_cuota", reportFileCuota);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceDefiProvisionEmpleado=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			DefiProvisionEmpleadoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			DefiProvisionEmpleadoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceDefiProvisionEmpleado=new JRBeanArrayDataSource(DefiProvisionEmpleadoJInternalFrame.TraerDefiProvisionEmpleadoBeans(defiprovisionempleadosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceDefiProvisionEmpleado);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+DefiProvisionEmpleadoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+DefiProvisionEmpleadoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(DefiProvisionEmpleadoBean.TraerDefiProvisionEmpleadoBeans(defiprovisionempleadosParaReportes).toArray()));
							
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
				this.generarExcelReporteDefiProvisionEmpleados(sAccionBusqueda,sTipoArchivoReporte,defiprovisionempleadosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalDefiProvisionEmpleados(sAccionBusqueda,sTipoArchivoReporte,defiprovisionempleadosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoDefiProvisionEmpleadoActionPerformed(null);
					//this.generarExcelReporteDefiProvisionEmpleados(sAccionBusqueda,sTipoArchivoReporte,defiprovisionempleadosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalDefiProvisionEmpleados(sAccionBusqueda,sTipoArchivoReporte,defiprovisionempleadosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesDefiProvisionEmpleados(sAccionBusqueda,sTipoArchivoReporte,defiprovisionempleadosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesDefiProvisionEmpleados(sAccionBusqueda,sTipoArchivoReporte,defiprovisionempleadosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteDefiProvisionEmpleados(String sAccionBusqueda,String sTipoArchivoReporte,List<DefiProvisionEmpleado> defiprovisionempleadosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"defiprovisionempleado";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DefiProvisionEmpleados");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDefiProvisionEmpleado("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(DefiProvisionEmpleado defiprovisionempleado : defiprovisionempleadosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			DefiProvisionEmpleadoConstantesFunciones.generarExcelReporteDataDefiProvisionEmpleado("NORMAL",row,workbook,defiprovisionempleado,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Defi Provision Empleado",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderDefiProvisionEmpleado(String sTipo,Row row,Workbook workbook) {
		
		DefiProvisionEmpleadoConstantesFunciones.generarExcelReporteHeaderDefiProvisionEmpleado(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalDefiProvisionEmpleados(String sAccionBusqueda,String sTipoArchivoReporte,List<DefiProvisionEmpleado> defiprovisionempleadosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"defiprovisionempleado_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DefiProvisionEmpleados");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(DefiProvisionEmpleado defiprovisionempleado : defiprovisionempleadosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(DefiProvisionEmpleadoConstantesFunciones.getDefiProvisionEmpleadoDescripcion(defiprovisionempleado));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DefiProvisionEmpleadoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DefiProvisionEmpleadoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(defiprovisionempleado.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DefiProvisionEmpleadoConstantesFunciones.LABEL_IDRUBROEMPLEA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DefiProvisionEmpleadoConstantesFunciones.LABEL_IDRUBROEMPLEA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(defiprovisionempleado.getrubroemplea_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DefiProvisionEmpleadoConstantesFunciones.LABEL_IDFORMATO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DefiProvisionEmpleadoConstantesFunciones.LABEL_IDFORMATO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(defiprovisionempleado.getformato_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DefiProvisionEmpleadoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DefiProvisionEmpleadoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(defiprovisionempleado.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DefiProvisionEmpleadoConstantesFunciones.LABEL_DIAINICIAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DefiProvisionEmpleadoConstantesFunciones.LABEL_DIAINICIAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(defiprovisionempleado.getdia_inicial());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DefiProvisionEmpleadoConstantesFunciones.LABEL_IDMESINICIAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DefiProvisionEmpleadoConstantesFunciones.LABEL_IDMESINICIAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(defiprovisionempleado.getmesinicial_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DefiProvisionEmpleadoConstantesFunciones.LABEL_DIAFINAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DefiProvisionEmpleadoConstantesFunciones.LABEL_DIAFINAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(defiprovisionempleado.getdia_final());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DefiProvisionEmpleadoConstantesFunciones.LABEL_IDMESFINAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DefiProvisionEmpleadoConstantesFunciones.LABEL_IDMESFINAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(defiprovisionempleado.getmesfinal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DefiProvisionEmpleadoConstantesFunciones.LABEL_PARALIQUIDACION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DefiProvisionEmpleadoConstantesFunciones.LABEL_PARALIQUIDACION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(defiprovisionempleado.getpara_liquidacion()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DefiProvisionEmpleadoConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DefiProvisionEmpleadoConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(defiprovisionempleado.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Defi Provision Empleado",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesDefiProvisionEmpleados(String sAccionBusqueda,String sTipoArchivoReporte,List<DefiProvisionEmpleado> defiprovisionempleadosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<DefiProvisionEmpleado> defiprovisionempleadosRespaldo=null;
		
		classes=DefiProvisionEmpleadoConstantesFunciones.getClassesRelationshipsOfDefiProvisionEmpleado(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.defiprovisionempleadoLogic.setDatosCliente(this.datosCliente);
		this.defiprovisionempleadoLogic.setDatosDeep(this.datosDeep);
		this.defiprovisionempleadoLogic.setIsConDeep(true);
		
		defiprovisionempleadosRespaldo=this.defiprovisionempleadoLogic.getDefiProvisionEmpleados();
		
		this.defiprovisionempleadoLogic.setDefiProvisionEmpleados(defiprovisionempleadosParaReportes);	
		this.defiprovisionempleadoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		defiprovisionempleadosParaReportes=this.defiprovisionempleadoLogic.getDefiProvisionEmpleados();
		this.defiprovisionempleadoLogic.setDefiProvisionEmpleados(defiprovisionempleadosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"defiprovisionempleado_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DefiProvisionEmpleados");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDefiProvisionEmpleado("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(DefiProvisionEmpleado defiprovisionempleado : defiprovisionempleadosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderDefiProvisionEmpleado("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			DefiProvisionEmpleadoConstantesFunciones.generarExcelReporteDataDefiProvisionEmpleado("NORMAL",row,workbook,defiprovisionempleado,cellStyleDataAux);
		
			
			


				//ProvisionEmpleado
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO))) {

				if(defiprovisionempleado.getProvisionEmpleados()!=null && defiprovisionempleado.getProvisionEmpleados().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ProvisionEmpleadoConstantesFunciones.generarExcelReporteHeaderProvisionEmpleado("RELACIONADO",row,workbook);
				}

				if(defiprovisionempleado.getProvisionEmpleados()!=null) {
					i2=0;
					for(ProvisionEmpleado provisionempleado : defiprovisionempleado.getProvisionEmpleados()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						ProvisionEmpleadoConstantesFunciones.generarExcelReporteDataProvisionEmpleado("RELACIONADO",row,workbook,provisionempleado,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//Cuota
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(CuotaConstantesFunciones.SCLASSWEBTITULO))) {

				if(defiprovisionempleado.getCuotas()!=null && defiprovisionempleado.getCuotas().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(CuotaConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					CuotaConstantesFunciones.generarExcelReporteHeaderCuota("RELACIONADO",row,workbook);
				}

				if(defiprovisionempleado.getCuotas()!=null) {
					i2=0;
					for(Cuota cuota : defiprovisionempleado.getCuotas()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						CuotaConstantesFunciones.generarExcelReporteDataCuota("RELACIONADO",row,workbook,cuota,cellStyleDataAuxHijo);
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
		cell.setCellValue(DefiProvisionEmpleadoConstantesFunciones.getDefiProvisionEmpleadoDescripcion(defiprovisionempleado));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Defi Provision Empleado",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoDefiProvisionEmpleado.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDefiProvisionEmpleado.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoDefiProvisionEmpleado.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDefiProvisionEmpleado.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessDefiProvisionEmpleado() throws Exception {		
		this.startProcessDefiProvisionEmpleado(true);
	}
	
	public void startProcessDefiProvisionEmpleado(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasDefiProvisionEmpleado ,this.jPanelParametrosReportesDefiProvisionEmpleado, this.jScrollPanelDatosDefiProvisionEmpleado,this.jPanelPaginacionDefiProvisionEmpleado, this.jScrollPanelDatosEdicionDefiProvisionEmpleado, this.jPanelAccionesDefiProvisionEmpleado,this.jPanelAccionesFormularioDefiProvisionEmpleado,this.jmenuBarDefiProvisionEmpleado,this.jmenuBarDetalleDefiProvisionEmpleado,this.jTtoolBarDefiProvisionEmpleado,this.jTtoolBarDetalleDefiProvisionEmpleado);		
		
		final JTabbedPane jTabbedPaneBusquedasDefiProvisionEmpleado=this.jTabbedPaneBusquedasDefiProvisionEmpleado; 
		
		final JPanel jPanelParametrosReportesDefiProvisionEmpleado=this.jPanelParametrosReportesDefiProvisionEmpleado;
		//final JScrollPane jScrollPanelDatosDefiProvisionEmpleado=this.jScrollPanelDatosDefiProvisionEmpleado;
		final JTable jTableDatosDefiProvisionEmpleado=this.jTableDatosDefiProvisionEmpleado;		
		final JPanel jPanelPaginacionDefiProvisionEmpleado=this.jPanelPaginacionDefiProvisionEmpleado;
		//final JScrollPane jScrollPanelDatosEdicionDefiProvisionEmpleado=this.jScrollPanelDatosEdicionDefiProvisionEmpleado;
		final JPanel jPanelAccionesDefiProvisionEmpleado=this.jPanelAccionesDefiProvisionEmpleado;
		
		JPanel jPanelCamposAuxiliarDefiProvisionEmpleado=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarDefiProvisionEmpleado=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormDefiProvisionEmpleado!=null) {
			jPanelCamposAuxiliarDefiProvisionEmpleado=this.jInternalFrameDetalleFormDefiProvisionEmpleado.jPanelCamposDefiProvisionEmpleado;
			jPanelAccionesFormularioAuxiliarDefiProvisionEmpleado=this.jInternalFrameDetalleFormDefiProvisionEmpleado.jPanelAccionesFormularioDefiProvisionEmpleado;
		}
		
		final JPanel jPanelCamposDefiProvisionEmpleado=jPanelCamposAuxiliarDefiProvisionEmpleado;
		final JPanel jPanelAccionesFormularioDefiProvisionEmpleado=jPanelAccionesFormularioAuxiliarDefiProvisionEmpleado;
		
		
		final JMenuBar jmenuBarDefiProvisionEmpleado=this.jmenuBarDefiProvisionEmpleado;
		final JToolBar jTtoolBarDefiProvisionEmpleado=this.jTtoolBarDefiProvisionEmpleado;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarDefiProvisionEmpleado=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDefiProvisionEmpleado=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormDefiProvisionEmpleado!=null) {
			jmenuBarDetalleAuxiliarDefiProvisionEmpleado=this.jInternalFrameDetalleFormDefiProvisionEmpleado.jmenuBarDetalleDefiProvisionEmpleado;
			jTtoolBarDetalleAuxiliarDefiProvisionEmpleado=this.jInternalFrameDetalleFormDefiProvisionEmpleado.jTtoolBarDetalleDefiProvisionEmpleado;
		}
		
		final JMenuBar jmenuBarDetalleDefiProvisionEmpleado=jmenuBarDetalleAuxiliarDefiProvisionEmpleado;
		final JToolBar jTtoolBarDetalleDefiProvisionEmpleado=jTtoolBarDetalleAuxiliarDefiProvisionEmpleado;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDefiProvisionEmpleado;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDefiProvisionEmpleado;
			processRunnable.jTableDatos=jTableDatosDefiProvisionEmpleado;
			processRunnable.jPanelCampos=jPanelCamposDefiProvisionEmpleado;
			processRunnable.jPanelPaginacion=jPanelPaginacionDefiProvisionEmpleado;
			processRunnable.jPanelAcciones=jPanelAccionesDefiProvisionEmpleado;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDefiProvisionEmpleado;
			
			
			processRunnable.jmenuBar=jmenuBarDefiProvisionEmpleado;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDefiProvisionEmpleado;
			processRunnable.jTtoolBar=jTtoolBarDefiProvisionEmpleado;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDefiProvisionEmpleado;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasDefiProvisionEmpleado ,jPanelParametrosReportesDefiProvisionEmpleado,jTableDatosDefiProvisionEmpleado, /*jScrollPanelDatosDefiProvisionEmpleado,*/jPanelCamposDefiProvisionEmpleado,jPanelPaginacionDefiProvisionEmpleado, /*jScrollPanelDatosEdicionDefiProvisionEmpleado,*/ jPanelAccionesDefiProvisionEmpleado,jPanelAccionesFormularioDefiProvisionEmpleado,jmenuBarDefiProvisionEmpleado,jmenuBarDetalleDefiProvisionEmpleado,jTtoolBarDefiProvisionEmpleado,jTtoolBarDetalleDefiProvisionEmpleado);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasDefiProvisionEmpleado ,jPanelParametrosReportesDefiProvisionEmpleado, jScrollPanelDatosDefiProvisionEmpleado,jPanelPaginacionDefiProvisionEmpleado, jScrollPanelDatosEdicionDefiProvisionEmpleado, jPanelAccionesDefiProvisionEmpleado,jPanelAccionesFormularioDefiProvisionEmpleado,jmenuBarDefiProvisionEmpleado,jmenuBarDetalleDefiProvisionEmpleado,jTtoolBarDefiProvisionEmpleado,jTtoolBarDetalleDefiProvisionEmpleado);
						
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
	
	public void finishProcessDefiProvisionEmpleado() {// throws Exception 
		this.finishProcessDefiProvisionEmpleado(true);
	}
	
	public void finishProcessDefiProvisionEmpleado(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasDefiProvisionEmpleado ,this.jPanelParametrosReportesDefiProvisionEmpleado, this.jScrollPanelDatosDefiProvisionEmpleado,this.jPanelPaginacionDefiProvisionEmpleado, this.jScrollPanelDatosEdicionDefiProvisionEmpleado, this.jPanelAccionesDefiProvisionEmpleado,this.jPanelAccionesFormularioDefiProvisionEmpleado,this.jmenuBarDefiProvisionEmpleado,this.jmenuBarDetalleDefiProvisionEmpleado,this.jTtoolBarDefiProvisionEmpleado,this.jTtoolBarDetalleDefiProvisionEmpleado);		
		
		final JTabbedPane jTabbedPaneBusquedasDefiProvisionEmpleado=this.jTabbedPaneBusquedasDefiProvisionEmpleado; 
		
		final JPanel jPanelParametrosReportesDefiProvisionEmpleado=this.jPanelParametrosReportesDefiProvisionEmpleado;
		//final JScrollPane jScrollPanelDatosDefiProvisionEmpleado=this.jScrollPanelDatosDefiProvisionEmpleado;
		final JTable jTableDatosDefiProvisionEmpleado=this.jTableDatosDefiProvisionEmpleado;		
		final JPanel jPanelPaginacionDefiProvisionEmpleado=this.jPanelPaginacionDefiProvisionEmpleado;
		//final JScrollPane jScrollPanelDatosEdicionDefiProvisionEmpleado=this.jScrollPanelDatosEdicionDefiProvisionEmpleado;
		final JPanel jPanelAccionesDefiProvisionEmpleado=this.jPanelAccionesDefiProvisionEmpleado;
		
		JPanel jPanelCamposAuxiliarDefiProvisionEmpleado=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarDefiProvisionEmpleado=new JPanel();
		
		if(this.jInternalFrameDetalleFormDefiProvisionEmpleado!=null) {
			jPanelCamposAuxiliarDefiProvisionEmpleado=this.jInternalFrameDetalleFormDefiProvisionEmpleado.jPanelCamposDefiProvisionEmpleado;
			jPanelAccionesFormularioAuxiliarDefiProvisionEmpleado=this.jInternalFrameDetalleFormDefiProvisionEmpleado.jPanelAccionesFormularioDefiProvisionEmpleado;
		}
		
		final JPanel jPanelCamposDefiProvisionEmpleado=jPanelCamposAuxiliarDefiProvisionEmpleado;
		final JPanel jPanelAccionesFormularioDefiProvisionEmpleado=jPanelAccionesFormularioAuxiliarDefiProvisionEmpleado;
		
		
		final JMenuBar jmenuBarDefiProvisionEmpleado=this.jmenuBarDefiProvisionEmpleado;		
		final JToolBar jTtoolBarDefiProvisionEmpleado=this.jTtoolBarDefiProvisionEmpleado;
				
		JMenuBar jmenuBarDetalleAuxiliarDefiProvisionEmpleado=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDefiProvisionEmpleado=new JToolBar();
		
		if(this.jInternalFrameDetalleFormDefiProvisionEmpleado!=null) {
			jmenuBarDetalleAuxiliarDefiProvisionEmpleado=this.jInternalFrameDetalleFormDefiProvisionEmpleado.jmenuBarDetalleDefiProvisionEmpleado;
			jTtoolBarDetalleAuxiliarDefiProvisionEmpleado=this.jInternalFrameDetalleFormDefiProvisionEmpleado.jTtoolBarDetalleDefiProvisionEmpleado;		
		}
		
		final JMenuBar jmenuBarDetalleDefiProvisionEmpleado=jmenuBarDetalleAuxiliarDefiProvisionEmpleado;
		final JToolBar jTtoolBarDetalleDefiProvisionEmpleado=jTtoolBarDetalleAuxiliarDefiProvisionEmpleado;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDefiProvisionEmpleado;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDefiProvisionEmpleado;
			processRunnable.jTableDatos=jTableDatosDefiProvisionEmpleado;
			processRunnable.jPanelCampos=jPanelCamposDefiProvisionEmpleado;
			processRunnable.jPanelPaginacion=jPanelPaginacionDefiProvisionEmpleado;
			processRunnable.jPanelAcciones=jPanelAccionesDefiProvisionEmpleado;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDefiProvisionEmpleado;
			
			
			processRunnable.jmenuBar=jmenuBarDefiProvisionEmpleado;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDefiProvisionEmpleado;
			processRunnable.jTtoolBar=jTtoolBarDefiProvisionEmpleado;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDefiProvisionEmpleado;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasDefiProvisionEmpleado ,jPanelParametrosReportesDefiProvisionEmpleado, jTableDatosDefiProvisionEmpleado,/*jScrollPanelDatosDefiProvisionEmpleado,*/jPanelCamposDefiProvisionEmpleado,jPanelPaginacionDefiProvisionEmpleado, /*jScrollPanelDatosEdicionDefiProvisionEmpleado,*/ jPanelAccionesDefiProvisionEmpleado,jPanelAccionesFormularioDefiProvisionEmpleado,jmenuBarDefiProvisionEmpleado,jmenuBarDetalleDefiProvisionEmpleado,jTtoolBarDefiProvisionEmpleado,jTtoolBarDetalleDefiProvisionEmpleado));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesDefiProvisionEmpleado(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarDefiProvisionEmpleado(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuDefiProvisionEmpleado(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarDefiProvisionEmpleado(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarDefiProvisionEmpleado,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleDefiProvisionEmpleado,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuDefiProvisionEmpleado(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarDefiProvisionEmpleado,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleDefiProvisionEmpleado,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.defiprovisionempleadoConstantesFunciones.getsFinalQueryDefiProvisionEmpleado();
		String  finalQueryPaginacionTodos=this.defiprovisionempleadoConstantesFunciones.getsFinalQueryDefiProvisionEmpleado();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=DefiProvisionEmpleadoConstantesFunciones.getArrayColumnasGlobalesNoDefiProvisionEmpleado(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=DefiProvisionEmpleadoConstantesFunciones.getArrayColumnasGlobalesDefiProvisionEmpleado(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,DefiProvisionEmpleadoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.defiprovisionempleadosEliminados= new ArrayList<DefiProvisionEmpleado>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessDefiProvisionEmpleado();
		
				///*DefiProvisionEmpleadoSessionBean*/this.defiprovisionempleadoSessionBean=new DefiProvisionEmpleadoSessionBean();
			
			if(this.defiprovisionempleadoSessionBean==null) {
				this.defiprovisionempleadoSessionBean=new DefiProvisionEmpleadoSessionBean();
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
					this.iNumeroPaginacion=DefiProvisionEmpleadoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=DefiProvisionEmpleadoConstantesFunciones.getClassesForeignKeysOfDefiProvisionEmpleado(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/defiprovisionempleado."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			defiprovisionempleadosAux= new ArrayList<DefiProvisionEmpleado>();
			
				
			defiprovisionempleadoLogic.setDatosCliente(this.datosCliente);
			defiprovisionempleadoLogic.setDatosDeep(this.datosDeep);
			defiprovisionempleadoLogic.setIsConDeep(true);
			
			
			defiprovisionempleadoLogic.getDefiProvisionEmpleadoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					defiprovisionempleadoLogic.getTodosDefiProvisionEmpleados(finalQueryGlobal,pagination);
					
					//defiprovisionempleadoLogic.getTodosDefiProvisionEmpleadosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(defiprovisionempleadoLogic.getDefiProvisionEmpleados()==null|| defiprovisionempleadoLogic.getDefiProvisionEmpleados().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							defiprovisionempleadosAux= new ArrayList<DefiProvisionEmpleado>();
							defiprovisionempleadosAux.addAll(defiprovisionempleadoLogic.getDefiProvisionEmpleados());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							defiprovisionempleadosAux= new ArrayList<DefiProvisionEmpleado>();
							defiprovisionempleadosAux.addAll(defiprovisionempleados);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							defiprovisionempleadoLogic.getTodosDefiProvisionEmpleados(finalQueryGlobal+"",this.pagination);												
							
							//defiprovisionempleadoLogic.getTodosDefiProvisionEmpleadosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteDefiProvisionEmpleados("Todos",defiprovisionempleadoLogic.getDefiProvisionEmpleados() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							defiprovisionempleadoLogic.setDefiProvisionEmpleados(new ArrayList<DefiProvisionEmpleado>());					
							defiprovisionempleadoLogic.getDefiProvisionEmpleados().addAll(defiprovisionempleadosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							defiprovisionempleados=new ArrayList<DefiProvisionEmpleado>();
							defiprovisionempleados.addAll(defiprovisionempleadosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idDefiProvisionEmpleado=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idDefiProvisionEmpleado=this.idActual;
				
				} else if(this.idDefiProvisionEmpleadoActual!=null && this.idDefiProvisionEmpleadoActual!=0L) {
					idDefiProvisionEmpleado=idDefiProvisionEmpleadoActual;
				}
				
					
				this.sDetalleReporte=DefiProvisionEmpleadoConstantesFunciones.getDetalleIndicePorId(idDefiProvisionEmpleado);
				
				this.defiprovisionempleados=new ArrayList<DefiProvisionEmpleado>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					defiprovisionempleadoLogic.getEntity(idDefiProvisionEmpleado);
					
					//defiprovisionempleadoLogic.getEntityWithConnection(idDefiProvisionEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					defiprovisionempleadoLogic.setDefiProvisionEmpleados(new ArrayList<DefiProvisionEmpleado>());
					defiprovisionempleadoLogic.getDefiProvisionEmpleados().add(defiprovisionempleadoLogic.getDefiProvisionEmpleado());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.defiprovisionempleados=new ArrayList<DefiProvisionEmpleado>();
					this.defiprovisionempleados.add(defiprovisionempleado);
				}
				
				if(defiprovisionempleadoLogic.getDefiProvisionEmpleado()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=DefiProvisionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					defiprovisionempleadoLogic.getDefiProvisionEmpleadosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DefiProvisionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DefiProvisionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=defiprovisionempleadoLogic.getDefiProvisionEmpleados()==null||defiprovisionempleadoLogic.getDefiProvisionEmpleados().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=defiprovisionempleados==null|| defiprovisionempleados.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						defiprovisionempleadosAux=new ArrayList<DefiProvisionEmpleado>();
						defiprovisionempleadosAux.addAll(defiprovisionempleadoLogic.getDefiProvisionEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							defiprovisionempleadosAux=new ArrayList<DefiProvisionEmpleado>();
							defiprovisionempleadosAux.addAll(defiprovisionempleados);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							defiprovisionempleadoLogic.getDefiProvisionEmpleadosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DefiProvisionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DefiProvisionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDefiProvisionEmpleados("FK_IdEmpresa",defiprovisionempleadoLogic.getDefiProvisionEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDefiProvisionEmpleados("FK_IdEmpresa",defiprovisionempleados);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						defiprovisionempleadoLogic.setDefiProvisionEmpleados(new ArrayList<DefiProvisionEmpleado>());
						defiprovisionempleadoLogic.getDefiProvisionEmpleados().addAll(defiprovisionempleadosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							defiprovisionempleados=new ArrayList<DefiProvisionEmpleado>();
							defiprovisionempleados.addAll(defiprovisionempleadosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdFormato")) {
				this.sDetalleReporte=DefiProvisionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdFormato(id_formatoFK_IdFormato);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					defiprovisionempleadoLogic.getDefiProvisionEmpleadosFK_IdFormato(finalQueryGlobal,pagination,id_formatoFK_IdFormato);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DefiProvisionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdFormato(id_formatoFK_IdFormato);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DefiProvisionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdFormato(id_formatoFK_IdFormato);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=defiprovisionempleadoLogic.getDefiProvisionEmpleados()==null||defiprovisionempleadoLogic.getDefiProvisionEmpleados().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=defiprovisionempleados==null|| defiprovisionempleados.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						defiprovisionempleadosAux=new ArrayList<DefiProvisionEmpleado>();
						defiprovisionempleadosAux.addAll(defiprovisionempleadoLogic.getDefiProvisionEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							defiprovisionempleadosAux=new ArrayList<DefiProvisionEmpleado>();
							defiprovisionempleadosAux.addAll(defiprovisionempleados);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							defiprovisionempleadoLogic.getDefiProvisionEmpleadosFK_IdFormato(finalQueryGlobal,pagination,id_formatoFK_IdFormato);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DefiProvisionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdFormato(id_formatoFK_IdFormato);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DefiProvisionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdFormato(id_formatoFK_IdFormato);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDefiProvisionEmpleados("FK_IdFormato",defiprovisionempleadoLogic.getDefiProvisionEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDefiProvisionEmpleados("FK_IdFormato",defiprovisionempleados);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						defiprovisionempleadoLogic.setDefiProvisionEmpleados(new ArrayList<DefiProvisionEmpleado>());
						defiprovisionempleadoLogic.getDefiProvisionEmpleados().addAll(defiprovisionempleadosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							defiprovisionempleados=new ArrayList<DefiProvisionEmpleado>();
							defiprovisionempleados.addAll(defiprovisionempleadosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdMesFinal")) {
				this.sDetalleReporte=DefiProvisionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdMesFinal(id_mes_finalFK_IdMesFinal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					defiprovisionempleadoLogic.getDefiProvisionEmpleadosFK_IdMesFinal(finalQueryGlobal,pagination,id_mes_finalFK_IdMesFinal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DefiProvisionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdMesFinal(id_mes_finalFK_IdMesFinal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DefiProvisionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdMesFinal(id_mes_finalFK_IdMesFinal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=defiprovisionempleadoLogic.getDefiProvisionEmpleados()==null||defiprovisionempleadoLogic.getDefiProvisionEmpleados().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=defiprovisionempleados==null|| defiprovisionempleados.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						defiprovisionempleadosAux=new ArrayList<DefiProvisionEmpleado>();
						defiprovisionempleadosAux.addAll(defiprovisionempleadoLogic.getDefiProvisionEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							defiprovisionempleadosAux=new ArrayList<DefiProvisionEmpleado>();
							defiprovisionempleadosAux.addAll(defiprovisionempleados);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							defiprovisionempleadoLogic.getDefiProvisionEmpleadosFK_IdMesFinal(finalQueryGlobal,pagination,id_mes_finalFK_IdMesFinal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DefiProvisionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdMesFinal(id_mes_finalFK_IdMesFinal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DefiProvisionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdMesFinal(id_mes_finalFK_IdMesFinal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDefiProvisionEmpleados("FK_IdMesFinal",defiprovisionempleadoLogic.getDefiProvisionEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDefiProvisionEmpleados("FK_IdMesFinal",defiprovisionempleados);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						defiprovisionempleadoLogic.setDefiProvisionEmpleados(new ArrayList<DefiProvisionEmpleado>());
						defiprovisionempleadoLogic.getDefiProvisionEmpleados().addAll(defiprovisionempleadosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							defiprovisionempleados=new ArrayList<DefiProvisionEmpleado>();
							defiprovisionempleados.addAll(defiprovisionempleadosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdMesInicial")) {
				this.sDetalleReporte=DefiProvisionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdMesInicial(id_mes_inicialFK_IdMesInicial);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					defiprovisionempleadoLogic.getDefiProvisionEmpleadosFK_IdMesInicial(finalQueryGlobal,pagination,id_mes_inicialFK_IdMesInicial);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DefiProvisionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdMesInicial(id_mes_inicialFK_IdMesInicial);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DefiProvisionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdMesInicial(id_mes_inicialFK_IdMesInicial);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=defiprovisionempleadoLogic.getDefiProvisionEmpleados()==null||defiprovisionempleadoLogic.getDefiProvisionEmpleados().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=defiprovisionempleados==null|| defiprovisionempleados.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						defiprovisionempleadosAux=new ArrayList<DefiProvisionEmpleado>();
						defiprovisionempleadosAux.addAll(defiprovisionempleadoLogic.getDefiProvisionEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							defiprovisionempleadosAux=new ArrayList<DefiProvisionEmpleado>();
							defiprovisionempleadosAux.addAll(defiprovisionempleados);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							defiprovisionempleadoLogic.getDefiProvisionEmpleadosFK_IdMesInicial(finalQueryGlobal,pagination,id_mes_inicialFK_IdMesInicial);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DefiProvisionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdMesInicial(id_mes_inicialFK_IdMesInicial);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DefiProvisionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdMesInicial(id_mes_inicialFK_IdMesInicial);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDefiProvisionEmpleados("FK_IdMesInicial",defiprovisionempleadoLogic.getDefiProvisionEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDefiProvisionEmpleados("FK_IdMesInicial",defiprovisionempleados);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						defiprovisionempleadoLogic.setDefiProvisionEmpleados(new ArrayList<DefiProvisionEmpleado>());
						defiprovisionempleadoLogic.getDefiProvisionEmpleados().addAll(defiprovisionempleadosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							defiprovisionempleados=new ArrayList<DefiProvisionEmpleado>();
							defiprovisionempleados.addAll(defiprovisionempleadosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdRubroEmplea")) {
				this.sDetalleReporte=DefiProvisionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdRubroEmplea(id_rubro_empleaFK_IdRubroEmplea);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					defiprovisionempleadoLogic.getDefiProvisionEmpleadosFK_IdRubroEmplea(finalQueryGlobal,pagination,id_rubro_empleaFK_IdRubroEmplea);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DefiProvisionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdRubroEmplea(id_rubro_empleaFK_IdRubroEmplea);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DefiProvisionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdRubroEmplea(id_rubro_empleaFK_IdRubroEmplea);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=defiprovisionempleadoLogic.getDefiProvisionEmpleados()==null||defiprovisionempleadoLogic.getDefiProvisionEmpleados().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=defiprovisionempleados==null|| defiprovisionempleados.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						defiprovisionempleadosAux=new ArrayList<DefiProvisionEmpleado>();
						defiprovisionempleadosAux.addAll(defiprovisionempleadoLogic.getDefiProvisionEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							defiprovisionempleadosAux=new ArrayList<DefiProvisionEmpleado>();
							defiprovisionempleadosAux.addAll(defiprovisionempleados);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							defiprovisionempleadoLogic.getDefiProvisionEmpleadosFK_IdRubroEmplea(finalQueryGlobal,pagination,id_rubro_empleaFK_IdRubroEmplea);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DefiProvisionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdRubroEmplea(id_rubro_empleaFK_IdRubroEmplea);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DefiProvisionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdRubroEmplea(id_rubro_empleaFK_IdRubroEmplea);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDefiProvisionEmpleados("FK_IdRubroEmplea",defiprovisionempleadoLogic.getDefiProvisionEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDefiProvisionEmpleados("FK_IdRubroEmplea",defiprovisionempleados);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						defiprovisionempleadoLogic.setDefiProvisionEmpleados(new ArrayList<DefiProvisionEmpleado>());
						defiprovisionempleadoLogic.getDefiProvisionEmpleados().addAll(defiprovisionempleadosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							defiprovisionempleados=new ArrayList<DefiProvisionEmpleado>();
							defiprovisionempleados.addAll(defiprovisionempleadosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesDefiProvisionEmpleado();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessDefiProvisionEmpleado();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=defiprovisionempleadoLogic.getDefiProvisionEmpleados().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=defiprovisionempleados.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=defiprovisionempleadoLogic.getDefiProvisionEmpleados().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=defiprovisionempleados.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(DefiProvisionEmpleado defiprovisionempleado) {
		Boolean permite=true;
		
		if(this.defiprovisionempleado.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=DefiProvisionEmpleadoConstantesFunciones.getOrderByListaDefiProvisionEmpleado();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=DefiProvisionEmpleadoConstantesFunciones.getOrderByListaDefiProvisionEmpleado();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DefiProvisionEmpleado defiprovisionempleado:defiprovisionempleadoLogic.getDefiProvisionEmpleados()) {
				if(defiprovisionempleado.getsType().equals(Constantes2.S_TOTALES)) {
					defiprovisionempleadoTotales=defiprovisionempleado;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DefiProvisionEmpleado defiprovisionempleado:this.defiprovisionempleados) {
				if(defiprovisionempleado.getsType().equals(Constantes2.S_TOTALES)) {
					defiprovisionempleadoTotales=defiprovisionempleado;
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
			this.defiprovisionempleadoAux=new DefiProvisionEmpleado();
			this.defiprovisionempleadoAux.setsType(Constantes2.S_TOTALES);
			this.defiprovisionempleadoAux.setIsNew(false);
			this.defiprovisionempleadoAux.setIsChanged(false);
			this.defiprovisionempleadoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				DefiProvisionEmpleadoConstantesFunciones.TotalizarValoresFilaDefiProvisionEmpleado(this.defiprovisionempleadoLogic.getDefiProvisionEmpleados(),this.defiprovisionempleadoAux);
				
				this.defiprovisionempleadoLogic.getDefiProvisionEmpleados().add(this.defiprovisionempleadoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				DefiProvisionEmpleadoConstantesFunciones.TotalizarValoresFilaDefiProvisionEmpleado(this.defiprovisionempleados,this.defiprovisionempleadoAux);
				
				this.defiprovisionempleados.add(this.defiprovisionempleadoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		defiprovisionempleadoTotales=new DefiProvisionEmpleado();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.defiprovisionempleadoLogic.getDefiProvisionEmpleados().remove(defiprovisionempleadoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.defiprovisionempleados.remove(defiprovisionempleadoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		defiprovisionempleadoTotales=new DefiProvisionEmpleado();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DefiProvisionEmpleado defiprovisionempleado:defiprovisionempleadoLogic.getDefiProvisionEmpleados()) {
				if(defiprovisionempleado.getsType().equals(Constantes2.S_TOTALES)) {
					defiprovisionempleadoTotales=defiprovisionempleado;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DefiProvisionEmpleadoConstantesFunciones.TotalizarValoresFilaDefiProvisionEmpleado(this.defiprovisionempleadoLogic.getDefiProvisionEmpleados(),defiprovisionempleadoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DefiProvisionEmpleado defiprovisionempleado:this.defiprovisionempleados) {
				if(defiprovisionempleado.getsType().equals(Constantes2.S_TOTALES)) {
					defiprovisionempleadoTotales=defiprovisionempleado;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DefiProvisionEmpleadoConstantesFunciones.TotalizarValoresFilaDefiProvisionEmpleado(this.defiprovisionempleados,defiprovisionempleadoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getDefiProvisionEmpleadosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDefiProvisionEmpleadosFK_IdFormato()throws Exception {
		try {
			sAccionBusqueda="FK_IdFormato";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDefiProvisionEmpleadosFK_IdMesFinal()throws Exception {
		try {
			sAccionBusqueda="FK_IdMesFinal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDefiProvisionEmpleadosFK_IdMesInicial()throws Exception {
		try {
			sAccionBusqueda="FK_IdMesInicial";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDefiProvisionEmpleadosFK_IdRubroEmplea()throws Exception {
		try {
			sAccionBusqueda="FK_IdRubroEmplea";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getDefiProvisionEmpleadosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					defiprovisionempleadoLogic.getDefiProvisionEmpleadosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDefiProvisionEmpleadosFK_IdFormato(String sFinalQuery,Long id_formato)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					defiprovisionempleadoLogic.getDefiProvisionEmpleadosFK_IdFormato(sFinalQuery,this.pagination,id_formato);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDefiProvisionEmpleadosFK_IdMesFinal(String sFinalQuery,Long id_mes_final)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					defiprovisionempleadoLogic.getDefiProvisionEmpleadosFK_IdMesFinal(sFinalQuery,this.pagination,id_mes_final);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDefiProvisionEmpleadosFK_IdMesInicial(String sFinalQuery,Long id_mes_inicial)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					defiprovisionempleadoLogic.getDefiProvisionEmpleadosFK_IdMesInicial(sFinalQuery,this.pagination,id_mes_inicial);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDefiProvisionEmpleadosFK_IdRubroEmplea(String sFinalQuery,Long id_rubro_emplea)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					defiprovisionempleadoLogic.getDefiProvisionEmpleadosFK_IdRubroEmplea(sFinalQuery,this.pagination,id_rubro_emplea);
				
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
	
	public void inicializarPermisosDefiProvisionEmpleado() {
		this.isPermisoTodoDefiProvisionEmpleado=false;
		this.isPermisoNuevoDefiProvisionEmpleado=false;
		this.isPermisoActualizarDefiProvisionEmpleado=false;
		this.isPermisoActualizarOriginalDefiProvisionEmpleado=false;
		this.isPermisoEliminarDefiProvisionEmpleado=false;
		this.isPermisoGuardarCambiosDefiProvisionEmpleado=false;
		this.isPermisoConsultaDefiProvisionEmpleado=false;
		this.isPermisoBusquedaDefiProvisionEmpleado=false;
		this.isPermisoReporteDefiProvisionEmpleado=false;		
		this.isPermisoOrdenDefiProvisionEmpleado=false;		
		this.isPermisoPaginacionMedioDefiProvisionEmpleado=false;		
		this.isPermisoPaginacionAltoDefiProvisionEmpleado=false;
		this.isPermisoPaginacionTodoDefiProvisionEmpleado=false;
		this.isPermisoCopiarDefiProvisionEmpleado=false;		
		this.isPermisoVerFormDefiProvisionEmpleado=false;		
		this.isPermisoDuplicarDefiProvisionEmpleado=false;		
		this.isPermisoOrdenDefiProvisionEmpleado=false;		
	}
	
	public void setPermisosUsuarioDefiProvisionEmpleado(Boolean isPermiso) {
		this.isPermisoTodoDefiProvisionEmpleado=isPermiso;
		this.isPermisoNuevoDefiProvisionEmpleado=isPermiso;
		this.isPermisoActualizarDefiProvisionEmpleado=isPermiso;
		this.isPermisoActualizarOriginalDefiProvisionEmpleado=isPermiso;
		this.isPermisoEliminarDefiProvisionEmpleado=isPermiso;
		this.isPermisoGuardarCambiosDefiProvisionEmpleado=isPermiso;
		this.isPermisoConsultaDefiProvisionEmpleado=isPermiso;
		this.isPermisoBusquedaDefiProvisionEmpleado=isPermiso;
		this.isPermisoReporteDefiProvisionEmpleado=isPermiso;
		this.isPermisoOrdenDefiProvisionEmpleado=isPermiso;		
		this.isPermisoPaginacionMedioDefiProvisionEmpleado=isPermiso;		
		this.isPermisoPaginacionAltoDefiProvisionEmpleado=isPermiso;		
		this.isPermisoPaginacionTodoDefiProvisionEmpleado=isPermiso;		
		this.isPermisoCopiarDefiProvisionEmpleado=isPermiso;		
		this.isPermisoVerFormDefiProvisionEmpleado=isPermiso;		
		this.isPermisoDuplicarDefiProvisionEmpleado=isPermiso;
		this.isPermisoOrdenDefiProvisionEmpleado=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioDefiProvisionEmpleado(Boolean isPermiso) {
		//this.isPermisoTodoDefiProvisionEmpleado=isPermiso;
		this.isPermisoNuevoDefiProvisionEmpleado=isPermiso;
		this.isPermisoActualizarDefiProvisionEmpleado=isPermiso;
		this.isPermisoActualizarOriginalDefiProvisionEmpleado=isPermiso;
		this.isPermisoEliminarDefiProvisionEmpleado=isPermiso;
		this.isPermisoGuardarCambiosDefiProvisionEmpleado=isPermiso;
		//this.isPermisoConsultaDefiProvisionEmpleado=isPermiso;
		//this.isPermisoBusquedaDefiProvisionEmpleado=isPermiso;
		//this.isPermisoReporteDefiProvisionEmpleado=isPermiso;
		//this.isPermisoOrdenDefiProvisionEmpleado=isPermiso;		
		//this.isPermisoPaginacionMedioDefiProvisionEmpleado=isPermiso;		
		//this.isPermisoPaginacionAltoDefiProvisionEmpleado=isPermiso;		
		//this.isPermisoPaginacionTodoDefiProvisionEmpleado=isPermiso;		
		//this.isPermisoCopiarDefiProvisionEmpleado=isPermiso;		
		//this.isPermisoDuplicarDefiProvisionEmpleado=isPermiso;
		//this.isPermisoOrdenDefiProvisionEmpleado=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioDefiProvisionEmpleadoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(ProvisionEmpleadoConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(CuotaConstantesFunciones.SNOMBREOPCION);
		
		if(DefiProvisionEmpleadoJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosProvisionEmpleado=false;
		this.isTienePermisosProvisionEmpleado=this.verificarGetPermisosUsuarioOpcionDefiProvisionEmpleadoClaseRelacionada(this.opcionsRelacionadas,ProvisionEmpleadoConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosCuota=false;
		this.isTienePermisosCuota=this.verificarGetPermisosUsuarioOpcionDefiProvisionEmpleadoClaseRelacionada(this.opcionsRelacionadas,CuotaConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebDefiProvisionEmpleado(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioDefiProvisionEmpleadoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosProvisionEmpleado=conPermiso;
		this.isTienePermisosCuota=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioDefiProvisionEmpleadoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionDefiProvisionEmpleadoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioDefiProvisionEmpleadoClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosProvisionEmpleado && this.jInternalFrameDetalleFormDefiProvisionEmpleado!=null && this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormDefiProvisionEmpleado.jTabbedPaneRelacionesDefiProvisionEmpleado.remove(this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosCuota && this.jInternalFrameDetalleFormDefiProvisionEmpleado!=null && this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormDefiProvisionEmpleado.jTabbedPaneRelacionesDefiProvisionEmpleado.remove(this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioDefiProvisionEmpleado() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(DefiProvisionEmpleadoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, DefiProvisionEmpleadoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoDefiProvisionEmpleado=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarDefiProvisionEmpleado=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalDefiProvisionEmpleado=this.isPermisoActualizarDefiProvisionEmpleado;
			this.isPermisoEliminarDefiProvisionEmpleado=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosDefiProvisionEmpleado=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaDefiProvisionEmpleado=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaDefiProvisionEmpleado=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoDefiProvisionEmpleado=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteDefiProvisionEmpleado=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDefiProvisionEmpleado=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioDefiProvisionEmpleado=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoDefiProvisionEmpleado=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoDefiProvisionEmpleado=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarDefiProvisionEmpleado=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormDefiProvisionEmpleado=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarDefiProvisionEmpleado=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDefiProvisionEmpleado=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosDefiProvisionEmpleado.setToolTipText(this.jTableDatosDefiProvisionEmpleado.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioDefiProvisionEmpleado(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioDefiProvisionEmpleado(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(DefiProvisionEmpleadoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(DefiProvisionEmpleadoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioDefiProvisionEmpleado() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosProvisionEmpleado && this.defiprovisionempleadoConstantesFunciones.mostrarProvisionEmpleadoDefiProvisionEmpleado && !DefiProvisionEmpleadoConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Provision Empleado");
			reporte.setsDescripcion("Provision Empleado");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosCuota && this.defiprovisionempleadoConstantesFunciones.mostrarCuotaDefiProvisionEmpleado && !DefiProvisionEmpleadoConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Cuota");
			reporte.setsDescripcion("Cuota");
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
	public void inicializarCombosForeignKeyDefiProvisionEmpleadoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.rubroempleasForeignKey=new ArrayList();
				this.formatosForeignKey=new ArrayList();
				this.mesinicialsForeignKey=new ArrayList();
				this.mesfinalsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyDefiProvisionEmpleadoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(DefiProvisionEmpleadoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyDefiProvisionEmpleadoListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyRubroEmpleaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyFormatoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyMesInicialListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyMesFinalListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyRubroEmpleaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.rubroempleasForeignKey==null||this.rubroempleasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=RubroEmpleaConstantesFunciones.getArrayColumnasGlobalesRubroEmplea(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,RubroEmpleaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=RubroEmpleaConstantesFunciones.SFINALQUERY;

				this.cargarCombosRubroEmpleasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyFormatoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.formatosForeignKey==null||this.formatosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=FormatoConstantesFunciones.getArrayColumnasGlobalesFormato(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,FormatoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=FormatoConstantesFunciones.SFINALQUERY;

				this.cargarCombosFormatosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyMesInicialListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.mesinicialsForeignKey==null||this.mesinicialsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=MesConstantesFunciones.getArrayColumnasGlobalesMes(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,MesConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=MesConstantesFunciones.SFINALQUERY;

				this.cargarCombosMesInicialsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyMesFinalListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.mesfinalsForeignKey==null||this.mesfinalsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=MesConstantesFunciones.getArrayColumnasGlobalesMes(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,MesConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=MesConstantesFunciones.SFINALQUERY;

				this.cargarCombosMesFinalsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyDefiProvisionEmpleadoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			DefiProvisionEmpleadoParameterReturnGeneral defiprovisionempleadoReturnGeneral=new DefiProvisionEmpleadoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.defiprovisionempleadoConstantesFunciones.cargarid_empresaDefiProvisionEmpleado)
					 || (this.esRecargarFks && this.defiprovisionempleadoConstantesFunciones.cargarid_empresaDefiProvisionEmpleado)) {

					if(!this.defiprovisionempleadoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+defiprovisionempleadoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalRubroEmplea="";

				if(((this.rubroempleasForeignKey==null||this.rubroempleasForeignKey.size()<=0) && this.defiprovisionempleadoConstantesFunciones.cargarid_rubro_empleaDefiProvisionEmpleado)
					 || (this.esRecargarFks && this.defiprovisionempleadoConstantesFunciones.cargarid_rubro_empleaDefiProvisionEmpleado)) {

					if(!this.defiprovisionempleadoSessionBean.getisBusquedaDesdeForeignKeySesionRubroEmplea()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=RubroEmpleaConstantesFunciones.getArrayColumnasGlobalesRubroEmplea(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalRubroEmplea=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,RubroEmpleaConstantesFunciones.TABLENAME);

						finalQueryGlobalRubroEmplea=Funciones.GetFinalQueryAppend(finalQueryGlobalRubroEmplea, "");
						finalQueryGlobalRubroEmplea+=RubroEmpleaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosRubroEmpleasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalRubroEmplea=" WHERE " + ConstantesSql.ID + "="+defiprovisionempleadoSessionBean.getlidRubroEmpleaActual();
					}
				} else {
					finalQueryGlobalRubroEmplea="NONE";
				}


				String finalQueryGlobalFormato="";

				if(((this.formatosForeignKey==null||this.formatosForeignKey.size()<=0) && this.defiprovisionempleadoConstantesFunciones.cargarid_formatoDefiProvisionEmpleado)
					 || (this.esRecargarFks && this.defiprovisionempleadoConstantesFunciones.cargarid_formatoDefiProvisionEmpleado)) {

					if(!this.defiprovisionempleadoSessionBean.getisBusquedaDesdeForeignKeySesionFormato()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=FormatoConstantesFunciones.getArrayColumnasGlobalesFormato(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalFormato=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,FormatoConstantesFunciones.TABLENAME);

						finalQueryGlobalFormato=Funciones.GetFinalQueryAppend(finalQueryGlobalFormato, "");
						finalQueryGlobalFormato+=FormatoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosFormatosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalFormato=" WHERE " + ConstantesSql.ID + "="+defiprovisionempleadoSessionBean.getlidFormatoActual();
					}
				} else {
					finalQueryGlobalFormato="NONE";
				}


				String finalQueryGlobalMesInicial="";

				if(((this.mesinicialsForeignKey==null||this.mesinicialsForeignKey.size()<=0) && this.defiprovisionempleadoConstantesFunciones.cargarid_mes_inicialDefiProvisionEmpleado)
					 || (this.esRecargarFks && this.defiprovisionempleadoConstantesFunciones.cargarid_mes_inicialDefiProvisionEmpleado)) {

					if(!this.defiprovisionempleadoSessionBean.getisBusquedaDesdeForeignKeySesionMesInicial()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=MesConstantesFunciones.getArrayColumnasGlobalesMes(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalMesInicial=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,MesConstantesFunciones.TABLENAME);

						finalQueryGlobalMesInicial=Funciones.GetFinalQueryAppend(finalQueryGlobalMesInicial, "");
						finalQueryGlobalMesInicial+=MesConstantesFunciones.SFINALQUERY;

						//this.cargarCombosMesInicialsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalMesInicial=" WHERE " + ConstantesSql.ID + "="+defiprovisionempleadoSessionBean.getlidMesInicialActual();
					}
				} else {
					finalQueryGlobalMesInicial="NONE";
				}


				String finalQueryGlobalMesFinal="";

				if(((this.mesfinalsForeignKey==null||this.mesfinalsForeignKey.size()<=0) && this.defiprovisionempleadoConstantesFunciones.cargarid_mes_finalDefiProvisionEmpleado)
					 || (this.esRecargarFks && this.defiprovisionempleadoConstantesFunciones.cargarid_mes_finalDefiProvisionEmpleado)) {

					if(!this.defiprovisionempleadoSessionBean.getisBusquedaDesdeForeignKeySesionMesFinal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=MesConstantesFunciones.getArrayColumnasGlobalesMes(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalMesFinal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,MesConstantesFunciones.TABLENAME);

						finalQueryGlobalMesFinal=Funciones.GetFinalQueryAppend(finalQueryGlobalMesFinal, "");
						finalQueryGlobalMesFinal+=MesConstantesFunciones.SFINALQUERY;

						//this.cargarCombosMesFinalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalMesFinal=" WHERE " + ConstantesSql.ID + "="+defiprovisionempleadoSessionBean.getlidMesFinalActual();
					}
				} else {
					finalQueryGlobalMesFinal="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				defiprovisionempleadoReturnGeneral=defiprovisionempleadoLogic.cargarCombosLoteForeignKeyDefiProvisionEmpleado(finalQueryGlobalEmpresa,finalQueryGlobalRubroEmplea,finalQueryGlobalFormato,finalQueryGlobalMesInicial,finalQueryGlobalMesFinal);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=defiprovisionempleadoReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalRubroEmplea.equals("NONE")) {
				this.rubroempleasForeignKey=defiprovisionempleadoReturnGeneral.getrubroempleasForeignKey();
			}

			if(!finalQueryGlobalFormato.equals("NONE")) {
				this.formatosForeignKey=defiprovisionempleadoReturnGeneral.getformatosForeignKey();
			}

			if(!finalQueryGlobalMesInicial.equals("NONE")) {
				this.mesinicialsForeignKey=defiprovisionempleadoReturnGeneral.getmesinicialsForeignKey();
			}

			if(!finalQueryGlobalMesFinal.equals("NONE")) {
				this.mesfinalsForeignKey=defiprovisionempleadoReturnGeneral.getmesfinalsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyDefiProvisionEmpleado()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyRubroEmplea();
			this.addItemDefectoCombosForeignKeyFormato();
			this.addItemDefectoCombosForeignKeyMesInicial();
			this.addItemDefectoCombosForeignKeyMesFinal();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.defiprovisionempleadoSessionBean==null) {
				this.defiprovisionempleadoSessionBean=new DefiProvisionEmpleadoSessionBean();
			}

			if(!this.defiprovisionempleadoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyRubroEmplea()throws Exception {
		try {

			if(!this.defiprovisionempleadoSessionBean.getisBusquedaDesdeForeignKeySesionRubroEmplea()) {
				RubroEmplea rubroemplea=new RubroEmplea();
				RubroEmpleaConstantesFunciones.setRubroEmpleaDescripcion(rubroemplea,Constantes.SMENSAJE_ESCOJA_OPCION);
				rubroemplea.setId(null);

				if(!RubroEmpleaConstantesFunciones.ExisteEnLista(this.rubroempleasForeignKey,rubroemplea,true)) {

					this.rubroempleasForeignKey.add(0,rubroemplea);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyFormato()throws Exception {
		try {

			if(!this.defiprovisionempleadoSessionBean.getisBusquedaDesdeForeignKeySesionFormato()) {
				Formato formato=new Formato();
				FormatoConstantesFunciones.setFormatoDescripcion(formato,Constantes.SMENSAJE_ESCOJA_OPCION);
				formato.setId(null);

				if(!FormatoConstantesFunciones.ExisteEnLista(this.formatosForeignKey,formato,true)) {

					this.formatosForeignKey.add(0,formato);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyMesInicial()throws Exception {
		try {

			if(!this.defiprovisionempleadoSessionBean.getisBusquedaDesdeForeignKeySesionMesInicial()) {
				Mes mesinicial=new Mes();
				MesConstantesFunciones.setMesDescripcion(mesinicial,Constantes.SMENSAJE_ESCOJA_OPCION);
				mesinicial.setId(null);

				if(!MesConstantesFunciones.ExisteEnLista(this.mesinicialsForeignKey,mesinicial,true)) {

					this.mesinicialsForeignKey.add(0,mesinicial);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyMesFinal()throws Exception {
		try {

			if(!this.defiprovisionempleadoSessionBean.getisBusquedaDesdeForeignKeySesionMesFinal()) {
				Mes mesfinal=new Mes();
				MesConstantesFunciones.setMesDescripcion(mesfinal,Constantes.SMENSAJE_ESCOJA_OPCION);
				mesfinal.setId(null);

				if(!MesConstantesFunciones.ExisteEnLista(this.mesfinalsForeignKey,mesfinal,true)) {

					this.mesfinalsForeignKey.add(0,mesfinal);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyDefiProvisionEmpleado()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyDefiProvisionEmpleado(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyDefiProvisionEmpleado()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyDefiProvisionEmpleado();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyDefiProvisionEmpleado(DefiProvisionEmpleado defiprovisionempleado)throws Exception {	
		try {
			
			this.setActualRubroEmpleaForeignKey(defiprovisionempleado.getid_rubro_emplea(),false,"Formulario");
			this.setActualFormatoForeignKey(defiprovisionempleado.getid_formato(),false,"Formulario");
			this.setActualMesInicialForeignKey(defiprovisionempleado.getid_mes_inicial(),false,"Formulario");
			this.setActualMesFinalForeignKey(defiprovisionempleado.getid_mes_final(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyDefiProvisionEmpleado(DefiProvisionEmpleado defiprovisionempleado,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyDefiProvisionEmpleado()throws Exception {	
		try {
			
			this.setActualRubroEmpleaForeignKey(this.defiprovisionempleadoConstantesFunciones.getid_rubro_emplea(),false,"Formulario");
			this.setActualFormatoForeignKey(this.defiprovisionempleadoConstantesFunciones.getid_formato(),false,"Formulario");
			this.setActualMesInicialForeignKey(this.defiprovisionempleadoConstantesFunciones.getid_mes_inicial(),false,"Formulario");
			this.setActualMesFinalForeignKey(this.defiprovisionempleadoConstantesFunciones.getid_mes_final(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyDefiProvisionEmpleado()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyDefiProvisionEmpleado()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyDefiProvisionEmpleado()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroDefiProvisionEmpleado()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyDefiProvisionEmpleado()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameRubroEmpleasForeignKey("Todos");
			this.cargarCombosFrameFormatosForeignKey("Todos");
			this.cargarCombosFrameMesInicialsForeignKey("Todos");
			this.cargarCombosFrameMesFinalsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyDefiProvisionEmpleado(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameRubroEmpleasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameFormatosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameMesInicialsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameMesFinalsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyDefiProvisionEmpleado()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormDefiProvisionEmpleado.jComboBoxid_empresaDefiProvisionEmpleado!=null && this.jInternalFrameDetalleFormDefiProvisionEmpleado.jComboBoxid_empresaDefiProvisionEmpleado.getItemCount()>0) {
				this.jInternalFrameDetalleFormDefiProvisionEmpleado.jComboBoxid_empresaDefiProvisionEmpleado.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDefiProvisionEmpleado.jComboBoxid_rubro_empleaDefiProvisionEmpleado!=null && this.jInternalFrameDetalleFormDefiProvisionEmpleado.jComboBoxid_rubro_empleaDefiProvisionEmpleado.getItemCount()>0) {
				this.jInternalFrameDetalleFormDefiProvisionEmpleado.jComboBoxid_rubro_empleaDefiProvisionEmpleado.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDefiProvisionEmpleado.jComboBoxid_formatoDefiProvisionEmpleado!=null && this.jInternalFrameDetalleFormDefiProvisionEmpleado.jComboBoxid_formatoDefiProvisionEmpleado.getItemCount()>0) {
				this.jInternalFrameDetalleFormDefiProvisionEmpleado.jComboBoxid_formatoDefiProvisionEmpleado.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDefiProvisionEmpleado.jComboBoxid_mes_inicialDefiProvisionEmpleado!=null && this.jInternalFrameDetalleFormDefiProvisionEmpleado.jComboBoxid_mes_inicialDefiProvisionEmpleado.getItemCount()>0) {
				this.jInternalFrameDetalleFormDefiProvisionEmpleado.jComboBoxid_mes_inicialDefiProvisionEmpleado.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDefiProvisionEmpleado.jComboBoxid_mes_finalDefiProvisionEmpleado!=null && this.jInternalFrameDetalleFormDefiProvisionEmpleado.jComboBoxid_mes_finalDefiProvisionEmpleado.getItemCount()>0) {
				this.jInternalFrameDetalleFormDefiProvisionEmpleado.jComboBoxid_mes_finalDefiProvisionEmpleado.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	










	
	

	public DefiProvisionEmpleadoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public DefiProvisionEmpleadoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public DefiProvisionEmpleadoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.defiprovisionempleadoSessionBean=new DefiProvisionEmpleadoSessionBean(); 
		this.defiprovisionempleadoConstantesFunciones=new DefiProvisionEmpleadoConstantesFunciones(); 
		this.defiprovisionempleadoBean=new DefiProvisionEmpleado();//(this.defiprovisionempleadoConstantesFunciones); 		
		this.defiprovisionempleadoReturnGeneral=new DefiProvisionEmpleadoParameterReturnGeneral(); 
		
		this.defiprovisionempleadoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.defiprovisionempleadoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public DefiProvisionEmpleadoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public DefiProvisionEmpleadoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public DefiProvisionEmpleadoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessDefiProvisionEmpleado(true);
			
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
			
			this.defiprovisionempleadoConstantesFunciones=new DefiProvisionEmpleadoConstantesFunciones(); 
			this.defiprovisionempleadoBean=new DefiProvisionEmpleado();//this.defiprovisionempleadoConstantesFunciones); 			
			this.defiprovisionempleadoReturnGeneral=new DefiProvisionEmpleadoParameterReturnGeneral(); 
		
			DefiProvisionEmpleadoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Defi Provision Empleado Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.defiprovisionempleado=new DefiProvisionEmpleado();
			this.defiprovisionempleados = new ArrayList<DefiProvisionEmpleado>();
			this.defiprovisionempleadosAux = new ArrayList<DefiProvisionEmpleado>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.defiprovisionempleadoLogic=new DefiProvisionEmpleadoLogic();
				this.defiprovisionempleadoLogic.getNewConnexionToDeep("");
			}
			
			//this.defiprovisionempleadoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.defiprovisionempleadoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormDefiProvisionEmpleado);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoDefiProvisionEmpleado!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDefiProvisionEmpleado);	
					}
					
					if(this.jInternalFrameImportacionDefiProvisionEmpleado!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDefiProvisionEmpleado);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByDefiProvisionEmpleado!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByDefiProvisionEmpleado);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormDefiProvisionEmpleado!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormDefiProvisionEmpleado);
				this.jInternalFrameDetalleFormDefiProvisionEmpleado.setVisible(false);
				this.jInternalFrameDetalleFormDefiProvisionEmpleado.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoDefiProvisionEmpleado!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDefiProvisionEmpleado);
					this.jInternalFrameReporteDinamicoDefiProvisionEmpleado.setVisible(false);
					this.jInternalFrameReporteDinamicoDefiProvisionEmpleado.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionDefiProvisionEmpleado!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionDefiProvisionEmpleado);
					this.jInternalFrameImportacionDefiProvisionEmpleado.setVisible(false);
					this.jInternalFrameImportacionDefiProvisionEmpleado.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByDefiProvisionEmpleado!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByDefiProvisionEmpleado);
					this.jInternalFrameOrderByDefiProvisionEmpleado.setVisible(false);
					this.jInternalFrameOrderByDefiProvisionEmpleado.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idDefiProvisionEmpleadoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=DefiProvisionEmpleadoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.defiprovisionempleadoReturnGeneral=new DefiProvisionEmpleadoParameterReturnGeneral();
			
			this.defiprovisionempleadoParameterGeneral=new DefiProvisionEmpleadoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.defiprovisionempleadoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(DefiProvisionEmpleadoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(ProvisionEmpleadoConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(CuotaConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DefiProvisionEmpleadoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado(),this.defiprovisionempleadoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DefiProvisionEmpleadoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado(),this.defiprovisionempleadoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoDefiProvisionEmpleado=false;
			this.isVisibilidadCeldaDuplicarDefiProvisionEmpleado=true;
			this.isVisibilidadCeldaCopiarDefiProvisionEmpleado=true;
			this.isVisibilidadCeldaVerFormDefiProvisionEmpleado=true;
			this.isVisibilidadCeldaOrdenDefiProvisionEmpleado=true;
			this.isVisibilidadCeldaNuevoRelacionesDefiProvisionEmpleado=false;
			this.isVisibilidadCeldaModificarDefiProvisionEmpleado=false;
			this.isVisibilidadCeldaActualizarDefiProvisionEmpleado=false;
			this.isVisibilidadCeldaEliminarDefiProvisionEmpleado=false;
			this.isVisibilidadCeldaCancelarDefiProvisionEmpleado=false;
			this.isVisibilidadCeldaGuardarDefiProvisionEmpleado=false;
			this.isVisibilidadCeldaGuardarCambiosDefiProvisionEmpleado=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdFormato=true;
			this.isVisibilidadFK_IdMesFinal=true;
			this.isVisibilidadFK_IdMesInicial=true;
			this.isVisibilidadFK_IdRubroEmplea=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesDefiProvisionEmpleado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosDefiProvisionEmpleado();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioDefiProvisionEmpleado(false);
			
			this.setPermisosUsuarioDefiProvisionEmpleado();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado() 
				|| (this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado() && this.defiprovisionempleadoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioDefiProvisionEmpleadoClasesRelacionadas();
			}
			
			if(this.defiprovisionempleadoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioDefiProvisionEmpleadoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!DefiProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosDefiProvisionEmpleado();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualDefiProvisionEmpleado();
			}
			
			if(!this.isPermisoBusquedaDefiProvisionEmpleado) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasDefiProvisionEmpleado.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioDefiProvisionEmpleado,this.isPermisoPaginacionMedioDefiProvisionEmpleado,this.isPermisoPaginacionTodoDefiProvisionEmpleado);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(DefiProvisionEmpleadoConstantesFunciones.getTiposSeleccionarDefiProvisionEmpleado());
				
				this.tiposColumnasSelect=DefiProvisionEmpleadoConstantesFunciones.getTiposSeleccionarDefiProvisionEmpleado(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectDefiProvisionEmpleado();				
				//this.tiposRelacionesSelect=DefiProvisionEmpleadoConstantesFunciones.getTiposRelacionesDefiProvisionEmpleado(true);
				
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
			//if(!this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioDefiProvisionEmpleado();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioDefiProvisionEmpleado(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioDefiProvisionEmpleado(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesDefiProvisionEmpleado() ;
			
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
			
			
			this.provisionempleadoLogic=new ProvisionEmpleadoLogic();
			this.cuotaLogic=new CuotaLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			this.rubroempleaLogic=new RubroEmpleaLogic();
			this.formatoLogic=new FormatoLogic();
			this.mesinicialLogic=new MesLogic();
			this.mesfinalLogic=new MesLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				defiprovisionempleadoImplementable= (DefiProvisionEmpleadoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DefiProvisionEmpleadoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				defiprovisionempleadoImplementableHome= (DefiProvisionEmpleadoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DefiProvisionEmpleadoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.defiprovisionempleados= new ArrayList<DefiProvisionEmpleado>();
			this.defiprovisionempleadosEliminados= new ArrayList<DefiProvisionEmpleado>();
						
			this.isEsNuevoDefiProvisionEmpleado=false;
			this.esParaAccionDesdeFormularioDefiProvisionEmpleado=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.rubroempleasForeignKey=new ArrayList<RubroEmplea>() ;
			this.formatosForeignKey=new ArrayList<Formato>() ;
			this.mesinicialsForeignKey=new ArrayList<Mes>() ;
			this.mesfinalsForeignKey=new ArrayList<Mes>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyDefiProvisionEmpleado(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroDefiProvisionEmpleado();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			DefiProvisionEmpleadoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=DefiProvisionEmpleadoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesDefiProvisionEmpleado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingDefiProvisionEmpleado(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormDefiProvisionEmpleado!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioDefiProvisionEmpleado();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioDefiProvisionEmpleado();
			}
			
			DefiProvisionEmpleadoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasDefiProvisionEmpleado.getTabCount(); i++) {
					this.jTabbedPaneBusquedasDefiProvisionEmpleado.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasDefiProvisionEmpleado.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.defiprovisionempleadoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessDefiProvisionEmpleado(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga DefiProvisionEmpleado: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.defiprovisionempleadoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.defiprovisionempleadoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectDefiProvisionEmpleado() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(ProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(CuotaConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(CuotaConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesDefiProvisionEmpleado")) {
				iIndex=this.jInternalFrameDetalleFormDefiProvisionEmpleado.jTabbedPaneRelacionesDefiProvisionEmpleado.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormDefiProvisionEmpleado.jTabbedPaneRelacionesDefiProvisionEmpleado.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosDefiProvisionEmpleado.getSelectedRow();	
				
				

				if(sTitle.equals("Cuotas")) {
					if(!CuotaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessDefiProvisionEmpleado();

						this.cargarParteTabPanelRelacionadaCuota(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Provision Empleados")) {
					if(!ProvisionEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessDefiProvisionEmpleado();

						this.cargarParteTabPanelRelacionadaProvisionEmpleado(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessDefiProvisionEmpleado();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaCuota(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.cargarSessionConBeanSwingJInternalFrameCuota(false,true,iIndex);
		this.jButtonCuotaActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaCuota();

		//this.jTabbedPaneRelacionesDefiProvisionEmpleado.updateUI();
		//this.jTabbedPaneRelacionesDefiProvisionEmpleado.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesDefiProvisionEmpleado.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaProvisionEmpleado(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.cargarSessionConBeanSwingJInternalFrameProvisionEmpleado(false,true,iIndex);
		this.jButtonProvisionEmpleadoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaProvisionEmpleado();

		//this.jTabbedPaneRelacionesDefiProvisionEmpleado.updateUI();
		//this.jTabbedPaneRelacionesDefiProvisionEmpleado.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesDefiProvisionEmpleado.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("ProvisionEmpleado")) {
				int row=this.jTableDatosDefiProvisionEmpleado.getSelectedRow();
				jButtonProvisionEmpleadoActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("Cuota")) {
				int row=this.jTableDatosDefiProvisionEmpleado.getSelectedRow();
				jButtonCuotaActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Provision Empleado")) {

					if(this.isTienePermisosProvisionEmpleado && this.defiprovisionempleadoConstantesFunciones.mostrarProvisionEmpleadoDefiProvisionEmpleado && !DefiProvisionEmpleadoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Provision Empleados"+"("+ProvisionEmpleadoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Provision Empleados");

						if(defiprovisionempleadoConstantesFunciones.resaltarProvisionEmpleadoDefiProvisionEmpleado!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(defiprovisionempleadoConstantesFunciones.resaltarProvisionEmpleadoDefiProvisionEmpleado);
						}

						jmenuItem.setEnabled(this.defiprovisionempleadoConstantesFunciones.activarProvisionEmpleadoDefiProvisionEmpleado);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"ProvisionEmpleado"));

						

						this.jInternalFrameDetalleFormDefiProvisionEmpleado.jmenuDetalleDefiProvisionEmpleado.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Cuota")) {

					if(this.isTienePermisosCuota && this.defiprovisionempleadoConstantesFunciones.mostrarCuotaDefiProvisionEmpleado && !DefiProvisionEmpleadoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Cuotas"+"("+CuotaConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Cuotas");

						if(defiprovisionempleadoConstantesFunciones.resaltarCuotaDefiProvisionEmpleado!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(defiprovisionempleadoConstantesFunciones.resaltarCuotaDefiProvisionEmpleado);
						}

						jmenuItem.setEnabled(this.defiprovisionempleadoConstantesFunciones.activarCuotaDefiProvisionEmpleado);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Cuota"));

						

						this.jInternalFrameDetalleFormDefiProvisionEmpleado.jmenuDetalleDefiProvisionEmpleado.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyDefiProvisionEmpleado(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyDefiProvisionEmpleado(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyDefiProvisionEmpleado(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyDefiProvisionEmpleadoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyDefiProvisionEmpleado();
		
		this.cargarCombosFrameForeignKeyDefiProvisionEmpleado();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyDefiProvisionEmpleado();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyDefiProvisionEmpleado();
		}
	}
	
	

	public void cargarCombosForeignKeyRubroEmplea(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyRubroEmpleaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyRubroEmplea();
				this.cargarCombosFrameRubroEmpleasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaRubroEmplea(this.rubroempleasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyFormato(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyFormatoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyFormato();
				this.cargarCombosFrameFormatosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaFormato(this.formatosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyMesInicial(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyMesInicialListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyMesInicial();
				this.cargarCombosFrameMesInicialsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaMesInicial(this.mesinicialsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyMesFinal(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyMesFinalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyMesFinal();
				this.cargarCombosFrameMesFinalsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaMesFinal(this.mesfinalsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoDefiProvisionEmpleadoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.defiprovisionempleadoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormDefiProvisionEmpleado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			DefiProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.defiprovisionempleado,new Object(),this.defiprovisionempleadoParameterGeneral,this.defiprovisionempleadoReturnGeneral);
			
			
			if(jTableDatosDefiProvisionEmpleado.getRowCount()>=1) {
				jTableDatosDefiProvisionEmpleado.removeRowSelectionInterval(0, jTableDatosDefiProvisionEmpleado.getRowCount()-1);						
			}
			
			this.isEsNuevoDefiProvisionEmpleado=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoDefiProvisionEmpleado(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesDefiProvisionEmpleado(true);			
			//this.defiprovisionempleado=new DefiProvisionEmpleado();
			//this.defiprovisionempleado.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDefiProvisionEmpleado(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDefiProvisionEmpleado() ;
			
			if(DefiProvisionEmpleadoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDefiProvisionEmpleado(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.defiprovisionempleado);	
			this.actualizarInformacion("INFO_PADRE",false,this.defiprovisionempleado);				
			
			DefiProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.defiprovisionempleado,new Object(),this.defiprovisionempleadoParameterGeneral,this.defiprovisionempleadoReturnGeneral);
			
			if(this.defiprovisionempleadoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar DefiProvisionEmpleado: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			DefiProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.defiprovisionempleado,new Object(),this.defiprovisionempleadoParameterGeneral,this.defiprovisionempleadoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarDefiProvisionEmpleadoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<DefiProvisionEmpleado> defiprovisionempleadosSeleccionados=new ArrayList<DefiProvisionEmpleado>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosDefiProvisionEmpleado.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosDefiProvisionEmpleado.getSelectedRows().length;			
			}
			
			defiprovisionempleadosSeleccionados=this.getDefiProvisionEmpleadosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoDefiProvisionEmpleado--;			
				//DefiProvisionEmpleado defiprovisionempleadoAux= new DefiProvisionEmpleado();			
				//defiprovisionempleadoAux.setId(this.iIdNuevoDefiProvisionEmpleado);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//DefiProvisionEmpleado defiprovisionempleadoOrigen=new DefiProvisionEmpleado();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(DefiProvisionEmpleado defiprovisionempleadoOrigen : defiprovisionempleadosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosDefiProvisionEmpleado.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							defiprovisionempleadoOrigen =(DefiProvisionEmpleado) this.defiprovisionempleadoLogic.getDefiProvisionEmpleados().toArray()[this.jTableDatosDefiProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							defiprovisionempleadoOrigen =(DefiProvisionEmpleado) this.defiprovisionempleados.toArray()[this.jTableDatosDefiProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaDefiProvisionEmpleado();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.defiprovisionempleado.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosDefiProvisionEmpleado(defiprovisionempleadoOrigen,this.defiprovisionempleado,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysDefiProvisionEmpleado(this.defiprovisionempleado);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.defiprovisionempleadoLogic.getDefiProvisionEmpleados().add(this.defiprovisionempleadoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.defiprovisionempleados.add(this.defiprovisionempleadoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaDefiProvisionEmpleado(false);
				
				this.jTableDatosDefiProvisionEmpleado.setRowSelectionInterval(this.getIndiceNuevoDefiProvisionEmpleado(), this.getIndiceNuevoDefiProvisionEmpleado());
				
				int iLastRow =  this.jTableDatosDefiProvisionEmpleado.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDefiProvisionEmpleado.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDefiProvisionEmpleado.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDefiProvisionEmpleado(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarDefiProvisionEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<DefiProvisionEmpleado> defiprovisionempleadosSeleccionados=new ArrayList<DefiProvisionEmpleado>();									
		
			DefiProvisionEmpleado defiprovisionempleadoOrigen=new DefiProvisionEmpleado();
			DefiProvisionEmpleado defiprovisionempleadoDestino=new DefiProvisionEmpleado();
				
			defiprovisionempleadosSeleccionados=this.getDefiProvisionEmpleadosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosDefiProvisionEmpleado.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || defiprovisionempleadosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosDefiProvisionEmpleado.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						defiprovisionempleadoOrigen =(DefiProvisionEmpleado) this.defiprovisionempleadoLogic.getDefiProvisionEmpleados().toArray()[this.jTableDatosDefiProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						defiprovisionempleadoOrigen =(DefiProvisionEmpleado) this.defiprovisionempleados.toArray()[this.jTableDatosDefiProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						defiprovisionempleadoDestino =(DefiProvisionEmpleado) this.defiprovisionempleadoLogic.getDefiProvisionEmpleados().toArray()[this.jTableDatosDefiProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						defiprovisionempleadoDestino =(DefiProvisionEmpleado) this.defiprovisionempleados.toArray()[this.jTableDatosDefiProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				defiprovisionempleadoOrigen =defiprovisionempleadosSeleccionados.get(0);
				defiprovisionempleadoDestino =defiprovisionempleadosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosDefiProvisionEmpleado(defiprovisionempleadoOrigen,defiprovisionempleadoDestino,true,false);
				
				defiprovisionempleadoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(defiprovisionempleadoDestino,defiprovisionempleadoLogic.getDefiProvisionEmpleados());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(defiprovisionempleadoDestino,defiprovisionempleados);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaDefiProvisionEmpleado(false);
				
				//this.jTableDatosDefiProvisionEmpleado.setRowSelectionInterval(this.getIndiceNuevoDefiProvisionEmpleado(), this.getIndiceNuevoDefiProvisionEmpleado());
				
				int iLastRow =  this.jTableDatosDefiProvisionEmpleado.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDefiProvisionEmpleado.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDefiProvisionEmpleado.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDefiProvisionEmpleado(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormDefiProvisionEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDefiProvisionEmpleado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormDefiProvisionEmpleado.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarDefiProvisionEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesDefiProvisionEmpleado.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasDefiProvisionEmpleado.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesDefiProvisionEmpleado.setVisible(!isVisible);
			this.jPanelPaginacionDefiProvisionEmpleado.setVisible(!isVisible);
			this.jPanelAccionesDefiProvisionEmpleado.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarDefiProvisionEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameDefiProvisionEmpleado();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoDefiProvisionEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoDefiProvisionEmpleado();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionDefiProvisionEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionDefiProvisionEmpleado();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByDefiProvisionEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByDefiProvisionEmpleado();
			
			this.abrirFrameOrderByDefiProvisionEmpleado();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByDefiProvisionEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByDefiProvisionEmpleado();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleDefiProvisionEmpleado(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormDefiProvisionEmpleado);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormDefiProvisionEmpleado.isMaximum()) {
					this.jInternalFrameDetalleFormDefiProvisionEmpleado.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormDefiProvisionEmpleado.setSize(this.jInternalFrameDetalleFormDefiProvisionEmpleado.iWidthFormulario,this.jInternalFrameDetalleFormDefiProvisionEmpleado.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormDefiProvisionEmpleado.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormDefiProvisionEmpleado.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormDefiProvisionEmpleado.isMaximum()) {
						this.jInternalFrameDetalleFormDefiProvisionEmpleado.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormDefiProvisionEmpleado.jContentPaneDetalleDefiProvisionEmpleado.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormDefiProvisionEmpleado.jTabbedPaneRelacionesDefiProvisionEmpleado.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormDefiProvisionEmpleado.jContentPaneDetalleDefiProvisionEmpleado.getWidth(),DefiProvisionEmpleadoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDefiProvisionEmpleado.jTabbedPaneRelacionesDefiProvisionEmpleado.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormDefiProvisionEmpleado.jContentPaneDetalleDefiProvisionEmpleado.getWidth(),DefiProvisionEmpleadoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDefiProvisionEmpleado.jTabbedPaneRelacionesDefiProvisionEmpleado.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormDefiProvisionEmpleado.jContentPaneDetalleDefiProvisionEmpleado.getWidth(),DefiProvisionEmpleadoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(CuotaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaCuota();
					}

					if(ProvisionEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaProvisionEmpleado();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormDefiProvisionEmpleado.setVisible(true);
	        this.jInternalFrameDetalleFormDefiProvisionEmpleado.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByDefiProvisionEmpleado() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByDefiProvisionEmpleado==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByDefiProvisionEmpleado=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDefiProvisionEmpleado,false,this);
				} else {
					this.jInternalFrameOrderByDefiProvisionEmpleado=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDefiProvisionEmpleado,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByDefiProvisionEmpleado);
				this.jInternalFrameOrderByDefiProvisionEmpleado.setVisible(false);
				this.jInternalFrameOrderByDefiProvisionEmpleado.setSelected(false);
				
				this.jInternalFrameOrderByDefiProvisionEmpleado.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDefiProvisionEmpleado"));
				
				this.inicializarActualizarBindingTablaOrderByDefiProvisionEmpleado();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionDefiProvisionEmpleado() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionDefiProvisionEmpleado==null) {
				
				this.jInternalFrameImportacionDefiProvisionEmpleado=new ImportacionJInternalFrame(DefiProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDefiProvisionEmpleado);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionDefiProvisionEmpleado);
				this.jInternalFrameImportacionDefiProvisionEmpleado.setVisible(false);
				this.jInternalFrameImportacionDefiProvisionEmpleado.setSelected(false);


				this.jInternalFrameImportacionDefiProvisionEmpleado.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDefiProvisionEmpleado"));
				this.jInternalFrameImportacionDefiProvisionEmpleado.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDefiProvisionEmpleado"));
				this.jInternalFrameImportacionDefiProvisionEmpleado.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDefiProvisionEmpleado"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoDefiProvisionEmpleado() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoDefiProvisionEmpleado==null) {
				this.jInternalFrameReporteDinamicoDefiProvisionEmpleado=new ReporteDinamicoJInternalFrame(DefiProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDefiProvisionEmpleado);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDefiProvisionEmpleado);
				this.jInternalFrameReporteDinamicoDefiProvisionEmpleado.setVisible(false);
				this.jInternalFrameReporteDinamicoDefiProvisionEmpleado.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoDefiProvisionEmpleado.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDefiProvisionEmpleado"));
				this.jInternalFrameReporteDinamicoDefiProvisionEmpleado.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDefiProvisionEmpleado"));
				this.jInternalFrameReporteDinamicoDefiProvisionEmpleado.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDefiProvisionEmpleado"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDefiProvisionEmpleado();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaCuota() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaBeanSwingJInternalFrame.jScrollPanelDatosCuota.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormDefiProvisionEmpleado.jContentPaneDetalleDefiProvisionEmpleado.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaBeanSwingJInternalFrame.jScrollPanelDatosCuota.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaBeanSwingJInternalFrame.jScrollPanelDatosCuota.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaBeanSwingJInternalFrame.jScrollPanelDatosCuota.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaProvisionEmpleado() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.jScrollPanelDatosProvisionEmpleado.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormDefiProvisionEmpleado.jContentPaneDetalleDefiProvisionEmpleado.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.jScrollPanelDatosProvisionEmpleado.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.jScrollPanelDatosProvisionEmpleado.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.jScrollPanelDatosProvisionEmpleado.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleDefiProvisionEmpleado() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormDefiProvisionEmpleado);
			
	       	this.jInternalFrameDetalleFormDefiProvisionEmpleado.setVisible(false);
	        this.jInternalFrameDetalleFormDefiProvisionEmpleado.setSelected(false);
			
			//this.jInternalFrameDetalleFormDefiProvisionEmpleado.dispose();
			//this.jInternalFrameDetalleFormDefiProvisionEmpleado=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoDefiProvisionEmpleado() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoDefiProvisionEmpleado.setVisible(true);
	        this.jInternalFrameReporteDinamicoDefiProvisionEmpleado.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionDefiProvisionEmpleado() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionDefiProvisionEmpleado.setVisible(true);
	        this.jInternalFrameImportacionDefiProvisionEmpleado.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByDefiProvisionEmpleado() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByDefiProvisionEmpleado.setVisible(true);
	        this.jInternalFrameOrderByDefiProvisionEmpleado.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByDefiProvisionEmpleado() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByDefiProvisionEmpleado.setVisible(false);
	        this.jInternalFrameOrderByDefiProvisionEmpleado.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoDefiProvisionEmpleado() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoDefiProvisionEmpleado.setVisible(false);
	        this.jInternalFrameReporteDinamicoDefiProvisionEmpleado.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionDefiProvisionEmpleado() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionDefiProvisionEmpleado.setVisible(false);
	        this.jInternalFrameImportacionDefiProvisionEmpleado.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarDefiProvisionEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarDefiProvisionEmpleado(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarDefiProvisionEmpleado(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDefiProvisionEmpleado.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesDefiProvisionEmpleado(true);
			//this.isEsNuevoDefiProvisionEmpleado=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.defiprovisionempleado =(DefiProvisionEmpleado) this.defiprovisionempleadoLogic.getDefiProvisionEmpleados().toArray()[this.jTableDatosDefiProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.defiprovisionempleado =(DefiProvisionEmpleado) this.defiprovisionempleados.toArray()[this.jTableDatosDefiProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesDefiProvisionEmpleado("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDefiProvisionEmpleado(false) ;
			
			if(defiprovisionempleadoSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.provisionempleadoSessionBean.getEsGuardarRelacionado() && ProvisionEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonProvisionEmpleadoActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaBeanSwingJInternalFrame.cuotaSessionBean.getEsGuardarRelacionado() && CuotaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonCuotaActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(DefiProvisionEmpleadoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDefiProvisionEmpleado(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDefiProvisionEmpleado(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaDefiProvisionEmpleadoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosDefiProvisionEmpleado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.defiprovisionempleado =(DefiProvisionEmpleado) this.defiprovisionempleadoLogic.getDefiProvisionEmpleados().toArray()[this.jTableDatosDefiProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.defiprovisionempleado =(DefiProvisionEmpleado) this.defiprovisionempleados.toArray()[this.jTableDatosDefiProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarDefiProvisionEmpleado(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDefiProvisionEmpleado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDefiProvisionEmpleado.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesDefiProvisionEmpleado(true);
			//this.isEsNuevoDefiProvisionEmpleado=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.defiprovisionempleado =(DefiProvisionEmpleado) this.defiprovisionempleadoLogic.getDefiProvisionEmpleados().toArray()[this.jTableDatosDefiProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.defiprovisionempleado =(DefiProvisionEmpleado) this.defiprovisionempleados.toArray()[this.jTableDatosDefiProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.defiprovisionempleado.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesDefiProvisionEmpleado("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesDefiProvisionEmpleado(false) ;
			
			if(DefiProvisionEmpleadoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDefiProvisionEmpleado(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDefiProvisionEmpleado(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaRubroEmplea(List<RubroEmplea> rubroempleasForeignKey)throws Exception{
		TableColumn tableColumnRubroEmplea=this.jTableDatosDefiProvisionEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDefiProvisionEmpleado,DefiProvisionEmpleadoConstantesFunciones.LABEL_IDRUBROEMPLEA));
		TableCellEditor tableCellEditorRubroEmplea =tableColumnRubroEmplea.getCellEditor();

		RubroEmpleaTableCell rubroempleaTableCellFk=(RubroEmpleaTableCell)tableCellEditorRubroEmplea;

		if(rubroempleaTableCellFk!=null) {
			rubroempleaTableCellFk.setrubroempleasForeignKey(rubroempleasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDefiProvisionEmpleado.getSelectedRow();

		//if(intSelectedRow<=0) {
			//rubroempleaTableCellFk.setRowActual(intSelectedRow);
			//rubroempleaTableCellFk.setrubroempleasForeignKeyActual(rubroempleasForeignKey);
		//}


		if(rubroempleaTableCellFk!=null) {
			rubroempleaTableCellFk.RecargarRubroEmpleasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaFormato(List<Formato> formatosForeignKey)throws Exception{
		TableColumn tableColumnFormato=this.jTableDatosDefiProvisionEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDefiProvisionEmpleado,DefiProvisionEmpleadoConstantesFunciones.LABEL_IDFORMATO));
		TableCellEditor tableCellEditorFormato =tableColumnFormato.getCellEditor();

		FormatoTableCell formatoTableCellFk=(FormatoTableCell)tableCellEditorFormato;

		if(formatoTableCellFk!=null) {
			formatoTableCellFk.setformatosForeignKey(formatosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDefiProvisionEmpleado.getSelectedRow();

		//if(intSelectedRow<=0) {
			//formatoTableCellFk.setRowActual(intSelectedRow);
			//formatoTableCellFk.setformatosForeignKeyActual(formatosForeignKey);
		//}


		if(formatoTableCellFk!=null) {
			formatoTableCellFk.RecargarFormatosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaMesInicial(List<Mes> mesinicialsForeignKey)throws Exception{
		TableColumn tableColumnMesInicial=this.jTableDatosDefiProvisionEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDefiProvisionEmpleado,DefiProvisionEmpleadoConstantesFunciones.LABEL_IDMESINICIAL));
		TableCellEditor tableCellEditorMesInicial =tableColumnMesInicial.getCellEditor();

		MesTableCell mesTableCellFk=(MesTableCell)tableCellEditorMesInicial;

		if(mesTableCellFk!=null) {
			mesTableCellFk.setmessForeignKey(mesinicialsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDefiProvisionEmpleado.getSelectedRow();

		//if(intSelectedRow<=0) {
			//mesTableCellFk.setRowActual(intSelectedRow);
			//mesTableCellFk.setmessForeignKeyActual(mesinicialsForeignKey);
		//}


		if(mesTableCellFk!=null) {
			mesTableCellFk.RecargarMessForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaMesFinal(List<Mes> mesfinalsForeignKey)throws Exception{
		TableColumn tableColumnMesFinal=this.jTableDatosDefiProvisionEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDefiProvisionEmpleado,DefiProvisionEmpleadoConstantesFunciones.LABEL_IDMESFINAL));
		TableCellEditor tableCellEditorMesFinal =tableColumnMesFinal.getCellEditor();

		MesTableCell mesTableCellFk=(MesTableCell)tableCellEditorMesFinal;

		if(mesTableCellFk!=null) {
			mesTableCellFk.setmessForeignKey(mesfinalsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDefiProvisionEmpleado.getSelectedRow();

		//if(intSelectedRow<=0) {
			//mesTableCellFk.setRowActual(intSelectedRow);
			//mesTableCellFk.setmessForeignKeyActual(mesfinalsForeignKey);
		//}


		if(mesTableCellFk!=null) {
			mesTableCellFk.RecargarMessForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarDefiProvisionEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.defiprovisionempleadoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesDefiProvisionEmpleado(false);
			
			//if(!this.isEsNuevoDefiProvisionEmpleado) {								
				int intSelectedRow = this.jTableDatosDefiProvisionEmpleado.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.defiprovisionempleado =(DefiProvisionEmpleado) this.defiprovisionempleadoLogic.getDefiProvisionEmpleados().toArray()[this.jTableDatosDefiProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.defiprovisionempleado =(DefiProvisionEmpleado) this.defiprovisionempleados.toArray()[this.jTableDatosDefiProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(DefiProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualDefiProvisionEmpleado(this.defiprovisionempleado,true);
				this.setVariablesFormularioToObjetoActualForeignKeysDefiProvisionEmpleado(this.defiprovisionempleado);
				
			}
			
			if(this.permiteMantenimiento(this.defiprovisionempleado)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoDefiProvisionEmpleado=true;
					this.inicializarActualizarBindingTablaDefiProvisionEmpleado(false);
					this.isEsNuevoDefiProvisionEmpleado=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoDefiProvisionEmpleado=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoDefiProvisionEmpleado=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDefiProvisionEmpleado(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDefiProvisionEmpleado(false);
				
				this.habilitarDeshabilitarControlesDefiProvisionEmpleado(false);
			
												
				
				if(DefiProvisionEmpleadoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleDefiProvisionEmpleado();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoDefiProvisionEmpleadoActionPerformed(evt,defiprovisionempleadoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualDefiProvisionEmpleado(this.defiprovisionempleado,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosDefiProvisionEmpleado.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,defiprovisionempleadoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.defiprovisionempleadoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.defiprovisionempleado.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(DefiProvisionEmpleado.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DefiProvisionEmpleado.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.defiprovisionempleadoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.defiprovisionempleadoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarDefiProvisionEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.defiprovisionempleadoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosDefiProvisionEmpleado.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.defiprovisionempleado =(DefiProvisionEmpleado) this.defiprovisionempleadoLogic.getDefiProvisionEmpleados().toArray()[this.jTableDatosDefiProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
				this.defiprovisionempleado.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.defiprovisionempleado =(DefiProvisionEmpleado) this.defiprovisionempleados.toArray()[this.jTableDatosDefiProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
				this.defiprovisionempleado.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.defiprovisionempleado)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((DefiProvisionEmpleadoModel) this.jTableDatosDefiProvisionEmpleado.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoDefiProvisionEmpleado=true;
				this.inicializarActualizarBindingTablaDefiProvisionEmpleado(false);
				this.isEsNuevoDefiProvisionEmpleado=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDefiProvisionEmpleado(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDefiProvisionEmpleado(false);
				
				this.habilitarDeshabilitarControlesDefiProvisionEmpleado(false);
				
				
				
				if(DefiProvisionEmpleadoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleDefiProvisionEmpleado();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.defiprovisionempleadoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.defiprovisionempleadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.defiprovisionempleadoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarDefiProvisionEmpleadoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosDefiProvisionEmpleado.getRowCount()>=1) {
				jTableDatosDefiProvisionEmpleado.removeRowSelectionInterval(0, jTableDatosDefiProvisionEmpleado.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesDefiProvisionEmpleado(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaDefiProvisionEmpleado(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDefiProvisionEmpleado(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDefiProvisionEmpleado(false) ;
			
			this.isEsNuevoDefiProvisionEmpleado=false;
			
			if(DefiProvisionEmpleadoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleDefiProvisionEmpleado();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosDefiProvisionEmpleadoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.defiprovisionempleadoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingDefiProvisionEmpleado(false);
				
				//SI ES MANUAL
				if(DefiProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualDefiProvisionEmpleado();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.defiprovisionempleadoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.defiprovisionempleadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.defiprovisionempleadoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosDefiProvisionEmpleadoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoDefiProvisionEmpleado--;			
			//DefiProvisionEmpleado defiprovisionempleadoAux= new DefiProvisionEmpleado();			
			//defiprovisionempleadoAux.setId(this.iIdNuevoDefiProvisionEmpleado);
			
			if(this.jInternalFrameDetalleFormDefiProvisionEmpleado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaDefiProvisionEmpleado();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysDefiProvisionEmpleado(this.defiprovisionempleado);
			
			this.defiprovisionempleado.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.defiprovisionempleadoLogic.getDefiProvisionEmpleados().add(this.defiprovisionempleadoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.defiprovisionempleados.add(this.defiprovisionempleadoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaDefiProvisionEmpleado(false);
			
			this.jTableDatosDefiProvisionEmpleado.setRowSelectionInterval(this.getIndiceNuevoDefiProvisionEmpleado(), this.getIndiceNuevoDefiProvisionEmpleado());
			
			int iLastRow =  this.jTableDatosDefiProvisionEmpleado.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosDefiProvisionEmpleado.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosDefiProvisionEmpleado.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaDefiProvisionEmpleado(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionDefiProvisionEmpleadoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.defiprovisionempleadoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingDefiProvisionEmpleado(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDefiProvisionEmpleado(false);
			
			//SI ES MANUAL
			if(DefiProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDefiProvisionEmpleado();
			}
			
			//this.abrirFrameTreeDefiProvisionEmpleado();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.defiprovisionempleadoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.defiprovisionempleadoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.defiprovisionempleadoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionDefiProvisionEmpleadoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Defi Provision EmpleadoS ?", "MANTENIMIENTO DE Defi Provision Empleado", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionDefiProvisionEmpleado.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralDefiProvisionEmpleado();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.defiprovisionempleadoReturnGeneral=defiprovisionempleadoLogic.procesarImportacionDefiProvisionEmpleadosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.defiprovisionempleadoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarDefiProvisionEmpleadoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionDefiProvisionEmpleadoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionDefiProvisionEmpleado.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionDefiProvisionEmpleado.setFileImportacion(this.jInternalFrameImportacionDefiProvisionEmpleado.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionDefiProvisionEmpleado.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionDefiProvisionEmpleado.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionDefiProvisionEmpleado.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionDefiProvisionEmpleado.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoDefiProvisionEmpleadoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<DefiProvisionEmpleado> defiprovisionempleadosSeleccionados=new ArrayList<DefiProvisionEmpleado>();		

		defiprovisionempleadosSeleccionados=this.getDefiProvisionEmpleadosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDefiProvisionEmpleado.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDefiProvisionEmpleado.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("DefiProvisionEmpleadoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"DefiProvisionEmpleadoBaseDesign.jrxml";
			
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
			
			this.generarReporteDefiProvisionEmpleados("Todos",defiprovisionempleadosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Defi Provision Empleado",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoDefiProvisionEmpleado.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDefiProvisionEmpleado.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DefiProvisionEmpleadoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DefiProvisionEmpleadoConstantesFunciones.LABEL_IDRUBROEMPLEA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_RubroEmplea_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_RubroEmplea_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_RubroEmplea_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_RubroEmplea_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DefiProvisionEmpleadoConstantesFunciones.LABEL_IDFORMATO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Formato_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Formato_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Formato_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Formato_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DefiProvisionEmpleadoConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DefiProvisionEmpleadoConstantesFunciones.LABEL_DIAINICIAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_aInicial_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_aInicial_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_aInicial_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_aInicial_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DefiProvisionEmpleadoConstantesFunciones.LABEL_IDMESINICIAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_MesInicial_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_MesInicial_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_MesInicial_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_MesInicial_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DefiProvisionEmpleadoConstantesFunciones.LABEL_DIAFINAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_aFinal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_aFinal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_aFinal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_aFinal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DefiProvisionEmpleadoConstantesFunciones.LABEL_IDMESFINAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_MesFinal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_MesFinal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_MesFinal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_MesFinal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DefiProvisionEmpleadoConstantesFunciones.LABEL_PARALIQUIDACION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_raLiquidacion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_raLiquidacion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_raLiquidacion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_raLiquidacion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DefiProvisionEmpleadoConstantesFunciones.LABEL_DESCRIPCION:
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
		
		if(this.jInternalFrameReporteDinamicoDefiProvisionEmpleado.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoDefiProvisionEmpleado.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoDefiProvisionEmpleado.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case DefiProvisionEmpleadoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case DefiProvisionEmpleadoConstantesFunciones.LABEL_IDRUBROEMPLEA:
					sNombreCampoCategoria="id_rubro_emplea";
					break;

				case DefiProvisionEmpleadoConstantesFunciones.LABEL_IDFORMATO:
					sNombreCampoCategoria="id_formato";
					break;

				case DefiProvisionEmpleadoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case DefiProvisionEmpleadoConstantesFunciones.LABEL_DIAINICIAL:
					sNombreCampoCategoria="dia_inicial";
					break;

				case DefiProvisionEmpleadoConstantesFunciones.LABEL_IDMESINICIAL:
					sNombreCampoCategoria="id_mes_inicial";
					break;

				case DefiProvisionEmpleadoConstantesFunciones.LABEL_DIAFINAL:
					sNombreCampoCategoria="dia_final";
					break;

				case DefiProvisionEmpleadoConstantesFunciones.LABEL_IDMESFINAL:
					sNombreCampoCategoria="id_mes_final";
					break;

				case DefiProvisionEmpleadoConstantesFunciones.LABEL_PARALIQUIDACION:
					sNombreCampoCategoria="para_liquidacion";
					break;

				case DefiProvisionEmpleadoConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoDefiProvisionEmpleado.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case DefiProvisionEmpleadoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case DefiProvisionEmpleadoConstantesFunciones.LABEL_IDRUBROEMPLEA:
					sNombreCampoCategoriaValor="id_rubro_emplea";
					break;

				case DefiProvisionEmpleadoConstantesFunciones.LABEL_IDFORMATO:
					sNombreCampoCategoriaValor="id_formato";
					break;

				case DefiProvisionEmpleadoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case DefiProvisionEmpleadoConstantesFunciones.LABEL_DIAINICIAL:
					sNombreCampoCategoriaValor="dia_inicial";
					break;

				case DefiProvisionEmpleadoConstantesFunciones.LABEL_IDMESINICIAL:
					sNombreCampoCategoriaValor="id_mes_inicial";
					break;

				case DefiProvisionEmpleadoConstantesFunciones.LABEL_DIAFINAL:
					sNombreCampoCategoriaValor="dia_final";
					break;

				case DefiProvisionEmpleadoConstantesFunciones.LABEL_IDMESFINAL:
					sNombreCampoCategoriaValor="id_mes_final";
					break;

				case DefiProvisionEmpleadoConstantesFunciones.LABEL_PARALIQUIDACION:
					sNombreCampoCategoriaValor="para_liquidacion";
					break;

				case DefiProvisionEmpleadoConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoDefiProvisionEmpleado.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDefiProvisionEmpleado.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DefiProvisionEmpleadoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case DefiProvisionEmpleadoConstantesFunciones.LABEL_IDRUBROEMPLEA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Rubro Emplea",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_rubro_emplea");
					break;

				case DefiProvisionEmpleadoConstantesFunciones.LABEL_IDFORMATO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Formato",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_formato");
					break;

				case DefiProvisionEmpleadoConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case DefiProvisionEmpleadoConstantesFunciones.LABEL_DIAINICIAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Dia Inicial",sNombreCampoCategoria,sNombreCampoCategoriaValor,"dia_inicial");
					break;

				case DefiProvisionEmpleadoConstantesFunciones.LABEL_IDMESINICIAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Mes Inicial",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_mes_inicial");
					break;

				case DefiProvisionEmpleadoConstantesFunciones.LABEL_DIAFINAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Dia Final",sNombreCampoCategoria,sNombreCampoCategoriaValor,"dia_final");
					break;

				case DefiProvisionEmpleadoConstantesFunciones.LABEL_IDMESFINAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Mes Final",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_mes_final");
					break;

				case DefiProvisionEmpleadoConstantesFunciones.LABEL_PARALIQUIDACION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Para Liquacion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"para_liquidacion");
					break;

				case DefiProvisionEmpleadoConstantesFunciones.LABEL_DESCRIPCION:
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
	
	public void jButtonGenerarExcelReporteDinamicoDefiProvisionEmpleadoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<DefiProvisionEmpleado> defiprovisionempleadosSeleccionados=new ArrayList<DefiProvisionEmpleado>();		
		
		defiprovisionempleadosSeleccionados=this.getDefiProvisionEmpleadosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"defiprovisionempleado";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("DefiProvisionEmpleados");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoDefiProvisionEmpleado.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoDefiProvisionEmpleado.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case DefiProvisionEmpleadoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DefiProvisionEmpleadoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(DefiProvisionEmpleado defiprovisionempleado:defiprovisionempleadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(defiprovisionempleado.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DefiProvisionEmpleadoConstantesFunciones.LABEL_IDRUBROEMPLEA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DefiProvisionEmpleadoConstantesFunciones.LABEL_IDRUBROEMPLEA);
					iRow++;

					for(DefiProvisionEmpleado defiprovisionempleado:defiprovisionempleadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(defiprovisionempleado.getrubroemplea_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DefiProvisionEmpleadoConstantesFunciones.LABEL_IDFORMATO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DefiProvisionEmpleadoConstantesFunciones.LABEL_IDFORMATO);
					iRow++;

					for(DefiProvisionEmpleado defiprovisionempleado:defiprovisionempleadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(defiprovisionempleado.getformato_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DefiProvisionEmpleadoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DefiProvisionEmpleadoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(DefiProvisionEmpleado defiprovisionempleado:defiprovisionempleadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(defiprovisionempleado.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DefiProvisionEmpleadoConstantesFunciones.LABEL_DIAINICIAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DefiProvisionEmpleadoConstantesFunciones.LABEL_DIAINICIAL);
					iRow++;

					for(DefiProvisionEmpleado defiprovisionempleado:defiprovisionempleadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(defiprovisionempleado.getdia_inicial());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DefiProvisionEmpleadoConstantesFunciones.LABEL_IDMESINICIAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DefiProvisionEmpleadoConstantesFunciones.LABEL_IDMESINICIAL);
					iRow++;

					for(DefiProvisionEmpleado defiprovisionempleado:defiprovisionempleadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(defiprovisionempleado.getmesinicial_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DefiProvisionEmpleadoConstantesFunciones.LABEL_DIAFINAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DefiProvisionEmpleadoConstantesFunciones.LABEL_DIAFINAL);
					iRow++;

					for(DefiProvisionEmpleado defiprovisionempleado:defiprovisionempleadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(defiprovisionempleado.getdia_final());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DefiProvisionEmpleadoConstantesFunciones.LABEL_IDMESFINAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DefiProvisionEmpleadoConstantesFunciones.LABEL_IDMESFINAL);
					iRow++;

					for(DefiProvisionEmpleado defiprovisionempleado:defiprovisionempleadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(defiprovisionempleado.getmesfinal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DefiProvisionEmpleadoConstantesFunciones.LABEL_PARALIQUIDACION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DefiProvisionEmpleadoConstantesFunciones.LABEL_PARALIQUIDACION);
					iRow++;

					for(DefiProvisionEmpleado defiprovisionempleado:defiprovisionempleadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(defiprovisionempleado.getpara_liquidacion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DefiProvisionEmpleadoConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DefiProvisionEmpleadoConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(DefiProvisionEmpleado defiprovisionempleado:defiprovisionempleadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(defiprovisionempleado.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelDefiProvisionEmpleado(row);				
			//	iRow++;
			//}				
			
			//for(DefiProvisionEmpleado defiprovisionempleadoAux:defiprovisionempleadosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelDefiProvisionEmpleado(defiprovisionempleadoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Defi Provision Empleado",JOptionPane.INFORMATION_MESSAGE);
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
				this.defiprovisionempleadoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDefiProvisionEmpleado(false);
			
			//SI ES MANUAL
			if(DefiProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDefiProvisionEmpleado();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.defiprovisionempleadoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.defiprovisionempleadoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.defiprovisionempleadoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresDefiProvisionEmpleadoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.defiprovisionempleadoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDefiProvisionEmpleado(false);
			
			//SI ES MANUAL
			if(DefiProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDefiProvisionEmpleado();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.defiprovisionempleadoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.defiprovisionempleadoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.defiprovisionempleadoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesDefiProvisionEmpleadoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.defiprovisionempleadoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDefiProvisionEmpleado(false);
			
			//SI ES MANUAL
			if(DefiProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDefiProvisionEmpleado();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.defiprovisionempleadoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.defiprovisionempleadoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.defiprovisionempleadoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaDefiProvisionEmpleado() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosDefiProvisionEmpleado.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosDefiProvisionEmpleado.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosDefiProvisionEmpleado.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosDefiProvisionEmpleado.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosDefiProvisionEmpleado.setMinimumSize(dimensionMinimum);
		this.jTableDatosDefiProvisionEmpleado.setMaximumSize(dimensionMaximum);
		this.jTableDatosDefiProvisionEmpleado.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingDefiProvisionEmpleado(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingDefiProvisionEmpleado(esInicializar,true);
	}
	
	public void inicializarActualizarBindingDefiProvisionEmpleado(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaDefiProvisionEmpleado(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesDefiProvisionEmpleado(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasDefiProvisionEmpleado(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDefiProvisionEmpleado(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesDefiProvisionEmpleado(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !DefiProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!DefiProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualDefiProvisionEmpleado() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaDefiProvisionEmpleado();
		
		this.inicializarActualizarBindingBotonesManualDefiProvisionEmpleado(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualDefiProvisionEmpleado();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDefiProvisionEmpleado() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualDefiProvisionEmpleado(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualDefiProvisionEmpleado(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosDefiProvisionEmpleado.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosDefiProvisionEmpleado.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteDefiProvisionEmpleado.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormDefiProvisionEmpleado!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormDefiProvisionEmpleado.jCheckBoxPostAccionNuevoDefiProvisionEmpleado.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormDefiProvisionEmpleado.jCheckBoxPostAccionSinCerrarDefiProvisionEmpleado.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormDefiProvisionEmpleado.jCheckBoxPostAccionSinMensajeDefiProvisionEmpleado.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosDefiProvisionEmpleado.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosDefiProvisionEmpleado.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteDefiProvisionEmpleado.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormDefiProvisionEmpleado!=null) {
				this.jInternalFrameDetalleFormDefiProvisionEmpleado.jCheckBoxPostAccionNuevoDefiProvisionEmpleado.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormDefiProvisionEmpleado.jCheckBoxPostAccionSinCerrarDefiProvisionEmpleado.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormDefiProvisionEmpleado.jCheckBoxPostAccionSinMensajeDefiProvisionEmpleado.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionDefiProvisionEmpleado.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionDefiProvisionEmpleado.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormDefiProvisionEmpleado!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormDefiProvisionEmpleado.jComboBoxTiposAccionesFormularioDefiProvisionEmpleado.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesDefiProvisionEmpleado.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoDefiProvisionEmpleado!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDefiProvisionEmpleado.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesDefiProvisionEmpleado.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesDefiProvisionEmpleado.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarDefiProvisionEmpleado.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesDefiProvisionEmpleado.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoDefiProvisionEmpleado!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDefiProvisionEmpleado.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesDefiProvisionEmpleado.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralDefiProvisionEmpleado.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesDefiProvisionEmpleado(Boolean esInicializar) throws Exception {
		try	{	
			if(DefiProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualDefiProvisionEmpleado(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesDefiProvisionEmpleado() throws Exception {
		try	{
			if(DefiProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualDefiProvisionEmpleado();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDefiProvisionEmpleado() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jComboBoxTiposAccionesFormularioDefiProvisionEmpleado.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormDefiProvisionEmpleado.jComboBoxTiposAccionesFormularioDefiProvisionEmpleado.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualDefiProvisionEmpleado() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesDefiProvisionEmpleado.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesDefiProvisionEmpleado.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesDefiProvisionEmpleado.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesDefiProvisionEmpleado.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesDefiProvisionEmpleado.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesDefiProvisionEmpleado.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionDefiProvisionEmpleado.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionDefiProvisionEmpleado.addItem(reporte);
			}
			
			
			if(!this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionDefiProvisionEmpleado.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionDefiProvisionEmpleado.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesDefiProvisionEmpleado.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesDefiProvisionEmpleado.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesDefiProvisionEmpleado.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesDefiProvisionEmpleado.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormDefiProvisionEmpleado!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormDefiProvisionEmpleado.jComboBoxTiposAccionesFormularioDefiProvisionEmpleado.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormDefiProvisionEmpleado.jComboBoxTiposAccionesFormularioDefiProvisionEmpleado.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarDefiProvisionEmpleado.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarDefiProvisionEmpleado.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarDefiProvisionEmpleado.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDefiProvisionEmpleado();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDefiProvisionEmpleado() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDefiProvisionEmpleado!=null) {
				this.jInternalFrameReporteDinamicoDefiProvisionEmpleado.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoDefiProvisionEmpleado.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDefiProvisionEmpleado!=null) {
				this.jInternalFrameReporteDinamicoDefiProvisionEmpleado.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoDefiProvisionEmpleado.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoDefiProvisionEmpleado!=null) {
				
				if(this.jInternalFrameReporteDinamicoDefiProvisionEmpleado.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDefiProvisionEmpleado.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDefiProvisionEmpleado.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoDefiProvisionEmpleado.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDefiProvisionEmpleado.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDefiProvisionEmpleado.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualDefiProvisionEmpleado()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_formatoFK_IdFormatoDefiProvisionEmpleado.getSelectedItem()!=null){this.id_formatoFK_IdFormato=((Formato)this.jComboBoxid_formatoFK_IdFormatoDefiProvisionEmpleado.getSelectedItem()).getId();}
		if(this.jComboBoxid_mes_finalFK_IdMesFinalDefiProvisionEmpleado.getSelectedItem()!=null){this.id_mes_finalFK_IdMesFinal=((Mes)this.jComboBoxid_mes_finalFK_IdMesFinalDefiProvisionEmpleado.getSelectedItem()).getId();}
		if(this.jComboBoxid_mes_inicialFK_IdMesInicialDefiProvisionEmpleado.getSelectedItem()!=null){this.id_mes_inicialFK_IdMesInicial=((Mes)this.jComboBoxid_mes_inicialFK_IdMesInicialDefiProvisionEmpleado.getSelectedItem()).getId();}
		if(this.jComboBoxid_rubro_empleaFK_IdRubroEmpleaDefiProvisionEmpleado.getSelectedItem()!=null){this.id_rubro_empleaFK_IdRubroEmplea=((RubroEmplea)this.jComboBoxid_rubro_empleaFK_IdRubroEmpleaDefiProvisionEmpleado.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasDefiProvisionEmpleado(Boolean esInicializar) throws Exception {				
		if(DefiProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualDefiProvisionEmpleado();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaDefiProvisionEmpleado() throws Exception {
		this.inicializarActualizarBindingTablaDefiProvisionEmpleado(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByDefiProvisionEmpleado() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByDefiProvisionEmpleado.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByDefiProvisionEmpleado.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDefiProvisionEmpleado.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new DefiProvisionEmpleadoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByDefiProvisionEmpleado.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDefiProvisionEmpleado.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new DefiProvisionEmpleadoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosDefiProvisionEmpleadoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDefiProvisionEmpleadoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new DefiProvisionEmpleadoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByDefiProvisionEmpleado.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDefiProvisionEmpleado.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new DefiProvisionEmpleadoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByDefiProvisionEmpleado.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaDefiProvisionEmpleado(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=defiprovisionempleadoLogic.getDefiProvisionEmpleados().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=defiprovisionempleados.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(DefiProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosDefiProvisionEmpleado.setModel(new DefiProvisionEmpleadoModel(this.defiprovisionempleadoLogic.getDefiProvisionEmpleados(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosDefiProvisionEmpleado.setModel(new DefiProvisionEmpleadoModel(this.defiprovisionempleados,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByDefiProvisionEmpleado!=null && this.jInternalFrameOrderByDefiProvisionEmpleado.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByDefiProvisionEmpleado();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosDefiProvisionEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDefiProvisionEmpleado,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new DefiProvisionEmpleadoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+DefiProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO,defiprovisionempleadoConstantesFunciones.resaltarSeleccionarDefiProvisionEmpleado,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+DefiProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO,defiprovisionempleadoConstantesFunciones.resaltarSeleccionarDefiProvisionEmpleado,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosDefiProvisionEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDefiProvisionEmpleado,DefiProvisionEmpleadoConstantesFunciones.LABEL_ID));

		if(this.defiprovisionempleadoConstantesFunciones.mostraridDefiProvisionEmpleado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DefiProvisionEmpleadoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.defiprovisionempleadoConstantesFunciones.resaltaridDefiProvisionEmpleado,this.defiprovisionempleadoConstantesFunciones.activaridDefiProvisionEmpleado,this,true,"idDefiProvisionEmpleado","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.defiprovisionempleadoConstantesFunciones.resaltaridDefiProvisionEmpleado,this.defiprovisionempleadoConstantesFunciones.activaridDefiProvisionEmpleado,this,true,"idDefiProvisionEmpleado","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDefiProvisionEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDefiProvisionEmpleado,DefiProvisionEmpleadoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.defiprovisionempleadoConstantesFunciones.mostrarid_empresaDefiProvisionEmpleado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DefiProvisionEmpleadoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.defiprovisionempleadoConstantesFunciones.resaltarid_empresaDefiProvisionEmpleado,this,this.defiprovisionempleadoConstantesFunciones.activarid_empresaDefiProvisionEmpleado));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.defiprovisionempleadoConstantesFunciones.resaltarid_empresaDefiProvisionEmpleado,this,this.defiprovisionempleadoConstantesFunciones.activarid_empresaDefiProvisionEmpleado,false,"id_empresaDefiProvisionEmpleado","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DefiProvisionEmpleadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDefiProvisionEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDefiProvisionEmpleado,DefiProvisionEmpleadoConstantesFunciones.LABEL_IDRUBROEMPLEA));

		if(this.defiprovisionempleadoConstantesFunciones.mostrarid_rubro_empleaDefiProvisionEmpleado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DefiProvisionEmpleadoConstantesFunciones.LABEL_IDRUBROEMPLEA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new RubroEmpleaTableCell(this.rubroempleasForeignKey,this.defiprovisionempleadoConstantesFunciones.resaltarid_rubro_empleaDefiProvisionEmpleado,this,this.defiprovisionempleadoConstantesFunciones.activarid_rubro_empleaDefiProvisionEmpleado));
			tableColumn.setCellEditor(new RubroEmpleaTableCell(this.rubroempleasForeignKey,this.defiprovisionempleadoConstantesFunciones.resaltarid_rubro_empleaDefiProvisionEmpleado,this,this.defiprovisionempleadoConstantesFunciones.activarid_rubro_empleaDefiProvisionEmpleado,true,"id_rubro_empleaDefiProvisionEmpleado","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DefiProvisionEmpleadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDefiProvisionEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDefiProvisionEmpleado,DefiProvisionEmpleadoConstantesFunciones.LABEL_IDFORMATO));

		if(this.defiprovisionempleadoConstantesFunciones.mostrarid_formatoDefiProvisionEmpleado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DefiProvisionEmpleadoConstantesFunciones.LABEL_IDFORMATO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new FormatoTableCell(this.formatosForeignKey,this.defiprovisionempleadoConstantesFunciones.resaltarid_formatoDefiProvisionEmpleado,this,this.defiprovisionempleadoConstantesFunciones.activarid_formatoDefiProvisionEmpleado));
			tableColumn.setCellEditor(new FormatoTableCell(this.formatosForeignKey,this.defiprovisionempleadoConstantesFunciones.resaltarid_formatoDefiProvisionEmpleado,this,this.defiprovisionempleadoConstantesFunciones.activarid_formatoDefiProvisionEmpleado,true,"id_formatoDefiProvisionEmpleado","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DefiProvisionEmpleadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDefiProvisionEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDefiProvisionEmpleado,DefiProvisionEmpleadoConstantesFunciones.LABEL_NOMBRE));

		if(this.defiprovisionempleadoConstantesFunciones.mostrarnombreDefiProvisionEmpleado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DefiProvisionEmpleadoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.defiprovisionempleadoConstantesFunciones.resaltarnombreDefiProvisionEmpleado,this.defiprovisionempleadoConstantesFunciones.activarnombreDefiProvisionEmpleado,this,true,"nombreDefiProvisionEmpleado","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.defiprovisionempleadoConstantesFunciones.resaltarnombreDefiProvisionEmpleado,this.defiprovisionempleadoConstantesFunciones.activarnombreDefiProvisionEmpleado,this,true,"nombreDefiProvisionEmpleado","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DefiProvisionEmpleadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDefiProvisionEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDefiProvisionEmpleado,DefiProvisionEmpleadoConstantesFunciones.LABEL_DIAINICIAL));

		if(this.defiprovisionempleadoConstantesFunciones.mostrardia_inicialDefiProvisionEmpleado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DefiProvisionEmpleadoConstantesFunciones.LABEL_DIAINICIAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.defiprovisionempleadoConstantesFunciones.resaltardia_inicialDefiProvisionEmpleado,this.defiprovisionempleadoConstantesFunciones.activardia_inicialDefiProvisionEmpleado,this,true,"dia_inicialDefiProvisionEmpleado","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.defiprovisionempleadoConstantesFunciones.resaltardia_inicialDefiProvisionEmpleado,this.defiprovisionempleadoConstantesFunciones.activardia_inicialDefiProvisionEmpleado,this,true,"dia_inicialDefiProvisionEmpleado","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DefiProvisionEmpleadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDefiProvisionEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDefiProvisionEmpleado,DefiProvisionEmpleadoConstantesFunciones.LABEL_IDMESINICIAL));

		if(this.defiprovisionempleadoConstantesFunciones.mostrarid_mes_inicialDefiProvisionEmpleado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DefiProvisionEmpleadoConstantesFunciones.LABEL_IDMESINICIAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new MesTableCell(this.mesinicialsForeignKey,this.defiprovisionempleadoConstantesFunciones.resaltarid_mes_inicialDefiProvisionEmpleado,this,this.defiprovisionempleadoConstantesFunciones.activarid_mes_inicialDefiProvisionEmpleado));
			tableColumn.setCellEditor(new MesTableCell(this.mesinicialsForeignKey,this.defiprovisionempleadoConstantesFunciones.resaltarid_mes_inicialDefiProvisionEmpleado,this,this.defiprovisionempleadoConstantesFunciones.activarid_mes_inicialDefiProvisionEmpleado,true,"id_mes_inicialDefiProvisionEmpleado","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DefiProvisionEmpleadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDefiProvisionEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDefiProvisionEmpleado,DefiProvisionEmpleadoConstantesFunciones.LABEL_DIAFINAL));

		if(this.defiprovisionempleadoConstantesFunciones.mostrardia_finalDefiProvisionEmpleado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DefiProvisionEmpleadoConstantesFunciones.LABEL_DIAFINAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.defiprovisionempleadoConstantesFunciones.resaltardia_finalDefiProvisionEmpleado,this.defiprovisionempleadoConstantesFunciones.activardia_finalDefiProvisionEmpleado,this,true,"dia_finalDefiProvisionEmpleado","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.defiprovisionempleadoConstantesFunciones.resaltardia_finalDefiProvisionEmpleado,this.defiprovisionempleadoConstantesFunciones.activardia_finalDefiProvisionEmpleado,this,true,"dia_finalDefiProvisionEmpleado","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DefiProvisionEmpleadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDefiProvisionEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDefiProvisionEmpleado,DefiProvisionEmpleadoConstantesFunciones.LABEL_IDMESFINAL));

		if(this.defiprovisionempleadoConstantesFunciones.mostrarid_mes_finalDefiProvisionEmpleado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DefiProvisionEmpleadoConstantesFunciones.LABEL_IDMESFINAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new MesTableCell(this.mesfinalsForeignKey,this.defiprovisionempleadoConstantesFunciones.resaltarid_mes_finalDefiProvisionEmpleado,this,this.defiprovisionempleadoConstantesFunciones.activarid_mes_finalDefiProvisionEmpleado));
			tableColumn.setCellEditor(new MesTableCell(this.mesfinalsForeignKey,this.defiprovisionempleadoConstantesFunciones.resaltarid_mes_finalDefiProvisionEmpleado,this,this.defiprovisionempleadoConstantesFunciones.activarid_mes_finalDefiProvisionEmpleado,true,"id_mes_finalDefiProvisionEmpleado","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DefiProvisionEmpleadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDefiProvisionEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDefiProvisionEmpleado,DefiProvisionEmpleadoConstantesFunciones.LABEL_PARALIQUIDACION));

		if(this.defiprovisionempleadoConstantesFunciones.mostrarpara_liquidacionDefiProvisionEmpleado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DefiProvisionEmpleadoConstantesFunciones.LABEL_PARALIQUIDACION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.defiprovisionempleadoConstantesFunciones.resaltarpara_liquidacionDefiProvisionEmpleado,this.defiprovisionempleadoConstantesFunciones.activarpara_liquidacionDefiProvisionEmpleado));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.defiprovisionempleadoConstantesFunciones.resaltarpara_liquidacionDefiProvisionEmpleado,this.defiprovisionempleadoConstantesFunciones.activarpara_liquidacionDefiProvisionEmpleado,this,true,"para_liquidacionDefiProvisionEmpleado","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DefiProvisionEmpleadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDefiProvisionEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDefiProvisionEmpleado,DefiProvisionEmpleadoConstantesFunciones.LABEL_DESCRIPCION));

		if(this.defiprovisionempleadoConstantesFunciones.mostrardescripcionDefiProvisionEmpleado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DefiProvisionEmpleadoConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.defiprovisionempleadoConstantesFunciones.resaltardescripcionDefiProvisionEmpleado,this.defiprovisionempleadoConstantesFunciones.activardescripcionDefiProvisionEmpleado,this,true,"descripcionDefiProvisionEmpleado","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.defiprovisionempleadoConstantesFunciones.resaltardescripcionDefiProvisionEmpleado,this.defiprovisionempleadoConstantesFunciones.activardescripcionDefiProvisionEmpleado,this,true,"descripcionDefiProvisionEmpleado","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DefiProvisionEmpleadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosProvisionEmpleado && this.defiprovisionempleadoConstantesFunciones.mostrarProvisionEmpleadoDefiProvisionEmpleado && !DefiProvisionEmpleadoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Provision Empleados");
				tableColumn.setHeaderValue("Provision Empleados");
				tableColumn.setCellRenderer(new ProvisionEmpleadoTableCell(defiprovisionempleadoConstantesFunciones.resaltarProvisionEmpleadoDefiProvisionEmpleado,this,this.defiprovisionempleadoConstantesFunciones.activarProvisionEmpleadoDefiProvisionEmpleado));
				tableColumn.setCellEditor(new ProvisionEmpleadoTableCell(defiprovisionempleadoConstantesFunciones.resaltarProvisionEmpleadoDefiProvisionEmpleado,this,this.defiprovisionempleadoConstantesFunciones.activarProvisionEmpleadoDefiProvisionEmpleado));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosDefiProvisionEmpleado.addColumn(tableColumn);
			}

			if(this.isTienePermisosCuota && this.defiprovisionempleadoConstantesFunciones.mostrarCuotaDefiProvisionEmpleado && !DefiProvisionEmpleadoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Cuotas");
				tableColumn.setHeaderValue("Cuotas");
				tableColumn.setCellRenderer(new CuotaTableCell(defiprovisionempleadoConstantesFunciones.resaltarCuotaDefiProvisionEmpleado,this,this.defiprovisionempleadoConstantesFunciones.activarCuotaDefiProvisionEmpleado));
				tableColumn.setCellEditor(new CuotaTableCell(defiprovisionempleadoConstantesFunciones.resaltarCuotaDefiProvisionEmpleado,this,this.defiprovisionempleadoConstantesFunciones.activarCuotaDefiProvisionEmpleado));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosDefiProvisionEmpleado.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDefiProvisionEmpleado.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDefiProvisionEmpleado.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarDefiProvisionEmpleado && this.isPermisoGuardarCambiosDefiProvisionEmpleado) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosDefiProvisionEmpleado.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.defiprovisionempleadoSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosDefiProvisionEmpleado.addColumn(tableColumn);
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
			
			this.jTableDatosDefiProvisionEmpleado.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDefiProvisionEmpleado && this.isPermisoGuardarCambiosDefiProvisionEmpleado) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.defiprovisionempleadoSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDefiProvisionEmpleado && this.isPermisoGuardarCambiosDefiProvisionEmpleado) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosDefiProvisionEmpleado.moveColumn(this.jTableDatosDefiProvisionEmpleado.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosDefiProvisionEmpleado.moveColumn(this.jTableDatosDefiProvisionEmpleado.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.defiprovisionempleadoSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosDefiProvisionEmpleado.moveColumn(this.jTableDatosDefiProvisionEmpleado.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosDefiProvisionEmpleado.moveColumn(this.jTableDatosDefiProvisionEmpleado.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosDefiProvisionEmpleado.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosDefiProvisionEmpleado.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosDefiProvisionEmpleado,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!DefiProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosDefiProvisionEmpleado.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosDefiProvisionEmpleado.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!DefiProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!DefiProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosDefiProvisionEmpleado.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosDefiProvisionEmpleado.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosDefiProvisionEmpleado.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=defiprovisionempleadoLogic.getDefiProvisionEmpleados().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=defiprovisionempleados.size()-1;
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
		//this.jTableDatosDefiProvisionEmpleado.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosDefiProvisionEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosDefiProvisionEmpleado();
			
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
				
				//this.isEsNuevoDefiProvisionEmpleado=false;
					
				DefiProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.defiprovisionempleado,new Object(),this.defiprovisionempleadoParameterGeneral,this.defiprovisionempleadoReturnGeneral);
			
				if(this.defiprovisionempleadoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormDefiProvisionEmpleado==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDefiProvisionEmpleado.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDefiProvisionEmpleado.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.defiprovisionempleado =(DefiProvisionEmpleado) this.defiprovisionempleadoLogic.getDefiProvisionEmpleados().toArray()[this.jTableDatosDefiProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.defiprovisionempleado =(DefiProvisionEmpleado) this.defiprovisionempleados.toArray()[this.jTableDatosDefiProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.defiprovisionempleado.getsType().equals("DUPLICADO")
				   || this.defiprovisionempleado.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoDefiProvisionEmpleado=true;
				
				} else {
					this.isEsNuevoDefiProvisionEmpleado=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado()) {
					if(this.defiprovisionempleado.getId()>=0 && !this.defiprovisionempleado.getIsNew()) {						
						this.isEsNuevoDefiProvisionEmpleado=false;
						
					} else {
						this.isEsNuevoDefiProvisionEmpleado=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoDefiProvisionEmpleado(esRelaciones);						
				
				this.seleccionarDefiProvisionEmpleado(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.defiprovisionempleado.getId()<0) {
					this.isEsNuevoDefiProvisionEmpleado=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarDefiProvisionEmpleado(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarDefiProvisionEmpleado(evt,rowIndex);
				}	
				
				if(this.defiprovisionempleadoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion DefiProvisionEmpleado: " + this.dDif); 
					}
				}								
				
				DefiProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.defiprovisionempleado,new Object(),this.defiprovisionempleadoParameterGeneral,this.defiprovisionempleadoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarDefiProvisionEmpleado(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.defiprovisionempleado)) {
					if(this.defiprovisionempleado.getId()>0) {
						this.defiprovisionempleado.setIsDeleted(true);
						
						this.defiprovisionempleadosEliminados.add(this.defiprovisionempleado);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.defiprovisionempleadoLogic.getDefiProvisionEmpleados().remove(this.defiprovisionempleado);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.defiprovisionempleados.remove(this.defiprovisionempleado);				
					}
					
					
					((DefiProvisionEmpleadoModel) this.jTableDatosDefiProvisionEmpleado.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaDefiProvisionEmpleado(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarDefiProvisionEmpleado(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoDefiProvisionEmpleado) {
			
			if(this.jInternalFrameDetalleFormDefiProvisionEmpleado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDefiProvisionEmpleado.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDefiProvisionEmpleado.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.defiprovisionempleado =(DefiProvisionEmpleado) this.defiprovisionempleadoLogic.getDefiProvisionEmpleados().toArray()[this.jTableDatosDefiProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.defiprovisionempleado =(DefiProvisionEmpleado) this.defiprovisionempleados.toArray()[this.jTableDatosDefiProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(DefiProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioDefiProvisionEmpleado(this.defiprovisionempleado);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.defiprovisionempleadoConstantesFunciones.cargarid_empresaDefiProvisionEmpleado || this.defiprovisionempleadoConstantesFunciones.event_dependid_empresaDefiProvisionEmpleado) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.defiprovisionempleado.getid_empresa());
									//this.inicializarActualizarBindingDefiProvisionEmpleado(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(defiprovisionempleado.getEmpresa()!=null) {
							this.empresasForeignKey.add(defiprovisionempleado.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.defiprovisionempleado.getid_empresa(),false,"Formulario");

					//RubroEmplea
					if(!this.defiprovisionempleadoConstantesFunciones.cargarid_rubro_empleaDefiProvisionEmpleado || this.defiprovisionempleadoConstantesFunciones.event_dependid_rubro_empleaDefiProvisionEmpleado) {
						//this.cargarCombosRubroEmpleasForeignKeyLista(" where id="+this.defiprovisionempleado.getid_rubro_emplea());
									//this.inicializarActualizarBindingDefiProvisionEmpleado(false,false);
						this.rubroempleasForeignKey=new ArrayList<RubroEmplea>();

						if(defiprovisionempleado.getRubroEmplea()!=null) {
							this.rubroempleasForeignKey.add(defiprovisionempleado.getRubroEmplea());
						}

						this.addItemDefectoCombosForeignKeyRubroEmplea();
						this.cargarCombosFrameRubroEmpleasForeignKey("Todos");
					}
					this.setActualRubroEmpleaForeignKey(this.defiprovisionempleado.getid_rubro_emplea(),false,"Formulario");

					//Formato
					if(!this.defiprovisionempleadoConstantesFunciones.cargarid_formatoDefiProvisionEmpleado || this.defiprovisionempleadoConstantesFunciones.event_dependid_formatoDefiProvisionEmpleado) {
						//this.cargarCombosFormatosForeignKeyLista(" where id="+this.defiprovisionempleado.getid_formato());
									//this.inicializarActualizarBindingDefiProvisionEmpleado(false,false);
						this.formatosForeignKey=new ArrayList<Formato>();

						if(defiprovisionempleado.getFormato()!=null) {
							this.formatosForeignKey.add(defiprovisionempleado.getFormato());
						}

						this.addItemDefectoCombosForeignKeyFormato();
						this.cargarCombosFrameFormatosForeignKey("Todos");
					}
					this.setActualFormatoForeignKey(this.defiprovisionempleado.getid_formato(),false,"Formulario");

					//MesInicial
					if(!this.defiprovisionempleadoConstantesFunciones.cargarid_mes_inicialDefiProvisionEmpleado || this.defiprovisionempleadoConstantesFunciones.event_dependid_mes_inicialDefiProvisionEmpleado) {
						//this.cargarCombosMesInicialsForeignKeyLista(" where id="+this.defiprovisionempleado.getid_mes_inicial());
									//this.inicializarActualizarBindingDefiProvisionEmpleado(false,false);
						this.mesinicialsForeignKey=new ArrayList<Mes>();

						if(defiprovisionempleado.getMesInicial()!=null) {
							this.mesinicialsForeignKey.add(defiprovisionempleado.getMesInicial());
						}

						this.addItemDefectoCombosForeignKeyMesInicial();
						this.cargarCombosFrameMesInicialsForeignKey("Todos");
					}
					this.setActualMesInicialForeignKey(this.defiprovisionempleado.getid_mes_inicial(),false,"Formulario");

					//MesFinal
					if(!this.defiprovisionempleadoConstantesFunciones.cargarid_mes_finalDefiProvisionEmpleado || this.defiprovisionempleadoConstantesFunciones.event_dependid_mes_finalDefiProvisionEmpleado) {
						//this.cargarCombosMesFinalsForeignKeyLista(" where id="+this.defiprovisionempleado.getid_mes_final());
									//this.inicializarActualizarBindingDefiProvisionEmpleado(false,false);
						this.mesfinalsForeignKey=new ArrayList<Mes>();

						if(defiprovisionempleado.getMesFinal()!=null) {
							this.mesfinalsForeignKey.add(defiprovisionempleado.getMesFinal());
						}

						this.addItemDefectoCombosForeignKeyMesFinal();
						this.cargarCombosFrameMesFinalsForeignKey("Todos");
					}
					this.setActualMesFinalForeignKey(this.defiprovisionempleado.getid_mes_final(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesDefiProvisionEmpleado("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesDefiProvisionEmpleado(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDefiProvisionEmpleado() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoDefiProvisionEmpleado(DefiProvisionEmpleado defiprovisionempleado) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoDefiProvisionEmpleado(defiprovisionempleado,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoDefiProvisionEmpleado(DefiProvisionEmpleado defiprovisionempleado,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioDefiProvisionEmpleado(defiprovisionempleado);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyDefiProvisionEmpleado(defiprovisionempleado,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyDefiProvisionEmpleado(defiprovisionempleado);
	}
	
	public void setVariablesObjetoActualToFormularioDefiProvisionEmpleado(DefiProvisionEmpleado defiprovisionempleado) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormDefiProvisionEmpleado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormDefiProvisionEmpleado.jLabelidDefiProvisionEmpleado.setText(defiprovisionempleado.getId().toString());
			this.jInternalFrameDetalleFormDefiProvisionEmpleado.jTextAreanombreDefiProvisionEmpleado.setText(defiprovisionempleado.getnombre());
			this.jInternalFrameDetalleFormDefiProvisionEmpleado.jTextFielddia_inicialDefiProvisionEmpleado.setText(defiprovisionempleado.getdia_inicial().toString());
			this.jInternalFrameDetalleFormDefiProvisionEmpleado.jTextFielddia_finalDefiProvisionEmpleado.setText(defiprovisionempleado.getdia_final().toString());
			this.jInternalFrameDetalleFormDefiProvisionEmpleado.jCheckBoxpara_liquidacionDefiProvisionEmpleado.setSelected(defiprovisionempleado.getpara_liquidacion());
			this.jInternalFrameDetalleFormDefiProvisionEmpleado.jTextAreadescripcionDefiProvisionEmpleado.setText(defiprovisionempleado.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,DefiProvisionEmpleado defiprovisionempleadoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,defiprovisionempleadoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,DefiProvisionEmpleado defiprovisionempleadoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				defiprovisionempleadoLocal=this.defiprovisionempleado;
			} else {
				defiprovisionempleadoLocal=this.defiprovisionempleadoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(defiprovisionempleadoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoDefiProvisionEmpleado(defiprovisionempleadoLocal,true);
					
					if(defiprovisionempleadoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(defiprovisionempleadoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(defiprovisionempleadoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoDefiProvisionEmpleado(DefiProvisionEmpleado defiprovisionempleado,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDefiProvisionEmpleado(defiprovisionempleado,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysDefiProvisionEmpleado(defiprovisionempleado);
	}
	
	public void setVariablesFormularioToObjetoActualDefiProvisionEmpleado(DefiProvisionEmpleado defiprovisionempleado,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDefiProvisionEmpleado(defiprovisionempleado,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualDefiProvisionEmpleado(DefiProvisionEmpleado defiprovisionempleado,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormDefiProvisionEmpleado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormDefiProvisionEmpleado.jLabelidDefiProvisionEmpleado.getText()==null || this.jInternalFrameDetalleFormDefiProvisionEmpleado.jLabelidDefiProvisionEmpleado.getText()=="" || this.jInternalFrameDetalleFormDefiProvisionEmpleado.jLabelidDefiProvisionEmpleado.getText()=="Id") {
				this.jInternalFrameDetalleFormDefiProvisionEmpleado.jLabelidDefiProvisionEmpleado.setText("0");
			}

			if(conColumnasBase) {defiprovisionempleado.setId(Long.parseLong(this.jInternalFrameDetalleFormDefiProvisionEmpleado.jLabelidDefiProvisionEmpleado.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DefiProvisionEmpleadoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDefiProvisionEmpleado.jLabelIdDefiProvisionEmpleado,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			defiprovisionempleado.setnombre(this.jInternalFrameDetalleFormDefiProvisionEmpleado.jTextAreanombreDefiProvisionEmpleado.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DefiProvisionEmpleadoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDefiProvisionEmpleado.jLabelnombreDefiProvisionEmpleado,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			defiprovisionempleado.setdia_inicial(Integer.parseInt(this.jInternalFrameDetalleFormDefiProvisionEmpleado.jTextFielddia_inicialDefiProvisionEmpleado.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DefiProvisionEmpleadoConstantesFunciones.LABEL_DIAINICIAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDefiProvisionEmpleado.jLabeldia_inicialDefiProvisionEmpleado,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			defiprovisionempleado.setdia_final(Integer.parseInt(this.jInternalFrameDetalleFormDefiProvisionEmpleado.jTextFielddia_finalDefiProvisionEmpleado.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DefiProvisionEmpleadoConstantesFunciones.LABEL_DIAFINAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDefiProvisionEmpleado.jLabeldia_finalDefiProvisionEmpleado,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			defiprovisionempleado.setpara_liquidacion(this.jInternalFrameDetalleFormDefiProvisionEmpleado.jCheckBoxpara_liquidacionDefiProvisionEmpleado.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DefiProvisionEmpleadoConstantesFunciones.LABEL_PARALIQUIDACION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDefiProvisionEmpleado.jLabelpara_liquidacionDefiProvisionEmpleado,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			defiprovisionempleado.setdescripcion(this.jInternalFrameDetalleFormDefiProvisionEmpleado.jTextAreadescripcionDefiProvisionEmpleado.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DefiProvisionEmpleadoConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDefiProvisionEmpleado.jLabeldescripcionDefiProvisionEmpleado,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDefiProvisionEmpleado(DefiProvisionEmpleado defiprovisionempleadoBean,DefiProvisionEmpleado defiprovisionempleado,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && defiprovisionempleadoBean.getid_rubro_emplea()!=null && !defiprovisionempleadoBean.getid_rubro_emplea().equals(-1L))) {defiprovisionempleado.setid_rubro_emplea(defiprovisionempleadoBean.getid_rubro_emplea());}
			if(conDefault || (!conDefault && defiprovisionempleadoBean.getid_formato()!=null && !defiprovisionempleadoBean.getid_formato().equals(-1L))) {defiprovisionempleado.setid_formato(defiprovisionempleadoBean.getid_formato());}
			if(conDefault || (!conDefault && defiprovisionempleadoBean.getid_mes_inicial()!=null && !defiprovisionempleadoBean.getid_mes_inicial().equals(-1L))) {defiprovisionempleado.setid_mes_inicial(defiprovisionempleadoBean.getid_mes_inicial());}
			if(conDefault || (!conDefault && defiprovisionempleadoBean.getid_mes_final()!=null && !defiprovisionempleadoBean.getid_mes_final().equals(-1L))) {defiprovisionempleado.setid_mes_final(defiprovisionempleadoBean.getid_mes_final());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosDefiProvisionEmpleado(DefiProvisionEmpleado defiprovisionempleadoOrigen,DefiProvisionEmpleado defiprovisionempleado,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && defiprovisionempleadoOrigen.getId()!=null && !defiprovisionempleadoOrigen.getId().equals(0L))) {defiprovisionempleado.setId(defiprovisionempleadoOrigen.getId());}}
			if(conDefault || (!conDefault && defiprovisionempleadoOrigen.getid_rubro_emplea()!=null && !defiprovisionempleadoOrigen.getid_rubro_emplea().equals(-1L))) {defiprovisionempleado.setid_rubro_emplea(defiprovisionempleadoOrigen.getid_rubro_emplea());}
			if(conDefault || (!conDefault && defiprovisionempleadoOrigen.getid_formato()!=null && !defiprovisionempleadoOrigen.getid_formato().equals(-1L))) {defiprovisionempleado.setid_formato(defiprovisionempleadoOrigen.getid_formato());}
			if(conDefault || (!conDefault && defiprovisionempleadoOrigen.getnombre()!=null && !defiprovisionempleadoOrigen.getnombre().equals(""))) {defiprovisionempleado.setnombre(defiprovisionempleadoOrigen.getnombre());}
			if(conDefault || (!conDefault && defiprovisionempleadoOrigen.getdia_inicial()!=null && !defiprovisionempleadoOrigen.getdia_inicial().equals(0))) {defiprovisionempleado.setdia_inicial(defiprovisionempleadoOrigen.getdia_inicial());}
			if(conDefault || (!conDefault && defiprovisionempleadoOrigen.getid_mes_inicial()!=null && !defiprovisionempleadoOrigen.getid_mes_inicial().equals(-1L))) {defiprovisionempleado.setid_mes_inicial(defiprovisionempleadoOrigen.getid_mes_inicial());}
			if(conDefault || (!conDefault && defiprovisionempleadoOrigen.getdia_final()!=null && !defiprovisionempleadoOrigen.getdia_final().equals(0))) {defiprovisionempleado.setdia_final(defiprovisionempleadoOrigen.getdia_final());}
			if(conDefault || (!conDefault && defiprovisionempleadoOrigen.getid_mes_final()!=null && !defiprovisionempleadoOrigen.getid_mes_final().equals(-1L))) {defiprovisionempleado.setid_mes_final(defiprovisionempleadoOrigen.getid_mes_final());}
			if(conDefault || (!conDefault && defiprovisionempleadoOrigen.getpara_liquidacion()!=null && !defiprovisionempleadoOrigen.getpara_liquidacion().equals(false))) {defiprovisionempleado.setpara_liquidacion(defiprovisionempleadoOrigen.getpara_liquidacion());}
			if(conDefault || (!conDefault && defiprovisionempleadoOrigen.getdescripcion()!=null && !defiprovisionempleadoOrigen.getdescripcion().equals(""))) {defiprovisionempleado.setdescripcion(defiprovisionempleadoOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDefiProvisionEmpleado(DefiProvisionEmpleado defiprovisionempleado) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDefiProvisionEmpleado.jLabelidDefiProvisionEmpleado.setText(defiprovisionempleado.getId().toString());
			this.jInternalFrameDetalleFormDefiProvisionEmpleado.jTextAreanombreDefiProvisionEmpleado.setText(defiprovisionempleado.getnombre());
			this.jInternalFrameDetalleFormDefiProvisionEmpleado.jTextFielddia_inicialDefiProvisionEmpleado.setText(defiprovisionempleado.getdia_inicial().toString());
			this.jInternalFrameDetalleFormDefiProvisionEmpleado.jTextFielddia_finalDefiProvisionEmpleado.setText(defiprovisionempleado.getdia_final().toString());
			this.jInternalFrameDetalleFormDefiProvisionEmpleado.jCheckBoxpara_liquidacionDefiProvisionEmpleado.setSelected(defiprovisionempleado.getpara_liquidacion());
			this.jInternalFrameDetalleFormDefiProvisionEmpleado.jTextAreadescripcionDefiProvisionEmpleado.setText(defiprovisionempleado.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDefiProvisionEmpleado(DefiProvisionEmpleadoBean defiprovisionempleadoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDefiProvisionEmpleado.jLabelidDefiProvisionEmpleado.setText(defiprovisionempleadoBean.getId().toString());
			this.jInternalFrameDetalleFormDefiProvisionEmpleado.jTextAreanombreDefiProvisionEmpleado.setText(defiprovisionempleadoBean.getnombre());
			this.jInternalFrameDetalleFormDefiProvisionEmpleado.jTextFielddia_inicialDefiProvisionEmpleado.setText(defiprovisionempleadoBean.getdia_inicial().toString());
			this.jInternalFrameDetalleFormDefiProvisionEmpleado.jTextFielddia_finalDefiProvisionEmpleado.setText(defiprovisionempleadoBean.getdia_final().toString());
			this.jInternalFrameDetalleFormDefiProvisionEmpleado.jCheckBoxpara_liquidacionDefiProvisionEmpleado.setSelected(defiprovisionempleadoBean.getpara_liquidacion());
			this.jInternalFrameDetalleFormDefiProvisionEmpleado.jTextAreadescripcionDefiProvisionEmpleado.setText(defiprovisionempleadoBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanDefiProvisionEmpleado(DefiProvisionEmpleadoParameterReturnGeneral defiprovisionempleadoReturnGeneral,DefiProvisionEmpleadoBean defiprovisionempleadoBean,Boolean conDefault) throws Exception { 
		try {
			DefiProvisionEmpleado defiprovisionempleadoLocal=new DefiProvisionEmpleado();
			
			defiprovisionempleadoLocal=defiprovisionempleadoReturnGeneral.getDefiProvisionEmpleado();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && defiprovisionempleadoLocal.getId()!=null && !defiprovisionempleadoLocal.getId().equals(0L))) {defiprovisionempleadoBean.setId(defiprovisionempleadoLocal.getId());}}
			if(conDefault || (!conDefault && defiprovisionempleadoLocal.getid_rubro_emplea()!=null && !defiprovisionempleadoLocal.getid_rubro_emplea().equals(-1L))) {defiprovisionempleadoBean.setid_rubro_emplea(defiprovisionempleadoLocal.getid_rubro_emplea());}
			if(conDefault || (!conDefault && defiprovisionempleadoLocal.getid_formato()!=null && !defiprovisionempleadoLocal.getid_formato().equals(-1L))) {defiprovisionempleadoBean.setid_formato(defiprovisionempleadoLocal.getid_formato());}
			if(conDefault || (!conDefault && defiprovisionempleadoLocal.getnombre()!=null && !defiprovisionempleadoLocal.getnombre().equals(""))) {defiprovisionempleadoBean.setnombre(defiprovisionempleadoLocal.getnombre());}
			if(conDefault || (!conDefault && defiprovisionempleadoLocal.getdia_inicial()!=null && !defiprovisionempleadoLocal.getdia_inicial().equals(0))) {defiprovisionempleadoBean.setdia_inicial(defiprovisionempleadoLocal.getdia_inicial());}
			if(conDefault || (!conDefault && defiprovisionempleadoLocal.getid_mes_inicial()!=null && !defiprovisionempleadoLocal.getid_mes_inicial().equals(-1L))) {defiprovisionempleadoBean.setid_mes_inicial(defiprovisionempleadoLocal.getid_mes_inicial());}
			if(conDefault || (!conDefault && defiprovisionempleadoLocal.getdia_final()!=null && !defiprovisionempleadoLocal.getdia_final().equals(0))) {defiprovisionempleadoBean.setdia_final(defiprovisionempleadoLocal.getdia_final());}
			if(conDefault || (!conDefault && defiprovisionempleadoLocal.getid_mes_final()!=null && !defiprovisionempleadoLocal.getid_mes_final().equals(-1L))) {defiprovisionempleadoBean.setid_mes_final(defiprovisionempleadoLocal.getid_mes_final());}
			if(conDefault || (!conDefault && defiprovisionempleadoLocal.getpara_liquidacion()!=null && !defiprovisionempleadoLocal.getpara_liquidacion().equals(false))) {defiprovisionempleadoBean.setpara_liquidacion(defiprovisionempleadoLocal.getpara_liquidacion());}
			if(conDefault || (!conDefault && defiprovisionempleadoLocal.getdescripcion()!=null && !defiprovisionempleadoLocal.getdescripcion().equals(""))) {defiprovisionempleadoBean.setdescripcion(defiprovisionempleadoLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxDefiProvisionEmpleadoGenerico(Long idDefiProvisionEmpleadoSeleccionado,JComboBox jComboBoxDefiProvisionEmpleado,List<DefiProvisionEmpleado> defiprovisionempleadosLocal)throws Exception {
		try {
			DefiProvisionEmpleado  defiprovisionempleadoTemp=null;

			for(DefiProvisionEmpleado defiprovisionempleadoAux:defiprovisionempleadosLocal) {
				if(defiprovisionempleadoAux.getId()!=null && defiprovisionempleadoAux.getId().equals(idDefiProvisionEmpleadoSeleccionado)) {
					defiprovisionempleadoTemp=defiprovisionempleadoAux;
					break;
				}
			}

			jComboBoxDefiProvisionEmpleado.setSelectedItem(defiprovisionempleadoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxDefiProvisionEmpleadoGenerico(JComboBox jComboBoxDefiProvisionEmpleado,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxDefiProvisionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDefiProvisionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxDefiProvisionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDefiProvisionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDefiProvisionEmpleado.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxDefiProvisionEmpleado.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDefiProvisionEmpleado.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxDefiProvisionEmpleado.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxDefiProvisionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxDefiProvisionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("ProvisionEmpleado")) {
			jButtonProvisionEmpleadoActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("Cuota")) {
			jButtonCuotaActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			defiprovisionempleado=(DefiProvisionEmpleado) defiprovisionempleadoLogic.getDefiProvisionEmpleados().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			defiprovisionempleado =(DefiProvisionEmpleado) defiprovisionempleados.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!defiprovisionempleado.getIsNew() && !defiprovisionempleado.getIsChanged() && !defiprovisionempleado.getIsDeleted()) {
				sDescripcion=defiprovisionempleado.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=defiprovisionempleado.getempresa_descripcion();
			}
		}

		if(sTipo.equals("RubroEmplea")) {
			//sDescripcion=this.getActualRubroEmpleaForeignKeyDescripcion((Long)value);
			if(!defiprovisionempleado.getIsNew() && !defiprovisionempleado.getIsChanged() && !defiprovisionempleado.getIsDeleted()) {
				sDescripcion=defiprovisionempleado.getrubroemplea_descripcion();
			} else {
				//sDescripcion=this.getActualRubroEmpleaForeignKeyDescripcion((Long)value);
				sDescripcion=defiprovisionempleado.getrubroemplea_descripcion();
			}
		}

		if(sTipo.equals("Formato")) {
			//sDescripcion=this.getActualFormatoForeignKeyDescripcion((Long)value);
			if(!defiprovisionempleado.getIsNew() && !defiprovisionempleado.getIsChanged() && !defiprovisionempleado.getIsDeleted()) {
				sDescripcion=defiprovisionempleado.getformato_descripcion();
			} else {
				//sDescripcion=this.getActualFormatoForeignKeyDescripcion((Long)value);
				sDescripcion=defiprovisionempleado.getformato_descripcion();
			}
		}

		if(sTipo.equals("MesInicial")) {
			//sDescripcion=this.getActualMesInicialForeignKeyDescripcion((Long)value);
			if(!defiprovisionempleado.getIsNew() && !defiprovisionempleado.getIsChanged() && !defiprovisionempleado.getIsDeleted()) {
				sDescripcion=defiprovisionempleado.getmesinicial_descripcion();
			} else {
				//sDescripcion=this.getActualMesInicialForeignKeyDescripcion((Long)value);
				sDescripcion=defiprovisionempleado.getmesinicial_descripcion();
			}
		}

		if(sTipo.equals("MesFinal")) {
			//sDescripcion=this.getActualMesFinalForeignKeyDescripcion((Long)value);
			if(!defiprovisionempleado.getIsNew() && !defiprovisionempleado.getIsChanged() && !defiprovisionempleado.getIsDeleted()) {
				sDescripcion=defiprovisionempleado.getmesfinal_descripcion();
			} else {
				//sDescripcion=this.getActualMesFinalForeignKeyDescripcion((Long)value);
				sDescripcion=defiprovisionempleado.getmesfinal_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		DefiProvisionEmpleado defiprovisionempleadoRow=new DefiProvisionEmpleado();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			defiprovisionempleadoRow=(DefiProvisionEmpleado) defiprovisionempleadoLogic.getDefiProvisionEmpleados().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			defiprovisionempleadoRow=(DefiProvisionEmpleado) defiprovisionempleados.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonProvisionEmpleadoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,DefiProvisionEmpleado defiprovisionempleado) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormDefiProvisionEmpleado==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.defiprovisionempleadoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.defiprovisionempleado = (DefiProvisionEmpleado)this.defiprovisionempleadoLogic.getDefiProvisionEmpleados().toArray()[this.jTableDatosDefiProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.defiprovisionempleado = (DefiProvisionEmpleado)this.defiprovisionempleados.toArray()[this.jTableDatosDefiProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(defiprovisionempleado!=null) {
						this.defiprovisionempleado = defiprovisionempleado;
					} else {
						this.defiprovisionempleado = new DefiProvisionEmpleado();
					}
				}

				if(this.isTienePermisosProvisionEmpleado && this.permiteMantenimiento(this.defiprovisionempleado)) {
					ProvisionEmpleadoBeanSwingJInternalFrame provisionempleadoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoBeanSwingJInternalFramePopup=new ProvisionEmpleadoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						provisionempleadoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoBeanSwingJInternalFramePopup;
					} else {
						provisionempleadoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame;
					}

					List<DefiProvisionEmpleado> defiprovisionempleados=new ArrayList<DefiProvisionEmpleado>();
					defiprovisionempleados.add(this.defiprovisionempleado);
					if(!esRelacionado) {
						//provisionempleadoBeanSwingJInternalFrame.provisionempleadoSessionBean.setConGuardarRelaciones(false);
						//provisionempleadoBeanSwingJInternalFrame.provisionempleadoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					provisionempleadoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormDefiProvisionEmpleado.cargarProvisionEmpleadoBeanSwingJInternalFrame(defiprovisionempleados,this.defiprovisionempleado,provisionempleadoBeanSwingJInternalFrame,/*conInicializar,*/provisionempleadoBeanSwingJInternalFrame.provisionempleadoSessionBean.getConGuardarRelaciones(),provisionempleadoBeanSwingJInternalFrame.provisionempleadoSessionBean.getEsGuardarRelacionado());
					provisionempleadoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						provisionempleadoBeanSwingJInternalFrame.actualizarEstadoPanelsProvisionEmpleado("no_relacionado");

						provisionempleadoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ProvisionEmpleadoConstantesFunciones.ITAMANIOFILATABLA + (ProvisionEmpleadoConstantesFunciones.ITAMANIOFILATABLA/2));

						provisionempleadoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderDefiProvisionEmpleado=(TitledBorder)this.jScrollPanelDatosDefiProvisionEmpleado.getBorder();
						TitledBorder titledBorderProvisionEmpleado=(TitledBorder)provisionempleadoBeanSwingJInternalFrame.jScrollPanelDatosProvisionEmpleado.getBorder();

						titledBorderProvisionEmpleado.setTitle(titledBorderDefiProvisionEmpleado.getTitle() + " -> Provision Empleado");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,provisionempleadoBeanSwingJInternalFrame);
						}

						provisionempleadoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(provisionempleadoBeanSwingJInternalFrame);

						provisionempleadoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.defiprovisionempleadoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Provision Empleado",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.defiprovisionempleadoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.defiprovisionempleadoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.defiprovisionempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonCuotaActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,DefiProvisionEmpleado defiprovisionempleado) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormDefiProvisionEmpleado==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.defiprovisionempleadoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.defiprovisionempleado = (DefiProvisionEmpleado)this.defiprovisionempleadoLogic.getDefiProvisionEmpleados().toArray()[this.jTableDatosDefiProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.defiprovisionempleado = (DefiProvisionEmpleado)this.defiprovisionempleados.toArray()[this.jTableDatosDefiProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(defiprovisionempleado!=null) {
						this.defiprovisionempleado = defiprovisionempleado;
					} else {
						this.defiprovisionempleado = new DefiProvisionEmpleado();
					}
				}

				if(this.isTienePermisosCuota && this.permiteMantenimiento(this.defiprovisionempleado)) {
					CuotaBeanSwingJInternalFrame cuotaBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaBeanSwingJInternalFramePopup=new CuotaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						cuotaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaBeanSwingJInternalFramePopup;
					} else {
						cuotaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaBeanSwingJInternalFrame;
					}

					List<DefiProvisionEmpleado> defiprovisionempleados=new ArrayList<DefiProvisionEmpleado>();
					defiprovisionempleados.add(this.defiprovisionempleado);
					if(!esRelacionado) {
						//cuotaBeanSwingJInternalFrame.cuotaSessionBean.setConGuardarRelaciones(false);
						//cuotaBeanSwingJInternalFrame.cuotaSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					cuotaBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormDefiProvisionEmpleado.cargarCuotaBeanSwingJInternalFrame(defiprovisionempleados,this.defiprovisionempleado,cuotaBeanSwingJInternalFrame,/*conInicializar,*/cuotaBeanSwingJInternalFrame.cuotaSessionBean.getConGuardarRelaciones(),cuotaBeanSwingJInternalFrame.cuotaSessionBean.getEsGuardarRelacionado());
					cuotaBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						cuotaBeanSwingJInternalFrame.actualizarEstadoPanelsCuota("no_relacionado");

						cuotaBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(CuotaConstantesFunciones.ITAMANIOFILATABLA + (CuotaConstantesFunciones.ITAMANIOFILATABLA/2));

						cuotaBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderDefiProvisionEmpleado=(TitledBorder)this.jScrollPanelDatosDefiProvisionEmpleado.getBorder();
						TitledBorder titledBorderCuota=(TitledBorder)cuotaBeanSwingJInternalFrame.jScrollPanelDatosCuota.getBorder();

						titledBorderCuota.setTitle(titledBorderDefiProvisionEmpleado.getTitle() + " -> Cuota");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,cuotaBeanSwingJInternalFrame);
						}

						cuotaBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(cuotaBeanSwingJInternalFrame);

						cuotaBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.defiprovisionempleadoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Cuota",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.defiprovisionempleadoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.defiprovisionempleadoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.defiprovisionempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualDefiProvisionEmpleado(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoDefiProvisionEmpleado.setVisible((this.isVisibilidadCeldaNuevoDefiProvisionEmpleado && this.isPermisoNuevoDefiProvisionEmpleado));			
			this.jButtonDuplicarDefiProvisionEmpleado.setVisible((this.isVisibilidadCeldaDuplicarDefiProvisionEmpleado && this.isPermisoDuplicarDefiProvisionEmpleado));			
			this.jButtonCopiarDefiProvisionEmpleado.setVisible((this.isVisibilidadCeldaCopiarDefiProvisionEmpleado && this.isPermisoCopiarDefiProvisionEmpleado));
			this.jButtonVerFormDefiProvisionEmpleado.setVisible((this.isVisibilidadCeldaVerFormDefiProvisionEmpleado && this.isPermisoVerFormDefiProvisionEmpleado));
			
			this.jButtonAbrirOrderByDefiProvisionEmpleado.setVisible((this.isVisibilidadCeldaOrdenDefiProvisionEmpleado && this.isPermisoOrdenDefiProvisionEmpleado));			
			
			this.jButtonNuevoRelacionesDefiProvisionEmpleado.setVisible((this.isVisibilidadCeldaNuevoRelacionesDefiProvisionEmpleado && this.isPermisoNuevoDefiProvisionEmpleado));			
			this.jButtonNuevoGuardarCambiosDefiProvisionEmpleado.setVisible((this.isVisibilidadCeldaNuevoDefiProvisionEmpleado && this.isPermisoNuevoDefiProvisionEmpleado && this.isPermisoGuardarCambiosDefiProvisionEmpleado));
			
			if(this.jInternalFrameDetalleFormDefiProvisionEmpleado!=null) {
			this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtonModificarDefiProvisionEmpleado.setVisible((this.isVisibilidadCeldaModificarDefiProvisionEmpleado && this.isPermisoActualizarDefiProvisionEmpleado));	
			this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtonActualizarDefiProvisionEmpleado.setVisible((this.isVisibilidadCeldaActualizarDefiProvisionEmpleado && this.isPermisoActualizarDefiProvisionEmpleado));	
			this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtonEliminarDefiProvisionEmpleado.setVisible((this.isVisibilidadCeldaEliminarDefiProvisionEmpleado && this.isPermisoEliminarDefiProvisionEmpleado));
			this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtonCancelarDefiProvisionEmpleado.setVisible(this.isVisibilidadCeldaCancelarDefiProvisionEmpleado);							
			this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtonGuardarCambiosDefiProvisionEmpleado.setVisible((this.isVisibilidadCeldaGuardarDefiProvisionEmpleado && this.isPermisoGuardarCambiosDefiProvisionEmpleado));			
			
			}
						
			this.jButtonGuardarCambiosTablaDefiProvisionEmpleado.setVisible((this.isVisibilidadCeldaGuardarCambiosDefiProvisionEmpleado && this.isPermisoGuardarCambiosDefiProvisionEmpleado));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarDefiProvisionEmpleado.setVisible((this.isVisibilidadCeldaNuevoDefiProvisionEmpleado && this.isPermisoNuevoDefiProvisionEmpleado));						
			this.jButtonDuplicarToolBarDefiProvisionEmpleado.setVisible((this.isVisibilidadCeldaDuplicarDefiProvisionEmpleado && this.isPermisoDuplicarDefiProvisionEmpleado));						
			this.jButtonCopiarToolBarDefiProvisionEmpleado.setVisible((this.isVisibilidadCeldaCopiarDefiProvisionEmpleado && this.isPermisoCopiarDefiProvisionEmpleado));			
			this.jButtonVerFormToolBarDefiProvisionEmpleado.setVisible((this.isVisibilidadCeldaVerFormDefiProvisionEmpleado && this.isPermisoVerFormDefiProvisionEmpleado));			
			this.jButtonAbrirOrderByToolBarDefiProvisionEmpleado.setVisible((this.isVisibilidadCeldaOrdenDefiProvisionEmpleado && this.isPermisoOrdenDefiProvisionEmpleado));
			this.jButtonNuevoRelacionesToolBarDefiProvisionEmpleado.setVisible((this.isVisibilidadCeldaNuevoRelacionesDefiProvisionEmpleado && this.isPermisoNuevoDefiProvisionEmpleado));			
			this.jButtonNuevoGuardarCambiosToolBarDefiProvisionEmpleado.setVisible((this.isVisibilidadCeldaNuevoDefiProvisionEmpleado && this.isPermisoNuevoDefiProvisionEmpleado && this.isPermisoGuardarCambiosDefiProvisionEmpleado));			
			
			if(this.jInternalFrameDetalleFormDefiProvisionEmpleado!=null) {
			this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtonModificarToolBarDefiProvisionEmpleado.setVisible((this.isVisibilidadCeldaModificarDefiProvisionEmpleado && this.isPermisoActualizarDefiProvisionEmpleado));	
			this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtonActualizarToolBarDefiProvisionEmpleado.setVisible((this.isVisibilidadCeldaActualizarDefiProvisionEmpleado  && this.isPermisoActualizarDefiProvisionEmpleado));	
			this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtonEliminarToolBarDefiProvisionEmpleado.setVisible((this.isVisibilidadCeldaEliminarDefiProvisionEmpleado && this.isPermisoEliminarDefiProvisionEmpleado));
			this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtonCancelarToolBarDefiProvisionEmpleado.setVisible(this.isVisibilidadCeldaCancelarDefiProvisionEmpleado);				
			this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtonGuardarCambiosToolBarDefiProvisionEmpleado.setVisible((this.isVisibilidadCeldaGuardarDefiProvisionEmpleado && this.isPermisoGuardarCambiosDefiProvisionEmpleado));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarDefiProvisionEmpleado.setVisible((this.isVisibilidadCeldaGuardarCambiosDefiProvisionEmpleado && this.isPermisoGuardarCambiosDefiProvisionEmpleado));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoDefiProvisionEmpleado.setVisible((this.isVisibilidadCeldaNuevoDefiProvisionEmpleado && this.isPermisoNuevoDefiProvisionEmpleado));			
			this.jMenuItemDuplicarDefiProvisionEmpleado.setVisible((this.isVisibilidadCeldaDuplicarDefiProvisionEmpleado && this.isPermisoDuplicarDefiProvisionEmpleado));			
			this.jMenuItemCopiarDefiProvisionEmpleado.setVisible((this.isVisibilidadCeldaCopiarDefiProvisionEmpleado && this.isPermisoCopiarDefiProvisionEmpleado));			
			this.jMenuItemVerFormDefiProvisionEmpleado.setVisible((this.isVisibilidadCeldaVerFormDefiProvisionEmpleado && this.isPermisoVerFormDefiProvisionEmpleado));			
			this.jMenuItemAbrirOrderByDefiProvisionEmpleado.setVisible((this.isVisibilidadCeldaOrdenDefiProvisionEmpleado && this.isPermisoOrdenDefiProvisionEmpleado));			
			//this.jMenuItemMostrarOcultarDefiProvisionEmpleado.setVisible((this.isVisibilidadCeldaOrdenDefiProvisionEmpleado && this.isPermisoOrdenDefiProvisionEmpleado));
			this.jMenuItemDetalleAbrirOrderByDefiProvisionEmpleado.setVisible((this.isVisibilidadCeldaOrdenDefiProvisionEmpleado && this.isPermisoOrdenDefiProvisionEmpleado));			
			//this.jMenuItemDetalleMostrarOcultarDefiProvisionEmpleado.setVisible((this.isVisibilidadCeldaOrdenDefiProvisionEmpleado && this.isPermisoOrdenDefiProvisionEmpleado));			
			this.jMenuItemNuevoRelacionesDefiProvisionEmpleado.setVisible((this.isVisibilidadCeldaNuevoRelacionesDefiProvisionEmpleado && this.isPermisoNuevoDefiProvisionEmpleado));			
			this.jMenuItemNuevoGuardarCambiosDefiProvisionEmpleado.setVisible((this.isVisibilidadCeldaNuevoDefiProvisionEmpleado && this.isPermisoNuevoDefiProvisionEmpleado && this.isPermisoGuardarCambiosDefiProvisionEmpleado));									
			
			if(this.jInternalFrameDetalleFormDefiProvisionEmpleado!=null) {
			this.jInternalFrameDetalleFormDefiProvisionEmpleado.jMenuItemModificarDefiProvisionEmpleado.setVisible((this.isVisibilidadCeldaModificarDefiProvisionEmpleado && this.isPermisoActualizarDefiProvisionEmpleado));	
			this.jInternalFrameDetalleFormDefiProvisionEmpleado.jMenuItemActualizarDefiProvisionEmpleado.setVisible((this.isVisibilidadCeldaActualizarDefiProvisionEmpleado && this.isPermisoActualizarDefiProvisionEmpleado));	
			this.jInternalFrameDetalleFormDefiProvisionEmpleado.jMenuItemEliminarDefiProvisionEmpleado.setVisible((this.isVisibilidadCeldaEliminarDefiProvisionEmpleado && this.isPermisoEliminarDefiProvisionEmpleado));
			this.jInternalFrameDetalleFormDefiProvisionEmpleado.jMenuItemCancelarDefiProvisionEmpleado.setVisible(this.isVisibilidadCeldaCancelarDefiProvisionEmpleado);				
			}
			
			this.jMenuItemGuardarCambiosDefiProvisionEmpleado.setVisible((this.isVisibilidadCeldaGuardarDefiProvisionEmpleado && this.isPermisoGuardarCambiosDefiProvisionEmpleado));						
			this.jMenuItemGuardarCambiosTablaDefiProvisionEmpleado.setVisible((this.isVisibilidadCeldaGuardarCambiosDefiProvisionEmpleado && this.isPermisoGuardarCambiosDefiProvisionEmpleado));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoDefiProvisionEmpleado=this.jButtonNuevoDefiProvisionEmpleado.isVisible();
			this.isVisibilidadCeldaDuplicarDefiProvisionEmpleado=this.jButtonDuplicarDefiProvisionEmpleado.isVisible();
			this.isVisibilidadCeldaCopiarDefiProvisionEmpleado=this.jButtonCopiarDefiProvisionEmpleado.isVisible();
			this.isVisibilidadCeldaVerFormDefiProvisionEmpleado=this.jButtonVerFormDefiProvisionEmpleado.isVisible();
			
			this.isVisibilidadCeldaOrdenDefiProvisionEmpleado=this.jButtonAbrirOrderByDefiProvisionEmpleado.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesDefiProvisionEmpleado=this.jButtonNuevoRelacionesDefiProvisionEmpleado.isVisible();
			this.isVisibilidadCeldaModificarDefiProvisionEmpleado=this.jButtonModificarDefiProvisionEmpleado.isVisible();
			
			if(this.jInternalFrameDetalleFormDefiProvisionEmpleado!=null) {
			this.isVisibilidadCeldaActualizarDefiProvisionEmpleado=this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtonActualizarDefiProvisionEmpleado.isVisible();
			this.isVisibilidadCeldaEliminarDefiProvisionEmpleado=this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtonEliminarDefiProvisionEmpleado.isVisible();
			this.isVisibilidadCeldaCancelarDefiProvisionEmpleado=this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtonCancelarDefiProvisionEmpleado.isVisible();
			this.isVisibilidadCeldaGuardarDefiProvisionEmpleado=this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtonGuardarCambiosDefiProvisionEmpleado.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosDefiProvisionEmpleado=this.jButtonGuardarCambiosTablaDefiProvisionEmpleado.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoDefiProvisionEmpleado=this.jButtonNuevoToolBarDefiProvisionEmpleado.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDefiProvisionEmpleado=this.jButtonNuevoRelacionesToolBarDefiProvisionEmpleado.isVisible();
			
			if(this.jInternalFrameDetalleFormDefiProvisionEmpleado!=null) {
			this.isVisibilidadCeldaModificarDefiProvisionEmpleado=this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtonModificarToolBarDefiProvisionEmpleado.isVisible();
			this.isVisibilidadCeldaActualizarDefiProvisionEmpleado=this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtonActualizarToolBarDefiProvisionEmpleado.isVisible();
			this.isVisibilidadCeldaEliminarDefiProvisionEmpleado=this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtonEliminarToolBarDefiProvisionEmpleado.isVisible();
			this.isVisibilidadCeldaCancelarDefiProvisionEmpleado=this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtonCancelarToolBarDefiProvisionEmpleado.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDefiProvisionEmpleado=this.jButtonGuardarCambiosToolBarDefiProvisionEmpleado.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDefiProvisionEmpleado=this.jButtonGuardarCambiosTablaToolBarDefiProvisionEmpleado.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoDefiProvisionEmpleado=this.jMenuItemNuevoDefiProvisionEmpleado.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDefiProvisionEmpleado=this.jMenuItemNuevoRelacionesDefiProvisionEmpleado.isVisible();
			
			if(this.jInternalFrameDetalleFormDefiProvisionEmpleado!=null) {
			this.isVisibilidadCeldaModificarDefiProvisionEmpleado=this.jInternalFrameDetalleFormDefiProvisionEmpleado.jMenuItemModificarDefiProvisionEmpleado.isVisible();
			this.isVisibilidadCeldaActualizarDefiProvisionEmpleado=this.jInternalFrameDetalleFormDefiProvisionEmpleado.jMenuItemActualizarDefiProvisionEmpleado.isVisible();
			this.isVisibilidadCeldaEliminarDefiProvisionEmpleado=this.jInternalFrameDetalleFormDefiProvisionEmpleado.jMenuItemEliminarDefiProvisionEmpleado.isVisible();
			this.isVisibilidadCeldaCancelarDefiProvisionEmpleado=this.jInternalFrameDetalleFormDefiProvisionEmpleado.jMenuItemCancelarDefiProvisionEmpleado.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDefiProvisionEmpleado=this.jMenuItemGuardarCambiosDefiProvisionEmpleado.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDefiProvisionEmpleado=this.jMenuItemGuardarCambiosTablaDefiProvisionEmpleado.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesDefiProvisionEmpleado(Boolean esInicializar) {
		if(DefiProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.defiprovisionempleadoSessionBean.getConGuardarRelaciones()) {
				//if(this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesDefiProvisionEmpleado();
			}
			
			this.inicializarActualizarBindingBotonesManualDefiProvisionEmpleado(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualDefiProvisionEmpleado() {
		this.jButtonNuevoDefiProvisionEmpleado.setVisible(this.isPermisoNuevoDefiProvisionEmpleado);			
		this.jButtonDuplicarDefiProvisionEmpleado.setVisible(this.isPermisoDuplicarDefiProvisionEmpleado);			
		this.jButtonCopiarDefiProvisionEmpleado.setVisible(this.isPermisoCopiarDefiProvisionEmpleado);			
		this.jButtonVerFormDefiProvisionEmpleado.setVisible(this.isPermisoVerFormDefiProvisionEmpleado);			
		
		this.jButtonAbrirOrderByDefiProvisionEmpleado.setVisible(this.isPermisoOrdenDefiProvisionEmpleado);					
		
		this.jButtonNuevoRelacionesDefiProvisionEmpleado.setVisible(this.isPermisoNuevoDefiProvisionEmpleado);			
		
		if(this.jInternalFrameDetalleFormDefiProvisionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtonModificarDefiProvisionEmpleado.setVisible(this.isPermisoActualizarDefiProvisionEmpleado);	
			this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtonActualizarDefiProvisionEmpleado.setVisible(this.isPermisoActualizarDefiProvisionEmpleado);	
			this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtonEliminarDefiProvisionEmpleado.setVisible(this.isPermisoEliminarDefiProvisionEmpleado);
			this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtonCancelarDefiProvisionEmpleado.setVisible(this.isVisibilidadCeldaCancelarDefiProvisionEmpleado);						
			this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtonGuardarCambiosDefiProvisionEmpleado.setVisible(this.isPermisoGuardarCambiosDefiProvisionEmpleado);							
		}
		
		this.jButtonGuardarCambiosTablaDefiProvisionEmpleado.setVisible(this.isPermisoActualizarDefiProvisionEmpleado);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleDefiProvisionEmpleado() {
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtonModificarDefiProvisionEmpleado.setVisible(this.isPermisoActualizarDefiProvisionEmpleado);	
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtonActualizarDefiProvisionEmpleado.setVisible(this.isPermisoActualizarDefiProvisionEmpleado);	
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtonEliminarDefiProvisionEmpleado.setVisible(this.isPermisoEliminarDefiProvisionEmpleado);
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtonCancelarDefiProvisionEmpleado.setVisible(this.isVisibilidadCeldaCancelarDefiProvisionEmpleado);							
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtonGuardarCambiosDefiProvisionEmpleado.setVisible((this.isVisibilidadCeldaGuardarDefiProvisionEmpleado && this.isPermisoGuardarCambiosDefiProvisionEmpleado));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosDefiProvisionEmpleado() {
		if(DefiProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualDefiProvisionEmpleado();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesDefiProvisionEmpleado() {
	}
	
	public void jTableDatosDefiProvisionEmpleadoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarDefiProvisionEmpleado(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidDefiProvisionEmpleadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.defiprovisionempleadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDefiProvisionEmpleado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDefiProvisionEmpleado(this.getdefiprovisionempleado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDefiProvisionEmpleado(this.defiprovisionempleado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.defiprovisionempleado =(DefiProvisionEmpleado) this.defiprovisionempleadoLogic.getDefiProvisionEmpleados().toArray()[this.jTableDatosDefiProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.defiprovisionempleado =(DefiProvisionEmpleado) this.defiprovisionempleados.toArray()[this.jTableDatosDefiProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.defiprovisionempleado==null) {
						this.defiprovisionempleado = new DefiProvisionEmpleado();
					}

					this.setVariablesFormularioToObjetoActualDefiProvisionEmpleado(this.defiprovisionempleado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDefiProvisionEmpleado(this.defiprovisionempleado);
				}

				if(this.defiprovisionempleado.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.defiprovisionempleado.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDefiProvisionEmpleado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.defiprovisionempleadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.defiprovisionempleadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.defiprovisionempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaDefiProvisionEmpleadoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.defiprovisionempleadoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebDefiProvisionEmpleado(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDefiProvisionEmpleado.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDefiProvisionEmpleado.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDefiProvisionEmpleado.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.defiprovisionempleado =(DefiProvisionEmpleado) this.defiprovisionempleadoLogic.getDefiProvisionEmpleados().toArray()[this.jTableDatosDefiProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.defiprovisionempleado =(DefiProvisionEmpleado) this.defiprovisionempleados.toArray()[this.jTableDatosDefiProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDefiProvisionEmpleado(this.getdefiprovisionempleado(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDefiProvisionEmpleado(this.defiprovisionempleado);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.defiprovisionempleadoLogic.getConnexion());

				if(this.defiprovisionempleado.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.defiprovisionempleado.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDefiProvisionEmpleado=(TitledBorder)this.jScrollPanelDatosDefiProvisionEmpleado.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderDefiProvisionEmpleado.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.defiprovisionempleadoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.defiprovisionempleadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.defiprovisionempleadoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaDefiProvisionEmpleadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.defiprovisionempleadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDefiProvisionEmpleado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDefiProvisionEmpleado(this.getdefiprovisionempleado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDefiProvisionEmpleado(this.defiprovisionempleado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.defiprovisionempleado =(DefiProvisionEmpleado) this.defiprovisionempleadoLogic.getDefiProvisionEmpleados().toArray()[this.jTableDatosDefiProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.defiprovisionempleado =(DefiProvisionEmpleado) this.defiprovisionempleados.toArray()[this.jTableDatosDefiProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.defiprovisionempleado==null) {
						this.defiprovisionempleado = new DefiProvisionEmpleado();
					}

					this.setVariablesFormularioToObjetoActualDefiProvisionEmpleado(this.defiprovisionempleado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDefiProvisionEmpleado(this.defiprovisionempleado);
				}

				if(this.defiprovisionempleado.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.defiprovisionempleado.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDefiProvisionEmpleado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.defiprovisionempleadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.defiprovisionempleadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.defiprovisionempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_rubro_empleaDefiProvisionEmpleadoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.defiprovisionempleadoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisorubroemplea=true;

			idTienePermisorubroemplea=this.tienePermisosUsuarioEnPaginaWebDefiProvisionEmpleado(RubroEmpleaConstantesFunciones.CLASSNAME);

			if(idTienePermisorubroemplea) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDefiProvisionEmpleado.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDefiProvisionEmpleado.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDefiProvisionEmpleado.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.defiprovisionempleado =(DefiProvisionEmpleado) this.defiprovisionempleadoLogic.getDefiProvisionEmpleados().toArray()[this.jTableDatosDefiProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.defiprovisionempleado =(DefiProvisionEmpleado) this.defiprovisionempleados.toArray()[this.jTableDatosDefiProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDefiProvisionEmpleado(this.getdefiprovisionempleado(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDefiProvisionEmpleado(this.defiprovisionempleado);

				this.rubroempleaBeanSwingJInternalFrame=new RubroEmpleaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.rubroempleaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.rubroempleaBeanSwingJInternalFrame.getRubroEmpleaLogic().setConnexion(this.defiprovisionempleadoLogic.getConnexion());

				if(this.defiprovisionempleado.getid_rubro_emplea()!=null) {
					this.rubroempleaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.rubroempleaBeanSwingJInternalFrame.setIdActual(this.defiprovisionempleado.getid_rubro_emplea());
					this.rubroempleaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.rubroempleaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.rubroempleaBeanSwingJInternalFrame.inicializarActualizarBindingTablaRubroEmplea();
				}

				JInternalFrameBase jinternalFrame =this.rubroempleaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDefiProvisionEmpleado=(TitledBorder)this.jScrollPanelDatosDefiProvisionEmpleado.getBorder();
				TitledBorder titledBorderrubroemplea=(TitledBorder)this.rubroempleaBeanSwingJInternalFrame.jScrollPanelDatosRubroEmplea.getBorder();

				titledBorderrubroemplea.setTitle(titledBorderDefiProvisionEmpleado.getTitle() + " -> Rubro Emplea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.defiprovisionempleadoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.defiprovisionempleadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.defiprovisionempleadoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_rubro_empleaDefiProvisionEmpleadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.defiprovisionempleadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDefiProvisionEmpleado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDefiProvisionEmpleado(this.getdefiprovisionempleado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDefiProvisionEmpleado(this.defiprovisionempleado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.defiprovisionempleado =(DefiProvisionEmpleado) this.defiprovisionempleadoLogic.getDefiProvisionEmpleados().toArray()[this.jTableDatosDefiProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.defiprovisionempleado =(DefiProvisionEmpleado) this.defiprovisionempleados.toArray()[this.jTableDatosDefiProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.defiprovisionempleado==null) {
						this.defiprovisionempleado = new DefiProvisionEmpleado();
					}

					this.setVariablesFormularioToObjetoActualDefiProvisionEmpleado(this.defiprovisionempleado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDefiProvisionEmpleado(this.defiprovisionempleado);
				}

				if(this.defiprovisionempleado.getid_rubro_emplea()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_rubro_emplea = "+this.defiprovisionempleado.getid_rubro_emplea().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDefiProvisionEmpleado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.defiprovisionempleadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.defiprovisionempleadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.defiprovisionempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_formatoDefiProvisionEmpleadoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.defiprovisionempleadoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoformato=true;

			idTienePermisoformato=this.tienePermisosUsuarioEnPaginaWebDefiProvisionEmpleado(FormatoConstantesFunciones.CLASSNAME);

			if(idTienePermisoformato) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDefiProvisionEmpleado.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDefiProvisionEmpleado.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDefiProvisionEmpleado.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.defiprovisionempleado =(DefiProvisionEmpleado) this.defiprovisionempleadoLogic.getDefiProvisionEmpleados().toArray()[this.jTableDatosDefiProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.defiprovisionempleado =(DefiProvisionEmpleado) this.defiprovisionempleados.toArray()[this.jTableDatosDefiProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDefiProvisionEmpleado(this.getdefiprovisionempleado(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDefiProvisionEmpleado(this.defiprovisionempleado);

				this.formatoBeanSwingJInternalFrame=new FormatoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.formatoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.formatoBeanSwingJInternalFrame.getFormatoLogic().setConnexion(this.defiprovisionempleadoLogic.getConnexion());

				if(this.defiprovisionempleado.getid_formato()!=null) {
					this.formatoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.formatoBeanSwingJInternalFrame.setIdActual(this.defiprovisionempleado.getid_formato());
					this.formatoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.formatoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.formatoBeanSwingJInternalFrame.inicializarActualizarBindingTablaFormato();
				}

				JInternalFrameBase jinternalFrame =this.formatoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDefiProvisionEmpleado=(TitledBorder)this.jScrollPanelDatosDefiProvisionEmpleado.getBorder();
				TitledBorder titledBorderformato=(TitledBorder)this.formatoBeanSwingJInternalFrame.jScrollPanelDatosFormato.getBorder();

				titledBorderformato.setTitle(titledBorderDefiProvisionEmpleado.getTitle() + " -> Formato");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.defiprovisionempleadoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.defiprovisionempleadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.defiprovisionempleadoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_formatoDefiProvisionEmpleadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.defiprovisionempleadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDefiProvisionEmpleado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDefiProvisionEmpleado(this.getdefiprovisionempleado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDefiProvisionEmpleado(this.defiprovisionempleado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.defiprovisionempleado =(DefiProvisionEmpleado) this.defiprovisionempleadoLogic.getDefiProvisionEmpleados().toArray()[this.jTableDatosDefiProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.defiprovisionempleado =(DefiProvisionEmpleado) this.defiprovisionempleados.toArray()[this.jTableDatosDefiProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.defiprovisionempleado==null) {
						this.defiprovisionempleado = new DefiProvisionEmpleado();
					}

					this.setVariablesFormularioToObjetoActualDefiProvisionEmpleado(this.defiprovisionempleado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDefiProvisionEmpleado(this.defiprovisionempleado);
				}

				if(this.defiprovisionempleado.getid_formato()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_formato = "+this.defiprovisionempleado.getid_formato().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDefiProvisionEmpleado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.defiprovisionempleadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.defiprovisionempleadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.defiprovisionempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreDefiProvisionEmpleadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.defiprovisionempleadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDefiProvisionEmpleado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDefiProvisionEmpleado(this.getdefiprovisionempleado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDefiProvisionEmpleado(this.defiprovisionempleado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.defiprovisionempleado =(DefiProvisionEmpleado) this.defiprovisionempleadoLogic.getDefiProvisionEmpleados().toArray()[this.jTableDatosDefiProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.defiprovisionempleado =(DefiProvisionEmpleado) this.defiprovisionempleados.toArray()[this.jTableDatosDefiProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.defiprovisionempleado==null) {
						this.defiprovisionempleado = new DefiProvisionEmpleado();
					}

					this.setVariablesFormularioToObjetoActualDefiProvisionEmpleado(this.defiprovisionempleado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDefiProvisionEmpleado(this.defiprovisionempleado);
				}

				if(this.defiprovisionempleado.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.defiprovisionempleado.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDefiProvisionEmpleado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.defiprovisionempleadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.defiprovisionempleadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.defiprovisionempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondia_inicialDefiProvisionEmpleadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.defiprovisionempleadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDefiProvisionEmpleado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDefiProvisionEmpleado(this.getdefiprovisionempleado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDefiProvisionEmpleado(this.defiprovisionempleado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.defiprovisionempleado =(DefiProvisionEmpleado) this.defiprovisionempleadoLogic.getDefiProvisionEmpleados().toArray()[this.jTableDatosDefiProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.defiprovisionempleado =(DefiProvisionEmpleado) this.defiprovisionempleados.toArray()[this.jTableDatosDefiProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.defiprovisionempleado==null) {
						this.defiprovisionempleado = new DefiProvisionEmpleado();
					}

					this.setVariablesFormularioToObjetoActualDefiProvisionEmpleado(this.defiprovisionempleado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDefiProvisionEmpleado(this.defiprovisionempleado);
				}

				if(this.defiprovisionempleado.getdia_inicial()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where dia_inicial = "+this.defiprovisionempleado.getdia_inicial().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDefiProvisionEmpleado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.defiprovisionempleadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.defiprovisionempleadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.defiprovisionempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_mes_inicialDefiProvisionEmpleadoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.defiprovisionempleadoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisomesinicial=true;

			idTienePermisomesinicial=this.tienePermisosUsuarioEnPaginaWebDefiProvisionEmpleado(MesConstantesFunciones.CLASSNAME);

			if(idTienePermisomesinicial) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDefiProvisionEmpleado.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDefiProvisionEmpleado.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDefiProvisionEmpleado.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.defiprovisionempleado =(DefiProvisionEmpleado) this.defiprovisionempleadoLogic.getDefiProvisionEmpleados().toArray()[this.jTableDatosDefiProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.defiprovisionempleado =(DefiProvisionEmpleado) this.defiprovisionempleados.toArray()[this.jTableDatosDefiProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDefiProvisionEmpleado(this.getdefiprovisionempleado(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDefiProvisionEmpleado(this.defiprovisionempleado);

				this.mesinicialBeanSwingJInternalFrame=new MesBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.mesinicialBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.mesinicialBeanSwingJInternalFrame.getMesLogic().setConnexion(this.defiprovisionempleadoLogic.getConnexion());

				if(this.defiprovisionempleado.getid_mes_inicial()!=null) {
					this.mesinicialBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.mesinicialBeanSwingJInternalFrame.setIdActual(this.defiprovisionempleado.getid_mes_inicial());
					this.mesinicialBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.mesinicialBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.mesinicialBeanSwingJInternalFrame.inicializarActualizarBindingTablaMes();
				}

				JInternalFrameBase jinternalFrame =this.mesinicialBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDefiProvisionEmpleado=(TitledBorder)this.jScrollPanelDatosDefiProvisionEmpleado.getBorder();
				TitledBorder titledBordermesinicial=(TitledBorder)this.mesinicialBeanSwingJInternalFrame.jScrollPanelDatosMes.getBorder();

				titledBordermesinicial.setTitle(titledBorderDefiProvisionEmpleado.getTitle() + " -> Mes");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.defiprovisionempleadoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.defiprovisionempleadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.defiprovisionempleadoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_mes_inicialDefiProvisionEmpleadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.defiprovisionempleadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDefiProvisionEmpleado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDefiProvisionEmpleado(this.getdefiprovisionempleado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDefiProvisionEmpleado(this.defiprovisionempleado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.defiprovisionempleado =(DefiProvisionEmpleado) this.defiprovisionempleadoLogic.getDefiProvisionEmpleados().toArray()[this.jTableDatosDefiProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.defiprovisionempleado =(DefiProvisionEmpleado) this.defiprovisionempleados.toArray()[this.jTableDatosDefiProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.defiprovisionempleado==null) {
						this.defiprovisionempleado = new DefiProvisionEmpleado();
					}

					this.setVariablesFormularioToObjetoActualDefiProvisionEmpleado(this.defiprovisionempleado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDefiProvisionEmpleado(this.defiprovisionempleado);
				}

				if(this.defiprovisionempleado.getid_mes_inicial()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_mes_inicial = "+this.defiprovisionempleado.getid_mes_inicial().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDefiProvisionEmpleado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.defiprovisionempleadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.defiprovisionempleadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.defiprovisionempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondia_finalDefiProvisionEmpleadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.defiprovisionempleadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDefiProvisionEmpleado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDefiProvisionEmpleado(this.getdefiprovisionempleado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDefiProvisionEmpleado(this.defiprovisionempleado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.defiprovisionempleado =(DefiProvisionEmpleado) this.defiprovisionempleadoLogic.getDefiProvisionEmpleados().toArray()[this.jTableDatosDefiProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.defiprovisionempleado =(DefiProvisionEmpleado) this.defiprovisionempleados.toArray()[this.jTableDatosDefiProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.defiprovisionempleado==null) {
						this.defiprovisionempleado = new DefiProvisionEmpleado();
					}

					this.setVariablesFormularioToObjetoActualDefiProvisionEmpleado(this.defiprovisionempleado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDefiProvisionEmpleado(this.defiprovisionempleado);
				}

				if(this.defiprovisionempleado.getdia_final()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where dia_final = "+this.defiprovisionempleado.getdia_final().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDefiProvisionEmpleado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.defiprovisionempleadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.defiprovisionempleadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.defiprovisionempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_mes_finalDefiProvisionEmpleadoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.defiprovisionempleadoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisomesfinal=true;

			idTienePermisomesfinal=this.tienePermisosUsuarioEnPaginaWebDefiProvisionEmpleado(MesConstantesFunciones.CLASSNAME);

			if(idTienePermisomesfinal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDefiProvisionEmpleado.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDefiProvisionEmpleado.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDefiProvisionEmpleado.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.defiprovisionempleado =(DefiProvisionEmpleado) this.defiprovisionempleadoLogic.getDefiProvisionEmpleados().toArray()[this.jTableDatosDefiProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.defiprovisionempleado =(DefiProvisionEmpleado) this.defiprovisionempleados.toArray()[this.jTableDatosDefiProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDefiProvisionEmpleado(this.getdefiprovisionempleado(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDefiProvisionEmpleado(this.defiprovisionempleado);

				this.mesfinalBeanSwingJInternalFrame=new MesBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.mesfinalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.mesfinalBeanSwingJInternalFrame.getMesLogic().setConnexion(this.defiprovisionempleadoLogic.getConnexion());

				if(this.defiprovisionempleado.getid_mes_final()!=null) {
					this.mesfinalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.mesfinalBeanSwingJInternalFrame.setIdActual(this.defiprovisionempleado.getid_mes_final());
					this.mesfinalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.mesfinalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.mesfinalBeanSwingJInternalFrame.inicializarActualizarBindingTablaMes();
				}

				JInternalFrameBase jinternalFrame =this.mesfinalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDefiProvisionEmpleado=(TitledBorder)this.jScrollPanelDatosDefiProvisionEmpleado.getBorder();
				TitledBorder titledBordermesfinal=(TitledBorder)this.mesfinalBeanSwingJInternalFrame.jScrollPanelDatosMes.getBorder();

				titledBordermesfinal.setTitle(titledBorderDefiProvisionEmpleado.getTitle() + " -> Mes");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.defiprovisionempleadoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.defiprovisionempleadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.defiprovisionempleadoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_mes_finalDefiProvisionEmpleadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.defiprovisionempleadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDefiProvisionEmpleado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDefiProvisionEmpleado(this.getdefiprovisionempleado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDefiProvisionEmpleado(this.defiprovisionempleado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.defiprovisionempleado =(DefiProvisionEmpleado) this.defiprovisionempleadoLogic.getDefiProvisionEmpleados().toArray()[this.jTableDatosDefiProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.defiprovisionempleado =(DefiProvisionEmpleado) this.defiprovisionempleados.toArray()[this.jTableDatosDefiProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.defiprovisionempleado==null) {
						this.defiprovisionempleado = new DefiProvisionEmpleado();
					}

					this.setVariablesFormularioToObjetoActualDefiProvisionEmpleado(this.defiprovisionempleado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDefiProvisionEmpleado(this.defiprovisionempleado);
				}

				if(this.defiprovisionempleado.getid_mes_final()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_mes_final = "+this.defiprovisionempleado.getid_mes_final().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDefiProvisionEmpleado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.defiprovisionempleadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.defiprovisionempleadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.defiprovisionempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonpara_liquidacionDefiProvisionEmpleadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.defiprovisionempleadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDefiProvisionEmpleado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDefiProvisionEmpleado(this.getdefiprovisionempleado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDefiProvisionEmpleado(this.defiprovisionempleado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.defiprovisionempleado =(DefiProvisionEmpleado) this.defiprovisionempleadoLogic.getDefiProvisionEmpleados().toArray()[this.jTableDatosDefiProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.defiprovisionempleado =(DefiProvisionEmpleado) this.defiprovisionempleados.toArray()[this.jTableDatosDefiProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.defiprovisionempleado==null) {
						this.defiprovisionempleado = new DefiProvisionEmpleado();
					}

					this.setVariablesFormularioToObjetoActualDefiProvisionEmpleado(this.defiprovisionempleado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDefiProvisionEmpleado(this.defiprovisionempleado);
				}

				if(this.defiprovisionempleado.getpara_liquidacion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where para_liquidacion = "+this.defiprovisionempleado.getpara_liquidacion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDefiProvisionEmpleado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.defiprovisionempleadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.defiprovisionempleadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.defiprovisionempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionDefiProvisionEmpleadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.defiprovisionempleadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDefiProvisionEmpleado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDefiProvisionEmpleado(this.getdefiprovisionempleado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDefiProvisionEmpleado(this.defiprovisionempleado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.defiprovisionempleado =(DefiProvisionEmpleado) this.defiprovisionempleadoLogic.getDefiProvisionEmpleados().toArray()[this.jTableDatosDefiProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.defiprovisionempleado =(DefiProvisionEmpleado) this.defiprovisionempleados.toArray()[this.jTableDatosDefiProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.defiprovisionempleado==null) {
						this.defiprovisionempleado = new DefiProvisionEmpleado();
					}

					this.setVariablesFormularioToObjetoActualDefiProvisionEmpleado(this.defiprovisionempleado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDefiProvisionEmpleado(this.defiprovisionempleado);
				}

				if(this.defiprovisionempleado.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.defiprovisionempleado.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDefiProvisionEmpleado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.defiprovisionempleadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.defiprovisionempleadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.defiprovisionempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaDefiProvisionEmpleadoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.defiprovisionempleadoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDefiProvisionEmpleado(false,false);

			this.getDefiProvisionEmpleadosFK_IdEmpresa();

			this.inicializarActualizarBindingDefiProvisionEmpleado(false);

			//if(DefiProvisionEmpleadoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDefiProvisionEmpleado(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.defiprovisionempleadoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.defiprovisionempleadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.defiprovisionempleadoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdFormatoDefiProvisionEmpleadoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.defiprovisionempleadoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDefiProvisionEmpleado(false,false);

			this.getDefiProvisionEmpleadosFK_IdFormato();

			this.inicializarActualizarBindingDefiProvisionEmpleado(false);

			//if(DefiProvisionEmpleadoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDefiProvisionEmpleado(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.defiprovisionempleadoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.defiprovisionempleadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.defiprovisionempleadoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdMesFinalDefiProvisionEmpleadoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.defiprovisionempleadoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDefiProvisionEmpleado(false,false);

			this.getDefiProvisionEmpleadosFK_IdMesFinal();

			this.inicializarActualizarBindingDefiProvisionEmpleado(false);

			//if(DefiProvisionEmpleadoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDefiProvisionEmpleado(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.defiprovisionempleadoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.defiprovisionempleadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.defiprovisionempleadoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdMesInicialDefiProvisionEmpleadoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.defiprovisionempleadoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDefiProvisionEmpleado(false,false);

			this.getDefiProvisionEmpleadosFK_IdMesInicial();

			this.inicializarActualizarBindingDefiProvisionEmpleado(false);

			//if(DefiProvisionEmpleadoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDefiProvisionEmpleado(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.defiprovisionempleadoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.defiprovisionempleadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.defiprovisionempleadoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdRubroEmpleaDefiProvisionEmpleadoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.defiprovisionempleadoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDefiProvisionEmpleado(false,false);

			this.getDefiProvisionEmpleadosFK_IdRubroEmplea();

			this.inicializarActualizarBindingDefiProvisionEmpleado(false);

			//if(DefiProvisionEmpleadoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDefiProvisionEmpleado(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.defiprovisionempleadoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.defiprovisionempleadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.defiprovisionempleadoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameDefiProvisionEmpleado() {
		if(this.jInternalFrameDetalleFormDefiProvisionEmpleado!=null) {
		

		if(this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormDefiProvisionEmpleado!=null) {
			this.jInternalFrameDetalleFormDefiProvisionEmpleado.setVisible(false);	    			
			this.jInternalFrameDetalleFormDefiProvisionEmpleado.dispose();
			this.jInternalFrameDetalleFormDefiProvisionEmpleado=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoDefiProvisionEmpleado!=null) {
			this.jInternalFrameReporteDinamicoDefiProvisionEmpleado.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoDefiProvisionEmpleado.dispose();
			this.jInternalFrameReporteDinamicoDefiProvisionEmpleado=null;
		}
		
		if(this.jInternalFrameImportacionDefiProvisionEmpleado!=null) {
			this.jInternalFrameImportacionDefiProvisionEmpleado.setVisible(false);	    			
			this.jInternalFrameImportacionDefiProvisionEmpleado.dispose();
			this.jInternalFrameImportacionDefiProvisionEmpleado=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessDefiProvisionEmpleado();
			
			DefiProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.defiprovisionempleado,new Object(),this.defiprovisionempleadoParameterGeneral,this.defiprovisionempleadoReturnGeneral);
			
			
			if(sTipo.equals("NuevoDefiProvisionEmpleado")) {
				jButtonNuevoDefiProvisionEmpleadoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarDefiProvisionEmpleado")) {
				jButtonDuplicarDefiProvisionEmpleadoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarDefiProvisionEmpleado")) {
				jButtonCopiarDefiProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("VerFormDefiProvisionEmpleado")) {
				jButtonVerFormDefiProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarDefiProvisionEmpleado")) {
				jButtonNuevoDefiProvisionEmpleadoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarDefiProvisionEmpleado")) {
				jButtonDuplicarDefiProvisionEmpleadoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoDefiProvisionEmpleado")) {
				jButtonNuevoDefiProvisionEmpleadoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarDefiProvisionEmpleado")) {
				jButtonDuplicarDefiProvisionEmpleadoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesDefiProvisionEmpleado")) {
				jButtonNuevoDefiProvisionEmpleadoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarDefiProvisionEmpleado")) {
				jButtonNuevoDefiProvisionEmpleadoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesDefiProvisionEmpleado")) {
				jButtonNuevoDefiProvisionEmpleadoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarDefiProvisionEmpleado")) {
				jButtonModificarDefiProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarDefiProvisionEmpleado")) {
				jButtonModificarDefiProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarDefiProvisionEmpleado")) {
				jButtonModificarDefiProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarDefiProvisionEmpleado")) {
				jButtonActualizarDefiProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarDefiProvisionEmpleado")) {
				jButtonActualizarDefiProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarDefiProvisionEmpleado")) {
				jButtonActualizarDefiProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("EliminarDefiProvisionEmpleado")) {
				jButtonEliminarDefiProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarDefiProvisionEmpleado")) {
				jButtonEliminarDefiProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarDefiProvisionEmpleado")) {
				jButtonEliminarDefiProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("CancelarDefiProvisionEmpleado")) {
				jButtonCancelarDefiProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarDefiProvisionEmpleado")) {
				jButtonCancelarDefiProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarDefiProvisionEmpleado")) {
				jButtonCancelarDefiProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("CerrarDefiProvisionEmpleado")) {
				jButtonCerrarDefiProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarDefiProvisionEmpleado")) {
				jButtonCerrarDefiProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarDefiProvisionEmpleado")) {
				jButtonCerrarDefiProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarDefiProvisionEmpleado")) {
				jButtonMostrarOcultarDefiProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarDefiProvisionEmpleado")) {
				jButtonCancelarDefiProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosDefiProvisionEmpleado")) {
				jButtonGuardarCambiosDefiProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarDefiProvisionEmpleado")) {
				jButtonGuardarCambiosDefiProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarDefiProvisionEmpleado")) {
				jButtonCopiarDefiProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarDefiProvisionEmpleado")) {
				jButtonVerFormDefiProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosDefiProvisionEmpleado")) {
				jButtonGuardarCambiosDefiProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarDefiProvisionEmpleado")) {
				jButtonCopiarDefiProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormDefiProvisionEmpleado")) {
				jButtonVerFormDefiProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaDefiProvisionEmpleado")) {
				jButtonGuardarCambiosDefiProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarDefiProvisionEmpleado")) {
				jButtonGuardarCambiosDefiProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaDefiProvisionEmpleado")) {
				jButtonGuardarCambiosDefiProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionDefiProvisionEmpleado")) {
				jButtonRecargarInformacionDefiProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarDefiProvisionEmpleado")) {
				jButtonRecargarInformacionDefiProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionDefiProvisionEmpleado")) {
				jButtonRecargarInformacionDefiProvisionEmpleadoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresDefiProvisionEmpleado")) {
				jButtonAnterioresDefiProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarDefiProvisionEmpleado")) {
				jButtonAnterioresDefiProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreDefiProvisionEmpleado")) {
				jButtonAnterioresDefiProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesDefiProvisionEmpleado")) {
				jButtonSiguientesDefiProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarDefiProvisionEmpleado")) {
				jButtonSiguientesDefiProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesDefiProvisionEmpleado")) {
				jButtonSiguientesDefiProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByDefiProvisionEmpleado") || sTipo.equals("MenuItemDetalleAbrirOrderByDefiProvisionEmpleado")) {
				jButtonAbrirOrderByDefiProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarDefiProvisionEmpleado") || sTipo.equals("MenuItemDetalleMostrarOcultarDefiProvisionEmpleado")) {
				jButtonMostrarOcultarDefiProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosDefiProvisionEmpleado")) {
				jButtonNuevoGuardarCambiosDefiProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarDefiProvisionEmpleado")) {
				jButtonNuevoGuardarCambiosDefiProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosDefiProvisionEmpleado")) {
				jButtonNuevoGuardarCambiosDefiProvisionEmpleadoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoDefiProvisionEmpleado")) {
				jButtonCerrarReporteDinamicoDefiProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoDefiProvisionEmpleado")) {
				jButtonGenerarReporteDinamicoDefiProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoDefiProvisionEmpleado")) {
				
				jButtonGenerarExcelReporteDinamicoDefiProvisionEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionDefiProvisionEmpleado")) {
				jButtonCerrarImportacionDefiProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionDefiProvisionEmpleado")) {
				
				jButtonGenerarImportacionDefiProvisionEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionDefiProvisionEmpleado")) {
				
				jButtonAbrirImportacionDefiProvisionEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesDefiProvisionEmpleado")) {
				jComboBoxTiposAccionesDefiProvisionEmpleadoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesDefiProvisionEmpleado")) {
				jComboBoxTiposRelacionesDefiProvisionEmpleadoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioDefiProvisionEmpleado")) {
				jComboBoxTiposAccionesDefiProvisionEmpleadoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarDefiProvisionEmpleado")) {
				
				jComboBoxTiposSeleccionarDefiProvisionEmpleadoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralDefiProvisionEmpleado")) {
				jTextFieldValorCampoGeneralDefiProvisionEmpleadoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByDefiProvisionEmpleado")) {
				jButtonAbrirOrderByDefiProvisionEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarDefiProvisionEmpleado")) {
				jButtonAbrirOrderByDefiProvisionEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByDefiProvisionEmpleado")) {
				jButtonCerrarOrderByDefiProvisionEmpleadoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idDefiProvisionEmpleadoBusqueda")) {
				this.jButtonidDefiProvisionEmpleadoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaDefiProvisionEmpleadoUpdate")) {
				this.jButtonid_empresaDefiProvisionEmpleadoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaDefiProvisionEmpleadoBusqueda")) {
				this.jButtonid_empresaDefiProvisionEmpleadoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_rubro_empleaDefiProvisionEmpleadoUpdate")) {
				this.jButtonid_rubro_empleaDefiProvisionEmpleadoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_rubro_empleaDefiProvisionEmpleadoBusqueda")) {
				this.jButtonid_rubro_empleaDefiProvisionEmpleadoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_formatoDefiProvisionEmpleadoUpdate")) {
				this.jButtonid_formatoDefiProvisionEmpleadoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_formatoDefiProvisionEmpleadoBusqueda")) {
				this.jButtonid_formatoDefiProvisionEmpleadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreDefiProvisionEmpleadoBusqueda")) {
				this.jButtonnombreDefiProvisionEmpleadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("dia_inicialDefiProvisionEmpleadoBusqueda")) {
				this.jButtondia_inicialDefiProvisionEmpleadoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mes_inicialDefiProvisionEmpleadoUpdate")) {
				this.jButtonid_mes_inicialDefiProvisionEmpleadoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mes_inicialDefiProvisionEmpleadoBusqueda")) {
				this.jButtonid_mes_inicialDefiProvisionEmpleadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("dia_finalDefiProvisionEmpleadoBusqueda")) {
				this.jButtondia_finalDefiProvisionEmpleadoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mes_finalDefiProvisionEmpleadoUpdate")) {
				this.jButtonid_mes_finalDefiProvisionEmpleadoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mes_finalDefiProvisionEmpleadoBusqueda")) {
				this.jButtonid_mes_finalDefiProvisionEmpleadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("para_liquidacionDefiProvisionEmpleadoBusqueda")) {
				this.jButtonpara_liquidacionDefiProvisionEmpleadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionDefiProvisionEmpleadoBusqueda")) {
				this.jButtondescripcionDefiProvisionEmpleadoBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdFormatoDefiProvisionEmpleado")) {
				this.jButtonFK_IdFormatoDefiProvisionEmpleadoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdMesFinalDefiProvisionEmpleado")) {
				this.jButtonFK_IdMesFinalDefiProvisionEmpleadoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdMesInicialDefiProvisionEmpleado")) {
				this.jButtonFK_IdMesInicialDefiProvisionEmpleadoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdRubroEmpleaDefiProvisionEmpleado")) {
				this.jButtonFK_IdRubroEmpleaDefiProvisionEmpleadoActionPerformed(evt);
			}
			
			;
			
			
			DefiProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.defiprovisionempleado,new Object(),this.defiprovisionempleadoParameterGeneral,this.defiprovisionempleadoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessDefiProvisionEmpleado();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDefiProvisionEmpleadoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.defiprovisionempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.defiprovisionempleado);
				
				DefiProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.defiprovisionempleado,new Object(),this.defiprovisionempleadoParameterGeneral,this.defiprovisionempleadoReturnGeneral);
				
				


				
				DefiProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.defiprovisionempleado,new Object(),this.defiprovisionempleadoParameterGeneral,this.defiprovisionempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DefiProvisionEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DefiProvisionEmpleado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			DefiProvisionEmpleado defiprovisionempleadoLocal=null;
			
			if(!this.getEsControlTabla()) {
				defiprovisionempleadoLocal=this.defiprovisionempleado;
			} else {
				defiprovisionempleadoLocal=this.defiprovisionempleadoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.defiprovisionempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.defiprovisionempleado);
				
				DefiProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.defiprovisionempleado,new Object(),this.defiprovisionempleadoParameterGeneral,this.defiprovisionempleadoReturnGeneral);
							
				
				


				
				DefiProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.defiprovisionempleado,new Object(),this.defiprovisionempleadoParameterGeneral,this.defiprovisionempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DefiProvisionEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DefiProvisionEmpleado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDefiProvisionEmpleadoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDefiProvisionEmpleado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.defiprovisionempleadoAnterior =(DefiProvisionEmpleado) this.defiprovisionempleadoLogic.getDefiProvisionEmpleados().toArray()[this.jTableDatosDefiProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.defiprovisionempleadoAnterior =(DefiProvisionEmpleado) this.defiprovisionempleados.toArray()[this.jTableDatosDefiProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
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
			
			DefiProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.defiprovisionempleado,new Object(),this.defiprovisionempleadoParameterGeneral,this.defiprovisionempleadoReturnGeneral);
			
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
			
			


			
			DefiProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.defiprovisionempleado,new Object(),this.defiprovisionempleadoParameterGeneral,this.defiprovisionempleadoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDefiProvisionEmpleadoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.defiprovisionempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.defiprovisionempleado);
				
				DefiProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.defiprovisionempleado,new Object(),this.defiprovisionempleadoParameterGeneral,this.defiprovisionempleadoReturnGeneral);
								
						
				


				
				DefiProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.defiprovisionempleado,new Object(),this.defiprovisionempleadoParameterGeneral,this.defiprovisionempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DefiProvisionEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DefiProvisionEmpleado.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.defiprovisionempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.defiprovisionempleado);
				
				DefiProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.defiprovisionempleado,new Object(),this.defiprovisionempleadoParameterGeneral,this.defiprovisionempleadoReturnGeneral);
								
				
				


				
				DefiProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.defiprovisionempleado,new Object(),this.defiprovisionempleadoParameterGeneral,this.defiprovisionempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DefiProvisionEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DefiProvisionEmpleado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDefiProvisionEmpleadoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDefiProvisionEmpleado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.defiprovisionempleadoAnterior =(DefiProvisionEmpleado) this.defiprovisionempleadoLogic.getDefiProvisionEmpleados().toArray()[this.jTableDatosDefiProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.defiprovisionempleadoAnterior =(DefiProvisionEmpleado) this.defiprovisionempleados.toArray()[this.jTableDatosDefiProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.defiprovisionempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.defiprovisionempleado);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDefiProvisionEmpleadoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDefiProvisionEmpleado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.defiprovisionempleadoAnterior =(DefiProvisionEmpleado) this.defiprovisionempleadoLogic.getDefiProvisionEmpleados().toArray()[this.jTableDatosDefiProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.defiprovisionempleadoAnterior =(DefiProvisionEmpleado) this.defiprovisionempleados.toArray()[this.jTableDatosDefiProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDefiProvisionEmpleadoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.defiprovisionempleado);
			
			this.actualizarInformacion("INFO_PADRE",false,this.defiprovisionempleado);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.defiprovisionempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.defiprovisionempleado);
				
				DefiProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.defiprovisionempleado,new Object(),this.defiprovisionempleadoParameterGeneral,this.defiprovisionempleadoReturnGeneral);
							
				
				


				
				DefiProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.defiprovisionempleado,new Object(),this.defiprovisionempleadoParameterGeneral,this.defiprovisionempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DefiProvisionEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DefiProvisionEmpleado.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDefiProvisionEmpleadoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDefiProvisionEmpleado.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.defiprovisionempleadoAnterior =(DefiProvisionEmpleado) this.defiprovisionempleadoLogic.getDefiProvisionEmpleados().toArray()[this.jTableDatosDefiProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.defiprovisionempleadoAnterior =(DefiProvisionEmpleado) this.defiprovisionempleados.toArray()[this.jTableDatosDefiProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
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
			
			DefiProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.defiprovisionempleado,new Object(),this.defiprovisionempleadoParameterGeneral,this.defiprovisionempleadoReturnGeneral);
			
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
			
			


			
			DefiProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.defiprovisionempleado,new Object(),this.defiprovisionempleadoParameterGeneral,this.defiprovisionempleadoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDefiProvisionEmpleadoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.defiprovisionempleado);
			
			this.actualizarInformacion("INFO_PADRE",false,this.defiprovisionempleado);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.defiprovisionempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.defiprovisionempleado);
				
				DefiProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.defiprovisionempleado,new Object(),this.defiprovisionempleadoParameterGeneral,this.defiprovisionempleadoReturnGeneral);
								
				
				


				
				DefiProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.defiprovisionempleado,new Object(),this.defiprovisionempleadoParameterGeneral,this.defiprovisionempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DefiProvisionEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DefiProvisionEmpleado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDefiProvisionEmpleadoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDefiProvisionEmpleado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.defiprovisionempleadoAnterior =(DefiProvisionEmpleado) this.defiprovisionempleadoLogic.getDefiProvisionEmpleados().toArray()[this.jTableDatosDefiProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.defiprovisionempleadoAnterior =(DefiProvisionEmpleado) this.defiprovisionempleados.toArray()[this.jTableDatosDefiProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDefiProvisionEmpleadoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.defiprovisionempleado);
			
			this.actualizarInformacion("INFO_PADRE",false,this.defiprovisionempleado);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDefiProvisionEmpleadoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.defiprovisionempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.defiprovisionempleado);
				
				DefiProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.defiprovisionempleado,new Object(),this.defiprovisionempleadoParameterGeneral,this.defiprovisionempleadoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosDefiProvisionEmpleado")) {
					jCheckBoxSeleccionarTodosDefiProvisionEmpleadoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosDefiProvisionEmpleado")) {
					jCheckBoxSeleccionadosDefiProvisionEmpleadoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarDefiProvisionEmpleado")) {
					
				}
				
				


				
				
				DefiProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.defiprovisionempleado,new Object(),this.defiprovisionempleadoParameterGeneral,this.defiprovisionempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DefiProvisionEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DefiProvisionEmpleado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.defiprovisionempleado);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.defiprovisionempleado);
				
				DefiProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.defiprovisionempleado,new Object(),this.defiprovisionempleadoParameterGeneral,this.defiprovisionempleadoReturnGeneral);
												
				
				


				
				
				DefiProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.defiprovisionempleado,new Object(),this.defiprovisionempleadoParameterGeneral,this.defiprovisionempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DefiProvisionEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DefiProvisionEmpleado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDefiProvisionEmpleadoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDefiProvisionEmpleado.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.defiprovisionempleadoAnterior =(DefiProvisionEmpleado) this.defiprovisionempleadoLogic.getDefiProvisionEmpleados().toArray()[this.jTableDatosDefiProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.defiprovisionempleadoAnterior =(DefiProvisionEmpleado) this.defiprovisionempleados.toArray()[this.jTableDatosDefiProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDefiProvisionEmpleadoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.defiprovisionempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.defiprovisionempleado);
				
				DefiProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.defiprovisionempleado,new Object(),this.defiprovisionempleadoParameterGeneral,this.defiprovisionempleadoReturnGeneral);
				
				
				DefiProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.defiprovisionempleado,new Object(),this.defiprovisionempleadoParameterGeneral,this.defiprovisionempleadoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
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
			
			DefiProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.defiprovisionempleado,new Object(),this.defiprovisionempleadoParameterGeneral,this.defiprovisionempleadoReturnGeneral);
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
			
			


			
			DefiProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.defiprovisionempleado,new Object(),this.defiprovisionempleadoParameterGeneral,this.defiprovisionempleadoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDefiProvisionEmpleadoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.defiprovisionempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.defiprovisionempleado);
				
				DefiProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.defiprovisionempleado,new Object(),this.defiprovisionempleadoParameterGeneral,this.defiprovisionempleadoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				DefiProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.defiprovisionempleado,new Object(),this.defiprovisionempleadoParameterGeneral,this.defiprovisionempleadoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DefiProvisionEmpleado.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DefiProvisionEmpleado.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.defiprovisionempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.defiprovisionempleado);
				
				DefiProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.defiprovisionempleado,new Object(),this.defiprovisionempleadoParameterGeneral,this.defiprovisionempleadoReturnGeneral);
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
				
				


				
				DefiProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.defiprovisionempleado,new Object(),this.defiprovisionempleadoParameterGeneral,this.defiprovisionempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DefiProvisionEmpleado.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DefiProvisionEmpleado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDefiProvisionEmpleadoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDefiProvisionEmpleado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.defiprovisionempleadoAnterior =(DefiProvisionEmpleado) this.defiprovisionempleadoLogic.getDefiProvisionEmpleados().toArray()[this.jTableDatosDefiProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.defiprovisionempleadoAnterior =(DefiProvisionEmpleado) this.defiprovisionempleados.toArray()[this.jTableDatosDefiProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				DefiProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.defiprovisionempleado,new Object(),this.defiprovisionempleadoParameterGeneral,this.defiprovisionempleadoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarDefiProvisionEmpleado")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosDefiProvisionEmpleadoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosDefiProvisionEmpleado.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.defiprovisionempleado =(DefiProvisionEmpleado) this.defiprovisionempleadoLogic.getDefiProvisionEmpleados().toArray()[this.jTableDatosDefiProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.defiprovisionempleado =(DefiProvisionEmpleado) this.defiprovisionempleados.toArray()[this.jTableDatosDefiProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.defiprovisionempleado);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarDefiProvisionEmpleado")) {
				
				}
				
				DefiProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.defiprovisionempleado,new Object(),this.defiprovisionempleadoParameterGeneral,this.defiprovisionempleadoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			DefiProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.defiprovisionempleado,new Object(),this.defiprovisionempleadoParameterGeneral,this.defiprovisionempleadoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarDefiProvisionEmpleado")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosDefiProvisionEmpleado.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarDefiProvisionEmpleado")) {
			
			}
			
			DefiProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.defiprovisionempleado,new Object(),this.defiprovisionempleadoParameterGeneral,this.defiprovisionempleadoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessDefiProvisionEmpleado();
			
			DefiProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.defiprovisionempleado,new Object(),this.defiprovisionempleadoParameterGeneral,this.defiprovisionempleadoReturnGeneral);
			
			if(sTipo.equals("NuevoDefiProvisionEmpleado")) {
				jButtonNuevoDefiProvisionEmpleadoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarDefiProvisionEmpleado")) {
				jButtonDuplicarDefiProvisionEmpleadoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarDefiProvisionEmpleado")) {
				jButtonCopiarDefiProvisionEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormDefiProvisionEmpleado")) {
				jButtonVerFormDefiProvisionEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesDefiProvisionEmpleado")) {
				jButtonNuevoDefiProvisionEmpleadoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarDefiProvisionEmpleado")) {
				jButtonModificarDefiProvisionEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarDefiProvisionEmpleado")) {
				jButtonActualizarDefiProvisionEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarDefiProvisionEmpleado")) {
				jButtonEliminarDefiProvisionEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaDefiProvisionEmpleado")) {
				jButtonGuardarCambiosDefiProvisionEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarDefiProvisionEmpleado")) {
				jButtonCancelarDefiProvisionEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarDefiProvisionEmpleado")) {
				jButtonCerrarDefiProvisionEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosDefiProvisionEmpleado")) {
				jButtonGuardarCambiosDefiProvisionEmpleadoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosDefiProvisionEmpleado")) {
				jButtonNuevoGuardarCambiosDefiProvisionEmpleadoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByDefiProvisionEmpleado")) {
				jButtonAbrirOrderByDefiProvisionEmpleadoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionDefiProvisionEmpleado")) {
				jButtonRecargarInformacionDefiProvisionEmpleadoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresDefiProvisionEmpleado")) {
				jButtonAnterioresDefiProvisionEmpleadoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesDefiProvisionEmpleado")) {
				jButtonSiguientesDefiProvisionEmpleadoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idDefiProvisionEmpleadoBusqueda")) {
				this.jButtonidDefiProvisionEmpleadoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaDefiProvisionEmpleadoUpdate")) {
				this.jButtonid_empresaDefiProvisionEmpleadoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaDefiProvisionEmpleadoBusqueda")) {
				this.jButtonid_empresaDefiProvisionEmpleadoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_rubro_empleaDefiProvisionEmpleadoUpdate")) {
				this.jButtonid_rubro_empleaDefiProvisionEmpleadoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_rubro_empleaDefiProvisionEmpleadoBusqueda")) {
				this.jButtonid_rubro_empleaDefiProvisionEmpleadoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_formatoDefiProvisionEmpleadoUpdate")) {
				this.jButtonid_formatoDefiProvisionEmpleadoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_formatoDefiProvisionEmpleadoBusqueda")) {
				this.jButtonid_formatoDefiProvisionEmpleadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreDefiProvisionEmpleadoBusqueda")) {
				this.jButtonnombreDefiProvisionEmpleadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("dia_inicialDefiProvisionEmpleadoBusqueda")) {
				this.jButtondia_inicialDefiProvisionEmpleadoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mes_inicialDefiProvisionEmpleadoUpdate")) {
				this.jButtonid_mes_inicialDefiProvisionEmpleadoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mes_inicialDefiProvisionEmpleadoBusqueda")) {
				this.jButtonid_mes_inicialDefiProvisionEmpleadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("dia_finalDefiProvisionEmpleadoBusqueda")) {
				this.jButtondia_finalDefiProvisionEmpleadoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mes_finalDefiProvisionEmpleadoUpdate")) {
				this.jButtonid_mes_finalDefiProvisionEmpleadoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mes_finalDefiProvisionEmpleadoBusqueda")) {
				this.jButtonid_mes_finalDefiProvisionEmpleadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("para_liquidacionDefiProvisionEmpleadoBusqueda")) {
				this.jButtonpara_liquidacionDefiProvisionEmpleadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionDefiProvisionEmpleadoBusqueda")) {
				this.jButtondescripcionDefiProvisionEmpleadoBusquedaActionPerformed(evt);
			}
			
			DefiProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.defiprovisionempleado,new Object(),this.defiprovisionempleadoParameterGeneral,this.defiprovisionempleadoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessDefiProvisionEmpleado();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			DefiProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.defiprovisionempleado,new Object(),this.defiprovisionempleadoParameterGeneral,this.defiprovisionempleadoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameDefiProvisionEmpleado")) {
				closingInternalFrameDefiProvisionEmpleado();
				
			} else if(sTipo.equals("jButtonCancelarDefiProvisionEmpleado")) {
				JInternalFrameBase jInternalFrameDetalleFormDefiProvisionEmpleado = (JInternalFrameBase)evt.getSource();
	            	
	            DefiProvisionEmpleadoBeanSwingJInternalFrame jInternalFrameParent=(DefiProvisionEmpleadoBeanSwingJInternalFrame)jInternalFrameDetalleFormDefiProvisionEmpleado.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarDefiProvisionEmpleadoActionPerformed(null);
			}
			
			DefiProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.defiprovisionempleado,new Object(),this.defiprovisionempleadoParameterGeneral,this.defiprovisionempleadoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormDefiProvisionEmpleado(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormDefiProvisionEmpleado(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormDefiProvisionEmpleado(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.defiprovisionempleado)) {
			if(!esControlTabla) {
				if(DefiProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualDefiProvisionEmpleado(this.defiprovisionempleado,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDefiProvisionEmpleado(this.defiprovisionempleado);			
				}
				
				if(this.defiprovisionempleadoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualDefiProvisionEmpleado(this.defiprovisionempleado,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.defiprovisionempleadoReturnGeneral=defiprovisionempleadoLogic.procesarEventosDefiProvisionEmpleadosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.defiprovisionempleadoLogic.getDefiProvisionEmpleados(),this.defiprovisionempleado,this.defiprovisionempleadoParameterGeneral,this.isEsNuevoDefiProvisionEmpleado,classes);//this.defiprovisionempleadoLogic.getDefiProvisionEmpleado()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanDefiProvisionEmpleado(this.defiprovisionempleadoReturnGeneral,this.defiprovisionempleadoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.defiprovisionempleadoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanDefiProvisionEmpleado(classes,this.defiprovisionempleadoReturnGeneral,this.defiprovisionempleadoBean,false);
					}
						
					if(this.defiprovisionempleadoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyDefiProvisionEmpleado(this.defiprovisionempleadoReturnGeneral.getDefiProvisionEmpleado());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioDefiProvisionEmpleado(this.defiprovisionempleadoReturnGeneral.getDefiProvisionEmpleado());	
					}
						
					if(this.defiprovisionempleadoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioDefiProvisionEmpleado(this.defiprovisionempleadoReturnGeneral.getDefiProvisionEmpleado(),classes);//this.defiprovisionempleadoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioDefiProvisionEmpleado(this.defiprovisionempleado,classes);//this.defiprovisionempleadoBean);									
				}
			
				if(DefiProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualDefiProvisionEmpleado(this.defiprovisionempleado,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDefiProvisionEmpleado(this.defiprovisionempleado);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.defiprovisionempleadoAnterior!=null) {
						this.defiprovisionempleado=this.defiprovisionempleadoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.defiprovisionempleadoReturnGeneral=defiprovisionempleadoLogic.procesarEventosDefiProvisionEmpleadosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.defiprovisionempleadoLogic.getDefiProvisionEmpleados(),this.defiprovisionempleado,this.defiprovisionempleadoParameterGeneral,this.isEsNuevoDefiProvisionEmpleado,classes);//this.defiprovisionempleadoLogic.getDefiProvisionEmpleado()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.defiprovisionempleadoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.defiprovisionempleadoReturnGeneral.getDefiProvisionEmpleado(),defiprovisionempleadoLogic.getDefiProvisionEmpleados());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.defiprovisionempleadoReturnGeneral.getDefiProvisionEmpleado(),this.defiprovisionempleados);
				}
				//ARCHITECTURE
				
				//this.jTableDatosDefiProvisionEmpleado.repaint();
				
				//((AbstractTableModel) this.jTableDatosDefiProvisionEmpleado.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosDefiProvisionEmpleado();
			}
		}
	}
	
	public void actualizarVisualTableDatosDefiProvisionEmpleado() throws Exception {
		
		DefiProvisionEmpleadoModel defiprovisionempleadoModel=(DefiProvisionEmpleadoModel)this.jTableDatosDefiProvisionEmpleado.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			defiprovisionempleadoModel.defiprovisionempleados=this.defiprovisionempleadoLogic.getDefiProvisionEmpleados();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			defiprovisionempleadoModel.defiprovisionempleados=this.defiprovisionempleados;
		}
		
		
		((DefiProvisionEmpleadoModel) this.jTableDatosDefiProvisionEmpleado.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaDefiProvisionEmpleado() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getdefiprovisionempleadoAnterior(),this.defiprovisionempleadoLogic.getDefiProvisionEmpleados());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getdefiprovisionempleadoAnterior(),this.defiprovisionempleados);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosDefiProvisionEmpleado();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioDefiProvisionEmpleado(DefiProvisionEmpleado defiprovisionempleado,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(ProvisionEmpleado.class)) {
					this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.provisionempleadoLogic.setProvisionEmpleados(defiprovisionempleado.getProvisionEmpleados());
					this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProvisionEmpleado(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Cuota.class)) {
					this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaBeanSwingJInternalFrame.cuotaLogic.setCuotas(defiprovisionempleado.getCuotas());
					this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuota(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
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
										
				DefiProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.defiprovisionempleado,new Object(),generalEntityParameterGeneral,this.defiprovisionempleadoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.defiprovisionempleadoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=DefiProvisionEmpleadoConstantesFunciones.getClassesRelationshipsOfDefiProvisionEmpleado(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=DefiProvisionEmpleadoConstantesFunciones.getClassesRelationshipsFromStringsOfDefiProvisionEmpleado(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormDefiProvisionEmpleado(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				DefiProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.defiprovisionempleado,new Object(),generalEntityParameterGeneral,this.defiprovisionempleadoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioDefiProvisionEmpleado(DefiProvisionEmpleadoBean defiprovisionempleadoBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(ProvisionEmpleado.class)) {
					this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.provisionempleadoLogic.setProvisionEmpleados(defiprovisionempleado.getProvisionEmpleados());
					this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProvisionEmpleado(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Cuota.class)) {
					this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaBeanSwingJInternalFrame.cuotaLogic.setCuotas(defiprovisionempleado.getCuotas());
					this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuota(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanDefiProvisionEmpleado(ArrayList<Classe> classes,DefiProvisionEmpleadoReturnGeneral defiprovisionempleadoReturnGeneral,DefiProvisionEmpleadoBean defiprovisionempleadoBean,Boolean conDefault) throws Exception {
		
			this.defiprovisionempleadoBean.setProvisionEmpleados(defiprovisionempleadoReturnGeneral.getDefiProvisionEmpleado().getProvisionEmpleados());
			this.defiprovisionempleadoBean.setCuotas(defiprovisionempleadoReturnGeneral.getDefiProvisionEmpleado().getCuotas());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualDefiProvisionEmpleado(DefiProvisionEmpleado defiprovisionempleado,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(ProvisionEmpleado.class)) {
					defiprovisionempleado.setProvisionEmpleados(this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.provisionempleadoLogic.getProvisionEmpleados());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Cuota.class)) {
					defiprovisionempleado.setCuotas(this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaBeanSwingJInternalFrame.cuotaLogic.getCuotas());
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
		if(!paraTabla && !this.permiteMantenimiento(this.defiprovisionempleado)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormDefiProvisionEmpleado = new DefiProvisionEmpleadoDetalleFormJInternalFrame(jDesktopPane,this.defiprovisionempleadoSessionBean.getConGuardarRelaciones(),this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormDefiProvisionEmpleado);
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.setVisible(false);
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.setSelected(false);						
		
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.defiprovisionempleadoLogic=this.defiprovisionempleadoLogic;
		
		this.cargarCombosFrameForeignKeyDefiProvisionEmpleado("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleDefiProvisionEmpleado();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDefiProvisionEmpleado();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyDefiProvisionEmpleado("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyDefiProvisionEmpleado();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDefiProvisionEmpleado"));
		
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtonModificarDefiProvisionEmpleado.addActionListener(new ButtonActionListener(this,"ModificarDefiProvisionEmpleado"));

		
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtonModificarToolBarDefiProvisionEmpleado.addActionListener(new ButtonActionListener(this,"ModificarToolBarDefiProvisionEmpleado"));
					
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jMenuItemModificarDefiProvisionEmpleado.addActionListener(new ButtonActionListener(this,"MenuItemModificarDefiProvisionEmpleado"));		
		
		
		
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtonActualizarDefiProvisionEmpleado.addActionListener (new ButtonActionListener(this,"ActualizarDefiProvisionEmpleado"));
		
		
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtonActualizarToolBarDefiProvisionEmpleado.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDefiProvisionEmpleado"));
						
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jMenuItemActualizarDefiProvisionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDefiProvisionEmpleado"));		
		
		
		
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtonEliminarDefiProvisionEmpleado.addActionListener (new ButtonActionListener(this,"EliminarDefiProvisionEmpleado"));
		
		
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtonEliminarToolBarDefiProvisionEmpleado.addActionListener (new ButtonActionListener(this,"EliminarToolBarDefiProvisionEmpleado"));
								
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jMenuItemEliminarDefiProvisionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDefiProvisionEmpleado"));		
		
		
		
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtonCancelarDefiProvisionEmpleado.addActionListener (new ButtonActionListener(this,"CancelarDefiProvisionEmpleado"));
		
		
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtonCancelarToolBarDefiProvisionEmpleado.addActionListener (new ButtonActionListener(this,"CancelarToolBarDefiProvisionEmpleado"));
					
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jMenuItemCancelarDefiProvisionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDefiProvisionEmpleado"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jMenuItemDetalleCerrarDefiProvisionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDefiProvisionEmpleado"));		
		
		
		
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtonGuardarCambiosToolBarDefiProvisionEmpleado.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDefiProvisionEmpleado"));
		
		
		
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtonGuardarCambiosToolBarDefiProvisionEmpleado.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDefiProvisionEmpleado"));
		
		
		
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jComboBoxTiposAccionesFormularioDefiProvisionEmpleado.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDefiProvisionEmpleado"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtonidDefiProvisionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"idDefiProvisionEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtonid_empresaDefiProvisionEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDefiProvisionEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtonid_empresaDefiProvisionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDefiProvisionEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtonid_rubro_empleaDefiProvisionEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_rubro_empleaDefiProvisionEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtonid_rubro_empleaDefiProvisionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_rubro_empleaDefiProvisionEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtonid_formatoDefiProvisionEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_formatoDefiProvisionEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtonid_formatoDefiProvisionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_formatoDefiProvisionEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtonnombreDefiProvisionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"nombreDefiProvisionEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtondia_inicialDefiProvisionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"dia_inicialDefiProvisionEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtonid_mes_inicialDefiProvisionEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_mes_inicialDefiProvisionEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtonid_mes_inicialDefiProvisionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_mes_inicialDefiProvisionEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtondia_finalDefiProvisionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"dia_finalDefiProvisionEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtonid_mes_finalDefiProvisionEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_mes_finalDefiProvisionEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtonid_mes_finalDefiProvisionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_mes_finalDefiProvisionEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtonpara_liquidacionDefiProvisionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"para_liquidacionDefiProvisionEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtondescripcionDefiProvisionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionDefiProvisionEmpleadoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jTabbedPaneRelacionesDefiProvisionEmpleado.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDefiProvisionEmpleado"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameDefiProvisionEmpleado"));
		
		if(this.jInternalFrameDetalleFormDefiProvisionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDefiProvisionEmpleado.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDefiProvisionEmpleado"));
		}
		
		this.jTableDatosDefiProvisionEmpleado.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarDefiProvisionEmpleado"));
		
		this.jTableDatosDefiProvisionEmpleado.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarDefiProvisionEmpleado"));
		
		this.jButtonNuevoDefiProvisionEmpleado.addActionListener(new ButtonActionListener(this,"NuevoDefiProvisionEmpleado"));
		
		this.jButtonDuplicarDefiProvisionEmpleado.addActionListener(new ButtonActionListener(this,"DuplicarDefiProvisionEmpleado"));
		
		this.jButtonCopiarDefiProvisionEmpleado.addActionListener(new ButtonActionListener(this,"CopiarDefiProvisionEmpleado"));
		
		this.jButtonVerFormDefiProvisionEmpleado.addActionListener(new ButtonActionListener(this,"VerFormDefiProvisionEmpleado"));
		
		
		this.jButtonNuevoToolBarDefiProvisionEmpleado.addActionListener(new ButtonActionListener(this,"NuevoToolBarDefiProvisionEmpleado"));
			
		this.jButtonDuplicarToolBarDefiProvisionEmpleado.addActionListener(new ButtonActionListener(this,"DuplicarToolBarDefiProvisionEmpleado"));
			
		this.jMenuItemNuevoDefiProvisionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemNuevoDefiProvisionEmpleado"));
			
		this.jMenuItemDuplicarDefiProvisionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarDefiProvisionEmpleado"));		
		
		
		this.jButtonNuevoRelacionesDefiProvisionEmpleado.addActionListener (new ButtonActionListener(this,"NuevoRelacionesDefiProvisionEmpleado"));
		
		
		this.jButtonNuevoRelacionesToolBarDefiProvisionEmpleado.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarDefiProvisionEmpleado"));
			
		this.jMenuItemNuevoRelacionesDefiProvisionEmpleado.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesDefiProvisionEmpleado"));		
		
		
		if(this.jInternalFrameDetalleFormDefiProvisionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtonModificarDefiProvisionEmpleado.addActionListener(new ButtonActionListener(this,"ModificarDefiProvisionEmpleado"));
		}
		
		
		if(this.jInternalFrameDetalleFormDefiProvisionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtonModificarToolBarDefiProvisionEmpleado.addActionListener(new ButtonActionListener(this,"ModificarToolBarDefiProvisionEmpleado"));
			
			this.jInternalFrameDetalleFormDefiProvisionEmpleado.jMenuItemModificarDefiProvisionEmpleado.addActionListener(new ButtonActionListener(this,"MenuItemModificarDefiProvisionEmpleado"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDefiProvisionEmpleado!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtonActualizarDefiProvisionEmpleado.addActionListener (new ButtonActionListener(this,"ActualizarDefiProvisionEmpleado"));
		}
		
		
		if(this.jInternalFrameDetalleFormDefiProvisionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtonActualizarToolBarDefiProvisionEmpleado.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDefiProvisionEmpleado"));
				
			this.jInternalFrameDetalleFormDefiProvisionEmpleado.jMenuItemActualizarDefiProvisionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDefiProvisionEmpleado"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDefiProvisionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtonEliminarDefiProvisionEmpleado.addActionListener (new ButtonActionListener(this,"EliminarDefiProvisionEmpleado"));
		}
		
		
		if(this.jInternalFrameDetalleFormDefiProvisionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtonEliminarToolBarDefiProvisionEmpleado.addActionListener (new ButtonActionListener(this,"EliminarToolBarDefiProvisionEmpleado"));
						
			this.jInternalFrameDetalleFormDefiProvisionEmpleado.jMenuItemEliminarDefiProvisionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDefiProvisionEmpleado"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDefiProvisionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtonCancelarDefiProvisionEmpleado.addActionListener (new ButtonActionListener(this,"CancelarDefiProvisionEmpleado"));
		}
		
		
		if(this.jInternalFrameDetalleFormDefiProvisionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtonCancelarToolBarDefiProvisionEmpleado.addActionListener (new ButtonActionListener(this,"CancelarToolBarDefiProvisionEmpleado"));
			
			this.jInternalFrameDetalleFormDefiProvisionEmpleado.jMenuItemCancelarDefiProvisionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDefiProvisionEmpleado"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarDefiProvisionEmpleado.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarDefiProvisionEmpleado"));		
		
		
		this.jButtonCerrarDefiProvisionEmpleado.addActionListener (new ButtonActionListener(this,"CerrarDefiProvisionEmpleado"));
		
		
		this.jButtonCerrarToolBarDefiProvisionEmpleado.addActionListener (new ButtonActionListener(this,"CerrarToolBarDefiProvisionEmpleado"));
			
		this.jMenuItemCerrarDefiProvisionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemCerrarDefiProvisionEmpleado"));
			
		if(this.jInternalFrameDetalleFormDefiProvisionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDefiProvisionEmpleado.jMenuItemDetalleCerrarDefiProvisionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDefiProvisionEmpleado"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDefiProvisionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtonGuardarCambiosDefiProvisionEmpleado.addActionListener (new ButtonActionListener(this,"GuardarCambiosDefiProvisionEmpleado"));
		}
		
		
		if(this.jInternalFrameDetalleFormDefiProvisionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtonGuardarCambiosToolBarDefiProvisionEmpleado.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDefiProvisionEmpleado"));
		}
		
		this.jButtonCopiarToolBarDefiProvisionEmpleado.addActionListener (new ButtonActionListener(this,"CopiarToolBarDefiProvisionEmpleado"));
			
		this.jButtonVerFormToolBarDefiProvisionEmpleado.addActionListener (new ButtonActionListener(this,"VerFormToolBarDefiProvisionEmpleado"));
		
		this.jMenuItemGuardarCambiosDefiProvisionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosDefiProvisionEmpleado"));
			
		this.jMenuItemCopiarDefiProvisionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemCopiarDefiProvisionEmpleado"));		
		
		this.jMenuItemVerFormDefiProvisionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemVerFormDefiProvisionEmpleado"));		
		
		
		this.jButtonGuardarCambiosTablaDefiProvisionEmpleado.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDefiProvisionEmpleado"));
		
		
		this.jButtonGuardarCambiosTablaToolBarDefiProvisionEmpleado.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarDefiProvisionEmpleado"));
			
		this.jMenuItemGuardarCambiosTablaDefiProvisionEmpleado.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDefiProvisionEmpleado"));		
		
		
		
		this.jButtonRecargarInformacionDefiProvisionEmpleado.addActionListener (new ButtonActionListener(this,"RecargarInformacionDefiProvisionEmpleado"));
					
		this.jButtonRecargarInformacionToolBarDefiProvisionEmpleado.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarDefiProvisionEmpleado"));
		
		this.jMenuItemRecargarInformacionDefiProvisionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionDefiProvisionEmpleado"));		
		
		
		
		this.jButtonAnterioresDefiProvisionEmpleado.addActionListener (new ButtonActionListener(this,"AnterioresDefiProvisionEmpleado"));
		
		
		this.jButtonAnterioresToolBarDefiProvisionEmpleado.addActionListener (new ButtonActionListener(this,"AnterioresToolBarDefiProvisionEmpleado"));
		
		this.jMenuItemAnterioresDefiProvisionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresDefiProvisionEmpleado"));		
		
		
		this.jButtonSiguientesDefiProvisionEmpleado.addActionListener (new ButtonActionListener(this,"SiguientesDefiProvisionEmpleado"));
		
		
		this.jButtonSiguientesToolBarDefiProvisionEmpleado.addActionListener (new ButtonActionListener(this,"SiguientesToolBarDefiProvisionEmpleado"));
			
		this.jMenuItemSiguientesDefiProvisionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesDefiProvisionEmpleado"));
			
		this.jMenuItemAbrirOrderByDefiProvisionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByDefiProvisionEmpleado"));
			
		this.jMenuItemMostrarOcultarDefiProvisionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarDefiProvisionEmpleado"));
			
		this.jMenuItemDetalleAbrirOrderByDefiProvisionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByDefiProvisionEmpleado"));
			
		this.jMenuItemDetalleMostarOcultarDefiProvisionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarDefiProvisionEmpleado"));		
		
		
		this.jButtonNuevoGuardarCambiosDefiProvisionEmpleado.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosDefiProvisionEmpleado"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarDefiProvisionEmpleado.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarDefiProvisionEmpleado"));
			
		this.jMenuItemNuevoGuardarCambiosDefiProvisionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosDefiProvisionEmpleado"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosDefiProvisionEmpleado.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosDefiProvisionEmpleado"));

		this.jCheckBoxSeleccionadosDefiProvisionEmpleado.addItemListener(new CheckBoxItemListener(this,"SeleccionadosDefiProvisionEmpleado"));
		
		if(this.jInternalFrameDetalleFormDefiProvisionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDefiProvisionEmpleado.jComboBoxTiposAccionesFormularioDefiProvisionEmpleado.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDefiProvisionEmpleado"));
		}
		
		
		this.jComboBoxTiposRelacionesDefiProvisionEmpleado.addActionListener (new ButtonActionListener(this,"TiposRelacionesDefiProvisionEmpleado"));
			
		this.jComboBoxTiposAccionesDefiProvisionEmpleado.addActionListener (new ButtonActionListener(this,"TiposAccionesDefiProvisionEmpleado"));
					
		this.jComboBoxTiposSeleccionarDefiProvisionEmpleado.addActionListener (new ButtonActionListener(this,"TiposSeleccionarDefiProvisionEmpleado"));
			
		this.jTextFieldValorCampoGeneralDefiProvisionEmpleado.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralDefiProvisionEmpleado"));		
		
		
		if(this.jInternalFrameDetalleFormDefiProvisionEmpleado!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtonidDefiProvisionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"idDefiProvisionEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtonid_empresaDefiProvisionEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDefiProvisionEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtonid_empresaDefiProvisionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDefiProvisionEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtonid_rubro_empleaDefiProvisionEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_rubro_empleaDefiProvisionEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtonid_rubro_empleaDefiProvisionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_rubro_empleaDefiProvisionEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtonid_formatoDefiProvisionEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_formatoDefiProvisionEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtonid_formatoDefiProvisionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_formatoDefiProvisionEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtonnombreDefiProvisionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"nombreDefiProvisionEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtondia_inicialDefiProvisionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"dia_inicialDefiProvisionEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtonid_mes_inicialDefiProvisionEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_mes_inicialDefiProvisionEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtonid_mes_inicialDefiProvisionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_mes_inicialDefiProvisionEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtondia_finalDefiProvisionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"dia_finalDefiProvisionEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtonid_mes_finalDefiProvisionEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_mes_finalDefiProvisionEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtonid_mes_finalDefiProvisionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_mes_finalDefiProvisionEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtonpara_liquidacionDefiProvisionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"para_liquidacionDefiProvisionEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtondescripcionDefiProvisionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionDefiProvisionEmpleadoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdFormatoDefiProvisionEmpleado.addActionListener(new ButtonActionListener(this,"FK_IdFormatoDefiProvisionEmpleado"));

			this.jButtonFK_IdMesFinalDefiProvisionEmpleado.addActionListener(new ButtonActionListener(this,"FK_IdMesFinalDefiProvisionEmpleado"));

			this.jButtonFK_IdMesInicialDefiProvisionEmpleado.addActionListener(new ButtonActionListener(this,"FK_IdMesInicialDefiProvisionEmpleado"));

			this.jButtonFK_IdRubroEmpleaDefiProvisionEmpleado.addActionListener(new ButtonActionListener(this,"FK_IdRubroEmpleaDefiProvisionEmpleado"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoDefiProvisionEmpleado!=null) {
				this.jInternalFrameReporteDinamicoDefiProvisionEmpleado.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDefiProvisionEmpleado"));
				this.jInternalFrameReporteDinamicoDefiProvisionEmpleado.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDefiProvisionEmpleado"));
				this.jInternalFrameReporteDinamicoDefiProvisionEmpleado.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDefiProvisionEmpleado"));
			}
			
			//this.jButtonCerrarReporteDinamicoDefiProvisionEmpleado.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDefiProvisionEmpleado"));				
			//this.jButtonGenerarReporteDinamicoDefiProvisionEmpleado.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDefiProvisionEmpleado"));
			//this.jButtonGenerarExcelReporteDinamicoDefiProvisionEmpleado.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDefiProvisionEmpleado"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionDefiProvisionEmpleado!=null) {
				this.jInternalFrameImportacionDefiProvisionEmpleado.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDefiProvisionEmpleado"));
				this.jInternalFrameImportacionDefiProvisionEmpleado.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDefiProvisionEmpleado"));
				this.jInternalFrameImportacionDefiProvisionEmpleado.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDefiProvisionEmpleado"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByDefiProvisionEmpleado.addActionListener (new ButtonActionListener(this,"AbrirOrderByDefiProvisionEmpleado"));
			
			this.jButtonAbrirOrderByToolBarDefiProvisionEmpleado.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarDefiProvisionEmpleado"));			
			
			if(this.jInternalFrameOrderByDefiProvisionEmpleado!=null) {
				this.jInternalFrameOrderByDefiProvisionEmpleado.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDefiProvisionEmpleado"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormDefiProvisionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormDefiProvisionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDefiProvisionEmpleado.jTabbedPaneRelacionesDefiProvisionEmpleado.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDefiProvisionEmpleado"));
		
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
            		closingInternalFrameDefiProvisionEmpleado();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormDefiProvisionEmpleado = (JInternalFrameBase)event.getSource();
	            	
	            DefiProvisionEmpleadoBeanSwingJInternalFrame jInternalFrameParent=(DefiProvisionEmpleadoBeanSwingJInternalFrame)jInternalFrameDetalleFormDefiProvisionEmpleado.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarDefiProvisionEmpleadoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosDefiProvisionEmpleado.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosDefiProvisionEmpleadoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosDefiProvisionEmpleado.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosDefiProvisionEmpleado.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoDefiProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDefiProvisionEmpleadoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarDefiProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDefiProvisionEmpleadoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoDefiProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDefiProvisionEmpleadoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoDefiProvisionEmpleado";
		inputMap = this.jButtonNuevoDefiProvisionEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoDefiProvisionEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDefiProvisionEmpleadoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesDefiProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDefiProvisionEmpleadoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarDefiProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDefiProvisionEmpleadoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesDefiProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDefiProvisionEmpleadoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesDefiProvisionEmpleado";
		inputMap = this.jButtonNuevoRelacionesDefiProvisionEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesDefiProvisionEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDefiProvisionEmpleadoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarDefiProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDefiProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarDefiProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDefiProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarDefiProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDefiProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarDefiProvisionEmpleado";
		inputMap = this.jButtonModificarDefiProvisionEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarDefiProvisionEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarDefiProvisionEmpleadoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarDefiProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDefiProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarDefiProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDefiProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarDefiProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDefiProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarDefiProvisionEmpleado";
		inputMap = this.jButtonActualizarDefiProvisionEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarDefiProvisionEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarDefiProvisionEmpleadoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarDefiProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDefiProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarDefiProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDefiProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarDefiProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDefiProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarDefiProvisionEmpleado";
		inputMap = this.jButtonEliminarDefiProvisionEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarDefiProvisionEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarDefiProvisionEmpleadoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarDefiProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDefiProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarDefiProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDefiProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarDefiProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDefiProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarDefiProvisionEmpleado";
		inputMap = this.jButtonCancelarDefiProvisionEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarDefiProvisionEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarDefiProvisionEmpleadoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarDefiProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDefiProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarDefiProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDefiProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarDefiProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDefiProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarDefiProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarDefiProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarDefiProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarDefiProvisionEmpleado";
		inputMap = this.jButtonCerrarDefiProvisionEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarDefiProvisionEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarDefiProvisionEmpleadoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtonGuardarCambiosDefiProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDefiProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarDefiProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDefiProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosDefiProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDefiProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaDefiProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDefiProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarDefiProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDefiProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaDefiProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDefiProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosDefiProvisionEmpleado";
		inputMap = this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtonGuardarCambiosDefiProvisionEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtonGuardarCambiosDefiProvisionEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosDefiProvisionEmpleadoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionDefiProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDefiProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarDefiProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDefiProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionDefiProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDefiProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresDefiProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDefiProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarDefiProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDefiProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresDefiProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDefiProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesDefiProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDefiProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarDefiProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDefiProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesDefiProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDefiProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosDefiProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDefiProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarDefiProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDefiProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosDefiProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDefiProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosDefiProvisionEmpleado.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosDefiProvisionEmpleadoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesDefiProvisionEmpleado.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesDefiProvisionEmpleadoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarDefiProvisionEmpleado.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarDefiProvisionEmpleadoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralDefiProvisionEmpleado.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralDefiProvisionEmpleadoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtonidDefiProvisionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"idDefiProvisionEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtonid_empresaDefiProvisionEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDefiProvisionEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtonid_empresaDefiProvisionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDefiProvisionEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtonid_rubro_empleaDefiProvisionEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_rubro_empleaDefiProvisionEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtonid_rubro_empleaDefiProvisionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_rubro_empleaDefiProvisionEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtonid_formatoDefiProvisionEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_formatoDefiProvisionEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtonid_formatoDefiProvisionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_formatoDefiProvisionEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtonnombreDefiProvisionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"nombreDefiProvisionEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtondia_inicialDefiProvisionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"dia_inicialDefiProvisionEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtonid_mes_inicialDefiProvisionEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_mes_inicialDefiProvisionEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtonid_mes_inicialDefiProvisionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_mes_inicialDefiProvisionEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtondia_finalDefiProvisionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"dia_finalDefiProvisionEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtonid_mes_finalDefiProvisionEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_mes_finalDefiProvisionEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtonid_mes_finalDefiProvisionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_mes_finalDefiProvisionEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtonpara_liquidacionDefiProvisionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"para_liquidacionDefiProvisionEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jButtondescripcionDefiProvisionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionDefiProvisionEmpleadoBusqueda"));
		
		
		this.jButtonFK_IdFormatoDefiProvisionEmpleado.addActionListener(new ButtonActionListener(this,"FK_IdFormatoDefiProvisionEmpleado"));

		this.jButtonFK_IdMesFinalDefiProvisionEmpleado.addActionListener(new ButtonActionListener(this,"FK_IdMesFinalDefiProvisionEmpleado"));

		this.jButtonFK_IdMesInicialDefiProvisionEmpleado.addActionListener(new ButtonActionListener(this,"FK_IdMesInicialDefiProvisionEmpleado"));

		this.jButtonFK_IdRubroEmpleaDefiProvisionEmpleado.addActionListener(new ButtonActionListener(this,"FK_IdRubroEmpleaDefiProvisionEmpleado"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoDefiProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoDefiProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoDefiProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoDefiProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoDefiProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoDefiProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionDefiProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionDefiProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionDefiProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionDefiProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionDefiProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionDefiProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarDefiProvisionEmpleadoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarDefiProvisionEmpleado.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosDefiProvisionEmpleado(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(DefiProvisionEmpleado defiprovisionempleadoAux:this.defiprovisionempleadoLogic.getDefiProvisionEmpleados()) {
					defiprovisionempleadoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DefiProvisionEmpleado defiprovisionempleadoAux:defiprovisionempleados) {
					defiprovisionempleadoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosDefiProvisionEmpleadoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDefiProvisionEmpleado(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(DefiProvisionEmpleado defiprovisionempleadoAux:this.defiprovisionempleadoLogic.getDefiProvisionEmpleados()) {
						defiprovisionempleadoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DefiProvisionEmpleado defiprovisionempleadoAux:defiprovisionempleados) {
						defiprovisionempleadoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(DefiProvisionEmpleado defiprovisionempleadoAux:this.defiprovisionempleadoLogic.getDefiProvisionEmpleados()) {
					
						if(sTipoSeleccionar.equals(DefiProvisionEmpleadoConstantesFunciones.LABEL_PARALIQUIDACION)) {
							existe=true;
							defiprovisionempleadoAux.setpara_liquidacion(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DefiProvisionEmpleado defiprovisionempleadoAux:defiprovisionempleados) {
						
						if(sTipoSeleccionar.equals(DefiProvisionEmpleadoConstantesFunciones.LABEL_PARALIQUIDACION)) {
							existe=true;
							defiprovisionempleadoAux.setpara_liquidacion(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaDefiProvisionEmpleado(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDefiProvisionEmpleado.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDefiProvisionEmpleado.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDefiProvisionEmpleado,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosDefiProvisionEmpleadoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDefiProvisionEmpleado(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosDefiProvisionEmpleado.getSelectedRows();
			
			DefiProvisionEmpleado defiprovisionempleadoLocal=new DefiProvisionEmpleado();
			
			//this.seleccionarTodosDefiProvisionEmpleado(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					defiprovisionempleadoLocal =(DefiProvisionEmpleado) this.defiprovisionempleadoLogic.getDefiProvisionEmpleados().toArray()[this.jTableDatosDefiProvisionEmpleado.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					defiprovisionempleadoLocal =(DefiProvisionEmpleado) this.defiprovisionempleados.toArray()[this.jTableDatosDefiProvisionEmpleado.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				defiprovisionempleadoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(DefiProvisionEmpleado defiprovisionempleadoAux:this.defiprovisionempleadoLogic.getDefiProvisionEmpleados()) {
						defiprovisionempleadoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DefiProvisionEmpleado defiprovisionempleadoAux:defiprovisionempleados) {
						defiprovisionempleadoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaDefiProvisionEmpleado(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDefiProvisionEmpleado.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDefiProvisionEmpleado.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDefiProvisionEmpleado,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualDefiProvisionEmpleadoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarDefiProvisionEmpleadoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralDefiProvisionEmpleadoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingDefiProvisionEmpleado(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralDefiProvisionEmpleado.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(DefiProvisionEmpleado defiprovisionempleadoAux:this.defiprovisionempleadoLogic.getDefiProvisionEmpleados()) {
				
						if(sTipoSeleccionar.equals(DefiProvisionEmpleadoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							defiprovisionempleadoAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DefiProvisionEmpleadoConstantesFunciones.LABEL_DIAINICIAL)) {
							existe=true;
							defiprovisionempleadoAux.setdia_inicial(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DefiProvisionEmpleadoConstantesFunciones.LABEL_DIAFINAL)) {
							existe=true;
							defiprovisionempleadoAux.setdia_final(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DefiProvisionEmpleadoConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							defiprovisionempleadoAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DefiProvisionEmpleado defiprovisionempleadoAux:defiprovisionempleados) {
					
						if(sTipoSeleccionar.equals(DefiProvisionEmpleadoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							defiprovisionempleadoAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DefiProvisionEmpleadoConstantesFunciones.LABEL_DIAINICIAL)) {
							existe=true;
							defiprovisionempleadoAux.setdia_inicial(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DefiProvisionEmpleadoConstantesFunciones.LABEL_DIAFINAL)) {
							existe=true;
							defiprovisionempleadoAux.setdia_final(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DefiProvisionEmpleadoConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							defiprovisionempleadoAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaDefiProvisionEmpleado(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesDefiProvisionEmpleadoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingDefiProvisionEmpleado(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioDefiProvisionEmpleado=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesDefiProvisionEmpleado.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormDefiProvisionEmpleado.jComboBoxTiposAccionesFormularioDefiProvisionEmpleado.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteDefiProvisionEmpleado) {				
					conSplash=true;//false;										
					
					//this.startProcessDefiProvisionEmpleado(conSplash);
				
					this.generarReporteDefiProvisionEmpleadosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDefiProvisionEmpleado.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDefiProvisionEmpleado.jComboBoxTiposAccionesFormularioDefiProvisionEmpleado.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoDefiProvisionEmpleadosSeleccionados();
				//this.jComboBoxTiposAccionesDefiProvisionEmpleado.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDefiProvisionEmpleadosSeleccionados(false);
				//this.jComboBoxTiposAccionesDefiProvisionEmpleado.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDefiProvisionEmpleadosSeleccionados(true);
				//this.jComboBoxTiposAccionesDefiProvisionEmpleado.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDefiProvisionEmpleado();
				
				this.exportarDefiProvisionEmpleadosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDefiProvisionEmpleado.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDefiProvisionEmpleado.jComboBoxTiposAccionesFormularioDefiProvisionEmpleado.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionDefiProvisionEmpleados();
				//this.importarDefiProvisionEmpleados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDefiProvisionEmpleado.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDefiProvisionEmpleado.jComboBoxTiposAccionesFormularioDefiProvisionEmpleado.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDefiProvisionEmpleado();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelDefiProvisionEmpleadosSeleccionados();
				//this.jComboBoxTiposAccionesDefiProvisionEmpleado.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Defi Provision Empleado", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessDefiProvisionEmpleado();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoDefiProvisionEmpleado)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyDefiProvisionEmpleado(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Defi Provision Empleado",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDefiProvisionEmpleado.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDefiProvisionEmpleado.jComboBoxTiposAccionesFormularioDefiProvisionEmpleado.setSelectedIndex(0);					
				}	
			} 			
			else if(DefiProvisionEmpleadoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteDefiProvisionEmpleado) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessDefiProvisionEmpleado(conSplash);
					
						//this.actualizarParametrosGeneralDefiProvisionEmpleado();
						
						this.generarReporteProcesoAccionDefiProvisionEmpleadosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesDefiProvisionEmpleado.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormDefiProvisionEmpleado.jComboBoxTiposAccionesFormularioDefiProvisionEmpleado.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(DefiProvisionEmpleadoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Defi Provision EmpleadoS SELECCIONADOS?", "MANTENIMIENTO DE Defi Provision Empleado", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessDefiProvisionEmpleado();
				
						this.actualizarParametrosGeneralDefiProvisionEmpleado();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.defiprovisionempleadoReturnGeneral=defiprovisionempleadoLogic.procesarAccionDefiProvisionEmpleadosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.defiprovisionempleadoLogic.getDefiProvisionEmpleados(),this.defiprovisionempleadoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarDefiProvisionEmpleadoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesDefiProvisionEmpleado.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormDefiProvisionEmpleado.jComboBoxTiposAccionesFormularioDefiProvisionEmpleado.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralDefiProvisionEmpleado();
					
					DefiProvisionEmpleadoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarDefiProvisionEmpleadoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesDefiProvisionEmpleado.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormDefiProvisionEmpleado.jComboBoxTiposAccionesFormularioDefiProvisionEmpleado.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessDefiProvisionEmpleado(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesDefiProvisionEmpleadoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessDefiProvisionEmpleado();
			
			if(this.jInternalFrameDetalleFormDefiProvisionEmpleado==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<DefiProvisionEmpleado> defiprovisionempleadosSeleccionados=new ArrayList<DefiProvisionEmpleado>();		
			DefiProvisionEmpleado defiprovisionempleado=new DefiProvisionEmpleado();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingDefiProvisionEmpleado(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesDefiProvisionEmpleado.getSelectedItem();
			
			
			
			
			defiprovisionempleadosSeleccionados=this.getDefiProvisionEmpleadosSeleccionados(true);
			//this.sTipoAccion;
			
			if(defiprovisionempleadosSeleccionados.size()==1) {
				for(DefiProvisionEmpleado defiprovisionempleadoAux:defiprovisionempleadosSeleccionados) {
					defiprovisionempleado=defiprovisionempleadoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Provision Empleado")) {
					jButtonProvisionEmpleadoActionPerformed(null,rowIndex,true,false,defiprovisionempleado);
				}
				else if(this.sTipoRelacion.equals("Cuota")) {
					jButtonCuotaActionPerformed(null,rowIndex,true,false,defiprovisionempleado);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessDefiProvisionEmpleado();
			
      		//this.finishProcessDefiProvisionEmpleado(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarDefiProvisionEmpleadoReturnGeneral() throws Exception {
		if(this.defiprovisionempleadoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.defiprovisionempleadoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.defiprovisionempleadoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.defiprovisionempleadoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.defiprovisionempleadoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.defiprovisionempleadoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingDefiProvisionEmpleado(false);
		}
		
		if(this.defiprovisionempleadoReturnGeneral.getConRetornoLista() || this.defiprovisionempleadoReturnGeneral.getConRetornoObjeto()) {
			if(this.defiprovisionempleadoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.defiprovisionempleadoLogic.setDefiProvisionEmpleados(this.defiprovisionempleadoReturnGeneral.getDefiProvisionEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.defiprovisionempleadoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.defiprovisionempleadoLogic.setDefiProvisionEmpleado(this.defiprovisionempleadoReturnGeneral.getDefiProvisionEmpleado());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingDefiProvisionEmpleado(false);
		}
	}
	
	public void actualizarParametrosGeneralDefiProvisionEmpleado() throws Exception {
		
		
	}
	
	public ArrayList<DefiProvisionEmpleado> getDefiProvisionEmpleadosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<DefiProvisionEmpleado> defiprovisionempleadosSeleccionados=new ArrayList<DefiProvisionEmpleado>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioDefiProvisionEmpleado) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(DefiProvisionEmpleado defiprovisionempleadoAux:defiprovisionempleadoLogic.getDefiProvisionEmpleados()) {
					if(defiprovisionempleadoAux.getIsSelected()) {
						defiprovisionempleadosSeleccionados.add(defiprovisionempleadoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DefiProvisionEmpleado defiprovisionempleadoAux:this.defiprovisionempleados) {
					if(defiprovisionempleadoAux.getIsSelected()) {
						defiprovisionempleadosSeleccionados.add(defiprovisionempleadoAux);				
					}
				}
			}
			
			if(defiprovisionempleadosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						defiprovisionempleadosSeleccionados.addAll(this.defiprovisionempleadoLogic.getDefiProvisionEmpleados());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						defiprovisionempleadosSeleccionados.addAll(this.defiprovisionempleados);				
					}
				}
			}
		} else {
			defiprovisionempleadosSeleccionados.add(this.defiprovisionempleado);
		}
		
		return defiprovisionempleadosSeleccionados;
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
	
	public void generarReporteDefiProvisionEmpleadosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalDefiProvisionEmpleadosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoDefiProvisionEmpleadosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDefiProvisionEmpleadosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDefiProvisionEmpleadosSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesDefiProvisionEmpleadosSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Defi Provision Empleado",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesDefiProvisionEmpleadosSeleccionados() throws Exception {
		ArrayList<DefiProvisionEmpleado> defiprovisionempleadosSeleccionados=new ArrayList<DefiProvisionEmpleado>();		
		
		defiprovisionempleadosSeleccionados=this.getDefiProvisionEmpleadosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteDefiProvisionEmpleados("Todos",defiprovisionempleadosSeleccionados);
		
	}	
	
	public void generarReporteNormalDefiProvisionEmpleadosSeleccionados() throws Exception {
		ArrayList<DefiProvisionEmpleado> defiprovisionempleadosSeleccionados=new ArrayList<DefiProvisionEmpleado>();		
		
		defiprovisionempleadosSeleccionados=this.getDefiProvisionEmpleadosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteDefiProvisionEmpleados("Todos",defiprovisionempleadosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionDefiProvisionEmpleadosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<DefiProvisionEmpleado> defiprovisionempleadosSeleccionados=new ArrayList<DefiProvisionEmpleado>();
		
		defiprovisionempleadosSeleccionados=this.getDefiProvisionEmpleadosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteDefiProvisionEmpleados("Todos",defiprovisionempleadosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoDefiProvisionEmpleadosSeleccionados() throws Exception {
		ArrayList<DefiProvisionEmpleado> defiprovisionempleadosSeleccionados=new ArrayList<DefiProvisionEmpleado>();		
		
		
		this.abrirInicializarFrameReporteDinamicoDefiProvisionEmpleado();
		
		
		defiprovisionempleadosSeleccionados=this.getDefiProvisionEmpleadosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoDefiProvisionEmpleado();
		
		
		//this.generarReporteDefiProvisionEmpleados("Todos",defiprovisionempleadosSeleccionados ,defiprovisionempleadoImplementable,defiprovisionempleadoImplementableHome);
	}
	
	public void mostrarImportacionDefiProvisionEmpleados() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionDefiProvisionEmpleado();
		
		this.abrirFrameImportacionDefiProvisionEmpleado();		
		
			
		//this.generarReporteDefiProvisionEmpleados("Todos",defiprovisionempleadosSeleccionados ,defiprovisionempleadoImplementable,defiprovisionempleadoImplementableHome);
	}
	
	public void importarDefiProvisionEmpleados() throws Exception {		
	
	}
	
	public void exportarDefiProvisionEmpleadosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelDefiProvisionEmpleadosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoDefiProvisionEmpleadosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlDefiProvisionEmpleadosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Defi Provision Empleado",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoDefiProvisionEmpleadosSeleccionados() throws Exception {
		ArrayList<DefiProvisionEmpleado> defiprovisionempleadosSeleccionados=new ArrayList<DefiProvisionEmpleado>();		
		
		defiprovisionempleadosSeleccionados=this.getDefiProvisionEmpleadosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"defiprovisionempleado."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarDefiProvisionEmpleado(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(DefiProvisionEmpleado defiprovisionempleadoAux:defiprovisionempleadosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarDefiProvisionEmpleado(defiprovisionempleadoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//defiprovisionempleadoAux.setsDetalleGeneralEntityReporte(defiprovisionempleadoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Defi Provision Empleado",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarDefiProvisionEmpleado(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=DefiProvisionEmpleadoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DefiProvisionEmpleadoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DefiProvisionEmpleadoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DefiProvisionEmpleadoConstantesFunciones.LABEL_IDRUBROEMPLEA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DefiProvisionEmpleadoConstantesFunciones.LABEL_IDFORMATO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DefiProvisionEmpleadoConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DefiProvisionEmpleadoConstantesFunciones.LABEL_DIAINICIAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DefiProvisionEmpleadoConstantesFunciones.LABEL_IDMESINICIAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DefiProvisionEmpleadoConstantesFunciones.LABEL_DIAFINAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DefiProvisionEmpleadoConstantesFunciones.LABEL_IDMESFINAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DefiProvisionEmpleadoConstantesFunciones.LABEL_PARALIQUIDACION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DefiProvisionEmpleadoConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarDefiProvisionEmpleado(DefiProvisionEmpleado defiprovisionempleado,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=defiprovisionempleado.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=defiprovisionempleado.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=defiprovisionempleado.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=defiprovisionempleado.getrubroemplea_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=defiprovisionempleado.getformato_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=defiprovisionempleado.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=defiprovisionempleado.getdia_inicial().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=defiprovisionempleado.getmesinicial_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=defiprovisionempleado.getdia_final().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=defiprovisionempleado.getmesfinal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=defiprovisionempleado.getpara_liquidacion().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=defiprovisionempleado.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelDefiProvisionEmpleadosSeleccionados() throws Exception {
		ArrayList<DefiProvisionEmpleado> defiprovisionempleadosSeleccionados=new ArrayList<DefiProvisionEmpleado>();		
		
		defiprovisionempleadosSeleccionados=this.getDefiProvisionEmpleadosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"defiprovisionempleado.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("DefiProvisionEmpleados");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelDefiProvisionEmpleado(row);				
				iRow++;
			}				
			
			for(DefiProvisionEmpleado defiprovisionempleadoAux:defiprovisionempleadosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelDefiProvisionEmpleado(defiprovisionempleadoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Defi Provision Empleado",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlDefiProvisionEmpleadosSeleccionados() throws Exception {
		ArrayList<DefiProvisionEmpleado> defiprovisionempleadosSeleccionados=new ArrayList<DefiProvisionEmpleado>();		
		
		defiprovisionempleadosSeleccionados=this.getDefiProvisionEmpleadosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"defiprovisionempleado.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("defiprovisionempleados");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("defiprovisionempleado");
			//elementRoot.appendChild(element);
		
			for(DefiProvisionEmpleado defiprovisionempleadoAux:defiprovisionempleadosSeleccionados) {
				element = document.createElement("defiprovisionempleado");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlDefiProvisionEmpleado(defiprovisionempleadoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Defi Provision Empleado",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelDefiProvisionEmpleado(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(DefiProvisionEmpleadoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(DefiProvisionEmpleadoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(DefiProvisionEmpleadoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(DefiProvisionEmpleadoConstantesFunciones.LABEL_IDRUBROEMPLEA);
		cell = row.createCell(iColumn++);cell.setCellValue(DefiProvisionEmpleadoConstantesFunciones.LABEL_IDFORMATO);
		cell = row.createCell(iColumn++);cell.setCellValue(DefiProvisionEmpleadoConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(DefiProvisionEmpleadoConstantesFunciones.LABEL_DIAINICIAL);
		cell = row.createCell(iColumn++);cell.setCellValue(DefiProvisionEmpleadoConstantesFunciones.LABEL_IDMESINICIAL);
		cell = row.createCell(iColumn++);cell.setCellValue(DefiProvisionEmpleadoConstantesFunciones.LABEL_DIAFINAL);
		cell = row.createCell(iColumn++);cell.setCellValue(DefiProvisionEmpleadoConstantesFunciones.LABEL_IDMESFINAL);
		cell = row.createCell(iColumn++);cell.setCellValue(DefiProvisionEmpleadoConstantesFunciones.LABEL_PARALIQUIDACION);
		cell = row.createCell(iColumn++);cell.setCellValue(DefiProvisionEmpleadoConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelDefiProvisionEmpleado(DefiProvisionEmpleado defiprovisionempleado,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(defiprovisionempleado.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(defiprovisionempleado.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(defiprovisionempleado.getrubroemplea_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(defiprovisionempleado.getformato_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(defiprovisionempleado.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(defiprovisionempleado.getdia_inicial());
		cell = row.createCell(iColumn++);cell.setCellValue(defiprovisionempleado.getmesinicial_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(defiprovisionempleado.getdia_final());
		cell = row.createCell(iColumn++);cell.setCellValue(defiprovisionempleado.getmesfinal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(defiprovisionempleado.getpara_liquidacion());
		cell = row.createCell(iColumn++);cell.setCellValue(defiprovisionempleado.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlDefiProvisionEmpleado(DefiProvisionEmpleado defiprovisionempleado,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(DefiProvisionEmpleadoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(defiprovisionempleado.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(DefiProvisionEmpleadoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(defiprovisionempleado.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(DefiProvisionEmpleadoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(defiprovisionempleado.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementrubroemplea_descripcion = document.createElement(DefiProvisionEmpleadoConstantesFunciones.IDRUBROEMPLEA);
		elementrubroemplea_descripcion.appendChild(document.createTextNode(defiprovisionempleado.getrubroemplea_descripcion()));
		element.appendChild(elementrubroemplea_descripcion);

		Element elementformato_descripcion = document.createElement(DefiProvisionEmpleadoConstantesFunciones.IDFORMATO);
		elementformato_descripcion.appendChild(document.createTextNode(defiprovisionempleado.getformato_descripcion()));
		element.appendChild(elementformato_descripcion);

		Element elementnombre = document.createElement(DefiProvisionEmpleadoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(defiprovisionempleado.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementdia_inicial = document.createElement(DefiProvisionEmpleadoConstantesFunciones.DIAINICIAL);
		elementdia_inicial.appendChild(document.createTextNode(defiprovisionempleado.getdia_inicial().toString().trim()));
		element.appendChild(elementdia_inicial);

		Element elementmesinicial_descripcion = document.createElement(DefiProvisionEmpleadoConstantesFunciones.IDMESINICIAL);
		elementmesinicial_descripcion.appendChild(document.createTextNode(defiprovisionempleado.getmesinicial_descripcion()));
		element.appendChild(elementmesinicial_descripcion);

		Element elementdia_final = document.createElement(DefiProvisionEmpleadoConstantesFunciones.DIAFINAL);
		elementdia_final.appendChild(document.createTextNode(defiprovisionempleado.getdia_final().toString().trim()));
		element.appendChild(elementdia_final);

		Element elementmesfinal_descripcion = document.createElement(DefiProvisionEmpleadoConstantesFunciones.IDMESFINAL);
		elementmesfinal_descripcion.appendChild(document.createTextNode(defiprovisionempleado.getmesfinal_descripcion()));
		element.appendChild(elementmesfinal_descripcion);

		Element elementpara_liquidacion = document.createElement(DefiProvisionEmpleadoConstantesFunciones.PARALIQUIDACION);
		elementpara_liquidacion.appendChild(document.createTextNode(defiprovisionempleado.getpara_liquidacion().toString().trim()));
		element.appendChild(elementpara_liquidacion);

		Element elementdescripcion = document.createElement(DefiProvisionEmpleadoConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(defiprovisionempleado.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoDefiProvisionEmpleadosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<DefiProvisionEmpleado> defiprovisionempleadosSeleccionados=new ArrayList<DefiProvisionEmpleado>();
		
		defiprovisionempleadosSeleccionados=this.getDefiProvisionEmpleadosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoDefiProvisionEmpleado(defiprovisionempleadosSeleccionados);
		
		this.generarReporteDefiProvisionEmpleados("Todos",defiprovisionempleadosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoDefiProvisionEmpleado(ArrayList<DefiProvisionEmpleado> defiprovisionempleadosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(DefiProvisionEmpleado defiprovisionempleadoAux:defiprovisionempleadosSeleccionados) {
				defiprovisionempleadoAux.setsDetalleGeneralEntityReporte(defiprovisionempleadoAux.toString());
			
				if(sTipoSeleccionar.equals(DefiProvisionEmpleadoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					defiprovisionempleadoAux.setsDescripcionGeneralEntityReporte1(defiprovisionempleadoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DefiProvisionEmpleadoConstantesFunciones.LABEL_IDRUBROEMPLEA)) {
					existe=true;
					defiprovisionempleadoAux.setsDescripcionGeneralEntityReporte1(defiprovisionempleadoAux.getrubroemplea_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DefiProvisionEmpleadoConstantesFunciones.LABEL_IDFORMATO)) {
					existe=true;
					defiprovisionempleadoAux.setsDescripcionGeneralEntityReporte1(defiprovisionempleadoAux.getformato_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DefiProvisionEmpleadoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					defiprovisionempleadoAux.setsDescripcionGeneralEntityReporte1(defiprovisionempleadoAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(DefiProvisionEmpleadoConstantesFunciones.LABEL_DIAINICIAL)) {
					existe=true;
					defiprovisionempleadoAux.setsDescripcionGeneralEntityReporte1(defiprovisionempleadoAux.getdia_inicial().toString());
				}
				 else if(sTipoSeleccionar.equals(DefiProvisionEmpleadoConstantesFunciones.LABEL_IDMESINICIAL)) {
					existe=true;
					defiprovisionempleadoAux.setsDescripcionGeneralEntityReporte1(defiprovisionempleadoAux.getmesinicial_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DefiProvisionEmpleadoConstantesFunciones.LABEL_DIAFINAL)) {
					existe=true;
					defiprovisionempleadoAux.setsDescripcionGeneralEntityReporte1(defiprovisionempleadoAux.getdia_final().toString());
				}
				 else if(sTipoSeleccionar.equals(DefiProvisionEmpleadoConstantesFunciones.LABEL_IDMESFINAL)) {
					existe=true;
					defiprovisionempleadoAux.setsDescripcionGeneralEntityReporte1(defiprovisionempleadoAux.getmesfinal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DefiProvisionEmpleadoConstantesFunciones.LABEL_PARALIQUIDACION)) {
					existe=true;
					defiprovisionempleadoAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(defiprovisionempleadoAux.getpara_liquidacion()));
				}
				 else if(sTipoSeleccionar.equals(DefiProvisionEmpleadoConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					defiprovisionempleadoAux.setsDescripcionGeneralEntityReporte1(defiprovisionempleadoAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesDefiProvisionEmpleado(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoDefiProvisionEmpleado=true;
				this.isVisibilidadCeldaNuevoRelacionesDefiProvisionEmpleado=true;
				this.isVisibilidadCeldaGuardarCambiosDefiProvisionEmpleado=true;
			}
			
			this.isVisibilidadCeldaModificarDefiProvisionEmpleado=false;
			this.isVisibilidadCeldaActualizarDefiProvisionEmpleado=false;
			this.isVisibilidadCeldaEliminarDefiProvisionEmpleado=false;
			this.isVisibilidadCeldaCancelarDefiProvisionEmpleado=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDefiProvisionEmpleado=true;
				} else {
					this.isVisibilidadCeldaGuardarDefiProvisionEmpleado=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoDefiProvisionEmpleado=false;
			this.isVisibilidadCeldaNuevoRelacionesDefiProvisionEmpleado=false;
			this.isVisibilidadCeldaGuardarCambiosDefiProvisionEmpleado=false;
			this.isVisibilidadCeldaModificarDefiProvisionEmpleado=false;
			this.isVisibilidadCeldaActualizarDefiProvisionEmpleado=true;
			this.isVisibilidadCeldaEliminarDefiProvisionEmpleado=false;
			this.isVisibilidadCeldaCancelarDefiProvisionEmpleado=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDefiProvisionEmpleado=true;
				} else {
					this.isVisibilidadCeldaGuardarDefiProvisionEmpleado=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoDefiProvisionEmpleado=false;
			this.isVisibilidadCeldaNuevoRelacionesDefiProvisionEmpleado=false;
			this.isVisibilidadCeldaGuardarCambiosDefiProvisionEmpleado=false;
			this.isVisibilidadCeldaModificarDefiProvisionEmpleado=false;
			this.isVisibilidadCeldaActualizarDefiProvisionEmpleado=true;
			this.isVisibilidadCeldaEliminarDefiProvisionEmpleado=true;
			this.isVisibilidadCeldaCancelarDefiProvisionEmpleado=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDefiProvisionEmpleado=true;
				} else {
					this.isVisibilidadCeldaGuardarDefiProvisionEmpleado=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoDefiProvisionEmpleado=false;
			this.isVisibilidadCeldaNuevoRelacionesDefiProvisionEmpleado=false;
			this.isVisibilidadCeldaGuardarCambiosDefiProvisionEmpleado=false;
			this.isVisibilidadCeldaModificarDefiProvisionEmpleado=false;
			this.isVisibilidadCeldaActualizarDefiProvisionEmpleado=true;
			this.isVisibilidadCeldaEliminarDefiProvisionEmpleado=false;
			this.isVisibilidadCeldaCancelarDefiProvisionEmpleado=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDefiProvisionEmpleado=false;
				} else {
					this.isVisibilidadCeldaGuardarDefiProvisionEmpleado=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoDefiProvisionEmpleado=true;
			this.isVisibilidadCeldaNuevoRelacionesDefiProvisionEmpleado=true;
			this.isVisibilidadCeldaGuardarCambiosDefiProvisionEmpleado=true;
			this.isVisibilidadCeldaModificarDefiProvisionEmpleado=false;
			this.isVisibilidadCeldaActualizarDefiProvisionEmpleado=false;
			this.isVisibilidadCeldaEliminarDefiProvisionEmpleado=false;
			this.isVisibilidadCeldaCancelarDefiProvisionEmpleado=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDefiProvisionEmpleado=true;
				} else {
					this.isVisibilidadCeldaGuardarDefiProvisionEmpleado=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoDefiProvisionEmpleado=false;
			this.isVisibilidadCeldaNuevoRelacionesDefiProvisionEmpleado=false;
			this.isVisibilidadCeldaGuardarCambiosDefiProvisionEmpleado=false;
			this.isVisibilidadCeldaActualizarDefiProvisionEmpleado=false;
			this.isVisibilidadCeldaEliminarDefiProvisionEmpleado=false;
			this.isVisibilidadCeldaCancelarDefiProvisionEmpleado=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDefiProvisionEmpleado=false;
				} else {
					this.isVisibilidadCeldaGuardarDefiProvisionEmpleado=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoDefiProvisionEmpleado=false;
			this.isVisibilidadCeldaNuevoRelacionesDefiProvisionEmpleado=false;
			this.isVisibilidadCeldaGuardarCambiosDefiProvisionEmpleado=false;
			this.isVisibilidadCeldaModificarDefiProvisionEmpleado=true;
			this.isVisibilidadCeldaActualizarDefiProvisionEmpleado=false;
			this.isVisibilidadCeldaEliminarDefiProvisionEmpleado=false;
			this.isVisibilidadCeldaCancelarDefiProvisionEmpleado=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDefiProvisionEmpleado=false;
				} else {
					this.isVisibilidadCeldaGuardarDefiProvisionEmpleado=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(DefiProvisionEmpleadoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoDefiProvisionEmpleado=true;
			this.isVisibilidadCeldaNuevoRelacionesDefiProvisionEmpleado=true;
			this.isVisibilidadCeldaGuardarCambiosDefiProvisionEmpleado=true;
		} else {
			this.actualizarEstadoPanelsDefiProvisionEmpleado(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarDefiProvisionEmpleado=false;
			//this.isVisibilidadCeldaVerFormDefiProvisionEmpleado=false;
			this.isVisibilidadCeldaDuplicarDefiProvisionEmpleado=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!defiprovisionempleadoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesDefiProvisionEmpleado=false;
		} else {
			this.isVisibilidadCeldaNuevoDefiProvisionEmpleado=false;
			this.isVisibilidadCeldaGuardarCambiosDefiProvisionEmpleado=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(defiprovisionempleadoSessionBean.getEsGuardarRelacionado()) {
			if(!defiprovisionempleadoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesDefiProvisionEmpleado=false;												
			}
			
			this.jButtonCerrarDefiProvisionEmpleado.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesDefiProvisionEmpleado=false;
		}
		
		if(!this.permiteMantenimiento(this.defiprovisionempleado)) {
			this.isVisibilidadCeldaActualizarDefiProvisionEmpleado=false;
			this.isVisibilidadCeldaEliminarDefiProvisionEmpleado=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesDefiProvisionEmpleado() {
		this.isVisibilidadCeldaNuevoDefiProvisionEmpleado=false;
		this.isVisibilidadCeldaGuardarCambiosDefiProvisionEmpleado=false;
	}
	
	public void actualizarEstadoPanelsDefiProvisionEmpleado(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionDefiProvisionEmpleado!=null) {
				this.jScrollPanelDatosEdicionDefiProvisionEmpleado.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDefiProvisionEmpleado!=null) {
				this.jTabbedPaneBusquedasDefiProvisionEmpleado.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDefiProvisionEmpleado!=null) {
				this.jScrollPanelDatosDefiProvisionEmpleado.setVisible(true);
			}
			
			if(this.jPanelPaginacionDefiProvisionEmpleado!=null) {
				this.jPanelPaginacionDefiProvisionEmpleado.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDefiProvisionEmpleado!=null) {
				this.jPanelParametrosReportesDefiProvisionEmpleado.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionDefiProvisionEmpleado!=null) {
				this.jScrollPanelDatosEdicionDefiProvisionEmpleado.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDefiProvisionEmpleado!=null) {
				this.jTabbedPaneBusquedasDefiProvisionEmpleado.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosDefiProvisionEmpleado!=null) {
				this.jScrollPanelDatosDefiProvisionEmpleado.setVisible(false);
			}
			
			if(this.jPanelPaginacionDefiProvisionEmpleado!=null) {
				this.jPanelPaginacionDefiProvisionEmpleado.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDefiProvisionEmpleado!=null) {
				this.jPanelParametrosReportesDefiProvisionEmpleado.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionDefiProvisionEmpleado!=null) {
				this.jScrollPanelDatosEdicionDefiProvisionEmpleado.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDefiProvisionEmpleado!=null) {
				this.jTabbedPaneBusquedasDefiProvisionEmpleado.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDefiProvisionEmpleado!=null) {
				this.jScrollPanelDatosDefiProvisionEmpleado.setVisible(false);
			}
			
			if(this.jPanelPaginacionDefiProvisionEmpleado!=null) {
				this.jPanelPaginacionDefiProvisionEmpleado.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDefiProvisionEmpleado!=null) {
				this.jPanelParametrosReportesDefiProvisionEmpleado.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionDefiProvisionEmpleado!=null) {
				this.jScrollPanelDatosEdicionDefiProvisionEmpleado.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDefiProvisionEmpleado!=null) {
				this.jTabbedPaneBusquedasDefiProvisionEmpleado.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDefiProvisionEmpleado!=null) {
				this.jScrollPanelDatosDefiProvisionEmpleado.setVisible(false);
			}
			
			if(this.jPanelPaginacionDefiProvisionEmpleado!=null) {
				this.jPanelPaginacionDefiProvisionEmpleado.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDefiProvisionEmpleado!=null) {
				this.jPanelParametrosReportesDefiProvisionEmpleado.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionDefiProvisionEmpleado!=null) {
				this.jScrollPanelDatosEdicionDefiProvisionEmpleado.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDefiProvisionEmpleado!=null) {
				this.jTabbedPaneBusquedasDefiProvisionEmpleado.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDefiProvisionEmpleado!=null) {
				this.jScrollPanelDatosDefiProvisionEmpleado.setVisible(true);
			}
			
			if(this.jPanelPaginacionDefiProvisionEmpleado!=null) {
				this.jPanelPaginacionDefiProvisionEmpleado.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDefiProvisionEmpleado!=null) {
				this.jPanelParametrosReportesDefiProvisionEmpleado.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionDefiProvisionEmpleado!=null) {
				this.jScrollPanelDatosEdicionDefiProvisionEmpleado.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDefiProvisionEmpleado!=null) {
				this.jTabbedPaneBusquedasDefiProvisionEmpleado.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDefiProvisionEmpleado!=null) {
				this.jScrollPanelDatosDefiProvisionEmpleado.setVisible(true);
			}
			
			if(this.jPanelPaginacionDefiProvisionEmpleado!=null) {
				this.jPanelPaginacionDefiProvisionEmpleado.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDefiProvisionEmpleado!=null) {
				this.jPanelParametrosReportesDefiProvisionEmpleado.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionDefiProvisionEmpleado!=null) {
				this.jScrollPanelDatosEdicionDefiProvisionEmpleado.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDefiProvisionEmpleado!=null) {
				this.jTabbedPaneBusquedasDefiProvisionEmpleado.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDefiProvisionEmpleado!=null) {
				this.jScrollPanelDatosDefiProvisionEmpleado.setVisible(true);
			}
			
			if(this.jPanelPaginacionDefiProvisionEmpleado!=null) {
				this.jPanelPaginacionDefiProvisionEmpleado.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDefiProvisionEmpleado!=null) {
				this.jPanelParametrosReportesDefiProvisionEmpleado.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasDefiProvisionEmpleado!=null) {
					this.jTabbedPaneBusquedasDefiProvisionEmpleado.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesDefiProvisionEmpleado!=null) {
				this.jPanelParametrosReportesDefiProvisionEmpleado.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDefiProvisionEmpleado!=null) {
				this.jTabbedPaneBusquedasDefiProvisionEmpleado.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesDefiProvisionEmpleado!=null) {
				this.jPanelParametrosReportesDefiProvisionEmpleado.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdFormato=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdFormato) {this.jTabbedPaneBusquedasDefiProvisionEmpleado.remove(jPanelFK_IdFormatoDefiProvisionEmpleado);}

			this.isVisibilidadFK_IdMesFinal=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdMesFinal) {this.jTabbedPaneBusquedasDefiProvisionEmpleado.remove(jPanelFK_IdMesFinalDefiProvisionEmpleado);}

			this.isVisibilidadFK_IdMesInicial=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdMesInicial) {this.jTabbedPaneBusquedasDefiProvisionEmpleado.remove(jPanelFK_IdMesInicialDefiProvisionEmpleado);}

			this.isVisibilidadFK_IdRubroEmplea=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdRubroEmplea) {this.jTabbedPaneBusquedasDefiProvisionEmpleado.remove(jPanelFK_IdRubroEmpleaDefiProvisionEmpleado);}
		}
		
	}

	public void setVisibilidadBusquedasParaRubroEmplea(Boolean isParaRubroEmplea){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaRubroEmpleaNegation=!isParaRubroEmplea;

			this.isVisibilidadFK_IdFormato=isParaRubroEmpleaNegation;
			if(!this.isVisibilidadFK_IdFormato) {this.jTabbedPaneBusquedasDefiProvisionEmpleado.remove(jPanelFK_IdFormatoDefiProvisionEmpleado);}

			this.isVisibilidadFK_IdMesFinal=isParaRubroEmpleaNegation;
			if(!this.isVisibilidadFK_IdMesFinal) {this.jTabbedPaneBusquedasDefiProvisionEmpleado.remove(jPanelFK_IdMesFinalDefiProvisionEmpleado);}

			this.isVisibilidadFK_IdMesInicial=isParaRubroEmpleaNegation;
			if(!this.isVisibilidadFK_IdMesInicial) {this.jTabbedPaneBusquedasDefiProvisionEmpleado.remove(jPanelFK_IdMesInicialDefiProvisionEmpleado);}

			this.isVisibilidadFK_IdRubroEmplea=isParaRubroEmplea;
			if(!this.isVisibilidadFK_IdRubroEmplea) {this.jTabbedPaneBusquedasDefiProvisionEmpleado.remove(jPanelFK_IdRubroEmpleaDefiProvisionEmpleado);}
		}
		
	}

	public void setVisibilidadBusquedasParaFormato(Boolean isParaFormato){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaFormatoNegation=!isParaFormato;

			this.isVisibilidadFK_IdFormato=isParaFormato;
			if(!this.isVisibilidadFK_IdFormato) {this.jTabbedPaneBusquedasDefiProvisionEmpleado.remove(jPanelFK_IdFormatoDefiProvisionEmpleado);}

			this.isVisibilidadFK_IdMesFinal=isParaFormatoNegation;
			if(!this.isVisibilidadFK_IdMesFinal) {this.jTabbedPaneBusquedasDefiProvisionEmpleado.remove(jPanelFK_IdMesFinalDefiProvisionEmpleado);}

			this.isVisibilidadFK_IdMesInicial=isParaFormatoNegation;
			if(!this.isVisibilidadFK_IdMesInicial) {this.jTabbedPaneBusquedasDefiProvisionEmpleado.remove(jPanelFK_IdMesInicialDefiProvisionEmpleado);}

			this.isVisibilidadFK_IdRubroEmplea=isParaFormatoNegation;
			if(!this.isVisibilidadFK_IdRubroEmplea) {this.jTabbedPaneBusquedasDefiProvisionEmpleado.remove(jPanelFK_IdRubroEmpleaDefiProvisionEmpleado);}
		}
		
	}

	public void setVisibilidadBusquedasParaMesInicial(Boolean isParaMesInicial){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaMesInicialNegation=!isParaMesInicial;

			this.isVisibilidadFK_IdFormato=isParaMesInicialNegation;
			if(!this.isVisibilidadFK_IdFormato) {this.jTabbedPaneBusquedasDefiProvisionEmpleado.remove(jPanelFK_IdFormatoDefiProvisionEmpleado);}

			this.isVisibilidadFK_IdMesFinal=isParaMesInicialNegation;
			if(!this.isVisibilidadFK_IdMesFinal) {this.jTabbedPaneBusquedasDefiProvisionEmpleado.remove(jPanelFK_IdMesFinalDefiProvisionEmpleado);}

			this.isVisibilidadFK_IdMesInicial=isParaMesInicial;
			if(!this.isVisibilidadFK_IdMesInicial) {this.jTabbedPaneBusquedasDefiProvisionEmpleado.remove(jPanelFK_IdMesInicialDefiProvisionEmpleado);}

			this.isVisibilidadFK_IdRubroEmplea=isParaMesInicialNegation;
			if(!this.isVisibilidadFK_IdRubroEmplea) {this.jTabbedPaneBusquedasDefiProvisionEmpleado.remove(jPanelFK_IdRubroEmpleaDefiProvisionEmpleado);}
		}
		
	}

	public void setVisibilidadBusquedasParaMesFinal(Boolean isParaMesFinal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaMesFinalNegation=!isParaMesFinal;

			this.isVisibilidadFK_IdFormato=isParaMesFinalNegation;
			if(!this.isVisibilidadFK_IdFormato) {this.jTabbedPaneBusquedasDefiProvisionEmpleado.remove(jPanelFK_IdFormatoDefiProvisionEmpleado);}

			this.isVisibilidadFK_IdMesFinal=isParaMesFinal;
			if(!this.isVisibilidadFK_IdMesFinal) {this.jTabbedPaneBusquedasDefiProvisionEmpleado.remove(jPanelFK_IdMesFinalDefiProvisionEmpleado);}

			this.isVisibilidadFK_IdMesInicial=isParaMesFinalNegation;
			if(!this.isVisibilidadFK_IdMesInicial) {this.jTabbedPaneBusquedasDefiProvisionEmpleado.remove(jPanelFK_IdMesInicialDefiProvisionEmpleado);}

			this.isVisibilidadFK_IdRubroEmplea=isParaMesFinalNegation;
			if(!this.isVisibilidadFK_IdRubroEmplea) {this.jTabbedPaneBusquedasDefiProvisionEmpleado.remove(jPanelFK_IdRubroEmpleaDefiProvisionEmpleado);}
		}
		
	}
	
	

	public String registrarSesionDefiProvisionEmpleadoParaProvisionEmpleados() throws Exception {
		Boolean isPaginaPopupProvisionEmpleado=false;

		try {

			if(this.defiprovisionempleadoSessionBean==null) {
				this.defiprovisionempleadoSessionBean=new DefiProvisionEmpleadoSessionBean();
			}

			if(this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoSessionBean==null) {
				this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoSessionBean=new ProvisionEmpleadoSessionBean();
			}

			this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoSessionBean.setsPathNavegacionActual(defiprovisionempleadoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupProvisionEmpleado=this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeProvisionEmpleado(true);
			this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeProvisionEmpleado(DefiProvisionEmpleadoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoSessionBean.setisBusquedaDesdeForeignKeySesionDefiProvisionEmpleado(true);
			this.jInternalFrameDetalleFormDefiProvisionEmpleado.provisionempleadoSessionBean.setlidDefiProvisionEmpleadoActual(this.idDefiProvisionEmpleadoActual);

			defiprovisionempleadoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyDefiProvisionEmpleado(true);
			defiprovisionempleadoSessionBean.setlIdDefiProvisionEmpleadoActualForeignKey(this.idDefiProvisionEmpleadoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionDefiProvisionEmpleadoParaCuotas() throws Exception {
		Boolean isPaginaPopupCuota=false;

		try {

			if(this.defiprovisionempleadoSessionBean==null) {
				this.defiprovisionempleadoSessionBean=new DefiProvisionEmpleadoSessionBean();
			}

			if(this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaSessionBean==null) {
				this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaSessionBean=new CuotaSessionBean();
			}

			this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaSessionBean.setsPathNavegacionActual(defiprovisionempleadoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+CuotaConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupCuota=this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCuota(true);
			this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCuota(DefiProvisionEmpleadoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaSessionBean.setisBusquedaDesdeForeignKeySesionDefiProvisionEmpleado(true);
			this.jInternalFrameDetalleFormDefiProvisionEmpleado.cuotaSessionBean.setlidDefiProvisionEmpleadoActual(this.idDefiProvisionEmpleadoActual);

			defiprovisionempleadoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyDefiProvisionEmpleado(true);
			defiprovisionempleadoSessionBean.setlIdDefiProvisionEmpleadoActualForeignKey(this.idDefiProvisionEmpleadoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//DefiProvisionEmpleadoSessionBean defiprovisionempleadoSessionBean=new DefiProvisionEmpleadoSessionBean();
		
		if(this.defiprovisionempleadoSessionBean==null) {
			this.defiprovisionempleadoSessionBean=new DefiProvisionEmpleadoSessionBean();
		}
		
		this.defiprovisionempleadoSessionBean.setsUltimaBusquedaDefiProvisionEmpleado(this.getsAccionBusqueda());
		this.defiprovisionempleadoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.defiprovisionempleadoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			defiprovisionempleadoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdFormato")) {
			defiprovisionempleadoSessionBean.setid_formato(this.getid_formatoFK_IdFormato());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdMesFinal")) {
			defiprovisionempleadoSessionBean.setid_mes_final(this.getid_mes_finalFK_IdMesFinal());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdMesInicial")) {
			defiprovisionempleadoSessionBean.setid_mes_inicial(this.getid_mes_inicialFK_IdMesInicial());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdRubroEmplea")) {
			defiprovisionempleadoSessionBean.setid_rubro_emplea(this.getid_rubro_empleaFK_IdRubroEmplea());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//DefiProvisionEmpleadoSessionBean defiprovisionempleadoSessionBean=new DefiProvisionEmpleadoSessionBean();
		
		if(this.defiprovisionempleadoSessionBean==null) {
			this.defiprovisionempleadoSessionBean=new DefiProvisionEmpleadoSessionBean();
		}
		
		if(this.defiprovisionempleadoSessionBean.getsUltimaBusquedaDefiProvisionEmpleado()!=null&&!this.defiprovisionempleadoSessionBean.getsUltimaBusquedaDefiProvisionEmpleado().equals("")) {
			this.setsAccionBusqueda(defiprovisionempleadoSessionBean.getsUltimaBusquedaDefiProvisionEmpleado());
			this.setiNumeroPaginacion(defiprovisionempleadoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(defiprovisionempleadoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(defiprovisionempleadoSessionBean.getid_empresa());
				defiprovisionempleadoSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdFormato")) {
				this.setid_formatoFK_IdFormato(defiprovisionempleadoSessionBean.getid_formato());
				defiprovisionempleadoSessionBean.setid_formato(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdMesFinal")) {
				this.setid_mes_finalFK_IdMesFinal(defiprovisionempleadoSessionBean.getid_mes_final());
				defiprovisionempleadoSessionBean.setid_mes_final(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdMesInicial")) {
				this.setid_mes_inicialFK_IdMesInicial(defiprovisionempleadoSessionBean.getid_mes_inicial());
				defiprovisionempleadoSessionBean.setid_mes_inicial(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdRubroEmplea")) {
				this.setid_rubro_empleaFK_IdRubroEmplea(defiprovisionempleadoSessionBean.getid_rubro_emplea());
				defiprovisionempleadoSessionBean.setid_rubro_emplea(-1L);
			}
		}
		
		this.defiprovisionempleadoSessionBean.setsUltimaBusquedaDefiProvisionEmpleado("");
		this.defiprovisionempleadoSessionBean.setiNumeroPaginacion(DefiProvisionEmpleadoConstantesFunciones.INUMEROPAGINACION);
		this.defiprovisionempleadoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaDefiProvisionEmpleado(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioDefiProvisionEmpleado() {
		this.updateBorderResaltarBusquedasFormularioDefiProvisionEmpleado();
		this.updateVisibilidadBusquedasFormularioDefiProvisionEmpleado();
		this.updateHabilitarBusquedasFormularioDefiProvisionEmpleado();
	}
	
	public void updateBorderResaltarBusquedasFormularioDefiProvisionEmpleado() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasDefiProvisionEmpleado.getComponents().length>0) {
	

		if(this.defiprovisionempleadoConstantesFunciones.resaltarFK_IdFormatoDefiProvisionEmpleado!=null) {
			index= this.jTabbedPaneBusquedasDefiProvisionEmpleado.indexOfComponent(this.jPanelFK_IdFormatoDefiProvisionEmpleado);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDefiProvisionEmpleado.getComponent(index);
				jPanel.setBorder(this.defiprovisionempleadoConstantesFunciones.resaltarFK_IdFormatoDefiProvisionEmpleado);
			}
		}

		if(this.defiprovisionempleadoConstantesFunciones.resaltarFK_IdMesFinalDefiProvisionEmpleado!=null) {
			index= this.jTabbedPaneBusquedasDefiProvisionEmpleado.indexOfComponent(this.jPanelFK_IdMesFinalDefiProvisionEmpleado);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDefiProvisionEmpleado.getComponent(index);
				jPanel.setBorder(this.defiprovisionempleadoConstantesFunciones.resaltarFK_IdMesFinalDefiProvisionEmpleado);
			}
		}

		if(this.defiprovisionempleadoConstantesFunciones.resaltarFK_IdMesInicialDefiProvisionEmpleado!=null) {
			index= this.jTabbedPaneBusquedasDefiProvisionEmpleado.indexOfComponent(this.jPanelFK_IdMesInicialDefiProvisionEmpleado);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDefiProvisionEmpleado.getComponent(index);
				jPanel.setBorder(this.defiprovisionempleadoConstantesFunciones.resaltarFK_IdMesInicialDefiProvisionEmpleado);
			}
		}

		if(this.defiprovisionempleadoConstantesFunciones.resaltarFK_IdRubroEmpleaDefiProvisionEmpleado!=null) {
			index= this.jTabbedPaneBusquedasDefiProvisionEmpleado.indexOfComponent(this.jPanelFK_IdRubroEmpleaDefiProvisionEmpleado);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDefiProvisionEmpleado.getComponent(index);
				jPanel.setBorder(this.defiprovisionempleadoConstantesFunciones.resaltarFK_IdRubroEmpleaDefiProvisionEmpleado);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioDefiProvisionEmpleado() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasDefiProvisionEmpleado.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasDefiProvisionEmpleado.indexOfComponent(this.jPanelFK_IdFormatoDefiProvisionEmpleado);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDefiProvisionEmpleado.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.defiprovisionempleadoConstantesFunciones.mostrarFK_IdFormatoDefiProvisionEmpleado);
			if(!this.defiprovisionempleadoConstantesFunciones.mostrarFK_IdFormatoDefiProvisionEmpleado && index>-1) {
				this.jTabbedPaneBusquedasDefiProvisionEmpleado.remove(index);
			}

			index= this.jTabbedPaneBusquedasDefiProvisionEmpleado.indexOfComponent(this.jPanelFK_IdMesFinalDefiProvisionEmpleado);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDefiProvisionEmpleado.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.defiprovisionempleadoConstantesFunciones.mostrarFK_IdMesFinalDefiProvisionEmpleado);
			if(!this.defiprovisionempleadoConstantesFunciones.mostrarFK_IdMesFinalDefiProvisionEmpleado && index>-1) {
				this.jTabbedPaneBusquedasDefiProvisionEmpleado.remove(index);
			}

			index= this.jTabbedPaneBusquedasDefiProvisionEmpleado.indexOfComponent(this.jPanelFK_IdMesInicialDefiProvisionEmpleado);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDefiProvisionEmpleado.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.defiprovisionempleadoConstantesFunciones.mostrarFK_IdMesInicialDefiProvisionEmpleado);
			if(!this.defiprovisionempleadoConstantesFunciones.mostrarFK_IdMesInicialDefiProvisionEmpleado && index>-1) {
				this.jTabbedPaneBusquedasDefiProvisionEmpleado.remove(index);
			}

			index= this.jTabbedPaneBusquedasDefiProvisionEmpleado.indexOfComponent(this.jPanelFK_IdRubroEmpleaDefiProvisionEmpleado);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDefiProvisionEmpleado.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.defiprovisionempleadoConstantesFunciones.mostrarFK_IdRubroEmpleaDefiProvisionEmpleado);
			if(!this.defiprovisionempleadoConstantesFunciones.mostrarFK_IdRubroEmpleaDefiProvisionEmpleado && index>-1) {
				this.jTabbedPaneBusquedasDefiProvisionEmpleado.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioDefiProvisionEmpleado() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasDefiProvisionEmpleado.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasDefiProvisionEmpleado.indexOfComponent(this.jPanelFK_IdFormatoDefiProvisionEmpleado);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDefiProvisionEmpleado.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.defiprovisionempleadoConstantesFunciones.activarFK_IdFormatoDefiProvisionEmpleado);
				this.jTabbedPaneBusquedasDefiProvisionEmpleado.setEnabledAt(index,this.defiprovisionempleadoConstantesFunciones.activarFK_IdFormatoDefiProvisionEmpleado);
			}

			index= this.jTabbedPaneBusquedasDefiProvisionEmpleado.indexOfComponent(this.jPanelFK_IdMesFinalDefiProvisionEmpleado);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDefiProvisionEmpleado.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.defiprovisionempleadoConstantesFunciones.activarFK_IdMesFinalDefiProvisionEmpleado);
				this.jTabbedPaneBusquedasDefiProvisionEmpleado.setEnabledAt(index,this.defiprovisionempleadoConstantesFunciones.activarFK_IdMesFinalDefiProvisionEmpleado);
			}

			index= this.jTabbedPaneBusquedasDefiProvisionEmpleado.indexOfComponent(this.jPanelFK_IdMesInicialDefiProvisionEmpleado);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDefiProvisionEmpleado.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.defiprovisionempleadoConstantesFunciones.activarFK_IdMesInicialDefiProvisionEmpleado);
				this.jTabbedPaneBusquedasDefiProvisionEmpleado.setEnabledAt(index,this.defiprovisionempleadoConstantesFunciones.activarFK_IdMesInicialDefiProvisionEmpleado);
			}

			index= this.jTabbedPaneBusquedasDefiProvisionEmpleado.indexOfComponent(this.jPanelFK_IdRubroEmpleaDefiProvisionEmpleado);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDefiProvisionEmpleado.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.defiprovisionempleadoConstantesFunciones.activarFK_IdRubroEmpleaDefiProvisionEmpleado);
				this.jTabbedPaneBusquedasDefiProvisionEmpleado.setEnabledAt(index,this.defiprovisionempleadoConstantesFunciones.activarFK_IdRubroEmpleaDefiProvisionEmpleado);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaDefiProvisionEmpleado(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdFormato")) {
			index= this.jTabbedPaneBusquedasDefiProvisionEmpleado.indexOfComponent(this.jPanelFK_IdFormatoDefiProvisionEmpleado);

			this.jTabbedPaneBusquedasDefiProvisionEmpleado.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDefiProvisionEmpleado.getComponent(index);

			this.defiprovisionempleadoConstantesFunciones.setResaltarFK_IdFormatoDefiProvisionEmpleado(resaltar);

			jPanel.setBorder(this.defiprovisionempleadoConstantesFunciones.resaltarFK_IdFormatoDefiProvisionEmpleado);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdMesFinal")) {
			index= this.jTabbedPaneBusquedasDefiProvisionEmpleado.indexOfComponent(this.jPanelFK_IdMesFinalDefiProvisionEmpleado);

			this.jTabbedPaneBusquedasDefiProvisionEmpleado.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDefiProvisionEmpleado.getComponent(index);

			this.defiprovisionempleadoConstantesFunciones.setResaltarFK_IdMesFinalDefiProvisionEmpleado(resaltar);

			jPanel.setBorder(this.defiprovisionempleadoConstantesFunciones.resaltarFK_IdMesFinalDefiProvisionEmpleado);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdMesInicial")) {
			index= this.jTabbedPaneBusquedasDefiProvisionEmpleado.indexOfComponent(this.jPanelFK_IdMesInicialDefiProvisionEmpleado);

			this.jTabbedPaneBusquedasDefiProvisionEmpleado.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDefiProvisionEmpleado.getComponent(index);

			this.defiprovisionempleadoConstantesFunciones.setResaltarFK_IdMesInicialDefiProvisionEmpleado(resaltar);

			jPanel.setBorder(this.defiprovisionempleadoConstantesFunciones.resaltarFK_IdMesInicialDefiProvisionEmpleado);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdRubroEmplea")) {
			index= this.jTabbedPaneBusquedasDefiProvisionEmpleado.indexOfComponent(this.jPanelFK_IdRubroEmpleaDefiProvisionEmpleado);

			this.jTabbedPaneBusquedasDefiProvisionEmpleado.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDefiProvisionEmpleado.getComponent(index);

			this.defiprovisionempleadoConstantesFunciones.setResaltarFK_IdRubroEmpleaDefiProvisionEmpleado(resaltar);

			jPanel.setBorder(this.defiprovisionempleadoConstantesFunciones.resaltarFK_IdRubroEmpleaDefiProvisionEmpleado);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarDefiProvisionEmpleado.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioDefiProvisionEmpleado() throws Exception {

		if(this.jInternalFrameDetalleFormDefiProvisionEmpleado==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioDefiProvisionEmpleado();
		this.updateVisibilidadResaltarControlesFormularioDefiProvisionEmpleado();
		this.updateHabilitarResaltarControlesFormularioDefiProvisionEmpleado();
		
	}
	
	public void updateBorderResaltarControlesFormularioDefiProvisionEmpleado() throws Exception {
		if(this.jInternalFrameDetalleFormDefiProvisionEmpleado==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.defiprovisionempleadoConstantesFunciones.resaltaridDefiProvisionEmpleado!=null && this.jInternalFrameDetalleFormDefiProvisionEmpleado!=null) {this.jInternalFrameDetalleFormDefiProvisionEmpleado.jLabelidDefiProvisionEmpleado.setBorder(this.defiprovisionempleadoConstantesFunciones.resaltaridDefiProvisionEmpleado);}
		if(this.defiprovisionempleadoConstantesFunciones.resaltarid_empresaDefiProvisionEmpleado!=null && this.jInternalFrameDetalleFormDefiProvisionEmpleado!=null) {this.jInternalFrameDetalleFormDefiProvisionEmpleado.jComboBoxid_empresaDefiProvisionEmpleado.setBorder(this.defiprovisionempleadoConstantesFunciones.resaltarid_empresaDefiProvisionEmpleado);}
		if(this.defiprovisionempleadoConstantesFunciones.resaltarid_rubro_empleaDefiProvisionEmpleado!=null && this.jInternalFrameDetalleFormDefiProvisionEmpleado!=null) {this.jInternalFrameDetalleFormDefiProvisionEmpleado.jComboBoxid_rubro_empleaDefiProvisionEmpleado.setBorder(this.defiprovisionempleadoConstantesFunciones.resaltarid_rubro_empleaDefiProvisionEmpleado);}
		if(this.defiprovisionempleadoConstantesFunciones.resaltarid_formatoDefiProvisionEmpleado!=null && this.jInternalFrameDetalleFormDefiProvisionEmpleado!=null) {this.jInternalFrameDetalleFormDefiProvisionEmpleado.jComboBoxid_formatoDefiProvisionEmpleado.setBorder(this.defiprovisionempleadoConstantesFunciones.resaltarid_formatoDefiProvisionEmpleado);}
		if(this.defiprovisionempleadoConstantesFunciones.resaltarnombreDefiProvisionEmpleado!=null && this.jInternalFrameDetalleFormDefiProvisionEmpleado!=null) {this.jInternalFrameDetalleFormDefiProvisionEmpleado.jTextAreanombreDefiProvisionEmpleado.setBorder(this.defiprovisionempleadoConstantesFunciones.resaltarnombreDefiProvisionEmpleado);}
		if(this.defiprovisionempleadoConstantesFunciones.resaltardia_inicialDefiProvisionEmpleado!=null && this.jInternalFrameDetalleFormDefiProvisionEmpleado!=null) {this.jInternalFrameDetalleFormDefiProvisionEmpleado.jTextFielddia_inicialDefiProvisionEmpleado.setBorder(this.defiprovisionempleadoConstantesFunciones.resaltardia_inicialDefiProvisionEmpleado);}
		if(this.defiprovisionempleadoConstantesFunciones.resaltarid_mes_inicialDefiProvisionEmpleado!=null && this.jInternalFrameDetalleFormDefiProvisionEmpleado!=null) {this.jInternalFrameDetalleFormDefiProvisionEmpleado.jComboBoxid_mes_inicialDefiProvisionEmpleado.setBorder(this.defiprovisionempleadoConstantesFunciones.resaltarid_mes_inicialDefiProvisionEmpleado);}
		if(this.defiprovisionempleadoConstantesFunciones.resaltardia_finalDefiProvisionEmpleado!=null && this.jInternalFrameDetalleFormDefiProvisionEmpleado!=null) {this.jInternalFrameDetalleFormDefiProvisionEmpleado.jTextFielddia_finalDefiProvisionEmpleado.setBorder(this.defiprovisionempleadoConstantesFunciones.resaltardia_finalDefiProvisionEmpleado);}
		if(this.defiprovisionempleadoConstantesFunciones.resaltarid_mes_finalDefiProvisionEmpleado!=null && this.jInternalFrameDetalleFormDefiProvisionEmpleado!=null) {this.jInternalFrameDetalleFormDefiProvisionEmpleado.jComboBoxid_mes_finalDefiProvisionEmpleado.setBorder(this.defiprovisionempleadoConstantesFunciones.resaltarid_mes_finalDefiProvisionEmpleado);}
		if(this.defiprovisionempleadoConstantesFunciones.resaltarpara_liquidacionDefiProvisionEmpleado!=null && this.jInternalFrameDetalleFormDefiProvisionEmpleado!=null) {this.jInternalFrameDetalleFormDefiProvisionEmpleado.jCheckBoxpara_liquidacionDefiProvisionEmpleado.setBorderPainted(true);this.jInternalFrameDetalleFormDefiProvisionEmpleado.jCheckBoxpara_liquidacionDefiProvisionEmpleado.setBorder(this.defiprovisionempleadoConstantesFunciones.resaltarpara_liquidacionDefiProvisionEmpleado);}
		if(this.defiprovisionempleadoConstantesFunciones.resaltardescripcionDefiProvisionEmpleado!=null && this.jInternalFrameDetalleFormDefiProvisionEmpleado!=null) {this.jInternalFrameDetalleFormDefiProvisionEmpleado.jTextAreadescripcionDefiProvisionEmpleado.setBorder(this.defiprovisionempleadoConstantesFunciones.resaltardescripcionDefiProvisionEmpleado);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioDefiProvisionEmpleado() throws Exception {		
		if(this.jInternalFrameDetalleFormDefiProvisionEmpleado==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDefiProvisionEmpleado!=null) {
	
		//this.jInternalFrameDetalleFormDefiProvisionEmpleado.jLabelidDefiProvisionEmpleado.setVisible(this.defiprovisionempleadoConstantesFunciones.mostraridDefiProvisionEmpleado);
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jPanelidDefiProvisionEmpleado.setVisible(this.defiprovisionempleadoConstantesFunciones.mostraridDefiProvisionEmpleado);
		//this.jInternalFrameDetalleFormDefiProvisionEmpleado.jComboBoxid_empresaDefiProvisionEmpleado.setVisible(this.defiprovisionempleadoConstantesFunciones.mostrarid_empresaDefiProvisionEmpleado);
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jPanelid_empresaDefiProvisionEmpleado.setVisible(this.defiprovisionempleadoConstantesFunciones.mostrarid_empresaDefiProvisionEmpleado);
		//this.jInternalFrameDetalleFormDefiProvisionEmpleado.jComboBoxid_rubro_empleaDefiProvisionEmpleado.setVisible(this.defiprovisionempleadoConstantesFunciones.mostrarid_rubro_empleaDefiProvisionEmpleado);
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jPanelid_rubro_empleaDefiProvisionEmpleado.setVisible(this.defiprovisionempleadoConstantesFunciones.mostrarid_rubro_empleaDefiProvisionEmpleado);
		//this.jInternalFrameDetalleFormDefiProvisionEmpleado.jComboBoxid_formatoDefiProvisionEmpleado.setVisible(this.defiprovisionempleadoConstantesFunciones.mostrarid_formatoDefiProvisionEmpleado);
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jPanelid_formatoDefiProvisionEmpleado.setVisible(this.defiprovisionempleadoConstantesFunciones.mostrarid_formatoDefiProvisionEmpleado);
		//this.jInternalFrameDetalleFormDefiProvisionEmpleado.jTextAreanombreDefiProvisionEmpleado.setVisible(this.defiprovisionempleadoConstantesFunciones.mostrarnombreDefiProvisionEmpleado);
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jPanelnombreDefiProvisionEmpleado.setVisible(this.defiprovisionempleadoConstantesFunciones.mostrarnombreDefiProvisionEmpleado);
		//this.jInternalFrameDetalleFormDefiProvisionEmpleado.jTextFielddia_inicialDefiProvisionEmpleado.setVisible(this.defiprovisionempleadoConstantesFunciones.mostrardia_inicialDefiProvisionEmpleado);
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jPaneldia_inicialDefiProvisionEmpleado.setVisible(this.defiprovisionempleadoConstantesFunciones.mostrardia_inicialDefiProvisionEmpleado);
		//this.jInternalFrameDetalleFormDefiProvisionEmpleado.jComboBoxid_mes_inicialDefiProvisionEmpleado.setVisible(this.defiprovisionempleadoConstantesFunciones.mostrarid_mes_inicialDefiProvisionEmpleado);
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jPanelid_mes_inicialDefiProvisionEmpleado.setVisible(this.defiprovisionempleadoConstantesFunciones.mostrarid_mes_inicialDefiProvisionEmpleado);
		//this.jInternalFrameDetalleFormDefiProvisionEmpleado.jTextFielddia_finalDefiProvisionEmpleado.setVisible(this.defiprovisionempleadoConstantesFunciones.mostrardia_finalDefiProvisionEmpleado);
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jPaneldia_finalDefiProvisionEmpleado.setVisible(this.defiprovisionempleadoConstantesFunciones.mostrardia_finalDefiProvisionEmpleado);
		//this.jInternalFrameDetalleFormDefiProvisionEmpleado.jComboBoxid_mes_finalDefiProvisionEmpleado.setVisible(this.defiprovisionempleadoConstantesFunciones.mostrarid_mes_finalDefiProvisionEmpleado);
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jPanelid_mes_finalDefiProvisionEmpleado.setVisible(this.defiprovisionempleadoConstantesFunciones.mostrarid_mes_finalDefiProvisionEmpleado);
		//this.jInternalFrameDetalleFormDefiProvisionEmpleado.jCheckBoxpara_liquidacionDefiProvisionEmpleado.setVisible(this.defiprovisionempleadoConstantesFunciones.mostrarpara_liquidacionDefiProvisionEmpleado);
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jPanelpara_liquidacionDefiProvisionEmpleado.setVisible(this.defiprovisionempleadoConstantesFunciones.mostrarpara_liquidacionDefiProvisionEmpleado);
		//this.jInternalFrameDetalleFormDefiProvisionEmpleado.jTextAreadescripcionDefiProvisionEmpleado.setVisible(this.defiprovisionempleadoConstantesFunciones.mostrardescripcionDefiProvisionEmpleado);
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jPaneldescripcionDefiProvisionEmpleado.setVisible(this.defiprovisionempleadoConstantesFunciones.mostrardescripcionDefiProvisionEmpleado);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioDefiProvisionEmpleado() throws Exception {
		if(this.jInternalFrameDetalleFormDefiProvisionEmpleado==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDefiProvisionEmpleado!=null) {
	
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jLabelidDefiProvisionEmpleado.setEnabled(this.defiprovisionempleadoConstantesFunciones.activaridDefiProvisionEmpleado);
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jComboBoxid_empresaDefiProvisionEmpleado.setEnabled(this.defiprovisionempleadoConstantesFunciones.activarid_empresaDefiProvisionEmpleado);
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jComboBoxid_rubro_empleaDefiProvisionEmpleado.setEnabled(this.defiprovisionempleadoConstantesFunciones.activarid_rubro_empleaDefiProvisionEmpleado);
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jComboBoxid_formatoDefiProvisionEmpleado.setEnabled(this.defiprovisionempleadoConstantesFunciones.activarid_formatoDefiProvisionEmpleado);
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jTextAreanombreDefiProvisionEmpleado.setEnabled(this.defiprovisionempleadoConstantesFunciones.activarnombreDefiProvisionEmpleado);
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jTextFielddia_inicialDefiProvisionEmpleado.setEnabled(this.defiprovisionempleadoConstantesFunciones.activardia_inicialDefiProvisionEmpleado);
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jComboBoxid_mes_inicialDefiProvisionEmpleado.setEnabled(this.defiprovisionempleadoConstantesFunciones.activarid_mes_inicialDefiProvisionEmpleado);
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jTextFielddia_finalDefiProvisionEmpleado.setEnabled(this.defiprovisionempleadoConstantesFunciones.activardia_finalDefiProvisionEmpleado);
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jComboBoxid_mes_finalDefiProvisionEmpleado.setEnabled(this.defiprovisionempleadoConstantesFunciones.activarid_mes_finalDefiProvisionEmpleado);
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jCheckBoxpara_liquidacionDefiProvisionEmpleado.setEnabled(this.defiprovisionempleadoConstantesFunciones.activarpara_liquidacionDefiProvisionEmpleado);
		this.jInternalFrameDetalleFormDefiProvisionEmpleado.jTextAreadescripcionDefiProvisionEmpleado.setEnabled(this.defiprovisionempleadoConstantesFunciones.activardescripcionDefiProvisionEmpleado);
		}
	}
	
		
}