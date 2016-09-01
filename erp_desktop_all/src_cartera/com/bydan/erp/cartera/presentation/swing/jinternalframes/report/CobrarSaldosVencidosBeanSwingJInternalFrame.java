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
package com.bydan.erp.cartera.presentation.swing.jinternalframes.report;




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

//import com.bydan.erp.cartera.util.CobrarSaldosVencidosConstantesFunciones;
import com.bydan.erp.cartera.util.report.CobrarSaldosVencidosParameterReturnGeneral;
//import com.bydan.erp.cartera.util.report.CobrarSaldosVencidosParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.report.CobrarSaldosVencidosBean;
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

import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.report.*;
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
import com.bydan.erp.cartera.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.cartera.util.*;

import com.bydan.erp.cartera.util.report.*;
import com.bydan.erp.cartera.business.logic.report.*;

import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.cartera.business.entity.report.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
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

//import org.hibernate.collection.PersistentBag;

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


import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.report.*;

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


import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class CobrarSaldosVencidosBeanSwingJInternalFrame extends CobrarSaldosVencidosJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(CobrarSaldosVencidosBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<CobrarSaldosVencidos> cobrarsaldosvencidosValidator = new ClassValidator<CobrarSaldosVencidos>(CobrarSaldosVencidos.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public CobrarSaldosVencidos cobrarsaldosvencidos;	
	public CobrarSaldosVencidos cobrarsaldosvencidosAux;
	public CobrarSaldosVencidos cobrarsaldosvencidosAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public CobrarSaldosVencidos cobrarsaldosvencidosTotales;
	public Long idCobrarSaldosVencidosActual;
	public Long iIdNuevoCobrarSaldosVencidos=0L;
	public int rowIndexActual=0;
	
	
	
	
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
	
	public Boolean isPermisoTodoCobrarSaldosVencidos;
	public Boolean isPermisoNuevoCobrarSaldosVencidos;
	public Boolean isPermisoActualizarCobrarSaldosVencidos;
	public Boolean isPermisoActualizarOriginalCobrarSaldosVencidos;
	public Boolean isPermisoEliminarCobrarSaldosVencidos;
	public Boolean isPermisoGuardarCambiosCobrarSaldosVencidos;
	public Boolean isPermisoConsultaCobrarSaldosVencidos;
	public Boolean isPermisoBusquedaCobrarSaldosVencidos;
	public Boolean isPermisoReporteCobrarSaldosVencidos;
	public Boolean isPermisoPaginacionMedioCobrarSaldosVencidos;
	public Boolean isPermisoPaginacionAltoCobrarSaldosVencidos;
	public Boolean isPermisoPaginacionTodoCobrarSaldosVencidos;
	public Boolean isPermisoCopiarCobrarSaldosVencidos;
	public Boolean isPermisoVerFormCobrarSaldosVencidos;
	public Boolean isPermisoDuplicarCobrarSaldosVencidos;
	public Boolean isPermisoOrdenCobrarSaldosVencidos;
	
	
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
	
	public CobrarSaldosVencidosParameterReturnGeneral cobrarsaldosvencidosReturnGeneral;
	public CobrarSaldosVencidosParameterReturnGeneral cobrarsaldosvencidosParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoCobrarSaldosVencidos=false;
	public Boolean esParaAccionDesdeFormularioCobrarSaldosVencidos=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected CobrarSaldosVencidosSessionBeanAdditional cobrarsaldosvencidosSessionBeanAdditional=null;
	
	public CobrarSaldosVencidosSessionBeanAdditional getCobrarSaldosVencidosSessionBeanAdditional() {
		return this.cobrarsaldosvencidosSessionBeanAdditional;
	}
	
	public void setCobrarSaldosVencidosSessionBeanAdditional(CobrarSaldosVencidosSessionBeanAdditional cobrarsaldosvencidosSessionBeanAdditional) {
		try {
			this.cobrarsaldosvencidosSessionBeanAdditional=cobrarsaldosvencidosSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected CobrarSaldosVencidosBeanSwingJInternalFrameAdditional cobrarsaldosvencidosBeanSwingJInternalFrameAdditional=null;
	//public class CobrarSaldosVencidosBeanSwingJInternalFrame
	
	public CobrarSaldosVencidosBeanSwingJInternalFrameAdditional getCobrarSaldosVencidosBeanSwingJInternalFrameAdditional() {
		return this.cobrarsaldosvencidosBeanSwingJInternalFrameAdditional;
	}
	
	public void setCobrarSaldosVencidosBeanSwingJInternalFrameAdditional(CobrarSaldosVencidosBeanSwingJInternalFrameAdditional cobrarsaldosvencidosBeanSwingJInternalFrameAdditional) {
		try {
			this.cobrarsaldosvencidosBeanSwingJInternalFrameAdditional=cobrarsaldosvencidosBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public CobrarSaldosVencidosLogic cobrarsaldosvencidosLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public CobrarSaldosVencidos cobrarsaldosvencidosBean;
	public CobrarSaldosVencidosConstantesFunciones cobrarsaldosvencidosConstantesFunciones;
	//public CobrarSaldosVencidosParameterReturnGeneral cobrarsaldosvencidosReturnGeneral;
	
	//FK
	
	public GrupoClienteLogic grupoclienteLogic;
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<CobrarSaldosVencidos> cobrarsaldosvencidoss;	
	//public List<CobrarSaldosVencidos> cobrarsaldosvencidossEliminados;
	//public List<CobrarSaldosVencidos> cobrarsaldosvencidossAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoCobrarSaldosVencidos=false;
	public Boolean isVisibilidadCeldaDuplicarCobrarSaldosVencidos=true;
	public Boolean isVisibilidadCeldaCopiarCobrarSaldosVencidos=true;
	public Boolean isVisibilidadCeldaVerFormCobrarSaldosVencidos=true;
	public Boolean isVisibilidadCeldaOrdenCobrarSaldosVencidos=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesCobrarSaldosVencidos=false;
	public Boolean isVisibilidadCeldaModificarCobrarSaldosVencidos=false;
	public Boolean isVisibilidadCeldaActualizarCobrarSaldosVencidos=false;
	public Boolean isVisibilidadCeldaEliminarCobrarSaldosVencidos=false;
	public Boolean isVisibilidadCeldaCancelarCobrarSaldosVencidos=false;
	public Boolean isVisibilidadCeldaGuardarCobrarSaldosVencidos=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosCobrarSaldosVencidos=false;	
	
	
	public Boolean isVisibilidadBusquedaCobrarSaldosVencidos=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdGrupoCliente=false;
	
	public Long getiIdNuevoCobrarSaldosVencidos() {
		return this.iIdNuevoCobrarSaldosVencidos;
	}

	public void setiIdNuevoCobrarSaldosVencidos(Long iIdNuevoCobrarSaldosVencidos) {
		this.iIdNuevoCobrarSaldosVencidos = iIdNuevoCobrarSaldosVencidos;
	}
	
	public Long getidCobrarSaldosVencidosActual() {
		return this.idCobrarSaldosVencidosActual;
	}

	public void setidCobrarSaldosVencidosActual(Long idCobrarSaldosVencidosActual) {
		this.idCobrarSaldosVencidosActual = idCobrarSaldosVencidosActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public CobrarSaldosVencidos getcobrarsaldosvencidos() {
		return this.cobrarsaldosvencidos;
	}

	public void setcobrarsaldosvencidos(CobrarSaldosVencidos cobrarsaldosvencidos) {
		this.cobrarsaldosvencidos = cobrarsaldosvencidos;
	}
	
	public CobrarSaldosVencidos getcobrarsaldosvencidosAux() {
		return this.cobrarsaldosvencidosAux;
	}

	public void setcobrarsaldosvencidosAux(CobrarSaldosVencidos cobrarsaldosvencidosAux) {
		this.cobrarsaldosvencidosAux = cobrarsaldosvencidosAux;
	}				
	
	public CobrarSaldosVencidos getcobrarsaldosvencidosAnterior() {
		return this.cobrarsaldosvencidosAnterior;
	}

	public void setcobrarsaldosvencidosAnterior(CobrarSaldosVencidos cobrarsaldosvencidosAnterior) {
		this.cobrarsaldosvencidosAnterior = cobrarsaldosvencidosAnterior;
	}	
	
	public CobrarSaldosVencidos getcobrarsaldosvencidosTotales() {
		return this.cobrarsaldosvencidosTotales;
	}

	public void setcobrarsaldosvencidosTotales(CobrarSaldosVencidos cobrarsaldosvencidosTotales) {
		this.cobrarsaldosvencidosTotales = cobrarsaldosvencidosTotales;
	}	
	
	public CobrarSaldosVencidos getcobrarsaldosvencidosBean() {
		return this.cobrarsaldosvencidosBean;
	}

	public void setcobrarsaldosvencidosBean(CobrarSaldosVencidos cobrarsaldosvencidosBean) {
		this.cobrarsaldosvencidosBean = cobrarsaldosvencidosBean;
	}	
	
	public CobrarSaldosVencidosParameterReturnGeneral getcobrarsaldosvencidosReturnGeneral() {
		return this.cobrarsaldosvencidosReturnGeneral;
	}

	public void setcobrarsaldosvencidosReturnGeneral(CobrarSaldosVencidosParameterReturnGeneral cobrarsaldosvencidosReturnGeneral) {
		this.cobrarsaldosvencidosReturnGeneral = cobrarsaldosvencidosReturnGeneral;
	}	
	
	
	public Long id_grupo_clienteBusquedaCobrarSaldosVencidos=-1L;

	public Long getid_grupo_clienteBusquedaCobrarSaldosVencidos() {
		return this.id_grupo_clienteBusquedaCobrarSaldosVencidos;
	}

	public void setid_grupo_clienteBusquedaCobrarSaldosVencidos(Long id_grupo_clienteBusquedaCobrarSaldosVencidos) {
		this.id_grupo_clienteBusquedaCobrarSaldosVencidos = id_grupo_clienteBusquedaCobrarSaldosVencidos;
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

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public CobrarSaldosVencidosLogic getCobrarSaldosVencidosLogic()	{		
		return cobrarsaldosvencidosLogic;
	}

	public void setCobrarSaldosVencidosLogic(CobrarSaldosVencidosLogic cobrarsaldosvencidosLogic) {
		this.cobrarsaldosvencidosLogic = cobrarsaldosvencidosLogic;
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
	
	public Boolean getIsEsNuevoCobrarSaldosVencidos() {
		return isEsNuevoCobrarSaldosVencidos;
	}

	public void setIsEsNuevoCobrarSaldosVencidos(Boolean isEsNuevoCobrarSaldosVencidos) {
		this.isEsNuevoCobrarSaldosVencidos = isEsNuevoCobrarSaldosVencidos;
	}

	public Boolean getEsParaAccionDesdeFormularioCobrarSaldosVencidos() {
		return esParaAccionDesdeFormularioCobrarSaldosVencidos;
	}
	
	public void setEsParaAccionDesdeFormularioCobrarSaldosVencidos(Boolean esParaAccionDesdeFormularioCobrarSaldosVencidos) {
		this.esParaAccionDesdeFormularioCobrarSaldosVencidos = esParaAccionDesdeFormularioCobrarSaldosVencidos;
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

			grupoclienteLogic.getGrupoClienteDataAccess().setIsForForeingKeyData(true);

			if(this.cobrarsaldosvencidosSessionBean==null) {
				this.cobrarsaldosvencidosSessionBean=new CobrarSaldosVencidosSessionBean();
			}

			if(!this.cobrarsaldosvencidosSessionBean.getisBusquedaDesdeForeignKeySesionGrupoCliente()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					grupoclienteLogic.getGrupoClienteDataAccess().setIsForForeingKeyData(true);

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
					grupoclienteLogic.getEntityWithConnection(cobrarsaldosvencidosSessionBean.getlidGrupoClienteActual());
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

			if(this.cobrarsaldosvencidosSessionBean==null) {
				this.cobrarsaldosvencidosSessionBean=new CobrarSaldosVencidosSessionBean();
			}

			if(!this.cobrarsaldosvencidosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(cobrarsaldosvencidosSessionBean.getlidEmpresaActual());
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

					if(this.cobrarsaldosvencidos!=null) {
						this.cobrarsaldosvencidos.setGrupoCliente(grupoclienteTemp);
					}

					if(this.jInternalFrameDetalleFormCobrarSaldosVencidos!=null) {
						this.jInternalFrameDetalleFormCobrarSaldosVencidos.jComboBoxid_grupo_clienteCobrarSaldosVencidos.setSelectedItem(grupoclienteTemp);
					}
				} else {
					//jComboBoxid_grupo_clienteCobrarSaldosVencidos.setSelectedItem(grupoclienteTemp);
					if(this.jInternalFrameDetalleFormCobrarSaldosVencidos!=null) {
						if(this.jInternalFrameDetalleFormCobrarSaldosVencidos.jComboBoxid_grupo_clienteCobrarSaldosVencidos.getItemCount()>0) {
							this.jInternalFrameDetalleFormCobrarSaldosVencidos.jComboBoxid_grupo_clienteCobrarSaldosVencidos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaCobrarSaldosVencidos") || sFormularioTipoBusqueda.equals("Todos")){
					if(grupoclienteTemp!=null && jComboBoxid_grupo_clienteBusquedaCobrarSaldosVencidosCobrarSaldosVencidos!=null) {
						jComboBoxid_grupo_clienteBusquedaCobrarSaldosVencidosCobrarSaldosVencidos.setSelectedItem(grupoclienteTemp);
					} else {
						if(jComboBoxid_grupo_clienteBusquedaCobrarSaldosVencidosCobrarSaldosVencidos!=null) {
							//jComboBoxid_grupo_clienteBusquedaCobrarSaldosVencidosCobrarSaldosVencidos.setSelectedItem(grupoclienteTemp);
							if(jComboBoxid_grupo_clienteBusquedaCobrarSaldosVencidosCobrarSaldosVencidos.getItemCount()>0) {
								jComboBoxid_grupo_clienteBusquedaCobrarSaldosVencidosCobrarSaldosVencidos.setSelectedIndex(0);
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
	public void setActualGrupoClienteForeignKeyGenerico(Long idGrupoClienteSeleccionado,JComboBox jComboBoxid_grupo_clienteCobrarSaldosVencidosGenerico)throws Exception
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
				jComboBoxid_grupo_clienteCobrarSaldosVencidosGenerico.setSelectedItem(grupoclienteTemp);
			} else {
				if(jComboBoxid_grupo_clienteCobrarSaldosVencidosGenerico!=null && jComboBoxid_grupo_clienteCobrarSaldosVencidosGenerico.getItemCount()>0) {
					jComboBoxid_grupo_clienteCobrarSaldosVencidosGenerico.setSelectedIndex(0);
				}
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

					if(this.cobrarsaldosvencidos!=null) {
						this.cobrarsaldosvencidos.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormCobrarSaldosVencidos!=null) {
						this.jInternalFrameDetalleFormCobrarSaldosVencidos.jComboBoxid_empresaCobrarSaldosVencidos.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaCobrarSaldosVencidos.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormCobrarSaldosVencidos!=null) {
						if(this.jInternalFrameDetalleFormCobrarSaldosVencidos.jComboBoxid_empresaCobrarSaldosVencidos.getItemCount()>0) {
							this.jInternalFrameDetalleFormCobrarSaldosVencidos.jComboBoxid_empresaCobrarSaldosVencidos.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaCobrarSaldosVencidosGenerico)throws Exception
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
				jComboBoxid_empresaCobrarSaldosVencidosGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaCobrarSaldosVencidosGenerico!=null && jComboBoxid_empresaCobrarSaldosVencidosGenerico.getItemCount()>0) {
					jComboBoxid_empresaCobrarSaldosVencidosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarGrupoClienteForeignKey(CobrarSaldosVencidos cobrarsaldosvencidos,JComboBox jComboBoxid_grupo_clienteCobrarSaldosVencidosGenerico)throws Exception
	{
		try
		{
			GrupoCliente  grupoclienteAux=new GrupoCliente();

			if(jComboBoxid_grupo_clienteCobrarSaldosVencidosGenerico==null) {
				grupoclienteAux=(GrupoCliente)this.jInternalFrameDetalleFormCobrarSaldosVencidos.jComboBoxid_grupo_clienteCobrarSaldosVencidos.getSelectedItem();
			} else {
				grupoclienteAux=(GrupoCliente)jComboBoxid_grupo_clienteCobrarSaldosVencidosGenerico.getSelectedItem();
			}

			if(grupoclienteAux!=null && grupoclienteAux.getId()!=null) {
				cobrarsaldosvencidos.setid_grupo_cliente(grupoclienteAux.getId());
				cobrarsaldosvencidos.setgrupocliente_descripcion(CobrarSaldosVencidosConstantesFunciones.getGrupoClienteDescripcion(grupoclienteAux));
				cobrarsaldosvencidos.setGrupoCliente(grupoclienteAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(CobrarSaldosVencidos cobrarsaldosvencidos,JComboBox jComboBoxid_empresaCobrarSaldosVencidosGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaCobrarSaldosVencidosGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormCobrarSaldosVencidos.jComboBoxid_empresaCobrarSaldosVencidos.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaCobrarSaldosVencidosGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				cobrarsaldosvencidos.setid_empresa(empresaAux.getId());
				cobrarsaldosvencidos.setempresa_descripcion(CobrarSaldosVencidosConstantesFunciones.getEmpresaDescripcion(empresaAux));
				cobrarsaldosvencidos.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameGrupoClientesForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingGrupoCliente=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CobrarSaldosVencidosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCobrarSaldosVencidos!=null) { 
							this.jInternalFrameDetalleFormCobrarSaldosVencidos.jComboBoxid_grupo_clienteCobrarSaldosVencidos.removeAllItems();

							for(GrupoCliente grupocliente:this.grupoclientesForeignKey) {
								this.jInternalFrameDetalleFormCobrarSaldosVencidos.jComboBoxid_grupo_clienteCobrarSaldosVencidos.addItem(grupocliente);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCobrarSaldosVencidos!=null) { 
					}

					if(!CobrarSaldosVencidosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaCobrarSaldosVencidos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CobrarSaldosVencidosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_grupo_clienteBusquedaCobrarSaldosVencidosCobrarSaldosVencidos.removeAllItems();

							for(GrupoCliente grupocliente:this.grupoclientesForeignKey) {
								this.jComboBoxid_grupo_clienteBusquedaCobrarSaldosVencidosCobrarSaldosVencidos.addItem(grupocliente);
							}
						}

						if(!CobrarSaldosVencidosJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEmpresasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEmpresa=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CobrarSaldosVencidosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCobrarSaldosVencidos!=null) { 
							this.jInternalFrameDetalleFormCobrarSaldosVencidos.jComboBoxid_empresaCobrarSaldosVencidos.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormCobrarSaldosVencidos.jComboBoxid_empresaCobrarSaldosVencidos.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCobrarSaldosVencidos!=null) { 
					}

					if(!CobrarSaldosVencidosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameGrupoClienteForeignKey(GrupoCliente grupocliente,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCobrarSaldosVencidos!=null) {
							this.jInternalFrameDetalleFormCobrarSaldosVencidos.jComboBoxid_grupo_clienteCobrarSaldosVencidos.setSelectedItem(grupocliente);
						}
					} else {
						if(this.jInternalFrameDetalleFormCobrarSaldosVencidos!=null) {
							this.jInternalFrameDetalleFormCobrarSaldosVencidos.jComboBoxid_grupo_clienteCobrarSaldosVencidos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_grupo_clienteBusquedaCobrarSaldosVencidosCobrarSaldosVencidos.setSelectedItem(grupocliente);
						} else {
							this.jComboBoxid_grupo_clienteBusquedaCobrarSaldosVencidosCobrarSaldosVencidos.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCobrarSaldosVencidos!=null) {
							this.jInternalFrameDetalleFormCobrarSaldosVencidos.jComboBoxid_empresaCobrarSaldosVencidos.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormCobrarSaldosVencidos!=null) {
							this.jInternalFrameDetalleFormCobrarSaldosVencidos.jComboBoxid_empresaCobrarSaldosVencidos.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesCobrarSaldosVencidos() throws Exception {
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
		
	public CobrarSaldosVencidosParameterReturnGeneral getCobrarSaldosVencidosParameterGeneral() {
		return this.cobrarsaldosvencidosParameterGeneral;
	}
	
	public void setCobrarSaldosVencidosParameterGeneral(CobrarSaldosVencidosParameterReturnGeneral cobrarsaldosvencidosParameterGeneral) {
		this.cobrarsaldosvencidosParameterGeneral = cobrarsaldosvencidosParameterGeneral;
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
	
	public Boolean getIsPermisoTodoCobrarSaldosVencidos() {
		return isPermisoTodoCobrarSaldosVencidos;
	}

	public void setIsPermisoTodoCobrarSaldosVencidos(Boolean isPermisoTodoCobrarSaldosVencidos) {
		this.isPermisoTodoCobrarSaldosVencidos = isPermisoTodoCobrarSaldosVencidos;
	}

	public Boolean getIsPermisoNuevoCobrarSaldosVencidos() {
		return isPermisoNuevoCobrarSaldosVencidos;
	}

	public void setIsPermisoNuevoCobrarSaldosVencidos(Boolean isPermisoNuevoCobrarSaldosVencidos) {
		this.isPermisoNuevoCobrarSaldosVencidos = isPermisoNuevoCobrarSaldosVencidos;
	}

	public Boolean getIsPermisoActualizarCobrarSaldosVencidos() {
		return isPermisoActualizarCobrarSaldosVencidos;
	}

	public void setIsPermisoActualizarCobrarSaldosVencidos(Boolean isPermisoActualizarCobrarSaldosVencidos) {
		this.isPermisoActualizarCobrarSaldosVencidos = isPermisoActualizarCobrarSaldosVencidos;
	}

	public Boolean getIsPermisoEliminarCobrarSaldosVencidos() {
		return isPermisoEliminarCobrarSaldosVencidos;
	}

	public void setIsPermisoEliminarCobrarSaldosVencidos(Boolean isPermisoEliminarCobrarSaldosVencidos) {
		this.isPermisoEliminarCobrarSaldosVencidos = isPermisoEliminarCobrarSaldosVencidos;
	}

	public Boolean getIsPermisoGuardarCambiosCobrarSaldosVencidos() {
		return isPermisoGuardarCambiosCobrarSaldosVencidos;
	}

	public void setIsPermisoGuardarCambiosCobrarSaldosVencidos(Boolean isPermisoGuardarCambiosCobrarSaldosVencidos) {
		this.isPermisoGuardarCambiosCobrarSaldosVencidos = isPermisoGuardarCambiosCobrarSaldosVencidos;
	}
	
	public Boolean getIsPermisoConsultaCobrarSaldosVencidos() {
		return isPermisoConsultaCobrarSaldosVencidos;
	}

	public void setIsPermisoConsultaCobrarSaldosVencidos(Boolean isPermisoConsultaCobrarSaldosVencidos) {
		this.isPermisoConsultaCobrarSaldosVencidos = isPermisoConsultaCobrarSaldosVencidos;
	}

	public Boolean getIsPermisoBusquedaCobrarSaldosVencidos() {
		return isPermisoBusquedaCobrarSaldosVencidos;
	}

	public void setIsPermisoBusquedaCobrarSaldosVencidos(Boolean isPermisoBusquedaCobrarSaldosVencidos) {
		this.isPermisoBusquedaCobrarSaldosVencidos = isPermisoBusquedaCobrarSaldosVencidos;
	}

	public Boolean getIsPermisoReporteCobrarSaldosVencidos() {
		return isPermisoReporteCobrarSaldosVencidos;
	}

	public void setIsPermisoReporteCobrarSaldosVencidos(Boolean isPermisoReporteCobrarSaldosVencidos) {
		this.isPermisoReporteCobrarSaldosVencidos = isPermisoReporteCobrarSaldosVencidos;
	}
	
	public Boolean getIsPermisoPaginacionMedioCobrarSaldosVencidos() {
		return isPermisoPaginacionMedioCobrarSaldosVencidos;
	}

	public void setIsPermisoPaginacionMedioCobrarSaldosVencidos(Boolean isPermisoPaginacionMedioCobrarSaldosVencidos) {
		this.isPermisoPaginacionMedioCobrarSaldosVencidos = isPermisoPaginacionMedioCobrarSaldosVencidos;
	}
	
	public Boolean getIsPermisoPaginacionTodoCobrarSaldosVencidos() {
		return isPermisoPaginacionTodoCobrarSaldosVencidos;
	}

	public void setIsPermisoPaginacionTodoCobrarSaldosVencidos(Boolean isPermisoPaginacionTodoCobrarSaldosVencidos) {
		this.isPermisoPaginacionTodoCobrarSaldosVencidos = isPermisoPaginacionTodoCobrarSaldosVencidos;
	}
	
	public Boolean getIsPermisoPaginacionAltoCobrarSaldosVencidos() {
		return isPermisoPaginacionAltoCobrarSaldosVencidos;
	}

	public void setIsPermisoPaginacionAltoCobrarSaldosVencidos(Boolean isPermisoPaginacionAltoCobrarSaldosVencidos) {
		this.isPermisoPaginacionAltoCobrarSaldosVencidos = isPermisoPaginacionAltoCobrarSaldosVencidos;
	}
	
	public Boolean getIsPermisoCopiarCobrarSaldosVencidos() {
		return isPermisoCopiarCobrarSaldosVencidos;
	}

	public void setIsPermisoCopiarCobrarSaldosVencidos(Boolean isPermisoCopiarCobrarSaldosVencidos) {
		this.isPermisoCopiarCobrarSaldosVencidos = isPermisoCopiarCobrarSaldosVencidos;
	}
	
	public Boolean getIsPermisoVerFormCobrarSaldosVencidos() {
		return isPermisoVerFormCobrarSaldosVencidos;
	}

	public void setIsPermisoVerFormCobrarSaldosVencidos(Boolean isPermisoVerFormCobrarSaldosVencidos) {
		this.isPermisoVerFormCobrarSaldosVencidos = isPermisoVerFormCobrarSaldosVencidos;
	}
	
	public Boolean getIsPermisoDuplicarCobrarSaldosVencidos() {
		return isPermisoDuplicarCobrarSaldosVencidos;
	}

	public void setIsPermisoDuplicarCobrarSaldosVencidos(Boolean isPermisoDuplicarCobrarSaldosVencidos) {
		this.isPermisoDuplicarCobrarSaldosVencidos = isPermisoDuplicarCobrarSaldosVencidos;
	}
	
	public Boolean getIsPermisoOrdenCobrarSaldosVencidos() {
		return isPermisoOrdenCobrarSaldosVencidos;
	}

	public void setIsPermisoOrdenCobrarSaldosVencidos(Boolean isPermisoOrdenCobrarSaldosVencidos) {
		this.isPermisoOrdenCobrarSaldosVencidos = isPermisoOrdenCobrarSaldosVencidos;
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
	
	public Boolean getIsVisibilidadCeldaNuevoCobrarSaldosVencidos() {
		return isVisibilidadCeldaNuevoCobrarSaldosVencidos;
	}

	public void setIsVisibilidadCeldaNuevoCobrarSaldosVencidos(Boolean isVisibilidadCeldaNuevoCobrarSaldosVencidos) {
		this.isVisibilidadCeldaNuevoCobrarSaldosVencidos = isVisibilidadCeldaNuevoCobrarSaldosVencidos;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarCobrarSaldosVencidos() {
		return isVisibilidadCeldaDuplicarCobrarSaldosVencidos;
	}

	public void setIsVisibilidadCeldaDuplicarCobrarSaldosVencidos(Boolean isVisibilidadCeldaDuplicarCobrarSaldosVencidos) {
		this.isVisibilidadCeldaDuplicarCobrarSaldosVencidos = isVisibilidadCeldaDuplicarCobrarSaldosVencidos;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarCobrarSaldosVencidos() {
		return isVisibilidadCeldaCopiarCobrarSaldosVencidos;
	}

	public void setIsVisibilidadCeldaCopiarCobrarSaldosVencidos(Boolean isVisibilidadCeldaCopiarCobrarSaldosVencidos) {
		this.isVisibilidadCeldaCopiarCobrarSaldosVencidos = isVisibilidadCeldaCopiarCobrarSaldosVencidos;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormCobrarSaldosVencidos() {
		return isVisibilidadCeldaVerFormCobrarSaldosVencidos;
	}

	public void setIsVisibilidadCeldaVerFormCobrarSaldosVencidos(Boolean isVisibilidadCeldaVerFormCobrarSaldosVencidos) {
		this.isVisibilidadCeldaVerFormCobrarSaldosVencidos = isVisibilidadCeldaVerFormCobrarSaldosVencidos;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenCobrarSaldosVencidos() {
		return isVisibilidadCeldaOrdenCobrarSaldosVencidos;
	}

	public void setIsVisibilidadCeldaOrdenCobrarSaldosVencidos(Boolean isVisibilidadCeldaOrdenCobrarSaldosVencidos) {
		this.isVisibilidadCeldaOrdenCobrarSaldosVencidos = isVisibilidadCeldaOrdenCobrarSaldosVencidos;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesCobrarSaldosVencidos() {
		return isVisibilidadCeldaNuevoRelacionesCobrarSaldosVencidos;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesCobrarSaldosVencidos(Boolean isVisibilidadCeldaNuevoRelacionesCobrarSaldosVencidos) {
		this.isVisibilidadCeldaNuevoRelacionesCobrarSaldosVencidos = isVisibilidadCeldaNuevoRelacionesCobrarSaldosVencidos;
	}
	
	public Boolean getIsVisibilidadCeldaModificarCobrarSaldosVencidos() {
		return isVisibilidadCeldaModificarCobrarSaldosVencidos;
	}

	public void setIsVisibilidadCeldaModificarCobrarSaldosVencidos(Boolean isVisibilidadCeldaModificarCobrarSaldosVencidos) {
		this.isVisibilidadCeldaModificarCobrarSaldosVencidos = isVisibilidadCeldaModificarCobrarSaldosVencidos;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarCobrarSaldosVencidos() {
		return isVisibilidadCeldaActualizarCobrarSaldosVencidos;
	}

	public void setIsVisibilidadCeldaActualizarCobrarSaldosVencidos(Boolean isVisibilidadCeldaActualizarCobrarSaldosVencidos) {
		this.isVisibilidadCeldaActualizarCobrarSaldosVencidos = isVisibilidadCeldaActualizarCobrarSaldosVencidos;
	}

	public Boolean getIsVisibilidadCeldaEliminarCobrarSaldosVencidos() {
		return isVisibilidadCeldaEliminarCobrarSaldosVencidos;
	}

	public void setIsVisibilidadCeldaEliminarCobrarSaldosVencidos(Boolean isVisibilidadCeldaEliminarCobrarSaldosVencidos) {
		this.isVisibilidadCeldaEliminarCobrarSaldosVencidos = isVisibilidadCeldaEliminarCobrarSaldosVencidos;
	}

	public Boolean getIsVisibilidadCeldaCancelarCobrarSaldosVencidos() {
		return isVisibilidadCeldaCancelarCobrarSaldosVencidos;
	}

	public void setIsVisibilidadCeldaCancelarCobrarSaldosVencidos(Boolean isVisibilidadCeldaCancelarCobrarSaldosVencidos) {
		this.isVisibilidadCeldaCancelarCobrarSaldosVencidos = isVisibilidadCeldaCancelarCobrarSaldosVencidos;
	}

	public Boolean getIsVisibilidadCeldaGuardarCobrarSaldosVencidos() {
		return isVisibilidadCeldaGuardarCobrarSaldosVencidos;
	}

	public void setIsVisibilidadCeldaGuardarCobrarSaldosVencidos(Boolean isVisibilidadCeldaGuardarCobrarSaldosVencidos) {
		this.isVisibilidadCeldaGuardarCobrarSaldosVencidos = isVisibilidadCeldaGuardarCobrarSaldosVencidos;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosCobrarSaldosVencidos() {
		return isVisibilidadCeldaGuardarCambiosCobrarSaldosVencidos;
	}

	public void setIsVisibilidadCeldaGuardarCambiosCobrarSaldosVencidos(Boolean isVisibilidadCeldaGuardarCambiosCobrarSaldosVencidos) {
		this.isVisibilidadCeldaGuardarCambiosCobrarSaldosVencidos = isVisibilidadCeldaGuardarCambiosCobrarSaldosVencidos;
	}
		
	public CobrarSaldosVencidosSessionBean getcobrarsaldosvencidosSessionBean() {
		return this.cobrarsaldosvencidosSessionBean;
	}
	
	public void setcobrarsaldosvencidosSessionBean(CobrarSaldosVencidosSessionBean cobrarsaldosvencidosSessionBean) {
		this.cobrarsaldosvencidosSessionBean=cobrarsaldosvencidosSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaCobrarSaldosVencidos() {
		return this.isVisibilidadBusquedaCobrarSaldosVencidos;
	}

	public void setisVisibilidadBusquedaCobrarSaldosVencidos(Boolean isVisibilidadBusquedaCobrarSaldosVencidos) {
		this.isVisibilidadBusquedaCobrarSaldosVencidos=isVisibilidadBusquedaCobrarSaldosVencidos;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysCobrarSaldosVencidos(CobrarSaldosVencidos cobrarsaldosvencidos)throws Exception {
		try {
			
				this.setActualParaGuardarGrupoClienteForeignKey(cobrarsaldosvencidos,null);
				this.setActualParaGuardarEmpresaForeignKey(cobrarsaldosvencidos,null);
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
	
	public void bugActualizarReferenciaActual(CobrarSaldosVencidos cobrarsaldosvencidos,CobrarSaldosVencidos cobrarsaldosvencidosAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalCobrarSaldosVencidos(cobrarsaldosvencidos);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		cobrarsaldosvencidosAux.setId(cobrarsaldosvencidos.getId());
		cobrarsaldosvencidosAux.setVersionRow(cobrarsaldosvencidos.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(CobrarSaldosVencidos cobrarsaldosvencidosLocal) throws Exception {
		
		if(this.cobrarsaldosvencidosSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(CobrarSaldosVencidos cobrarsaldosvencidosLocal) throws Exception {	
		if(this.cobrarsaldosvencidosSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(GrupoClienteDetalleFormJInternalFrame.class)) {
				GrupoClienteBeanSwingJInternalFrame grupoclienteBeanSwingJInternalFrameLocal=(GrupoClienteBeanSwingJInternalFrame) ((GrupoClienteDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				grupoclienteBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoGrupoCliente(grupoclienteBeanSwingJInternalFrameLocal.getgrupocliente(),true);
				grupoclienteBeanSwingJInternalFrameLocal.actualizarLista(grupoclienteBeanSwingJInternalFrameLocal.grupocliente,this.grupoclientesForeignKey);

				grupoclienteBeanSwingJInternalFrameLocal.actualizarRelaciones(grupoclienteBeanSwingJInternalFrameLocal.grupocliente);

				cobrarsaldosvencidosLocal.setGrupoCliente(grupoclienteBeanSwingJInternalFrameLocal.grupocliente);

				this.addItemDefectoCombosForeignKeyGrupoCliente();
				this.cargarCombosFrameGrupoClientesForeignKey("Formulario");
				this.setActualGrupoClienteForeignKey(grupoclienteBeanSwingJInternalFrameLocal.grupocliente.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				cobrarsaldosvencidosLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarCobrarSaldosVencidosActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosCobrarSaldosVencidos.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.cobrarsaldosvencidos =(CobrarSaldosVencidos) this.cobrarsaldosvencidosLogic.getCobrarSaldosVencidoss().toArray()[this.jTableDatosCobrarSaldosVencidos.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.cobrarsaldosvencidos =(CobrarSaldosVencidos) this.cobrarsaldosvencidoss.toArray()[this.jTableDatosCobrarSaldosVencidos.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = cobrarsaldosvencidosValidator.getInvalidValues(this.cobrarsaldosvencidos);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(CobrarSaldosVencidos cobrarsaldosvencidos,List<CobrarSaldosVencidos> cobrarsaldosvencidoss) throws Exception {
	}		
	
	public void actualizarSelectedLista(CobrarSaldosVencidos cobrarsaldosvencidos,List<CobrarSaldosVencidos> cobrarsaldosvencidoss) throws Exception {
		try	{			
			CobrarSaldosVencidosConstantesFunciones.actualizarSelectedLista(cobrarsaldosvencidos,cobrarsaldosvencidoss);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<CobrarSaldosVencidos> cobrarsaldosvencidossLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				cobrarsaldosvencidossLocal=this.cobrarsaldosvencidosLogic.getCobrarSaldosVencidoss();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				cobrarsaldosvencidossLocal=this.cobrarsaldosvencidoss;
			}
			//ARCHITECTURE
		
			for(CobrarSaldosVencidos cobrarsaldosvencidosLocal:cobrarsaldosvencidossLocal) {
				if(this.permiteMantenimiento(cobrarsaldosvencidosLocal) && cobrarsaldosvencidosLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+CobrarSaldosVencidosConstantesFunciones.getCobrarSaldosVencidosLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(CobrarSaldosVencidosConstantesFunciones.NUMEROFACTURA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarSaldosVencidos.jLabelnumero_facturaCobrarSaldosVencidos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarSaldosVencidosConstantesFunciones.NOMBREGRUPOCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarSaldosVencidos.jLabelnombre_grupo_clienteCobrarSaldosVencidos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarSaldosVencidosConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarSaldosVencidos.jLabelcodigoCobrarSaldosVencidos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarSaldosVencidosConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarSaldosVencidos.jLabelnombreCobrarSaldosVencidos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarSaldosVencidosConstantesFunciones.FECHA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarSaldosVencidos.jLabelfechaCobrarSaldosVencidos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarSaldosVencidosConstantesFunciones.FECHAVENCE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarSaldosVencidos.jLabelfecha_venceCobrarSaldosVencidos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarSaldosVencidosConstantesFunciones.FECHAEMISION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarSaldosVencidos.jLabelfecha_emisionCobrarSaldosVencidos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarSaldosVencidosConstantesFunciones.SALDO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarSaldosVencidos.jLabelsaldoCobrarSaldosVencidos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarSaldosVencidosConstantesFunciones.TELEFONOTELEFONO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarSaldosVencidos.jLabeltelefono_telefonoCobrarSaldosVencidos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarSaldosVencidosConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarSaldosVencidos.jLabeldescripcionCobrarSaldosVencidos,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormCobrarSaldosVencidos!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarSaldosVencidos.jLabelnumero_facturaCobrarSaldosVencidos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarSaldosVencidos.jLabelnombre_grupo_clienteCobrarSaldosVencidos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarSaldosVencidos.jLabelcodigoCobrarSaldosVencidos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarSaldosVencidos.jLabelnombreCobrarSaldosVencidos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarSaldosVencidos.jLabelfechaCobrarSaldosVencidos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarSaldosVencidos.jLabelfecha_venceCobrarSaldosVencidos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarSaldosVencidos.jLabelfecha_emisionCobrarSaldosVencidos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarSaldosVencidos.jLabelsaldoCobrarSaldosVencidos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarSaldosVencidos.jLabeltelefono_telefonoCobrarSaldosVencidos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarSaldosVencidos.jLabeldescripcionCobrarSaldosVencidos,"");
		
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
		this.iIdNuevoCobrarSaldosVencidos--;	
		
		
		this.cobrarsaldosvencidosAux=new CobrarSaldosVencidos();
		
		this.cobrarsaldosvencidosAux.setId(this.iIdNuevoCobrarSaldosVencidos);
		this.cobrarsaldosvencidosAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.cobrarsaldosvencidosLogic.getCobrarSaldosVencidoss().add(this.cobrarsaldosvencidosAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.cobrarsaldosvencidoss.add(this.cobrarsaldosvencidosAux);
		}
		//ARCHITECTURE
		
		this.cobrarsaldosvencidos=this.cobrarsaldosvencidosAux;
		
		if(CobrarSaldosVencidosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioCobrarSaldosVencidos(this.cobrarsaldosvencidos);
			this.setVariablesObjetoActualToFormularioForeignKeyCobrarSaldosVencidos(this.cobrarsaldosvencidos);
		}
				
		//this.setDefaultControlesCobrarSaldosVencidos();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyCobrarSaldosVencidos();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyCobrarSaldosVencidos();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyCobrarSaldosVencidos();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCobrarSaldosVencidos(this.cobrarsaldosvencidosBean,this.cobrarsaldosvencidos,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysCobrarSaldosVencidos(this.cobrarsaldosvencidos);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanCobrarSaldosVencidos(this.cobrarsaldosvencidosReturnGeneral,this.cobrarsaldosvencidosBean,false);
		
		if(this.cobrarsaldosvencidosReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyCobrarSaldosVencidos(this.cobrarsaldosvencidosReturnGeneral.getCobrarSaldosVencidos());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioCobrarSaldosVencidos(this.cobrarsaldosvencidosReturnGeneral.getCobrarSaldosVencidos());
		}
		
		if(this.cobrarsaldosvencidosReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioCobrarSaldosVencidos(this.cobrarsaldosvencidosReturnGeneral.getCobrarSaldosVencidos(),classes);//this.cobrarsaldosvencidosBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualCobrarSaldosVencidos(this.cobrarsaldosvencidos,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyCobrarSaldosVencidos();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyCobrarSaldosVencidos();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CobrarSaldosVencidosBeanSwingJInternalFrameAdditional.RecargarFormCobrarSaldosVencidos(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingCobrarSaldosVencidos(false);
						
			if(cobrarsaldosvencidosSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(CobrarSaldosVencidosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCobrarSaldosVencidos();
			}
			
			this.actualizarVisualTableDatosCobrarSaldosVencidos();
			
			this.jTableDatosCobrarSaldosVencidos.setRowSelectionInterval(this.getIndiceNuevoCobrarSaldosVencidos(), this.getIndiceNuevoCobrarSaldosVencidos());
			
			this.seleccionarFilaTablaCobrarSaldosVencidosActual();
						
			this.actualizarEstadoCeldasBotonesCobrarSaldosVencidos("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesCobrarSaldosVencidos(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jTextFieldnumero_facturaCobrarSaldosVencidos.setEnabled(isHabilitar && this.cobrarsaldosvencidosConstantesFunciones.activarnumero_facturaCobrarSaldosVencidos);
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jTextAreanombre_grupo_clienteCobrarSaldosVencidos.setEnabled(isHabilitar && this.cobrarsaldosvencidosConstantesFunciones.activarnombre_grupo_clienteCobrarSaldosVencidos);
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jTextFieldcodigoCobrarSaldosVencidos.setEnabled(isHabilitar && this.cobrarsaldosvencidosConstantesFunciones.activarcodigoCobrarSaldosVencidos);
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jTextAreanombreCobrarSaldosVencidos.setEnabled(isHabilitar && this.cobrarsaldosvencidosConstantesFunciones.activarnombreCobrarSaldosVencidos);
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jDateChooserfechaCobrarSaldosVencidos.setEnabled(isHabilitar && this.cobrarsaldosvencidosConstantesFunciones.activarfechaCobrarSaldosVencidos);
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jDateChooserfecha_venceCobrarSaldosVencidos.setEnabled(isHabilitar && this.cobrarsaldosvencidosConstantesFunciones.activarfecha_venceCobrarSaldosVencidos);
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jDateChooserfecha_emisionCobrarSaldosVencidos.setEnabled(isHabilitar && this.cobrarsaldosvencidosConstantesFunciones.activarfecha_emisionCobrarSaldosVencidos);
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jTextFieldsaldoCobrarSaldosVencidos.setEnabled(isHabilitar && this.cobrarsaldosvencidosConstantesFunciones.activarsaldoCobrarSaldosVencidos);
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jTextAreatelefono_telefonoCobrarSaldosVencidos.setEnabled(isHabilitar && this.cobrarsaldosvencidosConstantesFunciones.activartelefono_telefonoCobrarSaldosVencidos);
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jTextAreadescripcionCobrarSaldosVencidos.setEnabled(isHabilitar && this.cobrarsaldosvencidosConstantesFunciones.activardescripcionCobrarSaldosVencidos);	
		
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jComboBoxid_grupo_clienteCobrarSaldosVencidos.setEnabled(isHabilitar && this.cobrarsaldosvencidosConstantesFunciones.activarid_grupo_clienteCobrarSaldosVencidos);//
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jComboBoxid_empresaCobrarSaldosVencidos.setEnabled(isHabilitar && this.cobrarsaldosvencidosConstantesFunciones.activarid_empresaCobrarSaldosVencidos);
	};
	
	public void setDefaultControlesCobrarSaldosVencidos() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoCobrarSaldosVencidos(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.cobrarsaldosvencidosSessionBean.setConGuardarRelaciones(true);			
			this.cobrarsaldosvencidosSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormCobrarSaldosVencidos.jTabbedPaneRelacionesCobrarSaldosVencidos.setVisible(true);
			
					
		} else {
			//this.cobrarsaldosvencidosSessionBean.setConGuardarRelaciones(false);			
			this.cobrarsaldosvencidosSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormCobrarSaldosVencidos.jTabbedPaneRelacionesCobrarSaldosVencidos.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoCobrarSaldosVencidos() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CobrarSaldosVencidos cobrarsaldosvencidosAux:this.cobrarsaldosvencidosLogic.getCobrarSaldosVencidoss()) {
				if(cobrarsaldosvencidosAux.getId().equals(this.iIdNuevoCobrarSaldosVencidos)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CobrarSaldosVencidos cobrarsaldosvencidosAux:this.cobrarsaldosvencidoss) {
				if(cobrarsaldosvencidosAux.getId().equals(this.iIdNuevoCobrarSaldosVencidos)) {
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
	
	public int getIndiceActualCobrarSaldosVencidos(CobrarSaldosVencidos cobrarsaldosvencidos,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CobrarSaldosVencidos cobrarsaldosvencidosAux:this.cobrarsaldosvencidosLogic.getCobrarSaldosVencidoss()) {
				if(cobrarsaldosvencidosAux.getId().equals(cobrarsaldosvencidos.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CobrarSaldosVencidos cobrarsaldosvencidosAux:this.cobrarsaldosvencidoss) {
				if(cobrarsaldosvencidosAux.getId().equals(cobrarsaldosvencidos.getId())) {
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
	
	public void setCamposBaseDesdeOriginalCobrarSaldosVencidos(CobrarSaldosVencidos cobrarsaldosvencidosOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CobrarSaldosVencidos cobrarsaldosvencidosAux:this.cobrarsaldosvencidosLogic.getCobrarSaldosVencidoss()) {
				if(cobrarsaldosvencidosAux.getCobrarSaldosVencidosOriginal().getId().equals(cobrarsaldosvencidosOriginal.getId())) {
					existe=true;
					cobrarsaldosvencidosOriginal.setId(cobrarsaldosvencidosAux.getId());
					cobrarsaldosvencidosOriginal.setVersionRow(cobrarsaldosvencidosAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CobrarSaldosVencidos cobrarsaldosvencidosAux:this.cobrarsaldosvencidoss) {
				if(cobrarsaldosvencidosAux.getCobrarSaldosVencidosOriginal().getId().equals(cobrarsaldosvencidosOriginal.getId())) {
					existe=true;
					cobrarsaldosvencidosOriginal.setId(cobrarsaldosvencidosAux.getId());
					cobrarsaldosvencidosOriginal.setVersionRow(cobrarsaldosvencidosAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosCobrarSaldosVencidos(Boolean esParaCancelar) throws Exception {
		cobrarsaldosvencidossAux=new ArrayList<CobrarSaldosVencidos>();
		cobrarsaldosvencidosAux=new CobrarSaldosVencidos();
		
		if(!this.cobrarsaldosvencidosSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CobrarSaldosVencidos cobrarsaldosvencidosAux:this.cobrarsaldosvencidosLogic.getCobrarSaldosVencidoss()) {
					if(cobrarsaldosvencidosAux.getId()<0) {
						cobrarsaldosvencidossAux.add(cobrarsaldosvencidosAux);
					}		
				}
				this.iIdNuevoCobrarSaldosVencidos=0L;
				this.cobrarsaldosvencidosLogic.getCobrarSaldosVencidoss().removeAll(cobrarsaldosvencidossAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CobrarSaldosVencidos cobrarsaldosvencidosAux:this.cobrarsaldosvencidoss) {
					if(cobrarsaldosvencidosAux.getId()<0) {
						cobrarsaldosvencidossAux.add(cobrarsaldosvencidosAux);
					}		
				}
				this.iIdNuevoCobrarSaldosVencidos=0L;
				this.cobrarsaldosvencidoss.removeAll(cobrarsaldosvencidossAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoCobrarSaldosVencidos 
					&& this.cobrarsaldosvencidosLogic.getCobrarSaldosVencidoss().size()>0
					) {
					cobrarsaldosvencidosAux=this.cobrarsaldosvencidosLogic.getCobrarSaldosVencidoss().get(this.cobrarsaldosvencidosLogic.getCobrarSaldosVencidoss().size() - 1);
				
					if(cobrarsaldosvencidosAux.getId()<0) {
						this.cobrarsaldosvencidosLogic.getCobrarSaldosVencidoss().remove(cobrarsaldosvencidosAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoCobrarSaldosVencidos && this.cobrarsaldosvencidoss.size()>0) {
					cobrarsaldosvencidosAux=this.cobrarsaldosvencidoss.get(this.cobrarsaldosvencidoss.size() - 1);
				
					if(cobrarsaldosvencidosAux.getId()<0) {
						this.cobrarsaldosvencidoss.remove(cobrarsaldosvencidosAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoCobrarSaldosVencidos(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(cobrarsaldosvencidos.getId()<0) {
				this.cobrarsaldosvencidosLogic.getCobrarSaldosVencidoss().remove(this.cobrarsaldosvencidos);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(cobrarsaldosvencidos.getId()<0) {
				this.cobrarsaldosvencidoss.remove(this.cobrarsaldosvencidos);
			}
		}			
	}
	
	public void setEstadosInicialesCobrarSaldosVencidos(List<CobrarSaldosVencidos> cobrarsaldosvencidossAux) throws Exception {
		CobrarSaldosVencidosConstantesFunciones.setEstadosInicialesCobrarSaldosVencidos(cobrarsaldosvencidossAux);
	}
	
	public void setEstadosInicialesCobrarSaldosVencidos(CobrarSaldosVencidos cobrarsaldosvencidosAux) throws Exception {
		CobrarSaldosVencidosConstantesFunciones.setEstadosInicialesCobrarSaldosVencidos(cobrarsaldosvencidosAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarCobrarSaldosVencidosActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesCobrarSaldosVencidos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarCobrarSaldosVencidosActual()) {
				if(!this.isEsNuevoCobrarSaldosVencidos) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesCobrarSaldosVencidos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoCobrarSaldosVencidos=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarCobrarSaldosVencidosActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Cobrar Saldos Vencidos ?", "MANTENIMIENTO DE Cobrar Saldos Vencidos", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesCobrarSaldosVencidos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(CobrarSaldosVencidos cobrarsaldosvencidos) throws Exception {
		CobrarSaldosVencidosConstantesFunciones.seleccionarAsignar(this.cobrarsaldosvencidos,cobrarsaldosvencidos);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarCobrarSaldosVencidos=this.isPermisoActualizarOriginalCobrarSaldosVencidos;
			
			
			this.seleccionarAsignar(cobrarsaldosvencidos);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesCobrarSaldosVencidos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.cobrarsaldosvencidosSessionBean.setsFuncionBusquedaRapida(this.cobrarsaldosvencidosSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoCobrarSaldosVencidos) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosCobrarSaldosVencidos(esParaCancelar);				
				this.cancelarNuevoCobrarSaldosVencidos(esParaCancelar);								
			}
			
			this.cobrarsaldosvencidos=new CobrarSaldosVencidos();
			
			this.inicializarCobrarSaldosVencidos();
			
			this.actualizarEstadoCeldasBotonesCobrarSaldosVencidos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarCobrarSaldosVencidos() throws Exception {
		try {
			CobrarSaldosVencidosConstantesFunciones.inicializarCobrarSaldosVencidos(this.cobrarsaldosvencidos);
			
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
			FuncionesSwing.manageException(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.cobrarsaldosvencidosLogic.getCobrarSaldosVencidoss().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteCobrarSaldosVencidoss(String sAccionBusqueda,List<CobrarSaldosVencidos> cobrarsaldosvencidossParaReportes) throws Exception {
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
					sPathReporteFinal="CobrarSaldosVencidos"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="CobrarSaldosVencidosMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("CobrarSaldosVencidosMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="CobrarSaldosVencidos"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Cobrar Saldos Vencidoses");		
		parameters.put("busquedapor", CobrarSaldosVencidosConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceCobrarSaldosVencidos=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			CobrarSaldosVencidosConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			CobrarSaldosVencidosConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceCobrarSaldosVencidos=new JRBeanArrayDataSource(CobrarSaldosVencidosJInternalFrame.TraerCobrarSaldosVencidosBeans(cobrarsaldosvencidossParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceCobrarSaldosVencidos);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+CobrarSaldosVencidosConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+CobrarSaldosVencidosConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(CobrarSaldosVencidosBean.TraerCobrarSaldosVencidosBeans(cobrarsaldosvencidossParaReportes).toArray()));
							
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
				this.generarExcelReporteCobrarSaldosVencidoss(sAccionBusqueda,sTipoArchivoReporte,cobrarsaldosvencidossParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalCobrarSaldosVencidoss(sAccionBusqueda,sTipoArchivoReporte,cobrarsaldosvencidossParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoCobrarSaldosVencidosActionPerformed(null);
					//this.generarExcelReporteCobrarSaldosVencidoss(sAccionBusqueda,sTipoArchivoReporte,cobrarsaldosvencidossParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalCobrarSaldosVencidoss(sAccionBusqueda,sTipoArchivoReporte,cobrarsaldosvencidossParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesCobrarSaldosVencidoss(sAccionBusqueda,sTipoArchivoReporte,cobrarsaldosvencidossParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesCobrarSaldosVencidoss(sAccionBusqueda,sTipoArchivoReporte,cobrarsaldosvencidossParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteCobrarSaldosVencidoss(String sAccionBusqueda,String sTipoArchivoReporte,List<CobrarSaldosVencidos> cobrarsaldosvencidossParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrarsaldosvencidos";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CobrarSaldosVencidoss");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCobrarSaldosVencidos("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(CobrarSaldosVencidos cobrarsaldosvencidos : cobrarsaldosvencidossParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			CobrarSaldosVencidosConstantesFunciones.generarExcelReporteDataCobrarSaldosVencidos("NORMAL",row,workbook,cobrarsaldosvencidos,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarsaldosvencidosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Saldos Vencidos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderCobrarSaldosVencidos(String sTipo,Row row,Workbook workbook) {
		
		CobrarSaldosVencidosConstantesFunciones.generarExcelReporteHeaderCobrarSaldosVencidos(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalCobrarSaldosVencidoss(String sAccionBusqueda,String sTipoArchivoReporte,List<CobrarSaldosVencidos> cobrarsaldosvencidossParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrarsaldosvencidos_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CobrarSaldosVencidoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(CobrarSaldosVencidos cobrarsaldosvencidos : cobrarsaldosvencidossParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(CobrarSaldosVencidosConstantesFunciones.getCobrarSaldosVencidosDescripcion(cobrarsaldosvencidos));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarSaldosVencidosConstantesFunciones.LABEL_IDGRUPOCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarSaldosVencidosConstantesFunciones.LABEL_IDGRUPOCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarsaldosvencidos.getgrupocliente_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarSaldosVencidosConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarSaldosVencidosConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarsaldosvencidos.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarSaldosVencidosConstantesFunciones.LABEL_NUMEROFACTURA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarSaldosVencidosConstantesFunciones.LABEL_NUMEROFACTURA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarsaldosvencidos.getnumero_factura());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarSaldosVencidosConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarSaldosVencidosConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarsaldosvencidos.getnombre_grupo_cliente());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarSaldosVencidosConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarSaldosVencidosConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarsaldosvencidos.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarSaldosVencidosConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarSaldosVencidosConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarsaldosvencidos.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarSaldosVencidosConstantesFunciones.LABEL_FECHA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarSaldosVencidosConstantesFunciones.LABEL_FECHA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarsaldosvencidos.getfecha());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarSaldosVencidosConstantesFunciones.LABEL_FECHAVENCE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarSaldosVencidosConstantesFunciones.LABEL_FECHAVENCE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarsaldosvencidos.getfecha_vence());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarSaldosVencidosConstantesFunciones.LABEL_FECHAEMISION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarSaldosVencidosConstantesFunciones.LABEL_FECHAEMISION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarsaldosvencidos.getfecha_emision());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarSaldosVencidosConstantesFunciones.LABEL_SALDO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarSaldosVencidosConstantesFunciones.LABEL_SALDO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarsaldosvencidos.getsaldo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarSaldosVencidosConstantesFunciones.LABEL_TELEFONOTELEFONO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarSaldosVencidosConstantesFunciones.LABEL_TELEFONOTELEFONO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarsaldosvencidos.gettelefono_telefono());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarSaldosVencidosConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarSaldosVencidosConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarsaldosvencidos.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarsaldosvencidosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Saldos Vencidos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesCobrarSaldosVencidoss(String sAccionBusqueda,String sTipoArchivoReporte,List<CobrarSaldosVencidos> cobrarsaldosvencidossParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<CobrarSaldosVencidos> cobrarsaldosvencidossRespaldo=null;
		
		classes=CobrarSaldosVencidosConstantesFunciones.getClassesRelationshipsOfCobrarSaldosVencidos(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.cobrarsaldosvencidosLogic.setDatosCliente(this.datosCliente);
		this.cobrarsaldosvencidosLogic.setDatosDeep(this.datosDeep);
		this.cobrarsaldosvencidosLogic.setIsConDeep(true);
		
		cobrarsaldosvencidossRespaldo=this.cobrarsaldosvencidosLogic.getCobrarSaldosVencidoss();
		
		this.cobrarsaldosvencidosLogic.setCobrarSaldosVencidoss(cobrarsaldosvencidossParaReportes);	
		this.cobrarsaldosvencidosLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		cobrarsaldosvencidossParaReportes=this.cobrarsaldosvencidosLogic.getCobrarSaldosVencidoss();
		this.cobrarsaldosvencidosLogic.setCobrarSaldosVencidoss(cobrarsaldosvencidossRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrarsaldosvencidos_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CobrarSaldosVencidoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCobrarSaldosVencidos("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(CobrarSaldosVencidos cobrarsaldosvencidos : cobrarsaldosvencidossParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderCobrarSaldosVencidos("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			CobrarSaldosVencidosConstantesFunciones.generarExcelReporteDataCobrarSaldosVencidos("NORMAL",row,workbook,cobrarsaldosvencidos,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(CobrarSaldosVencidosConstantesFunciones.getCobrarSaldosVencidosDescripcion(cobrarsaldosvencidos));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarsaldosvencidosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Saldos Vencidos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoCobrarSaldosVencidos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCobrarSaldosVencidos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoCobrarSaldosVencidos.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCobrarSaldosVencidos.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessCobrarSaldosVencidos() throws Exception {		
		this.startProcessCobrarSaldosVencidos(true);
	}
	
	public void startProcessCobrarSaldosVencidos(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasCobrarSaldosVencidos ,this.jPanelParametrosReportesCobrarSaldosVencidos, this.jScrollPanelDatosCobrarSaldosVencidos,this.jPanelPaginacionCobrarSaldosVencidos, this.jScrollPanelDatosEdicionCobrarSaldosVencidos, this.jPanelAccionesCobrarSaldosVencidos,this.jPanelAccionesFormularioCobrarSaldosVencidos,this.jmenuBarCobrarSaldosVencidos,this.jmenuBarDetalleCobrarSaldosVencidos,this.jTtoolBarCobrarSaldosVencidos,this.jTtoolBarDetalleCobrarSaldosVencidos);		
		
		final JTabbedPane jTabbedPaneBusquedasCobrarSaldosVencidos=this.jTabbedPaneBusquedasCobrarSaldosVencidos; 
		
		final JPanel jPanelParametrosReportesCobrarSaldosVencidos=this.jPanelParametrosReportesCobrarSaldosVencidos;
		//final JScrollPane jScrollPanelDatosCobrarSaldosVencidos=this.jScrollPanelDatosCobrarSaldosVencidos;
		final JTable jTableDatosCobrarSaldosVencidos=this.jTableDatosCobrarSaldosVencidos;		
		final JPanel jPanelPaginacionCobrarSaldosVencidos=this.jPanelPaginacionCobrarSaldosVencidos;
		//final JScrollPane jScrollPanelDatosEdicionCobrarSaldosVencidos=this.jScrollPanelDatosEdicionCobrarSaldosVencidos;
		final JPanel jPanelAccionesCobrarSaldosVencidos=this.jPanelAccionesCobrarSaldosVencidos;
		
		JPanel jPanelCamposAuxiliarCobrarSaldosVencidos=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarCobrarSaldosVencidos=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormCobrarSaldosVencidos!=null) {
			jPanelCamposAuxiliarCobrarSaldosVencidos=this.jInternalFrameDetalleFormCobrarSaldosVencidos.jPanelCamposCobrarSaldosVencidos;
			jPanelAccionesFormularioAuxiliarCobrarSaldosVencidos=this.jInternalFrameDetalleFormCobrarSaldosVencidos.jPanelAccionesFormularioCobrarSaldosVencidos;
		}
		
		final JPanel jPanelCamposCobrarSaldosVencidos=jPanelCamposAuxiliarCobrarSaldosVencidos;
		final JPanel jPanelAccionesFormularioCobrarSaldosVencidos=jPanelAccionesFormularioAuxiliarCobrarSaldosVencidos;
		
		
		final JMenuBar jmenuBarCobrarSaldosVencidos=this.jmenuBarCobrarSaldosVencidos;
		final JToolBar jTtoolBarCobrarSaldosVencidos=this.jTtoolBarCobrarSaldosVencidos;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarCobrarSaldosVencidos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCobrarSaldosVencidos=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormCobrarSaldosVencidos!=null) {
			jmenuBarDetalleAuxiliarCobrarSaldosVencidos=this.jInternalFrameDetalleFormCobrarSaldosVencidos.jmenuBarDetalleCobrarSaldosVencidos;
			jTtoolBarDetalleAuxiliarCobrarSaldosVencidos=this.jInternalFrameDetalleFormCobrarSaldosVencidos.jTtoolBarDetalleCobrarSaldosVencidos;
		}
		
		final JMenuBar jmenuBarDetalleCobrarSaldosVencidos=jmenuBarDetalleAuxiliarCobrarSaldosVencidos;
		final JToolBar jTtoolBarDetalleCobrarSaldosVencidos=jTtoolBarDetalleAuxiliarCobrarSaldosVencidos;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCobrarSaldosVencidos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCobrarSaldosVencidos;
			processRunnable.jTableDatos=jTableDatosCobrarSaldosVencidos;
			processRunnable.jPanelCampos=jPanelCamposCobrarSaldosVencidos;
			processRunnable.jPanelPaginacion=jPanelPaginacionCobrarSaldosVencidos;
			processRunnable.jPanelAcciones=jPanelAccionesCobrarSaldosVencidos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCobrarSaldosVencidos;
			
			
			processRunnable.jmenuBar=jmenuBarCobrarSaldosVencidos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCobrarSaldosVencidos;
			processRunnable.jTtoolBar=jTtoolBarCobrarSaldosVencidos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCobrarSaldosVencidos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCobrarSaldosVencidos ,jPanelParametrosReportesCobrarSaldosVencidos,jTableDatosCobrarSaldosVencidos, /*jScrollPanelDatosCobrarSaldosVencidos,*/jPanelCamposCobrarSaldosVencidos,jPanelPaginacionCobrarSaldosVencidos, /*jScrollPanelDatosEdicionCobrarSaldosVencidos,*/ jPanelAccionesCobrarSaldosVencidos,jPanelAccionesFormularioCobrarSaldosVencidos,jmenuBarCobrarSaldosVencidos,jmenuBarDetalleCobrarSaldosVencidos,jTtoolBarCobrarSaldosVencidos,jTtoolBarDetalleCobrarSaldosVencidos);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCobrarSaldosVencidos ,jPanelParametrosReportesCobrarSaldosVencidos, jScrollPanelDatosCobrarSaldosVencidos,jPanelPaginacionCobrarSaldosVencidos, jScrollPanelDatosEdicionCobrarSaldosVencidos, jPanelAccionesCobrarSaldosVencidos,jPanelAccionesFormularioCobrarSaldosVencidos,jmenuBarCobrarSaldosVencidos,jmenuBarDetalleCobrarSaldosVencidos,jTtoolBarCobrarSaldosVencidos,jTtoolBarDetalleCobrarSaldosVencidos);
						
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
	
	public void finishProcessCobrarSaldosVencidos() {// throws Exception 
		this.finishProcessCobrarSaldosVencidos(true);
	}
	
	public void finishProcessCobrarSaldosVencidos(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasCobrarSaldosVencidos ,this.jPanelParametrosReportesCobrarSaldosVencidos, this.jScrollPanelDatosCobrarSaldosVencidos,this.jPanelPaginacionCobrarSaldosVencidos, this.jScrollPanelDatosEdicionCobrarSaldosVencidos, this.jPanelAccionesCobrarSaldosVencidos,this.jPanelAccionesFormularioCobrarSaldosVencidos,this.jmenuBarCobrarSaldosVencidos,this.jmenuBarDetalleCobrarSaldosVencidos,this.jTtoolBarCobrarSaldosVencidos,this.jTtoolBarDetalleCobrarSaldosVencidos);		
		
		final JTabbedPane jTabbedPaneBusquedasCobrarSaldosVencidos=this.jTabbedPaneBusquedasCobrarSaldosVencidos; 
		
		final JPanel jPanelParametrosReportesCobrarSaldosVencidos=this.jPanelParametrosReportesCobrarSaldosVencidos;
		//final JScrollPane jScrollPanelDatosCobrarSaldosVencidos=this.jScrollPanelDatosCobrarSaldosVencidos;
		final JTable jTableDatosCobrarSaldosVencidos=this.jTableDatosCobrarSaldosVencidos;		
		final JPanel jPanelPaginacionCobrarSaldosVencidos=this.jPanelPaginacionCobrarSaldosVencidos;
		//final JScrollPane jScrollPanelDatosEdicionCobrarSaldosVencidos=this.jScrollPanelDatosEdicionCobrarSaldosVencidos;
		final JPanel jPanelAccionesCobrarSaldosVencidos=this.jPanelAccionesCobrarSaldosVencidos;
		
		JPanel jPanelCamposAuxiliarCobrarSaldosVencidos=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarCobrarSaldosVencidos=new JPanel();
		
		if(this.jInternalFrameDetalleFormCobrarSaldosVencidos!=null) {
			jPanelCamposAuxiliarCobrarSaldosVencidos=this.jInternalFrameDetalleFormCobrarSaldosVencidos.jPanelCamposCobrarSaldosVencidos;
			jPanelAccionesFormularioAuxiliarCobrarSaldosVencidos=this.jInternalFrameDetalleFormCobrarSaldosVencidos.jPanelAccionesFormularioCobrarSaldosVencidos;
		}
		
		final JPanel jPanelCamposCobrarSaldosVencidos=jPanelCamposAuxiliarCobrarSaldosVencidos;
		final JPanel jPanelAccionesFormularioCobrarSaldosVencidos=jPanelAccionesFormularioAuxiliarCobrarSaldosVencidos;
		
		
		final JMenuBar jmenuBarCobrarSaldosVencidos=this.jmenuBarCobrarSaldosVencidos;		
		final JToolBar jTtoolBarCobrarSaldosVencidos=this.jTtoolBarCobrarSaldosVencidos;
				
		JMenuBar jmenuBarDetalleAuxiliarCobrarSaldosVencidos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCobrarSaldosVencidos=new JToolBar();
		
		if(this.jInternalFrameDetalleFormCobrarSaldosVencidos!=null) {
			jmenuBarDetalleAuxiliarCobrarSaldosVencidos=this.jInternalFrameDetalleFormCobrarSaldosVencidos.jmenuBarDetalleCobrarSaldosVencidos;
			jTtoolBarDetalleAuxiliarCobrarSaldosVencidos=this.jInternalFrameDetalleFormCobrarSaldosVencidos.jTtoolBarDetalleCobrarSaldosVencidos;		
		}
		
		final JMenuBar jmenuBarDetalleCobrarSaldosVencidos=jmenuBarDetalleAuxiliarCobrarSaldosVencidos;
		final JToolBar jTtoolBarDetalleCobrarSaldosVencidos=jTtoolBarDetalleAuxiliarCobrarSaldosVencidos;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCobrarSaldosVencidos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCobrarSaldosVencidos;
			processRunnable.jTableDatos=jTableDatosCobrarSaldosVencidos;
			processRunnable.jPanelCampos=jPanelCamposCobrarSaldosVencidos;
			processRunnable.jPanelPaginacion=jPanelPaginacionCobrarSaldosVencidos;
			processRunnable.jPanelAcciones=jPanelAccionesCobrarSaldosVencidos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCobrarSaldosVencidos;
			
			
			processRunnable.jmenuBar=jmenuBarCobrarSaldosVencidos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCobrarSaldosVencidos;
			processRunnable.jTtoolBar=jTtoolBarCobrarSaldosVencidos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCobrarSaldosVencidos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasCobrarSaldosVencidos ,jPanelParametrosReportesCobrarSaldosVencidos, jTableDatosCobrarSaldosVencidos,/*jScrollPanelDatosCobrarSaldosVencidos,*/jPanelCamposCobrarSaldosVencidos,jPanelPaginacionCobrarSaldosVencidos, /*jScrollPanelDatosEdicionCobrarSaldosVencidos,*/ jPanelAccionesCobrarSaldosVencidos,jPanelAccionesFormularioCobrarSaldosVencidos,jmenuBarCobrarSaldosVencidos,jmenuBarDetalleCobrarSaldosVencidos,jTtoolBarCobrarSaldosVencidos,jTtoolBarDetalleCobrarSaldosVencidos));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesCobrarSaldosVencidos(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarCobrarSaldosVencidos(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuCobrarSaldosVencidos(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarCobrarSaldosVencidos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarCobrarSaldosVencidos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleCobrarSaldosVencidos,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuCobrarSaldosVencidos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarCobrarSaldosVencidos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleCobrarSaldosVencidos,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.cobrarsaldosvencidosConstantesFunciones.getsFinalQueryCobrarSaldosVencidos();
		String  finalQueryPaginacionTodos=this.cobrarsaldosvencidosConstantesFunciones.getsFinalQueryCobrarSaldosVencidos();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=CobrarSaldosVencidosConstantesFunciones.getArrayColumnasGlobalesNoCobrarSaldosVencidos(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=CobrarSaldosVencidosConstantesFunciones.getArrayColumnasGlobalesCobrarSaldosVencidos(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,CobrarSaldosVencidosConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.cobrarsaldosvencidossEliminados= new ArrayList<CobrarSaldosVencidos>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessCobrarSaldosVencidos();
		
				///*CobrarSaldosVencidosSessionBean*/this.cobrarsaldosvencidosSessionBean=new CobrarSaldosVencidosSessionBean();
			
			if(this.cobrarsaldosvencidosSessionBean==null) {
				this.cobrarsaldosvencidosSessionBean=new CobrarSaldosVencidosSessionBean();
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
					this.iNumeroPaginacion=CobrarSaldosVencidosConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=CobrarSaldosVencidosConstantesFunciones.getClassesForeignKeysOfCobrarSaldosVencidos(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/cobrarsaldosvencidos."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			cobrarsaldosvencidossAux= new ArrayList<CobrarSaldosVencidos>();
			
				
			cobrarsaldosvencidosLogic.setDatosCliente(this.datosCliente);
			cobrarsaldosvencidosLogic.setDatosDeep(this.datosDeep);
			cobrarsaldosvencidosLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaCobrarSaldosVencidos")) {
				this.sDetalleReporte=CobrarSaldosVencidosConstantesFunciones.getDetalleIndiceBusquedaCobrarSaldosVencidos(id_grupo_clienteBusquedaCobrarSaldosVencidos);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cobrarsaldosvencidosLogic.getCobrarSaldosVencidossBusquedaCobrarSaldosVencidos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_grupo_clienteBusquedaCobrarSaldosVencidos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CobrarSaldosVencidosConstantesFunciones.getDetalleIndiceBusquedaCobrarSaldosVencidos(id_grupo_clienteBusquedaCobrarSaldosVencidos);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CobrarSaldosVencidosConstantesFunciones.getDetalleIndiceBusquedaCobrarSaldosVencidos(id_grupo_clienteBusquedaCobrarSaldosVencidos);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cobrarsaldosvencidosLogic.getCobrarSaldosVencidoss()==null||cobrarsaldosvencidosLogic.getCobrarSaldosVencidoss().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cobrarsaldosvencidoss==null|| cobrarsaldosvencidoss.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cobrarsaldosvencidossAux=new ArrayList<CobrarSaldosVencidos>();
						cobrarsaldosvencidossAux.addAll(cobrarsaldosvencidosLogic.getCobrarSaldosVencidoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cobrarsaldosvencidossAux=new ArrayList<CobrarSaldosVencidos>();
							cobrarsaldosvencidossAux.addAll(cobrarsaldosvencidoss);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cobrarsaldosvencidosLogic.getCobrarSaldosVencidossBusquedaCobrarSaldosVencidos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_grupo_clienteBusquedaCobrarSaldosVencidos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CobrarSaldosVencidosConstantesFunciones.getDetalleIndiceBusquedaCobrarSaldosVencidos(id_grupo_clienteBusquedaCobrarSaldosVencidos);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CobrarSaldosVencidosConstantesFunciones.getDetalleIndiceBusquedaCobrarSaldosVencidos(id_grupo_clienteBusquedaCobrarSaldosVencidos);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCobrarSaldosVencidoss("BusquedaCobrarSaldosVencidos",cobrarsaldosvencidosLogic.getCobrarSaldosVencidoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCobrarSaldosVencidoss("BusquedaCobrarSaldosVencidos",cobrarsaldosvencidoss);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cobrarsaldosvencidosLogic.setCobrarSaldosVencidoss(new ArrayList<CobrarSaldosVencidos>());
						cobrarsaldosvencidosLogic.getCobrarSaldosVencidoss().addAll(cobrarsaldosvencidossAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cobrarsaldosvencidoss=new ArrayList<CobrarSaldosVencidos>();
							cobrarsaldosvencidoss.addAll(cobrarsaldosvencidossAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesCobrarSaldosVencidos();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessCobrarSaldosVencidos();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=cobrarsaldosvencidosLogic.getCobrarSaldosVencidoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cobrarsaldosvencidoss.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=cobrarsaldosvencidosLogic.getCobrarSaldosVencidoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cobrarsaldosvencidoss.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(CobrarSaldosVencidos cobrarsaldosvencidos) {
		Boolean permite=true;
		
		if(this.cobrarsaldosvencidos.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=CobrarSaldosVencidosConstantesFunciones.getOrderByListaCobrarSaldosVencidos();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=CobrarSaldosVencidosConstantesFunciones.getOrderByListaCobrarSaldosVencidos();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CobrarSaldosVencidos cobrarsaldosvencidos:cobrarsaldosvencidosLogic.getCobrarSaldosVencidoss()) {
				if(cobrarsaldosvencidos.getsType().equals(Constantes2.S_TOTALES)) {
					cobrarsaldosvencidosTotales=cobrarsaldosvencidos;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CobrarSaldosVencidos cobrarsaldosvencidos:this.cobrarsaldosvencidoss) {
				if(cobrarsaldosvencidos.getsType().equals(Constantes2.S_TOTALES)) {
					cobrarsaldosvencidosTotales=cobrarsaldosvencidos;
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
			this.cobrarsaldosvencidosAux=new CobrarSaldosVencidos();
			this.cobrarsaldosvencidosAux.setsType(Constantes2.S_TOTALES);
			this.cobrarsaldosvencidosAux.setIsNew(false);
			this.cobrarsaldosvencidosAux.setIsChanged(false);
			this.cobrarsaldosvencidosAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//CobrarSaldosVencidosConstantesFunciones.TotalizarValoresFilaCobrarSaldosVencidos(this.cobrarsaldosvencidosLogic.getCobrarSaldosVencidoss(),this.cobrarsaldosvencidosAux);
				
				//this.cobrarsaldosvencidosLogic.getCobrarSaldosVencidoss().add(this.cobrarsaldosvencidosAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				CobrarSaldosVencidosConstantesFunciones.TotalizarValoresFilaCobrarSaldosVencidos(this.cobrarsaldosvencidoss,this.cobrarsaldosvencidosAux);
				
				this.cobrarsaldosvencidoss.add(this.cobrarsaldosvencidosAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		cobrarsaldosvencidosTotales=new CobrarSaldosVencidos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.cobrarsaldosvencidosLogic.getCobrarSaldosVencidoss().remove(cobrarsaldosvencidosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.cobrarsaldosvencidoss.remove(cobrarsaldosvencidosTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		cobrarsaldosvencidosTotales=new CobrarSaldosVencidos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CobrarSaldosVencidos cobrarsaldosvencidos:cobrarsaldosvencidosLogic.getCobrarSaldosVencidoss()) {
				if(cobrarsaldosvencidos.getsType().equals(Constantes2.S_TOTALES)) {
					cobrarsaldosvencidosTotales=cobrarsaldosvencidos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CobrarSaldosVencidosConstantesFunciones.TotalizarValoresFilaCobrarSaldosVencidos(this.cobrarsaldosvencidosLogic.getCobrarSaldosVencidoss(),cobrarsaldosvencidosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CobrarSaldosVencidos cobrarsaldosvencidos:this.cobrarsaldosvencidoss) {
				if(cobrarsaldosvencidos.getsType().equals(Constantes2.S_TOTALES)) {
					cobrarsaldosvencidosTotales=cobrarsaldosvencidos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CobrarSaldosVencidosConstantesFunciones.TotalizarValoresFilaCobrarSaldosVencidos(this.cobrarsaldosvencidoss,cobrarsaldosvencidosTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getCobrarSaldosVencidossBusquedaCobrarSaldosVencidos()throws Exception {
		try {
			sAccionBusqueda="BusquedaCobrarSaldosVencidos";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCobrarSaldosVencidossFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCobrarSaldosVencidossFK_IdGrupoCliente()throws Exception {
		try {
			sAccionBusqueda="FK_IdGrupoCliente";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getCobrarSaldosVencidossBusquedaCobrarSaldosVencidos(String sFinalQuery,Long id_grupo_cliente)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cobrarsaldosvencidosLogic.getCobrarSaldosVencidossBusquedaCobrarSaldosVencidos(sFinalQuery,this.pagination,id_grupo_cliente);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCobrarSaldosVencidossFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cobrarsaldosvencidosLogic.getCobrarSaldosVencidossFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCobrarSaldosVencidossFK_IdGrupoCliente(String sFinalQuery,Long id_grupo_cliente)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cobrarsaldosvencidosLogic.getCobrarSaldosVencidossFK_IdGrupoCliente(sFinalQuery,this.pagination,id_grupo_cliente);
				
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
								
			//this.procesarBusqueda(sAccionBusqueda);
			
		} catch (Exception e) {
			throw e;
		}
	}		
	
	public void inicializarPermisosCobrarSaldosVencidos() {
		this.isPermisoTodoCobrarSaldosVencidos=false;
		this.isPermisoNuevoCobrarSaldosVencidos=false;
		this.isPermisoActualizarCobrarSaldosVencidos=false;
		this.isPermisoActualizarOriginalCobrarSaldosVencidos=false;
		this.isPermisoEliminarCobrarSaldosVencidos=false;
		this.isPermisoGuardarCambiosCobrarSaldosVencidos=false;
		this.isPermisoConsultaCobrarSaldosVencidos=true;
		this.isPermisoBusquedaCobrarSaldosVencidos=true;
		this.isPermisoReporteCobrarSaldosVencidos=true;
		this.isPermisoOrdenCobrarSaldosVencidos=false;		
		this.isPermisoPaginacionMedioCobrarSaldosVencidos=false;		
		this.isPermisoPaginacionAltoCobrarSaldosVencidos=false;		
		this.isPermisoPaginacionTodoCobrarSaldosVencidos=false;		
		this.isPermisoCopiarCobrarSaldosVencidos=false;		
		this.isPermisoVerFormCobrarSaldosVencidos=false;		
		this.isPermisoDuplicarCobrarSaldosVencidos=false;
		this.isPermisoOrdenCobrarSaldosVencidos=false;
	}
	
	public void setPermisosUsuarioCobrarSaldosVencidos(Boolean isPermiso) {
		this.isPermisoTodoCobrarSaldosVencidos=isPermiso;
		this.isPermisoNuevoCobrarSaldosVencidos=isPermiso;
		this.isPermisoActualizarCobrarSaldosVencidos=isPermiso;
		this.isPermisoActualizarOriginalCobrarSaldosVencidos=isPermiso;
		this.isPermisoEliminarCobrarSaldosVencidos=isPermiso;
		this.isPermisoGuardarCambiosCobrarSaldosVencidos=isPermiso;
		this.isPermisoConsultaCobrarSaldosVencidos=isPermiso;
		this.isPermisoBusquedaCobrarSaldosVencidos=isPermiso;
		this.isPermisoReporteCobrarSaldosVencidos=isPermiso;
		this.isPermisoOrdenCobrarSaldosVencidos=isPermiso;		
		this.isPermisoPaginacionMedioCobrarSaldosVencidos=isPermiso;		
		this.isPermisoPaginacionAltoCobrarSaldosVencidos=isPermiso;		
		this.isPermisoPaginacionTodoCobrarSaldosVencidos=isPermiso;		
		this.isPermisoCopiarCobrarSaldosVencidos=isPermiso;		
		this.isPermisoVerFormCobrarSaldosVencidos=isPermiso;		
		this.isPermisoDuplicarCobrarSaldosVencidos=isPermiso;
		this.isPermisoOrdenCobrarSaldosVencidos=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioCobrarSaldosVencidos(Boolean isPermiso) {
		//this.isPermisoTodoCobrarSaldosVencidos=isPermiso;
		this.isPermisoNuevoCobrarSaldosVencidos=isPermiso;
		this.isPermisoActualizarCobrarSaldosVencidos=isPermiso;
		this.isPermisoActualizarOriginalCobrarSaldosVencidos=isPermiso;
		this.isPermisoEliminarCobrarSaldosVencidos=isPermiso;
		this.isPermisoGuardarCambiosCobrarSaldosVencidos=isPermiso;
		//this.isPermisoConsultaCobrarSaldosVencidos=isPermiso;
		//this.isPermisoBusquedaCobrarSaldosVencidos=isPermiso;
		//this.isPermisoReporteCobrarSaldosVencidos=isPermiso;
		//this.isPermisoOrdenCobrarSaldosVencidos=isPermiso;		
		//this.isPermisoPaginacionMedioCobrarSaldosVencidos=isPermiso;		
		//this.isPermisoPaginacionAltoCobrarSaldosVencidos=isPermiso;		
		//this.isPermisoPaginacionTodoCobrarSaldosVencidos=isPermiso;		
		//this.isPermisoCopiarCobrarSaldosVencidos=isPermiso;		
		//this.isPermisoDuplicarCobrarSaldosVencidos=isPermiso;
		//this.isPermisoOrdenCobrarSaldosVencidos=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioCobrarSaldosVencidosClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(CobrarSaldosVencidosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebCobrarSaldosVencidos(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioCobrarSaldosVencidosClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioCobrarSaldosVencidosClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionCobrarSaldosVencidosClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioCobrarSaldosVencidosClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioCobrarSaldosVencidos() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(CobrarSaldosVencidosJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.cobrarsaldosvencidosSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, CobrarSaldosVencidosConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoCobrarSaldosVencidos=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarCobrarSaldosVencidos=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalCobrarSaldosVencidos=this.isPermisoActualizarCobrarSaldosVencidos;
			this.isPermisoEliminarCobrarSaldosVencidos=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosCobrarSaldosVencidos=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaCobrarSaldosVencidos=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaCobrarSaldosVencidos=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoCobrarSaldosVencidos=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteCobrarSaldosVencidos=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCobrarSaldosVencidos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioCobrarSaldosVencidos=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoCobrarSaldosVencidos=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoCobrarSaldosVencidos=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarCobrarSaldosVencidos=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormCobrarSaldosVencidos=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarCobrarSaldosVencidos=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCobrarSaldosVencidos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.cobrarsaldosvencidosSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosCobrarSaldosVencidos.setToolTipText(this.jTableDatosCobrarSaldosVencidos.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioCobrarSaldosVencidos(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioCobrarSaldosVencidos(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(CobrarSaldosVencidosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(CobrarSaldosVencidosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioCobrarSaldosVencidos() throws Exception {
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
	public void inicializarCombosForeignKeyCobrarSaldosVencidosListas()throws Exception {
		try	{						
			
				this.grupoclientesForeignKey=new ArrayList();
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyCobrarSaldosVencidosListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(CobrarSaldosVencidosJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyGrupoClienteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	
	public void addItemDefectoCombosTodosForeignKeyCobrarSaldosVencidos()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyGrupoCliente();
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyGrupoCliente()throws Exception {
		try {
			if(this.cobrarsaldosvencidosSessionBean==null) {
				this.cobrarsaldosvencidosSessionBean=new CobrarSaldosVencidosSessionBean();
			}

			if(!this.cobrarsaldosvencidosSessionBean.getisBusquedaDesdeForeignKeySesionGrupoCliente()) {
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

	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {

			if(!this.cobrarsaldosvencidosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyCobrarSaldosVencidos()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyCobrarSaldosVencidos(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyCobrarSaldosVencidos()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyCobrarSaldosVencidos();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyCobrarSaldosVencidos(CobrarSaldosVencidos cobrarsaldosvencidos)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyCobrarSaldosVencidos(CobrarSaldosVencidos cobrarsaldosvencidos,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyCobrarSaldosVencidos()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyCobrarSaldosVencidos()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyCobrarSaldosVencidos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyCobrarSaldosVencidos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroCobrarSaldosVencidos()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyCobrarSaldosVencidos()throws Exception {
		try {
			

			this.cargarCombosFrameGrupoClientesForeignKey("Todos");
			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyCobrarSaldosVencidos(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameGrupoClientesForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyCobrarSaldosVencidos()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormCobrarSaldosVencidos.jComboBoxid_grupo_clienteCobrarSaldosVencidos!=null && this.jInternalFrameDetalleFormCobrarSaldosVencidos.jComboBoxid_grupo_clienteCobrarSaldosVencidos.getItemCount()>0) {
				this.jInternalFrameDetalleFormCobrarSaldosVencidos.jComboBoxid_grupo_clienteCobrarSaldosVencidos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCobrarSaldosVencidos.jComboBoxid_empresaCobrarSaldosVencidos!=null && this.jInternalFrameDetalleFormCobrarSaldosVencidos.jComboBoxid_empresaCobrarSaldosVencidos.getItemCount()>0) {
				this.jInternalFrameDetalleFormCobrarSaldosVencidos.jComboBoxid_empresaCobrarSaldosVencidos.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	




	
	

	public CobrarSaldosVencidosBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public CobrarSaldosVencidosBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public CobrarSaldosVencidosBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.cobrarsaldosvencidosSessionBean=new CobrarSaldosVencidosSessionBean(); 
		this.cobrarsaldosvencidosConstantesFunciones=new CobrarSaldosVencidosConstantesFunciones(); 
		this.cobrarsaldosvencidosBean=new CobrarSaldosVencidos();//(this.cobrarsaldosvencidosConstantesFunciones); 		
		this.cobrarsaldosvencidosReturnGeneral=new CobrarSaldosVencidosParameterReturnGeneral(); 
		
		this.cobrarsaldosvencidosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cobrarsaldosvencidosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public CobrarSaldosVencidosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public CobrarSaldosVencidosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public CobrarSaldosVencidosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessCobrarSaldosVencidos(true);
			
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
			
			this.cobrarsaldosvencidosConstantesFunciones=new CobrarSaldosVencidosConstantesFunciones(); 
			this.cobrarsaldosvencidosBean=new CobrarSaldosVencidos();//this.cobrarsaldosvencidosConstantesFunciones); 			
			this.cobrarsaldosvencidosReturnGeneral=new CobrarSaldosVencidosParameterReturnGeneral(); 
		
			CobrarSaldosVencidosBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Cobrar Saldos Vencidos Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.cobrarsaldosvencidos=new CobrarSaldosVencidos();
			this.cobrarsaldosvencidoss = new ArrayList<CobrarSaldosVencidos>();
			this.cobrarsaldosvencidossAux = new ArrayList<CobrarSaldosVencidos>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarsaldosvencidosLogic=new CobrarSaldosVencidosLogic();
				this.cobrarsaldosvencidosLogic.getNewConnexionToDeep("");
			}
			
			//this.cobrarsaldosvencidosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.cobrarsaldosvencidosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormCobrarSaldosVencidos);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoCobrarSaldosVencidos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCobrarSaldosVencidos);	
					}
					
					if(this.jInternalFrameImportacionCobrarSaldosVencidos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCobrarSaldosVencidos);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByCobrarSaldosVencidos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByCobrarSaldosVencidos);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormCobrarSaldosVencidos!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormCobrarSaldosVencidos);
				this.jInternalFrameDetalleFormCobrarSaldosVencidos.setVisible(false);
				this.jInternalFrameDetalleFormCobrarSaldosVencidos.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoCobrarSaldosVencidos!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCobrarSaldosVencidos);
					this.jInternalFrameReporteDinamicoCobrarSaldosVencidos.setVisible(false);
					this.jInternalFrameReporteDinamicoCobrarSaldosVencidos.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionCobrarSaldosVencidos!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionCobrarSaldosVencidos);
					this.jInternalFrameImportacionCobrarSaldosVencidos.setVisible(false);
					this.jInternalFrameImportacionCobrarSaldosVencidos.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByCobrarSaldosVencidos!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByCobrarSaldosVencidos);
					this.jInternalFrameOrderByCobrarSaldosVencidos.setVisible(false);
					this.jInternalFrameOrderByCobrarSaldosVencidos.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idCobrarSaldosVencidosActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=CobrarSaldosVencidosConstantesFunciones.INUMEROPAGINACION;
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
			
			this.cobrarsaldosvencidosReturnGeneral=new CobrarSaldosVencidosParameterReturnGeneral();
			
			this.cobrarsaldosvencidosParameterGeneral=new CobrarSaldosVencidosParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.cobrarsaldosvencidosLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.cobrarsaldosvencidosSessionBean.getEsGuardarRelacionado()) {
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
			
			if(CobrarSaldosVencidosJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.cobrarsaldosvencidosSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CobrarSaldosVencidosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.cobrarsaldosvencidosSessionBean.getEsGuardarRelacionado(),this.cobrarsaldosvencidosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CobrarSaldosVencidosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.cobrarsaldosvencidosSessionBean.getEsGuardarRelacionado(),this.cobrarsaldosvencidosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoCobrarSaldosVencidos=false;
			this.isVisibilidadCeldaDuplicarCobrarSaldosVencidos=true;
			this.isVisibilidadCeldaCopiarCobrarSaldosVencidos=true;
			this.isVisibilidadCeldaVerFormCobrarSaldosVencidos=true;
			this.isVisibilidadCeldaOrdenCobrarSaldosVencidos=true;
			this.isVisibilidadCeldaNuevoRelacionesCobrarSaldosVencidos=false;
			this.isVisibilidadCeldaModificarCobrarSaldosVencidos=false;
			this.isVisibilidadCeldaActualizarCobrarSaldosVencidos=false;
			this.isVisibilidadCeldaEliminarCobrarSaldosVencidos=false;
			this.isVisibilidadCeldaCancelarCobrarSaldosVencidos=false;
			this.isVisibilidadCeldaGuardarCobrarSaldosVencidos=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarSaldosVencidos=false;
			
			
			this.isVisibilidadBusquedaCobrarSaldosVencidos=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdGrupoCliente=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesCobrarSaldosVencidos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosCobrarSaldosVencidos();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioCobrarSaldosVencidos(false);
			
			this.setPermisosUsuarioCobrarSaldosVencidos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cobrarsaldosvencidosSessionBean.getEsGuardarRelacionado() 
				|| (this.cobrarsaldosvencidosSessionBean.getEsGuardarRelacionado() && this.cobrarsaldosvencidosSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioCobrarSaldosVencidosClasesRelacionadas();
			}
			
			if(this.cobrarsaldosvencidosSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioCobrarSaldosVencidosClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!CobrarSaldosVencidosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosCobrarSaldosVencidos();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualCobrarSaldosVencidos();
			}
			
			if(!this.isPermisoBusquedaCobrarSaldosVencidos) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasCobrarSaldosVencidos.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cobrarsaldosvencidosSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(CobrarSaldosVencidosConstantesFunciones.getTiposSeleccionarCobrarSaldosVencidos());
				
				this.tiposColumnasSelect=CobrarSaldosVencidosConstantesFunciones.getTiposSeleccionarCobrarSaldosVencidos(true);
				
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
			//if(!this.cobrarsaldosvencidosSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioCobrarSaldosVencidos();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioCobrarSaldosVencidos(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioCobrarSaldosVencidos(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesCobrarSaldosVencidos() ;
			
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
			
			this.grupoclienteLogic=new GrupoClienteLogic();
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
				cobrarsaldosvencidosImplementable= (CobrarSaldosVencidosImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CobrarSaldosVencidosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				cobrarsaldosvencidosImplementableHome= (CobrarSaldosVencidosImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CobrarSaldosVencidosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.cobrarsaldosvencidoss= new ArrayList<CobrarSaldosVencidos>();
			this.cobrarsaldosvencidossEliminados= new ArrayList<CobrarSaldosVencidos>();
						
			this.isEsNuevoCobrarSaldosVencidos=false;
			this.esParaAccionDesdeFormularioCobrarSaldosVencidos=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.grupoclientesForeignKey=new ArrayList<GrupoCliente>() ;
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyCobrarSaldosVencidos(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroCobrarSaldosVencidos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cobrarsaldosvencidosSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			CobrarSaldosVencidosBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=CobrarSaldosVencidosConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesCobrarSaldosVencidos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingCobrarSaldosVencidos(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormCobrarSaldosVencidos!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioCobrarSaldosVencidos();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioCobrarSaldosVencidos();
			}
			
			CobrarSaldosVencidosBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasCobrarSaldosVencidos.getTabCount(); i++) {
					this.jTabbedPaneBusquedasCobrarSaldosVencidos.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasCobrarSaldosVencidos.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarsaldosvencidosLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessCobrarSaldosVencidos(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga CobrarSaldosVencidos: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarsaldosvencidosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarsaldosvencidosLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectCobrarSaldosVencidos() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesCobrarSaldosVencidos")) {
				iIndex=this.jInternalFrameDetalleFormCobrarSaldosVencidos.jTabbedPaneRelacionesCobrarSaldosVencidos.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormCobrarSaldosVencidos.jTabbedPaneRelacionesCobrarSaldosVencidos.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosCobrarSaldosVencidos.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessCobrarSaldosVencidos();	
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
	
	public void cargarCombosForeignKeyCobrarSaldosVencidos(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyCobrarSaldosVencidos(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyCobrarSaldosVencidos(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyCobrarSaldosVencidosListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyCobrarSaldosVencidos();
		
		this.cargarCombosFrameForeignKeyCobrarSaldosVencidos();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyCobrarSaldosVencidos();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyCobrarSaldosVencidos();
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
	
	public void jButtonNuevoCobrarSaldosVencidosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.cobrarsaldosvencidosSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormCobrarSaldosVencidos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			CobrarSaldosVencidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cobrarsaldosvencidos,new Object(),this.cobrarsaldosvencidosParameterGeneral,this.cobrarsaldosvencidosReturnGeneral);
			
			
			if(jTableDatosCobrarSaldosVencidos.getRowCount()>=1) {
				jTableDatosCobrarSaldosVencidos.removeRowSelectionInterval(0, jTableDatosCobrarSaldosVencidos.getRowCount()-1);						
			}
			
			this.isEsNuevoCobrarSaldosVencidos=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoCobrarSaldosVencidos(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesCobrarSaldosVencidos(true);			
			//this.cobrarsaldosvencidos=new CobrarSaldosVencidos();
			//this.cobrarsaldosvencidos.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCobrarSaldosVencidos(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCobrarSaldosVencidos() ;
			
			if(CobrarSaldosVencidosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCobrarSaldosVencidos(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.cobrarsaldosvencidos);	
			this.actualizarInformacion("INFO_PADRE",false,this.cobrarsaldosvencidos);				
			
			CobrarSaldosVencidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cobrarsaldosvencidos,new Object(),this.cobrarsaldosvencidosParameterGeneral,this.cobrarsaldosvencidosReturnGeneral);
			
			if(this.cobrarsaldosvencidosSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar CobrarSaldosVencidos: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			CobrarSaldosVencidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.cobrarsaldosvencidos,new Object(),this.cobrarsaldosvencidosParameterGeneral,this.cobrarsaldosvencidosReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarCobrarSaldosVencidosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<CobrarSaldosVencidos> cobrarsaldosvencidossSeleccionados=new ArrayList<CobrarSaldosVencidos>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosCobrarSaldosVencidos.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosCobrarSaldosVencidos.getSelectedRows().length;			
			}
			
			cobrarsaldosvencidossSeleccionados=this.getCobrarSaldosVencidossSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoCobrarSaldosVencidos--;			
				//CobrarSaldosVencidos cobrarsaldosvencidosAux= new CobrarSaldosVencidos();			
				//cobrarsaldosvencidosAux.setId(this.iIdNuevoCobrarSaldosVencidos);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//CobrarSaldosVencidos cobrarsaldosvencidosOrigen=new CobrarSaldosVencidos();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(CobrarSaldosVencidos cobrarsaldosvencidosOrigen : cobrarsaldosvencidossSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosCobrarSaldosVencidos.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							cobrarsaldosvencidosOrigen =(CobrarSaldosVencidos) this.cobrarsaldosvencidosLogic.getCobrarSaldosVencidoss().toArray()[this.jTableDatosCobrarSaldosVencidos.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cobrarsaldosvencidosOrigen =(CobrarSaldosVencidos) this.cobrarsaldosvencidoss.toArray()[this.jTableDatosCobrarSaldosVencidos.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaCobrarSaldosVencidos();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.cobrarsaldosvencidos.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosCobrarSaldosVencidos(cobrarsaldosvencidosOrigen,this.cobrarsaldosvencidos,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarSaldosVencidos(this.cobrarsaldosvencidos);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.cobrarsaldosvencidosLogic.getCobrarSaldosVencidoss().add(this.cobrarsaldosvencidosAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.cobrarsaldosvencidoss.add(this.cobrarsaldosvencidosAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaCobrarSaldosVencidos(false);
				
				this.jTableDatosCobrarSaldosVencidos.setRowSelectionInterval(this.getIndiceNuevoCobrarSaldosVencidos(), this.getIndiceNuevoCobrarSaldosVencidos());
				
				int iLastRow =  this.jTableDatosCobrarSaldosVencidos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCobrarSaldosVencidos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCobrarSaldosVencidos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCobrarSaldosVencidos(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarCobrarSaldosVencidosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<CobrarSaldosVencidos> cobrarsaldosvencidossSeleccionados=new ArrayList<CobrarSaldosVencidos>();									
		
			CobrarSaldosVencidos cobrarsaldosvencidosOrigen=new CobrarSaldosVencidos();
			CobrarSaldosVencidos cobrarsaldosvencidosDestino=new CobrarSaldosVencidos();
				
			cobrarsaldosvencidossSeleccionados=this.getCobrarSaldosVencidossSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosCobrarSaldosVencidos.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || cobrarsaldosvencidossSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosCobrarSaldosVencidos.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cobrarsaldosvencidosOrigen =(CobrarSaldosVencidos) this.cobrarsaldosvencidosLogic.getCobrarSaldosVencidoss().toArray()[this.jTableDatosCobrarSaldosVencidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						cobrarsaldosvencidosOrigen =(CobrarSaldosVencidos) this.cobrarsaldosvencidoss.toArray()[this.jTableDatosCobrarSaldosVencidos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cobrarsaldosvencidosDestino =(CobrarSaldosVencidos) this.cobrarsaldosvencidosLogic.getCobrarSaldosVencidoss().toArray()[this.jTableDatosCobrarSaldosVencidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						cobrarsaldosvencidosDestino =(CobrarSaldosVencidos) this.cobrarsaldosvencidoss.toArray()[this.jTableDatosCobrarSaldosVencidos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				cobrarsaldosvencidosOrigen =cobrarsaldosvencidossSeleccionados.get(0);
				cobrarsaldosvencidosDestino =cobrarsaldosvencidossSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosCobrarSaldosVencidos(cobrarsaldosvencidosOrigen,cobrarsaldosvencidosDestino,true,false);
				
				cobrarsaldosvencidosDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(cobrarsaldosvencidosDestino,cobrarsaldosvencidosLogic.getCobrarSaldosVencidoss());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cobrarsaldosvencidosDestino,cobrarsaldosvencidoss);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaCobrarSaldosVencidos(false);
				
				//this.jTableDatosCobrarSaldosVencidos.setRowSelectionInterval(this.getIndiceNuevoCobrarSaldosVencidos(), this.getIndiceNuevoCobrarSaldosVencidos());
				
				int iLastRow =  this.jTableDatosCobrarSaldosVencidos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCobrarSaldosVencidos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCobrarSaldosVencidos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCobrarSaldosVencidos(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormCobrarSaldosVencidosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCobrarSaldosVencidos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormCobrarSaldosVencidos.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarCobrarSaldosVencidosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesCobrarSaldosVencidos.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasCobrarSaldosVencidos.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesCobrarSaldosVencidos.setVisible(!isVisible);
			this.jPanelPaginacionCobrarSaldosVencidos.setVisible(!isVisible);
			this.jPanelAccionesCobrarSaldosVencidos.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarCobrarSaldosVencidosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameCobrarSaldosVencidos();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoCobrarSaldosVencidosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoCobrarSaldosVencidos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionCobrarSaldosVencidosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionCobrarSaldosVencidos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByCobrarSaldosVencidosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByCobrarSaldosVencidos();
			
			this.abrirFrameOrderByCobrarSaldosVencidos();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByCobrarSaldosVencidosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByCobrarSaldosVencidos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleCobrarSaldosVencidos(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormCobrarSaldosVencidos);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormCobrarSaldosVencidos.isMaximum()) {
					this.jInternalFrameDetalleFormCobrarSaldosVencidos.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormCobrarSaldosVencidos.setSize(this.jInternalFrameDetalleFormCobrarSaldosVencidos.iWidthFormulario,this.jInternalFrameDetalleFormCobrarSaldosVencidos.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormCobrarSaldosVencidos.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormCobrarSaldosVencidos.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormCobrarSaldosVencidos.isMaximum()) {
						this.jInternalFrameDetalleFormCobrarSaldosVencidos.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormCobrarSaldosVencidos.jContentPaneDetalleCobrarSaldosVencidos.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormCobrarSaldosVencidos.jTabbedPaneRelacionesCobrarSaldosVencidos.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormCobrarSaldosVencidos.jContentPaneDetalleCobrarSaldosVencidos.getWidth(),CobrarSaldosVencidosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCobrarSaldosVencidos.jTabbedPaneRelacionesCobrarSaldosVencidos.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormCobrarSaldosVencidos.jContentPaneDetalleCobrarSaldosVencidos.getWidth(),CobrarSaldosVencidosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCobrarSaldosVencidos.jTabbedPaneRelacionesCobrarSaldosVencidos.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormCobrarSaldosVencidos.jContentPaneDetalleCobrarSaldosVencidos.getWidth(),CobrarSaldosVencidosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormCobrarSaldosVencidos.setVisible(true);
	        this.jInternalFrameDetalleFormCobrarSaldosVencidos.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByCobrarSaldosVencidos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByCobrarSaldosVencidos==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByCobrarSaldosVencidos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCobrarSaldosVencidos,false,this);
				} else {
					this.jInternalFrameOrderByCobrarSaldosVencidos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCobrarSaldosVencidos,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByCobrarSaldosVencidos);
				this.jInternalFrameOrderByCobrarSaldosVencidos.setVisible(false);
				this.jInternalFrameOrderByCobrarSaldosVencidos.setSelected(false);
				
				this.jInternalFrameOrderByCobrarSaldosVencidos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCobrarSaldosVencidos"));
				
				this.inicializarActualizarBindingTablaOrderByCobrarSaldosVencidos();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionCobrarSaldosVencidos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionCobrarSaldosVencidos==null) {
				
				this.jInternalFrameImportacionCobrarSaldosVencidos=new ImportacionJInternalFrame(CobrarSaldosVencidosConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCobrarSaldosVencidos);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionCobrarSaldosVencidos);
				this.jInternalFrameImportacionCobrarSaldosVencidos.setVisible(false);
				this.jInternalFrameImportacionCobrarSaldosVencidos.setSelected(false);


				this.jInternalFrameImportacionCobrarSaldosVencidos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCobrarSaldosVencidos"));
				this.jInternalFrameImportacionCobrarSaldosVencidos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCobrarSaldosVencidos"));
				this.jInternalFrameImportacionCobrarSaldosVencidos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCobrarSaldosVencidos"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoCobrarSaldosVencidos() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoCobrarSaldosVencidos==null) {
				this.jInternalFrameReporteDinamicoCobrarSaldosVencidos=new ReporteDinamicoJInternalFrame(CobrarSaldosVencidosConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCobrarSaldosVencidos);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCobrarSaldosVencidos);
				this.jInternalFrameReporteDinamicoCobrarSaldosVencidos.setVisible(false);
				this.jInternalFrameReporteDinamicoCobrarSaldosVencidos.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoCobrarSaldosVencidos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCobrarSaldosVencidos"));
				this.jInternalFrameReporteDinamicoCobrarSaldosVencidos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCobrarSaldosVencidos"));
				this.jInternalFrameReporteDinamicoCobrarSaldosVencidos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCobrarSaldosVencidos"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCobrarSaldosVencidos();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleCobrarSaldosVencidos() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormCobrarSaldosVencidos);
			
	       	this.jInternalFrameDetalleFormCobrarSaldosVencidos.setVisible(false);
	        this.jInternalFrameDetalleFormCobrarSaldosVencidos.setSelected(false);
			
			//this.jInternalFrameDetalleFormCobrarSaldosVencidos.dispose();
			//this.jInternalFrameDetalleFormCobrarSaldosVencidos=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoCobrarSaldosVencidos() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoCobrarSaldosVencidos.setVisible(true);
	        this.jInternalFrameReporteDinamicoCobrarSaldosVencidos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionCobrarSaldosVencidos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionCobrarSaldosVencidos.setVisible(true);
	        this.jInternalFrameImportacionCobrarSaldosVencidos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByCobrarSaldosVencidos() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByCobrarSaldosVencidos.setVisible(true);
	        this.jInternalFrameOrderByCobrarSaldosVencidos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByCobrarSaldosVencidos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByCobrarSaldosVencidos.setVisible(false);
	        this.jInternalFrameOrderByCobrarSaldosVencidos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoCobrarSaldosVencidos() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoCobrarSaldosVencidos.setVisible(false);
	        this.jInternalFrameReporteDinamicoCobrarSaldosVencidos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionCobrarSaldosVencidos() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionCobrarSaldosVencidos.setVisible(false);
	        this.jInternalFrameImportacionCobrarSaldosVencidos.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarCobrarSaldosVencidosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarCobrarSaldosVencidos(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarCobrarSaldosVencidos(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCobrarSaldosVencidos.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesCobrarSaldosVencidos(true);
			//this.isEsNuevoCobrarSaldosVencidos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarsaldosvencidos =(CobrarSaldosVencidos) this.cobrarsaldosvencidosLogic.getCobrarSaldosVencidoss().toArray()[this.jTableDatosCobrarSaldosVencidos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cobrarsaldosvencidos =(CobrarSaldosVencidos) this.cobrarsaldosvencidoss.toArray()[this.jTableDatosCobrarSaldosVencidos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesCobrarSaldosVencidos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCobrarSaldosVencidos(false) ;
			
			if(cobrarsaldosvencidosSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(CobrarSaldosVencidosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCobrarSaldosVencidos(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCobrarSaldosVencidos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaCobrarSaldosVencidosActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosCobrarSaldosVencidos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarsaldosvencidos =(CobrarSaldosVencidos) this.cobrarsaldosvencidosLogic.getCobrarSaldosVencidoss().toArray()[this.jTableDatosCobrarSaldosVencidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarsaldosvencidos =(CobrarSaldosVencidos) this.cobrarsaldosvencidoss.toArray()[this.jTableDatosCobrarSaldosVencidos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarCobrarSaldosVencidos(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCobrarSaldosVencidos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCobrarSaldosVencidos.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesCobrarSaldosVencidos(true);
			//this.isEsNuevoCobrarSaldosVencidos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarsaldosvencidos =(CobrarSaldosVencidos) this.cobrarsaldosvencidosLogic.getCobrarSaldosVencidoss().toArray()[this.jTableDatosCobrarSaldosVencidos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cobrarsaldosvencidos =(CobrarSaldosVencidos) this.cobrarsaldosvencidoss.toArray()[this.jTableDatosCobrarSaldosVencidos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.cobrarsaldosvencidos.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesCobrarSaldosVencidos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesCobrarSaldosVencidos(false) ;
			
			if(CobrarSaldosVencidosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCobrarSaldosVencidos(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCobrarSaldosVencidos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaGrupoCliente(List<GrupoCliente> grupoclientesForeignKey)throws Exception{
		TableColumn tableColumnGrupoCliente=this.jTableDatosCobrarSaldosVencidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarSaldosVencidos,CobrarSaldosVencidosConstantesFunciones.LABEL_IDGRUPOCLIENTE));
		TableCellEditor tableCellEditorGrupoCliente =tableColumnGrupoCliente.getCellEditor();

		GrupoClienteTableCell grupoclienteTableCellFk=(GrupoClienteTableCell)tableCellEditorGrupoCliente;

		if(grupoclienteTableCellFk!=null) {
			grupoclienteTableCellFk.setgrupoclientesForeignKey(grupoclientesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCobrarSaldosVencidos.getSelectedRow();

		//if(intSelectedRow<=0) {
			//grupoclienteTableCellFk.setRowActual(intSelectedRow);
			//grupoclienteTableCellFk.setgrupoclientesForeignKeyActual(grupoclientesForeignKey);
		//}


		if(grupoclienteTableCellFk!=null) {
			grupoclienteTableCellFk.RecargarGrupoClientesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
		
	
	
	public void jButtonActualizarCobrarSaldosVencidosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarsaldosvencidosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesCobrarSaldosVencidos(false);
			
			//if(!this.isEsNuevoCobrarSaldosVencidos) {								
				int intSelectedRow = this.jTableDatosCobrarSaldosVencidos.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarsaldosvencidos =(CobrarSaldosVencidos) this.cobrarsaldosvencidosLogic.getCobrarSaldosVencidoss().toArray()[this.jTableDatosCobrarSaldosVencidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cobrarsaldosvencidos =(CobrarSaldosVencidos) this.cobrarsaldosvencidoss.toArray()[this.jTableDatosCobrarSaldosVencidos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(CobrarSaldosVencidosJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualCobrarSaldosVencidos(this.cobrarsaldosvencidos,true);
				this.setVariablesFormularioToObjetoActualForeignKeysCobrarSaldosVencidos(this.cobrarsaldosvencidos);
				
			}
			
			if(this.permiteMantenimiento(this.cobrarsaldosvencidos)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.cobrarsaldosvencidosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoCobrarSaldosVencidos=true;
					this.inicializarActualizarBindingTablaCobrarSaldosVencidos(false);
					this.isEsNuevoCobrarSaldosVencidos=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoCobrarSaldosVencidos=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoCobrarSaldosVencidos=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCobrarSaldosVencidos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCobrarSaldosVencidos(false);
				
				this.habilitarDeshabilitarControlesCobrarSaldosVencidos(false);
			
												
				
				if(CobrarSaldosVencidosJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleCobrarSaldosVencidos();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoCobrarSaldosVencidosActionPerformed(evt,cobrarsaldosvencidosSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualCobrarSaldosVencidos(this.cobrarsaldosvencidos,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosCobrarSaldosVencidos.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,cobrarsaldosvencidosSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarsaldosvencidosLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.cobrarsaldosvencidos.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(CobrarSaldosVencidos.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarSaldosVencidos.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarsaldosvencidosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarsaldosvencidosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarCobrarSaldosVencidosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarsaldosvencidosLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosCobrarSaldosVencidos.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarsaldosvencidos =(CobrarSaldosVencidos) this.cobrarsaldosvencidosLogic.getCobrarSaldosVencidoss().toArray()[this.jTableDatosCobrarSaldosVencidos.convertRowIndexToModel(intSelectedRow)];
				this.cobrarsaldosvencidos.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cobrarsaldosvencidos =(CobrarSaldosVencidos) this.cobrarsaldosvencidoss.toArray()[this.jTableDatosCobrarSaldosVencidos.convertRowIndexToModel(intSelectedRow)];
				this.cobrarsaldosvencidos.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.cobrarsaldosvencidos)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.cobrarsaldosvencidosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((CobrarSaldosVencidosModel) this.jTableDatosCobrarSaldosVencidos.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoCobrarSaldosVencidos=true;
				this.inicializarActualizarBindingTablaCobrarSaldosVencidos(false);
				this.isEsNuevoCobrarSaldosVencidos=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCobrarSaldosVencidos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCobrarSaldosVencidos(false);
				
				this.habilitarDeshabilitarControlesCobrarSaldosVencidos(false);
				
				
				
				if(CobrarSaldosVencidosJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleCobrarSaldosVencidos();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarsaldosvencidosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarsaldosvencidosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarsaldosvencidosLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarCobrarSaldosVencidosActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosCobrarSaldosVencidos.getRowCount()>=1) {
				jTableDatosCobrarSaldosVencidos.removeRowSelectionInterval(0, jTableDatosCobrarSaldosVencidos.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesCobrarSaldosVencidos(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaCobrarSaldosVencidos(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCobrarSaldosVencidos(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCobrarSaldosVencidos(false) ;
			
			this.isEsNuevoCobrarSaldosVencidos=false;
			
			if(CobrarSaldosVencidosJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleCobrarSaldosVencidos();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosCobrarSaldosVencidosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarsaldosvencidosLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingCobrarSaldosVencidos(false);
				
				//SI ES MANUAL
				if(CobrarSaldosVencidosJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualCobrarSaldosVencidos();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarsaldosvencidosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarsaldosvencidosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarsaldosvencidosLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosCobrarSaldosVencidosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoCobrarSaldosVencidos--;			
			//CobrarSaldosVencidos cobrarsaldosvencidosAux= new CobrarSaldosVencidos();			
			//cobrarsaldosvencidosAux.setId(this.iIdNuevoCobrarSaldosVencidos);
			
			if(this.jInternalFrameDetalleFormCobrarSaldosVencidos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaCobrarSaldosVencidos();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysCobrarSaldosVencidos(this.cobrarsaldosvencidos);
			
			this.cobrarsaldosvencidos.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.cobrarsaldosvencidosLogic.getCobrarSaldosVencidoss().add(this.cobrarsaldosvencidosAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.cobrarsaldosvencidoss.add(this.cobrarsaldosvencidosAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaCobrarSaldosVencidos(false);
			
			this.jTableDatosCobrarSaldosVencidos.setRowSelectionInterval(this.getIndiceNuevoCobrarSaldosVencidos(), this.getIndiceNuevoCobrarSaldosVencidos());
			
			int iLastRow =  this.jTableDatosCobrarSaldosVencidos.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosCobrarSaldosVencidos.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosCobrarSaldosVencidos.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaCobrarSaldosVencidos(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionCobrarSaldosVencidosActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarsaldosvencidosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingCobrarSaldosVencidos(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCobrarSaldosVencidos(false);
			
			//SI ES MANUAL
			if(CobrarSaldosVencidosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCobrarSaldosVencidos();
			}
			
			//this.abrirFrameTreeCobrarSaldosVencidos();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarsaldosvencidosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarsaldosvencidosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarsaldosvencidosLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionCobrarSaldosVencidosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionCobrarSaldosVencidosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionCobrarSaldosVencidos.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionCobrarSaldosVencidos.setFileImportacion(this.jInternalFrameImportacionCobrarSaldosVencidos.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionCobrarSaldosVencidos.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionCobrarSaldosVencidos.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionCobrarSaldosVencidos.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionCobrarSaldosVencidos.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoCobrarSaldosVencidosActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<CobrarSaldosVencidos> cobrarsaldosvencidossSeleccionados=new ArrayList<CobrarSaldosVencidos>();		

		cobrarsaldosvencidossSeleccionados=this.getCobrarSaldosVencidossSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCobrarSaldosVencidos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCobrarSaldosVencidos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("CobrarSaldosVencidosBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"CobrarSaldosVencidosBaseDesign.jrxml";
			
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
			
			this.generarReporteCobrarSaldosVencidoss("Todos",cobrarsaldosvencidossSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarsaldosvencidosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Saldos Vencidos",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoCobrarSaldosVencidos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCobrarSaldosVencidos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CobrarSaldosVencidosConstantesFunciones.LABEL_NUMEROFACTURA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroFactura_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroFactura_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroFactura_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroFactura_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarSaldosVencidosConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreGrupoCliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreGrupoCliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreGrupoCliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreGrupoCliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarSaldosVencidosConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarSaldosVencidosConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarSaldosVencidosConstantesFunciones.LABEL_FECHA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cha_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cha_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cha_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cha_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarSaldosVencidosConstantesFunciones.LABEL_FECHAVENCE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaVence_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaVence_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaVence_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaVence_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarSaldosVencidosConstantesFunciones.LABEL_FECHAEMISION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaEmision_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaEmision_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaEmision_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaEmision_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarSaldosVencidosConstantesFunciones.LABEL_SALDO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ldo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ldo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ldo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ldo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarSaldosVencidosConstantesFunciones.LABEL_TELEFONOTELEFONO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lefonoTelefono_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lefonoTelefono_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lefonoTelefono_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lefonoTelefono_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarSaldosVencidosConstantesFunciones.LABEL_DESCRIPCION:
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
		
		if(this.jInternalFrameReporteDinamicoCobrarSaldosVencidos.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoCobrarSaldosVencidos.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoCobrarSaldosVencidos.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case CobrarSaldosVencidosConstantesFunciones.LABEL_NUMEROFACTURA:
					sNombreCampoCategoria="numero_factura";
					break;

				case CobrarSaldosVencidosConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE:
					sNombreCampoCategoria="nombre_grupo_cliente";
					break;

				case CobrarSaldosVencidosConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case CobrarSaldosVencidosConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case CobrarSaldosVencidosConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoria="fecha";
					break;

				case CobrarSaldosVencidosConstantesFunciones.LABEL_FECHAVENCE:
					sNombreCampoCategoria="fecha_vence";
					break;

				case CobrarSaldosVencidosConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoria="fecha_emision";
					break;

				case CobrarSaldosVencidosConstantesFunciones.LABEL_SALDO:
					sNombreCampoCategoria="saldo";
					break;

				case CobrarSaldosVencidosConstantesFunciones.LABEL_TELEFONOTELEFONO:
					sNombreCampoCategoria="telefono_telefono";
					break;

				case CobrarSaldosVencidosConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoCobrarSaldosVencidos.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case CobrarSaldosVencidosConstantesFunciones.LABEL_NUMEROFACTURA:
					sNombreCampoCategoriaValor="numero_factura";
					break;

				case CobrarSaldosVencidosConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE:
					sNombreCampoCategoriaValor="nombre_grupo_cliente";
					break;

				case CobrarSaldosVencidosConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case CobrarSaldosVencidosConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case CobrarSaldosVencidosConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoriaValor="fecha";
					break;

				case CobrarSaldosVencidosConstantesFunciones.LABEL_FECHAVENCE:
					sNombreCampoCategoriaValor="fecha_vence";
					break;

				case CobrarSaldosVencidosConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoriaValor="fecha_emision";
					break;

				case CobrarSaldosVencidosConstantesFunciones.LABEL_SALDO:
					sNombreCampoCategoriaValor="saldo";
					break;

				case CobrarSaldosVencidosConstantesFunciones.LABEL_TELEFONOTELEFONO:
					sNombreCampoCategoriaValor="telefono_telefono";
					break;

				case CobrarSaldosVencidosConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoCobrarSaldosVencidos.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCobrarSaldosVencidos.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CobrarSaldosVencidosConstantesFunciones.LABEL_NUMEROFACTURA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Factura",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_factura");
					break;

				case CobrarSaldosVencidosConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Grupo Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_grupo_cliente");
					break;

				case CobrarSaldosVencidosConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case CobrarSaldosVencidosConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case CobrarSaldosVencidosConstantesFunciones.LABEL_FECHA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha");
					break;

				case CobrarSaldosVencidosConstantesFunciones.LABEL_FECHAVENCE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Vence",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_vence");
					break;

				case CobrarSaldosVencidosConstantesFunciones.LABEL_FECHAEMISION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Emision",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_emision");
					break;

				case CobrarSaldosVencidosConstantesFunciones.LABEL_SALDO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Saldo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"saldo");
					break;

				case CobrarSaldosVencidosConstantesFunciones.LABEL_TELEFONOTELEFONO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Telefono Telefono",sNombreCampoCategoria,sNombreCampoCategoriaValor,"telefono_telefono");
					break;

				case CobrarSaldosVencidosConstantesFunciones.LABEL_DESCRIPCION:
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
	
	public void jButtonGenerarExcelReporteDinamicoCobrarSaldosVencidosActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<CobrarSaldosVencidos> cobrarsaldosvencidossSeleccionados=new ArrayList<CobrarSaldosVencidos>();		
		
		cobrarsaldosvencidossSeleccionados=this.getCobrarSaldosVencidossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrarsaldosvencidos";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("CobrarSaldosVencidoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoCobrarSaldosVencidos.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoCobrarSaldosVencidos.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case CobrarSaldosVencidosConstantesFunciones.LABEL_IDGRUPOCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarSaldosVencidosConstantesFunciones.LABEL_IDGRUPOCLIENTE);
					iRow++;

					for(CobrarSaldosVencidos cobrarsaldosvencidos:cobrarsaldosvencidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarsaldosvencidos.getgrupocliente_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarSaldosVencidosConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarSaldosVencidosConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(CobrarSaldosVencidos cobrarsaldosvencidos:cobrarsaldosvencidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarsaldosvencidos.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarSaldosVencidosConstantesFunciones.LABEL_NUMEROFACTURA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarSaldosVencidosConstantesFunciones.LABEL_NUMEROFACTURA);
					iRow++;

					for(CobrarSaldosVencidos cobrarsaldosvencidos:cobrarsaldosvencidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarsaldosvencidos.getnumero_factura());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarSaldosVencidosConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarSaldosVencidosConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE);
					iRow++;

					for(CobrarSaldosVencidos cobrarsaldosvencidos:cobrarsaldosvencidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarsaldosvencidos.getnombre_grupo_cliente());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarSaldosVencidosConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarSaldosVencidosConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(CobrarSaldosVencidos cobrarsaldosvencidos:cobrarsaldosvencidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarsaldosvencidos.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarSaldosVencidosConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarSaldosVencidosConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(CobrarSaldosVencidos cobrarsaldosvencidos:cobrarsaldosvencidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarsaldosvencidos.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarSaldosVencidosConstantesFunciones.LABEL_FECHA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarSaldosVencidosConstantesFunciones.LABEL_FECHA);
					iRow++;

					for(CobrarSaldosVencidos cobrarsaldosvencidos:cobrarsaldosvencidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarsaldosvencidos.getfecha());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarSaldosVencidosConstantesFunciones.LABEL_FECHAVENCE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarSaldosVencidosConstantesFunciones.LABEL_FECHAVENCE);
					iRow++;

					for(CobrarSaldosVencidos cobrarsaldosvencidos:cobrarsaldosvencidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarsaldosvencidos.getfecha_vence());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarSaldosVencidosConstantesFunciones.LABEL_FECHAEMISION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarSaldosVencidosConstantesFunciones.LABEL_FECHAEMISION);
					iRow++;

					for(CobrarSaldosVencidos cobrarsaldosvencidos:cobrarsaldosvencidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarsaldosvencidos.getfecha_emision());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarSaldosVencidosConstantesFunciones.LABEL_SALDO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarSaldosVencidosConstantesFunciones.LABEL_SALDO);
					iRow++;

					for(CobrarSaldosVencidos cobrarsaldosvencidos:cobrarsaldosvencidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarsaldosvencidos.getsaldo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarSaldosVencidosConstantesFunciones.LABEL_TELEFONOTELEFONO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarSaldosVencidosConstantesFunciones.LABEL_TELEFONOTELEFONO);
					iRow++;

					for(CobrarSaldosVencidos cobrarsaldosvencidos:cobrarsaldosvencidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarsaldosvencidos.gettelefono_telefono());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarSaldosVencidosConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarSaldosVencidosConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(CobrarSaldosVencidos cobrarsaldosvencidos:cobrarsaldosvencidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarsaldosvencidos.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelCobrarSaldosVencidos(row);				
			//	iRow++;
			//}				
			
			//for(CobrarSaldosVencidos cobrarsaldosvencidosAux:cobrarsaldosvencidossSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelCobrarSaldosVencidos(cobrarsaldosvencidosAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarsaldosvencidosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Saldos Vencidos",JOptionPane.INFORMATION_MESSAGE);
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
				this.cobrarsaldosvencidosLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCobrarSaldosVencidos(false);
			
			//SI ES MANUAL
			if(CobrarSaldosVencidosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCobrarSaldosVencidos();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarsaldosvencidosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarsaldosvencidosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarsaldosvencidosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresCobrarSaldosVencidosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarsaldosvencidosLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCobrarSaldosVencidos(false);
			
			//SI ES MANUAL
			if(CobrarSaldosVencidosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCobrarSaldosVencidos();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarsaldosvencidosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarsaldosvencidosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarsaldosvencidosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesCobrarSaldosVencidosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarsaldosvencidosLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCobrarSaldosVencidos(false);
			
			//SI ES MANUAL
			if(CobrarSaldosVencidosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCobrarSaldosVencidos();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarsaldosvencidosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarsaldosvencidosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarsaldosvencidosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaCobrarSaldosVencidos() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosCobrarSaldosVencidos.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosCobrarSaldosVencidos.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosCobrarSaldosVencidos.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosCobrarSaldosVencidos.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosCobrarSaldosVencidos.setMinimumSize(dimensionMinimum);
		this.jTableDatosCobrarSaldosVencidos.setMaximumSize(dimensionMaximum);
		this.jTableDatosCobrarSaldosVencidos.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingCobrarSaldosVencidos(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingCobrarSaldosVencidos(esInicializar,true);
	}
	
	public void inicializarActualizarBindingCobrarSaldosVencidos(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaCobrarSaldosVencidos(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesCobrarSaldosVencidos(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.cobrarsaldosvencidosSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasCobrarSaldosVencidos(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCobrarSaldosVencidos(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesCobrarSaldosVencidos(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !CobrarSaldosVencidosJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!CobrarSaldosVencidosJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualCobrarSaldosVencidos() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaCobrarSaldosVencidos();
		
		this.inicializarActualizarBindingBotonesManualCobrarSaldosVencidos(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.cobrarsaldosvencidosSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualCobrarSaldosVencidos();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCobrarSaldosVencidos() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualCobrarSaldosVencidos(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualCobrarSaldosVencidos(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosCobrarSaldosVencidos.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosCobrarSaldosVencidos.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteCobrarSaldosVencidos.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormCobrarSaldosVencidos!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormCobrarSaldosVencidos.jCheckBoxPostAccionNuevoCobrarSaldosVencidos.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormCobrarSaldosVencidos.jCheckBoxPostAccionSinCerrarCobrarSaldosVencidos.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormCobrarSaldosVencidos.jCheckBoxPostAccionSinMensajeCobrarSaldosVencidos.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosCobrarSaldosVencidos.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosCobrarSaldosVencidos.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteCobrarSaldosVencidos.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormCobrarSaldosVencidos!=null) {
				this.jInternalFrameDetalleFormCobrarSaldosVencidos.jCheckBoxPostAccionNuevoCobrarSaldosVencidos.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormCobrarSaldosVencidos.jCheckBoxPostAccionSinCerrarCobrarSaldosVencidos.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormCobrarSaldosVencidos.jCheckBoxPostAccionSinMensajeCobrarSaldosVencidos.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionCobrarSaldosVencidos.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionCobrarSaldosVencidos.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormCobrarSaldosVencidos!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormCobrarSaldosVencidos.jComboBoxTiposAccionesFormularioCobrarSaldosVencidos.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesCobrarSaldosVencidos.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoCobrarSaldosVencidos!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCobrarSaldosVencidos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesCobrarSaldosVencidos.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesCobrarSaldosVencidos.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarCobrarSaldosVencidos.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesCobrarSaldosVencidos.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoCobrarSaldosVencidos!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCobrarSaldosVencidos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesCobrarSaldosVencidos.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralCobrarSaldosVencidos.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesCobrarSaldosVencidos(Boolean esInicializar) throws Exception {
		try	{	
			if(CobrarSaldosVencidosJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualCobrarSaldosVencidos(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesCobrarSaldosVencidos() throws Exception {
		try	{
			if(CobrarSaldosVencidosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualCobrarSaldosVencidos();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCobrarSaldosVencidos() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jComboBoxTiposAccionesFormularioCobrarSaldosVencidos.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormCobrarSaldosVencidos.jComboBoxTiposAccionesFormularioCobrarSaldosVencidos.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualCobrarSaldosVencidos() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesCobrarSaldosVencidos.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesCobrarSaldosVencidos.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesCobrarSaldosVencidos.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesCobrarSaldosVencidos.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesCobrarSaldosVencidos.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesCobrarSaldosVencidos.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionCobrarSaldosVencidos.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionCobrarSaldosVencidos.addItem(reporte);
			}
			
			
			if(!this.cobrarsaldosvencidosSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionCobrarSaldosVencidos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionCobrarSaldosVencidos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesCobrarSaldosVencidos.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesCobrarSaldosVencidos.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesCobrarSaldosVencidos.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesCobrarSaldosVencidos.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormCobrarSaldosVencidos!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormCobrarSaldosVencidos.jComboBoxTiposAccionesFormularioCobrarSaldosVencidos.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormCobrarSaldosVencidos.jComboBoxTiposAccionesFormularioCobrarSaldosVencidos.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarCobrarSaldosVencidos.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarCobrarSaldosVencidos.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarCobrarSaldosVencidos.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCobrarSaldosVencidos();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCobrarSaldosVencidos() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCobrarSaldosVencidos!=null) {
				this.jInternalFrameReporteDinamicoCobrarSaldosVencidos.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoCobrarSaldosVencidos.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCobrarSaldosVencidos!=null) {
				this.jInternalFrameReporteDinamicoCobrarSaldosVencidos.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoCobrarSaldosVencidos.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoCobrarSaldosVencidos!=null) {
				
				if(this.jInternalFrameReporteDinamicoCobrarSaldosVencidos.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCobrarSaldosVencidos.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCobrarSaldosVencidos.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoCobrarSaldosVencidos.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCobrarSaldosVencidos.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCobrarSaldosVencidos.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoCobrarSaldosVencidos.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoCobrarSaldosVencidos.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=CobrarSaldosVencidosConstantesFunciones.getTiposSeleccionarCobrarSaldosVencidos(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoCobrarSaldosVencidos.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoCobrarSaldosVencidos.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoCobrarSaldosVencidos.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=CobrarSaldosVencidosConstantesFunciones.getTiposSeleccionarCobrarSaldosVencidos(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoCobrarSaldosVencidos.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoCobrarSaldosVencidos.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoCobrarSaldosVencidos.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=CobrarSaldosVencidosConstantesFunciones.getTiposSeleccionarCobrarSaldosVencidos(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCobrarSaldosVencidos.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoCobrarSaldosVencidos.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoCobrarSaldosVencidos.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoCobrarSaldosVencidos.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualCobrarSaldosVencidos()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_grupo_clienteBusquedaCobrarSaldosVencidosCobrarSaldosVencidos.getSelectedItem()!=null){this.id_grupo_clienteBusquedaCobrarSaldosVencidos=((GrupoCliente)this.jComboBoxid_grupo_clienteBusquedaCobrarSaldosVencidosCobrarSaldosVencidos.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasCobrarSaldosVencidos(Boolean esInicializar) throws Exception {				
		if(CobrarSaldosVencidosJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualCobrarSaldosVencidos();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaCobrarSaldosVencidos() throws Exception {
		this.inicializarActualizarBindingTablaCobrarSaldosVencidos(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByCobrarSaldosVencidos() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByCobrarSaldosVencidos.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByCobrarSaldosVencidos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCobrarSaldosVencidos.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new CobrarSaldosVencidosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByCobrarSaldosVencidos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCobrarSaldosVencidos.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new CobrarSaldosVencidosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosCobrarSaldosVencidosOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarSaldosVencidosOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new CobrarSaldosVencidosPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByCobrarSaldosVencidos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCobrarSaldosVencidos.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new CobrarSaldosVencidosPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByCobrarSaldosVencidos.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaCobrarSaldosVencidos(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=cobrarsaldosvencidosLogic.getCobrarSaldosVencidoss().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=cobrarsaldosvencidoss.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(CobrarSaldosVencidosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosCobrarSaldosVencidos.setModel(new CobrarSaldosVencidosModel(this.cobrarsaldosvencidosLogic.getCobrarSaldosVencidoss(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosCobrarSaldosVencidos.setModel(new CobrarSaldosVencidosModel(this.cobrarsaldosvencidoss,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByCobrarSaldosVencidos!=null && this.jInternalFrameOrderByCobrarSaldosVencidos.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByCobrarSaldosVencidos();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosCobrarSaldosVencidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarSaldosVencidos,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new CobrarSaldosVencidosPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+CobrarSaldosVencidosConstantesFunciones.SCLASSWEBTITULO,cobrarsaldosvencidosConstantesFunciones.resaltarSeleccionarCobrarSaldosVencidos,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+CobrarSaldosVencidosConstantesFunciones.SCLASSWEBTITULO,cobrarsaldosvencidosConstantesFunciones.resaltarSeleccionarCobrarSaldosVencidos,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosCobrarSaldosVencidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarSaldosVencidos,CobrarSaldosVencidosConstantesFunciones.LABEL_ID));

		if(this.cobrarsaldosvencidosConstantesFunciones.mostraridCobrarSaldosVencidos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarSaldosVencidosConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cobrarsaldosvencidosConstantesFunciones.resaltaridCobrarSaldosVencidos,this.cobrarsaldosvencidosConstantesFunciones.activaridCobrarSaldosVencidos,iSizeTabla,this,true,"idCobrarSaldosVencidos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarsaldosvencidosConstantesFunciones.resaltaridCobrarSaldosVencidos,this.cobrarsaldosvencidosConstantesFunciones.activaridCobrarSaldosVencidos,this,true,"idCobrarSaldosVencidos","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarSaldosVencidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarSaldosVencidos,CobrarSaldosVencidosConstantesFunciones.LABEL_NUMEROFACTURA));

		if(this.cobrarsaldosvencidosConstantesFunciones.mostrarnumero_facturaCobrarSaldosVencidos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarSaldosVencidosConstantesFunciones.LABEL_NUMEROFACTURA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrarsaldosvencidosConstantesFunciones.resaltarnumero_facturaCobrarSaldosVencidos,this.cobrarsaldosvencidosConstantesFunciones.activarnumero_facturaCobrarSaldosVencidos,iSizeTabla,this,true,"numero_facturaCobrarSaldosVencidos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarsaldosvencidosConstantesFunciones.resaltarnumero_facturaCobrarSaldosVencidos,this.cobrarsaldosvencidosConstantesFunciones.activarnumero_facturaCobrarSaldosVencidos,this,true,"numero_facturaCobrarSaldosVencidos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarSaldosVencidosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarSaldosVencidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarSaldosVencidos,CobrarSaldosVencidosConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE));

		if(this.cobrarsaldosvencidosConstantesFunciones.mostrarnombre_grupo_clienteCobrarSaldosVencidos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarSaldosVencidosConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrarsaldosvencidosConstantesFunciones.resaltarnombre_grupo_clienteCobrarSaldosVencidos,this.cobrarsaldosvencidosConstantesFunciones.activarnombre_grupo_clienteCobrarSaldosVencidos,iSizeTabla,this,true,"nombre_grupo_clienteCobrarSaldosVencidos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarsaldosvencidosConstantesFunciones.resaltarnombre_grupo_clienteCobrarSaldosVencidos,this.cobrarsaldosvencidosConstantesFunciones.activarnombre_grupo_clienteCobrarSaldosVencidos,this,true,"nombre_grupo_clienteCobrarSaldosVencidos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarSaldosVencidosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarSaldosVencidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarSaldosVencidos,CobrarSaldosVencidosConstantesFunciones.LABEL_CODIGO));

		if(this.cobrarsaldosvencidosConstantesFunciones.mostrarcodigoCobrarSaldosVencidos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarSaldosVencidosConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrarsaldosvencidosConstantesFunciones.resaltarcodigoCobrarSaldosVencidos,this.cobrarsaldosvencidosConstantesFunciones.activarcodigoCobrarSaldosVencidos,iSizeTabla,this,true,"codigoCobrarSaldosVencidos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarsaldosvencidosConstantesFunciones.resaltarcodigoCobrarSaldosVencidos,this.cobrarsaldosvencidosConstantesFunciones.activarcodigoCobrarSaldosVencidos,this,true,"codigoCobrarSaldosVencidos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarSaldosVencidosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarSaldosVencidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarSaldosVencidos,CobrarSaldosVencidosConstantesFunciones.LABEL_NOMBRE));

		if(this.cobrarsaldosvencidosConstantesFunciones.mostrarnombreCobrarSaldosVencidos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarSaldosVencidosConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrarsaldosvencidosConstantesFunciones.resaltarnombreCobrarSaldosVencidos,this.cobrarsaldosvencidosConstantesFunciones.activarnombreCobrarSaldosVencidos,iSizeTabla,this,true,"nombreCobrarSaldosVencidos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarsaldosvencidosConstantesFunciones.resaltarnombreCobrarSaldosVencidos,this.cobrarsaldosvencidosConstantesFunciones.activarnombreCobrarSaldosVencidos,this,true,"nombreCobrarSaldosVencidos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarSaldosVencidosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarSaldosVencidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarSaldosVencidos,CobrarSaldosVencidosConstantesFunciones.LABEL_FECHA));

		if(this.cobrarsaldosvencidosConstantesFunciones.mostrarfechaCobrarSaldosVencidos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarSaldosVencidosConstantesFunciones.LABEL_FECHA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.cobrarsaldosvencidosConstantesFunciones.resaltarfechaCobrarSaldosVencidos,this.cobrarsaldosvencidosConstantesFunciones.activarfechaCobrarSaldosVencidos,iSizeTabla,this,true,"fechaCobrarSaldosVencidos","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.cobrarsaldosvencidosConstantesFunciones.resaltarfechaCobrarSaldosVencidos,this.cobrarsaldosvencidosConstantesFunciones.activarfechaCobrarSaldosVencidos,this,true,"fechaCobrarSaldosVencidos","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new CobrarSaldosVencidosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarSaldosVencidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarSaldosVencidos,CobrarSaldosVencidosConstantesFunciones.LABEL_FECHAVENCE));

		if(this.cobrarsaldosvencidosConstantesFunciones.mostrarfecha_venceCobrarSaldosVencidos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarSaldosVencidosConstantesFunciones.LABEL_FECHAVENCE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.cobrarsaldosvencidosConstantesFunciones.resaltarfecha_venceCobrarSaldosVencidos,this.cobrarsaldosvencidosConstantesFunciones.activarfecha_venceCobrarSaldosVencidos,iSizeTabla,this,true,"fecha_venceCobrarSaldosVencidos","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.cobrarsaldosvencidosConstantesFunciones.resaltarfecha_venceCobrarSaldosVencidos,this.cobrarsaldosvencidosConstantesFunciones.activarfecha_venceCobrarSaldosVencidos,this,true,"fecha_venceCobrarSaldosVencidos","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new CobrarSaldosVencidosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarSaldosVencidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarSaldosVencidos,CobrarSaldosVencidosConstantesFunciones.LABEL_FECHAEMISION));

		if(this.cobrarsaldosvencidosConstantesFunciones.mostrarfecha_emisionCobrarSaldosVencidos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarSaldosVencidosConstantesFunciones.LABEL_FECHAEMISION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.cobrarsaldosvencidosConstantesFunciones.resaltarfecha_emisionCobrarSaldosVencidos,this.cobrarsaldosvencidosConstantesFunciones.activarfecha_emisionCobrarSaldosVencidos,iSizeTabla,this,true,"fecha_emisionCobrarSaldosVencidos","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.cobrarsaldosvencidosConstantesFunciones.resaltarfecha_emisionCobrarSaldosVencidos,this.cobrarsaldosvencidosConstantesFunciones.activarfecha_emisionCobrarSaldosVencidos,this,true,"fecha_emisionCobrarSaldosVencidos","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new CobrarSaldosVencidosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarSaldosVencidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarSaldosVencidos,CobrarSaldosVencidosConstantesFunciones.LABEL_SALDO));

		if(this.cobrarsaldosvencidosConstantesFunciones.mostrarsaldoCobrarSaldosVencidos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarSaldosVencidosConstantesFunciones.LABEL_SALDO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cobrarsaldosvencidosConstantesFunciones.resaltarsaldoCobrarSaldosVencidos,this.cobrarsaldosvencidosConstantesFunciones.activarsaldoCobrarSaldosVencidos,iSizeTabla,this,true,"saldoCobrarSaldosVencidos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarsaldosvencidosConstantesFunciones.resaltarsaldoCobrarSaldosVencidos,this.cobrarsaldosvencidosConstantesFunciones.activarsaldoCobrarSaldosVencidos,this,true,"saldoCobrarSaldosVencidos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CobrarSaldosVencidosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarSaldosVencidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarSaldosVencidos,CobrarSaldosVencidosConstantesFunciones.LABEL_TELEFONOTELEFONO));

		if(this.cobrarsaldosvencidosConstantesFunciones.mostrartelefono_telefonoCobrarSaldosVencidos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarSaldosVencidosConstantesFunciones.LABEL_TELEFONOTELEFONO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrarsaldosvencidosConstantesFunciones.resaltartelefono_telefonoCobrarSaldosVencidos,this.cobrarsaldosvencidosConstantesFunciones.activartelefono_telefonoCobrarSaldosVencidos,iSizeTabla,this,true,"telefono_telefonoCobrarSaldosVencidos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarsaldosvencidosConstantesFunciones.resaltartelefono_telefonoCobrarSaldosVencidos,this.cobrarsaldosvencidosConstantesFunciones.activartelefono_telefonoCobrarSaldosVencidos,this,true,"telefono_telefonoCobrarSaldosVencidos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarSaldosVencidosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarSaldosVencidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarSaldosVencidos,CobrarSaldosVencidosConstantesFunciones.LABEL_DESCRIPCION));

		if(this.cobrarsaldosvencidosConstantesFunciones.mostrardescripcionCobrarSaldosVencidos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarSaldosVencidosConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrarsaldosvencidosConstantesFunciones.resaltardescripcionCobrarSaldosVencidos,this.cobrarsaldosvencidosConstantesFunciones.activardescripcionCobrarSaldosVencidos,iSizeTabla,this,true,"descripcionCobrarSaldosVencidos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarsaldosvencidosConstantesFunciones.resaltardescripcionCobrarSaldosVencidos,this.cobrarsaldosvencidosConstantesFunciones.activardescripcionCobrarSaldosVencidos,this,true,"descripcionCobrarSaldosVencidos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarSaldosVencidosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.cobrarsaldosvencidosSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.cobrarsaldosvencidosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.cobrarsaldosvencidosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCobrarSaldosVencidos.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.cobrarsaldosvencidosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.cobrarsaldosvencidosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCobrarSaldosVencidos.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarCobrarSaldosVencidos && this.isPermisoGuardarCambiosCobrarSaldosVencidos) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.cobrarsaldosvencidosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.cobrarsaldosvencidosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosCobrarSaldosVencidos.addColumn(tableColumn);
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
			
			this.jTableDatosCobrarSaldosVencidos.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCobrarSaldosVencidos && this.isPermisoGuardarCambiosCobrarSaldosVencidos) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCobrarSaldosVencidos && this.isPermisoGuardarCambiosCobrarSaldosVencidos) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosCobrarSaldosVencidos.moveColumn(this.jTableDatosCobrarSaldosVencidos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosCobrarSaldosVencidos.moveColumn(this.jTableDatosCobrarSaldosVencidos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosCobrarSaldosVencidos.moveColumn(this.jTableDatosCobrarSaldosVencidos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosCobrarSaldosVencidos.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosCobrarSaldosVencidos.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosCobrarSaldosVencidos,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!CobrarSaldosVencidosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosCobrarSaldosVencidos.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosCobrarSaldosVencidos.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!CobrarSaldosVencidosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!CobrarSaldosVencidosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosCobrarSaldosVencidos.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosCobrarSaldosVencidos.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosCobrarSaldosVencidos.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=cobrarsaldosvencidosLogic.getCobrarSaldosVencidoss().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=cobrarsaldosvencidoss.size()-1;
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
		//this.jTableDatosCobrarSaldosVencidos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosCobrarSaldosVencidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosCobrarSaldosVencidos();
			
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
				
				//this.isEsNuevoCobrarSaldosVencidos=false;
					
				CobrarSaldosVencidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.cobrarsaldosvencidos,new Object(),this.cobrarsaldosvencidosParameterGeneral,this.cobrarsaldosvencidosReturnGeneral);
			
				if(this.cobrarsaldosvencidosSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormCobrarSaldosVencidos==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCobrarSaldosVencidos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCobrarSaldosVencidos.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarsaldosvencidos =(CobrarSaldosVencidos) this.cobrarsaldosvencidosLogic.getCobrarSaldosVencidoss().toArray()[this.jTableDatosCobrarSaldosVencidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarsaldosvencidos =(CobrarSaldosVencidos) this.cobrarsaldosvencidoss.toArray()[this.jTableDatosCobrarSaldosVencidos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.cobrarsaldosvencidos.getsType().equals("DUPLICADO")
				   || this.cobrarsaldosvencidos.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoCobrarSaldosVencidos=true;
				
				} else {
					this.isEsNuevoCobrarSaldosVencidos=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.cobrarsaldosvencidosSessionBean.getEsGuardarRelacionado()) {
					if(this.cobrarsaldosvencidos.getId()>=0 && !this.cobrarsaldosvencidos.getIsNew()) {						
						this.isEsNuevoCobrarSaldosVencidos=false;
						
					} else {
						this.isEsNuevoCobrarSaldosVencidos=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoCobrarSaldosVencidos(esRelaciones);						
				
				this.seleccionarCobrarSaldosVencidos(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.cobrarsaldosvencidos.getId()<0) {
					this.isEsNuevoCobrarSaldosVencidos=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarCobrarSaldosVencidos(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarCobrarSaldosVencidos(evt,rowIndex);
				}	
				
				if(this.cobrarsaldosvencidosSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion CobrarSaldosVencidos: " + this.dDif); 
					}
				}								
				
				CobrarSaldosVencidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.cobrarsaldosvencidos,new Object(),this.cobrarsaldosvencidosParameterGeneral,this.cobrarsaldosvencidosReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarCobrarSaldosVencidos(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.cobrarsaldosvencidos)) {
					if(this.cobrarsaldosvencidos.getId()>0) {
						this.cobrarsaldosvencidos.setIsDeleted(true);
						
						this.cobrarsaldosvencidossEliminados.add(this.cobrarsaldosvencidos);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.cobrarsaldosvencidosLogic.getCobrarSaldosVencidoss().remove(this.cobrarsaldosvencidos);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.cobrarsaldosvencidoss.remove(this.cobrarsaldosvencidos);				
					}
					
					
					((CobrarSaldosVencidosModel) this.jTableDatosCobrarSaldosVencidos.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaCobrarSaldosVencidos(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarCobrarSaldosVencidos(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoCobrarSaldosVencidos) {
			
			if(this.jInternalFrameDetalleFormCobrarSaldosVencidos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCobrarSaldosVencidos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCobrarSaldosVencidos.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarsaldosvencidos =(CobrarSaldosVencidos) this.cobrarsaldosvencidosLogic.getCobrarSaldosVencidoss().toArray()[this.jTableDatosCobrarSaldosVencidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarsaldosvencidos =(CobrarSaldosVencidos) this.cobrarsaldosvencidoss.toArray()[this.jTableDatosCobrarSaldosVencidos.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(CobrarSaldosVencidosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioCobrarSaldosVencidos(this.cobrarsaldosvencidos);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesCobrarSaldosVencidos("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesCobrarSaldosVencidos(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCobrarSaldosVencidos() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoCobrarSaldosVencidos(CobrarSaldosVencidos cobrarsaldosvencidos) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoCobrarSaldosVencidos(cobrarsaldosvencidos,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoCobrarSaldosVencidos(CobrarSaldosVencidos cobrarsaldosvencidos,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioCobrarSaldosVencidos(cobrarsaldosvencidos);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyCobrarSaldosVencidos(cobrarsaldosvencidos,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyCobrarSaldosVencidos(cobrarsaldosvencidos);
	}
	
	public void setVariablesObjetoActualToFormularioCobrarSaldosVencidos(CobrarSaldosVencidos cobrarsaldosvencidos) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormCobrarSaldosVencidos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormCobrarSaldosVencidos.jLabelidCobrarSaldosVencidos.setText(cobrarsaldosvencidos.getId().toString());
			this.jInternalFrameDetalleFormCobrarSaldosVencidos.jTextFieldnumero_facturaCobrarSaldosVencidos.setText(cobrarsaldosvencidos.getnumero_factura());
			this.jInternalFrameDetalleFormCobrarSaldosVencidos.jTextAreanombre_grupo_clienteCobrarSaldosVencidos.setText(cobrarsaldosvencidos.getnombre_grupo_cliente());
			this.jInternalFrameDetalleFormCobrarSaldosVencidos.jTextFieldcodigoCobrarSaldosVencidos.setText(cobrarsaldosvencidos.getcodigo());
			this.jInternalFrameDetalleFormCobrarSaldosVencidos.jTextAreanombreCobrarSaldosVencidos.setText(cobrarsaldosvencidos.getnombre());
			this.jInternalFrameDetalleFormCobrarSaldosVencidos.jDateChooserfechaCobrarSaldosVencidos.setDate(cobrarsaldosvencidos.getfecha());
			this.jInternalFrameDetalleFormCobrarSaldosVencidos.jDateChooserfecha_venceCobrarSaldosVencidos.setDate(cobrarsaldosvencidos.getfecha_vence());
			this.jInternalFrameDetalleFormCobrarSaldosVencidos.jDateChooserfecha_emisionCobrarSaldosVencidos.setDate(cobrarsaldosvencidos.getfecha_emision());
			this.jInternalFrameDetalleFormCobrarSaldosVencidos.jTextFieldsaldoCobrarSaldosVencidos.setText(cobrarsaldosvencidos.getsaldo().toString());
			this.jInternalFrameDetalleFormCobrarSaldosVencidos.jTextAreatelefono_telefonoCobrarSaldosVencidos.setText(cobrarsaldosvencidos.gettelefono_telefono());
			this.jInternalFrameDetalleFormCobrarSaldosVencidos.jTextAreadescripcionCobrarSaldosVencidos.setText(cobrarsaldosvencidos.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,CobrarSaldosVencidos cobrarsaldosvencidosLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,cobrarsaldosvencidosLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,CobrarSaldosVencidos cobrarsaldosvencidosLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				cobrarsaldosvencidosLocal=this.cobrarsaldosvencidos;
			} else {
				cobrarsaldosvencidosLocal=this.cobrarsaldosvencidosAnterior;
			}
		}
		
		if(this.permiteMantenimiento(cobrarsaldosvencidosLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoCobrarSaldosVencidos(cobrarsaldosvencidosLocal,true);
					
					if(cobrarsaldosvencidosSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(cobrarsaldosvencidosLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.cobrarsaldosvencidosSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(cobrarsaldosvencidosLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoCobrarSaldosVencidos(CobrarSaldosVencidos cobrarsaldosvencidos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCobrarSaldosVencidos(cobrarsaldosvencidos,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysCobrarSaldosVencidos(cobrarsaldosvencidos);
	}
	
	public void setVariablesFormularioToObjetoActualCobrarSaldosVencidos(CobrarSaldosVencidos cobrarsaldosvencidos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCobrarSaldosVencidos(cobrarsaldosvencidos,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualCobrarSaldosVencidos(CobrarSaldosVencidos cobrarsaldosvencidos,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormCobrarSaldosVencidos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormCobrarSaldosVencidos.jLabelidCobrarSaldosVencidos.getText()==null || this.jInternalFrameDetalleFormCobrarSaldosVencidos.jLabelidCobrarSaldosVencidos.getText()=="" || this.jInternalFrameDetalleFormCobrarSaldosVencidos.jLabelidCobrarSaldosVencidos.getText()=="Id") {
				this.jInternalFrameDetalleFormCobrarSaldosVencidos.jLabelidCobrarSaldosVencidos.setText("0");
			}

			if(conColumnasBase) {cobrarsaldosvencidos.setId(Long.parseLong(this.jInternalFrameDetalleFormCobrarSaldosVencidos.jLabelidCobrarSaldosVencidos.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarSaldosVencidosConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarSaldosVencidos.jLabelIdCobrarSaldosVencidos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarsaldosvencidos.setnumero_factura(this.jInternalFrameDetalleFormCobrarSaldosVencidos.jTextFieldnumero_facturaCobrarSaldosVencidos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarSaldosVencidosConstantesFunciones.LABEL_NUMEROFACTURA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarSaldosVencidos.jLabelnumero_facturaCobrarSaldosVencidos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarsaldosvencidos.setnombre_grupo_cliente(this.jInternalFrameDetalleFormCobrarSaldosVencidos.jTextAreanombre_grupo_clienteCobrarSaldosVencidos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarSaldosVencidosConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarSaldosVencidos.jLabelnombre_grupo_clienteCobrarSaldosVencidos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarsaldosvencidos.setcodigo(this.jInternalFrameDetalleFormCobrarSaldosVencidos.jTextFieldcodigoCobrarSaldosVencidos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarSaldosVencidosConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarSaldosVencidos.jLabelcodigoCobrarSaldosVencidos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarsaldosvencidos.setnombre(this.jInternalFrameDetalleFormCobrarSaldosVencidos.jTextAreanombreCobrarSaldosVencidos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarSaldosVencidosConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarSaldosVencidos.jLabelnombreCobrarSaldosVencidos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarsaldosvencidos.setfecha(this.jInternalFrameDetalleFormCobrarSaldosVencidos.jDateChooserfechaCobrarSaldosVencidos.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarSaldosVencidosConstantesFunciones.LABEL_FECHA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarSaldosVencidos.jLabelfechaCobrarSaldosVencidos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarsaldosvencidos.setfecha_vence(this.jInternalFrameDetalleFormCobrarSaldosVencidos.jDateChooserfecha_venceCobrarSaldosVencidos.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarSaldosVencidosConstantesFunciones.LABEL_FECHAVENCE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarSaldosVencidos.jLabelfecha_venceCobrarSaldosVencidos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarsaldosvencidos.setfecha_emision(this.jInternalFrameDetalleFormCobrarSaldosVencidos.jDateChooserfecha_emisionCobrarSaldosVencidos.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarSaldosVencidosConstantesFunciones.LABEL_FECHAEMISION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarSaldosVencidos.jLabelfecha_emisionCobrarSaldosVencidos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarsaldosvencidos.setsaldo(Double.parseDouble(this.jInternalFrameDetalleFormCobrarSaldosVencidos.jTextFieldsaldoCobrarSaldosVencidos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarSaldosVencidosConstantesFunciones.LABEL_SALDO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarSaldosVencidos.jLabelsaldoCobrarSaldosVencidos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarsaldosvencidos.settelefono_telefono(this.jInternalFrameDetalleFormCobrarSaldosVencidos.jTextAreatelefono_telefonoCobrarSaldosVencidos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarSaldosVencidosConstantesFunciones.LABEL_TELEFONOTELEFONO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarSaldosVencidos.jLabeltelefono_telefonoCobrarSaldosVencidos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarsaldosvencidos.setdescripcion(this.jInternalFrameDetalleFormCobrarSaldosVencidos.jTextAreadescripcionCobrarSaldosVencidos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarSaldosVencidosConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarSaldosVencidos.jLabeldescripcionCobrarSaldosVencidos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCobrarSaldosVencidos(CobrarSaldosVencidos cobrarsaldosvencidosBean,CobrarSaldosVencidos cobrarsaldosvencidos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosCobrarSaldosVencidos(CobrarSaldosVencidos cobrarsaldosvencidosOrigen,CobrarSaldosVencidos cobrarsaldosvencidos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && cobrarsaldosvencidosOrigen.getId()!=null && !cobrarsaldosvencidosOrigen.getId().equals(0L))) {cobrarsaldosvencidos.setId(cobrarsaldosvencidosOrigen.getId());}}
			if(conDefault || (!conDefault && cobrarsaldosvencidosOrigen.getnumero_factura()!=null && !cobrarsaldosvencidosOrigen.getnumero_factura().equals(""))) {cobrarsaldosvencidos.setnumero_factura(cobrarsaldosvencidosOrigen.getnumero_factura());}
			if(conDefault || (!conDefault && cobrarsaldosvencidosOrigen.getnombre_grupo_cliente()!=null && !cobrarsaldosvencidosOrigen.getnombre_grupo_cliente().equals(""))) {cobrarsaldosvencidos.setnombre_grupo_cliente(cobrarsaldosvencidosOrigen.getnombre_grupo_cliente());}
			if(conDefault || (!conDefault && cobrarsaldosvencidosOrigen.getcodigo()!=null && !cobrarsaldosvencidosOrigen.getcodigo().equals(""))) {cobrarsaldosvencidos.setcodigo(cobrarsaldosvencidosOrigen.getcodigo());}
			if(conDefault || (!conDefault && cobrarsaldosvencidosOrigen.getnombre()!=null && !cobrarsaldosvencidosOrigen.getnombre().equals(""))) {cobrarsaldosvencidos.setnombre(cobrarsaldosvencidosOrigen.getnombre());}
			if(conDefault || (!conDefault && cobrarsaldosvencidosOrigen.getfecha()!=null && !cobrarsaldosvencidosOrigen.getfecha().equals(new Date()))) {cobrarsaldosvencidos.setfecha(cobrarsaldosvencidosOrigen.getfecha());}
			if(conDefault || (!conDefault && cobrarsaldosvencidosOrigen.getfecha_vence()!=null && !cobrarsaldosvencidosOrigen.getfecha_vence().equals(new Date()))) {cobrarsaldosvencidos.setfecha_vence(cobrarsaldosvencidosOrigen.getfecha_vence());}
			if(conDefault || (!conDefault && cobrarsaldosvencidosOrigen.getfecha_emision()!=null && !cobrarsaldosvencidosOrigen.getfecha_emision().equals(new Date()))) {cobrarsaldosvencidos.setfecha_emision(cobrarsaldosvencidosOrigen.getfecha_emision());}
			if(conDefault || (!conDefault && cobrarsaldosvencidosOrigen.getsaldo()!=null && !cobrarsaldosvencidosOrigen.getsaldo().equals(0.0))) {cobrarsaldosvencidos.setsaldo(cobrarsaldosvencidosOrigen.getsaldo());}
			if(conDefault || (!conDefault && cobrarsaldosvencidosOrigen.gettelefono_telefono()!=null && !cobrarsaldosvencidosOrigen.gettelefono_telefono().equals(""))) {cobrarsaldosvencidos.settelefono_telefono(cobrarsaldosvencidosOrigen.gettelefono_telefono());}
			if(conDefault || (!conDefault && cobrarsaldosvencidosOrigen.getdescripcion()!=null && !cobrarsaldosvencidosOrigen.getdescripcion().equals(""))) {cobrarsaldosvencidos.setdescripcion(cobrarsaldosvencidosOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCobrarSaldosVencidos(CobrarSaldosVencidos cobrarsaldosvencidos) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCobrarSaldosVencidos.jLabelidCobrarSaldosVencidos.setText(cobrarsaldosvencidos.getId().toString());
			this.jInternalFrameDetalleFormCobrarSaldosVencidos.jTextFieldnumero_facturaCobrarSaldosVencidos.setText(cobrarsaldosvencidos.getnumero_factura());
			this.jInternalFrameDetalleFormCobrarSaldosVencidos.jTextAreanombre_grupo_clienteCobrarSaldosVencidos.setText(cobrarsaldosvencidos.getnombre_grupo_cliente());
			this.jInternalFrameDetalleFormCobrarSaldosVencidos.jTextFieldcodigoCobrarSaldosVencidos.setText(cobrarsaldosvencidos.getcodigo());
			this.jInternalFrameDetalleFormCobrarSaldosVencidos.jTextAreanombreCobrarSaldosVencidos.setText(cobrarsaldosvencidos.getnombre());
			this.jInternalFrameDetalleFormCobrarSaldosVencidos.jDateChooserfechaCobrarSaldosVencidos.setDate(cobrarsaldosvencidos.getfecha());
			this.jInternalFrameDetalleFormCobrarSaldosVencidos.jDateChooserfecha_venceCobrarSaldosVencidos.setDate(cobrarsaldosvencidos.getfecha_vence());
			this.jInternalFrameDetalleFormCobrarSaldosVencidos.jDateChooserfecha_emisionCobrarSaldosVencidos.setDate(cobrarsaldosvencidos.getfecha_emision());
			this.jInternalFrameDetalleFormCobrarSaldosVencidos.jTextFieldsaldoCobrarSaldosVencidos.setText(cobrarsaldosvencidos.getsaldo().toString());
			this.jInternalFrameDetalleFormCobrarSaldosVencidos.jTextAreatelefono_telefonoCobrarSaldosVencidos.setText(cobrarsaldosvencidos.gettelefono_telefono());
			this.jInternalFrameDetalleFormCobrarSaldosVencidos.jTextAreadescripcionCobrarSaldosVencidos.setText(cobrarsaldosvencidos.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCobrarSaldosVencidos(CobrarSaldosVencidosBean cobrarsaldosvencidosBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCobrarSaldosVencidos.jLabelidCobrarSaldosVencidos.setText(cobrarsaldosvencidosBean.getId().toString());
			this.jInternalFrameDetalleFormCobrarSaldosVencidos.jTextFieldnumero_facturaCobrarSaldosVencidos.setText(cobrarsaldosvencidosBean.getnumero_factura());
			this.jInternalFrameDetalleFormCobrarSaldosVencidos.jTextAreanombre_grupo_clienteCobrarSaldosVencidos.setText(cobrarsaldosvencidosBean.getnombre_grupo_cliente());
			this.jInternalFrameDetalleFormCobrarSaldosVencidos.jTextFieldcodigoCobrarSaldosVencidos.setText(cobrarsaldosvencidosBean.getcodigo());
			this.jInternalFrameDetalleFormCobrarSaldosVencidos.jTextAreanombreCobrarSaldosVencidos.setText(cobrarsaldosvencidosBean.getnombre());
			this.jInternalFrameDetalleFormCobrarSaldosVencidos.jDateChooserfechaCobrarSaldosVencidos.setDate(cobrarsaldosvencidosBean.getfecha());
			this.jInternalFrameDetalleFormCobrarSaldosVencidos.jDateChooserfecha_venceCobrarSaldosVencidos.setDate(cobrarsaldosvencidosBean.getfecha_vence());
			this.jInternalFrameDetalleFormCobrarSaldosVencidos.jDateChooserfecha_emisionCobrarSaldosVencidos.setDate(cobrarsaldosvencidosBean.getfecha_emision());
			this.jInternalFrameDetalleFormCobrarSaldosVencidos.jTextFieldsaldoCobrarSaldosVencidos.setText(cobrarsaldosvencidosBean.getsaldo().toString());
			this.jInternalFrameDetalleFormCobrarSaldosVencidos.jTextAreatelefono_telefonoCobrarSaldosVencidos.setText(cobrarsaldosvencidosBean.gettelefono_telefono());
			this.jInternalFrameDetalleFormCobrarSaldosVencidos.jTextAreadescripcionCobrarSaldosVencidos.setText(cobrarsaldosvencidosBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanCobrarSaldosVencidos(CobrarSaldosVencidosParameterReturnGeneral cobrarsaldosvencidosReturnGeneral,CobrarSaldosVencidosBean cobrarsaldosvencidosBean,Boolean conDefault) throws Exception { 
		try {
			CobrarSaldosVencidos cobrarsaldosvencidosLocal=new CobrarSaldosVencidos();
			
			cobrarsaldosvencidosLocal=cobrarsaldosvencidosReturnGeneral.getCobrarSaldosVencidos();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && cobrarsaldosvencidosLocal.getId()!=null && !cobrarsaldosvencidosLocal.getId().equals(0L))) {cobrarsaldosvencidosBean.setId(cobrarsaldosvencidosLocal.getId());}}
			if(conDefault || (!conDefault && cobrarsaldosvencidosLocal.getnumero_factura()!=null && !cobrarsaldosvencidosLocal.getnumero_factura().equals(""))) {cobrarsaldosvencidosBean.setnumero_factura(cobrarsaldosvencidosLocal.getnumero_factura());}
			if(conDefault || (!conDefault && cobrarsaldosvencidosLocal.getnombre_grupo_cliente()!=null && !cobrarsaldosvencidosLocal.getnombre_grupo_cliente().equals(""))) {cobrarsaldosvencidosBean.setnombre_grupo_cliente(cobrarsaldosvencidosLocal.getnombre_grupo_cliente());}
			if(conDefault || (!conDefault && cobrarsaldosvencidosLocal.getcodigo()!=null && !cobrarsaldosvencidosLocal.getcodigo().equals(""))) {cobrarsaldosvencidosBean.setcodigo(cobrarsaldosvencidosLocal.getcodigo());}
			if(conDefault || (!conDefault && cobrarsaldosvencidosLocal.getnombre()!=null && !cobrarsaldosvencidosLocal.getnombre().equals(""))) {cobrarsaldosvencidosBean.setnombre(cobrarsaldosvencidosLocal.getnombre());}
			if(conDefault || (!conDefault && cobrarsaldosvencidosLocal.getfecha()!=null && !cobrarsaldosvencidosLocal.getfecha().equals(new Date()))) {cobrarsaldosvencidosBean.setfecha(cobrarsaldosvencidosLocal.getfecha());}
			if(conDefault || (!conDefault && cobrarsaldosvencidosLocal.getfecha_vence()!=null && !cobrarsaldosvencidosLocal.getfecha_vence().equals(new Date()))) {cobrarsaldosvencidosBean.setfecha_vence(cobrarsaldosvencidosLocal.getfecha_vence());}
			if(conDefault || (!conDefault && cobrarsaldosvencidosLocal.getfecha_emision()!=null && !cobrarsaldosvencidosLocal.getfecha_emision().equals(new Date()))) {cobrarsaldosvencidosBean.setfecha_emision(cobrarsaldosvencidosLocal.getfecha_emision());}
			if(conDefault || (!conDefault && cobrarsaldosvencidosLocal.getsaldo()!=null && !cobrarsaldosvencidosLocal.getsaldo().equals(0.0))) {cobrarsaldosvencidosBean.setsaldo(cobrarsaldosvencidosLocal.getsaldo());}
			if(conDefault || (!conDefault && cobrarsaldosvencidosLocal.gettelefono_telefono()!=null && !cobrarsaldosvencidosLocal.gettelefono_telefono().equals(""))) {cobrarsaldosvencidosBean.settelefono_telefono(cobrarsaldosvencidosLocal.gettelefono_telefono());}
			if(conDefault || (!conDefault && cobrarsaldosvencidosLocal.getdescripcion()!=null && !cobrarsaldosvencidosLocal.getdescripcion().equals(""))) {cobrarsaldosvencidosBean.setdescripcion(cobrarsaldosvencidosLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxCobrarSaldosVencidosGenerico(Long idCobrarSaldosVencidosSeleccionado,JComboBox jComboBoxCobrarSaldosVencidos,List<CobrarSaldosVencidos> cobrarsaldosvencidossLocal)throws Exception {
		try {
			CobrarSaldosVencidos  cobrarsaldosvencidosTemp=null;

			for(CobrarSaldosVencidos cobrarsaldosvencidosAux:cobrarsaldosvencidossLocal) {
				if(cobrarsaldosvencidosAux.getId()!=null && cobrarsaldosvencidosAux.getId().equals(idCobrarSaldosVencidosSeleccionado)) {
					cobrarsaldosvencidosTemp=cobrarsaldosvencidosAux;
					break;
				}
			}

			jComboBoxCobrarSaldosVencidos.setSelectedItem(cobrarsaldosvencidosTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxCobrarSaldosVencidosGenerico(JComboBox jComboBoxCobrarSaldosVencidos,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxCobrarSaldosVencidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCobrarSaldosVencidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxCobrarSaldosVencidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCobrarSaldosVencidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCobrarSaldosVencidos.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxCobrarSaldosVencidos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCobrarSaldosVencidos.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxCobrarSaldosVencidos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxCobrarSaldosVencidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxCobrarSaldosVencidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cobrarsaldosvencidos=(CobrarSaldosVencidos) cobrarsaldosvencidosLogic.getCobrarSaldosVencidoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			cobrarsaldosvencidos =(CobrarSaldosVencidos) cobrarsaldosvencidoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("GrupoCliente")) {
			//sDescripcion=this.getActualGrupoClienteForeignKeyDescripcion((Long)value);
			if(!cobrarsaldosvencidos.getIsNew() && !cobrarsaldosvencidos.getIsChanged() && !cobrarsaldosvencidos.getIsDeleted()) {
				sDescripcion=cobrarsaldosvencidos.getgrupocliente_descripcion();
			} else {
				//sDescripcion=this.getActualGrupoClienteForeignKeyDescripcion((Long)value);
				sDescripcion=cobrarsaldosvencidos.getgrupocliente_descripcion();
			}
		}

		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!cobrarsaldosvencidos.getIsNew() && !cobrarsaldosvencidos.getIsChanged() && !cobrarsaldosvencidos.getIsDeleted()) {
				sDescripcion=cobrarsaldosvencidos.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=cobrarsaldosvencidos.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		CobrarSaldosVencidos cobrarsaldosvencidosRow=new CobrarSaldosVencidos();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cobrarsaldosvencidosRow=(CobrarSaldosVencidos) cobrarsaldosvencidosLogic.getCobrarSaldosVencidoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			cobrarsaldosvencidosRow=(CobrarSaldosVencidos) cobrarsaldosvencidoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualCobrarSaldosVencidos(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoCobrarSaldosVencidos.setVisible((this.isVisibilidadCeldaNuevoCobrarSaldosVencidos && this.isPermisoNuevoCobrarSaldosVencidos));			
			this.jButtonDuplicarCobrarSaldosVencidos.setVisible((this.isVisibilidadCeldaDuplicarCobrarSaldosVencidos && this.isPermisoDuplicarCobrarSaldosVencidos));			
			this.jButtonCopiarCobrarSaldosVencidos.setVisible((this.isVisibilidadCeldaCopiarCobrarSaldosVencidos && this.isPermisoCopiarCobrarSaldosVencidos));
			this.jButtonVerFormCobrarSaldosVencidos.setVisible((this.isVisibilidadCeldaVerFormCobrarSaldosVencidos && this.isPermisoVerFormCobrarSaldosVencidos));
			
			this.jButtonAbrirOrderByCobrarSaldosVencidos.setVisible((this.isVisibilidadCeldaOrdenCobrarSaldosVencidos && this.isPermisoOrdenCobrarSaldosVencidos));			
			
			this.jButtonNuevoRelacionesCobrarSaldosVencidos.setVisible((this.isVisibilidadCeldaNuevoRelacionesCobrarSaldosVencidos && this.isPermisoNuevoCobrarSaldosVencidos));			
			this.jButtonNuevoGuardarCambiosCobrarSaldosVencidos.setVisible((this.isVisibilidadCeldaNuevoCobrarSaldosVencidos && this.isPermisoNuevoCobrarSaldosVencidos && this.isPermisoGuardarCambiosCobrarSaldosVencidos));
			
			if(this.jInternalFrameDetalleFormCobrarSaldosVencidos!=null) {
			this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtonModificarCobrarSaldosVencidos.setVisible((this.isVisibilidadCeldaModificarCobrarSaldosVencidos && this.isPermisoActualizarCobrarSaldosVencidos));	
			this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtonActualizarCobrarSaldosVencidos.setVisible((this.isVisibilidadCeldaActualizarCobrarSaldosVencidos && this.isPermisoActualizarCobrarSaldosVencidos));	
			this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtonEliminarCobrarSaldosVencidos.setVisible((this.isVisibilidadCeldaEliminarCobrarSaldosVencidos && this.isPermisoEliminarCobrarSaldosVencidos));
			this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtonCancelarCobrarSaldosVencidos.setVisible(this.isVisibilidadCeldaCancelarCobrarSaldosVencidos);							
			this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtonGuardarCambiosCobrarSaldosVencidos.setVisible((this.isVisibilidadCeldaGuardarCobrarSaldosVencidos && this.isPermisoGuardarCambiosCobrarSaldosVencidos));			
			
			}
						
			this.jButtonGuardarCambiosTablaCobrarSaldosVencidos.setVisible((this.isVisibilidadCeldaGuardarCambiosCobrarSaldosVencidos && this.isPermisoGuardarCambiosCobrarSaldosVencidos));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarCobrarSaldosVencidos.setVisible((this.isVisibilidadCeldaNuevoCobrarSaldosVencidos && this.isPermisoNuevoCobrarSaldosVencidos));						
			this.jButtonDuplicarToolBarCobrarSaldosVencidos.setVisible((this.isVisibilidadCeldaDuplicarCobrarSaldosVencidos && this.isPermisoDuplicarCobrarSaldosVencidos));						
			this.jButtonCopiarToolBarCobrarSaldosVencidos.setVisible((this.isVisibilidadCeldaCopiarCobrarSaldosVencidos && this.isPermisoCopiarCobrarSaldosVencidos));			
			this.jButtonVerFormToolBarCobrarSaldosVencidos.setVisible((this.isVisibilidadCeldaVerFormCobrarSaldosVencidos && this.isPermisoVerFormCobrarSaldosVencidos));			
			this.jButtonAbrirOrderByToolBarCobrarSaldosVencidos.setVisible((this.isVisibilidadCeldaOrdenCobrarSaldosVencidos && this.isPermisoOrdenCobrarSaldosVencidos));
			this.jButtonNuevoRelacionesToolBarCobrarSaldosVencidos.setVisible((this.isVisibilidadCeldaNuevoRelacionesCobrarSaldosVencidos && this.isPermisoNuevoCobrarSaldosVencidos));			
			this.jButtonNuevoGuardarCambiosToolBarCobrarSaldosVencidos.setVisible((this.isVisibilidadCeldaNuevoCobrarSaldosVencidos && this.isPermisoNuevoCobrarSaldosVencidos && this.isPermisoGuardarCambiosCobrarSaldosVencidos));			
			
			if(this.jInternalFrameDetalleFormCobrarSaldosVencidos!=null) {
			this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtonModificarToolBarCobrarSaldosVencidos.setVisible((this.isVisibilidadCeldaModificarCobrarSaldosVencidos && this.isPermisoActualizarCobrarSaldosVencidos));	
			this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtonActualizarToolBarCobrarSaldosVencidos.setVisible((this.isVisibilidadCeldaActualizarCobrarSaldosVencidos  && this.isPermisoActualizarCobrarSaldosVencidos));	
			this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtonEliminarToolBarCobrarSaldosVencidos.setVisible((this.isVisibilidadCeldaEliminarCobrarSaldosVencidos && this.isPermisoEliminarCobrarSaldosVencidos));
			this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtonCancelarToolBarCobrarSaldosVencidos.setVisible(this.isVisibilidadCeldaCancelarCobrarSaldosVencidos);				
			this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtonGuardarCambiosToolBarCobrarSaldosVencidos.setVisible((this.isVisibilidadCeldaGuardarCobrarSaldosVencidos && this.isPermisoGuardarCambiosCobrarSaldosVencidos));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarCobrarSaldosVencidos.setVisible((this.isVisibilidadCeldaGuardarCambiosCobrarSaldosVencidos && this.isPermisoGuardarCambiosCobrarSaldosVencidos));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoCobrarSaldosVencidos.setVisible((this.isVisibilidadCeldaNuevoCobrarSaldosVencidos && this.isPermisoNuevoCobrarSaldosVencidos));			
			this.jMenuItemDuplicarCobrarSaldosVencidos.setVisible((this.isVisibilidadCeldaDuplicarCobrarSaldosVencidos && this.isPermisoDuplicarCobrarSaldosVencidos));			
			this.jMenuItemCopiarCobrarSaldosVencidos.setVisible((this.isVisibilidadCeldaCopiarCobrarSaldosVencidos && this.isPermisoCopiarCobrarSaldosVencidos));			
			this.jMenuItemVerFormCobrarSaldosVencidos.setVisible((this.isVisibilidadCeldaVerFormCobrarSaldosVencidos && this.isPermisoVerFormCobrarSaldosVencidos));			
			this.jMenuItemAbrirOrderByCobrarSaldosVencidos.setVisible((this.isVisibilidadCeldaOrdenCobrarSaldosVencidos && this.isPermisoOrdenCobrarSaldosVencidos));			
			//this.jMenuItemMostrarOcultarCobrarSaldosVencidos.setVisible((this.isVisibilidadCeldaOrdenCobrarSaldosVencidos && this.isPermisoOrdenCobrarSaldosVencidos));
			this.jMenuItemDetalleAbrirOrderByCobrarSaldosVencidos.setVisible((this.isVisibilidadCeldaOrdenCobrarSaldosVencidos && this.isPermisoOrdenCobrarSaldosVencidos));			
			//this.jMenuItemDetalleMostrarOcultarCobrarSaldosVencidos.setVisible((this.isVisibilidadCeldaOrdenCobrarSaldosVencidos && this.isPermisoOrdenCobrarSaldosVencidos));			
			this.jMenuItemNuevoRelacionesCobrarSaldosVencidos.setVisible((this.isVisibilidadCeldaNuevoRelacionesCobrarSaldosVencidos && this.isPermisoNuevoCobrarSaldosVencidos));			
			this.jMenuItemNuevoGuardarCambiosCobrarSaldosVencidos.setVisible((this.isVisibilidadCeldaNuevoCobrarSaldosVencidos && this.isPermisoNuevoCobrarSaldosVencidos && this.isPermisoGuardarCambiosCobrarSaldosVencidos));									
			
			if(this.jInternalFrameDetalleFormCobrarSaldosVencidos!=null) {
			this.jInternalFrameDetalleFormCobrarSaldosVencidos.jMenuItemModificarCobrarSaldosVencidos.setVisible((this.isVisibilidadCeldaModificarCobrarSaldosVencidos && this.isPermisoActualizarCobrarSaldosVencidos));	
			this.jInternalFrameDetalleFormCobrarSaldosVencidos.jMenuItemActualizarCobrarSaldosVencidos.setVisible((this.isVisibilidadCeldaActualizarCobrarSaldosVencidos && this.isPermisoActualizarCobrarSaldosVencidos));	
			this.jInternalFrameDetalleFormCobrarSaldosVencidos.jMenuItemEliminarCobrarSaldosVencidos.setVisible((this.isVisibilidadCeldaEliminarCobrarSaldosVencidos && this.isPermisoEliminarCobrarSaldosVencidos));
			this.jInternalFrameDetalleFormCobrarSaldosVencidos.jMenuItemCancelarCobrarSaldosVencidos.setVisible(this.isVisibilidadCeldaCancelarCobrarSaldosVencidos);				
			}
			
			this.jMenuItemGuardarCambiosCobrarSaldosVencidos.setVisible((this.isVisibilidadCeldaGuardarCobrarSaldosVencidos && this.isPermisoGuardarCambiosCobrarSaldosVencidos));						
			this.jMenuItemGuardarCambiosTablaCobrarSaldosVencidos.setVisible((this.isVisibilidadCeldaGuardarCambiosCobrarSaldosVencidos && this.isPermisoGuardarCambiosCobrarSaldosVencidos));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoCobrarSaldosVencidos=this.jButtonNuevoCobrarSaldosVencidos.isVisible();
			this.isVisibilidadCeldaDuplicarCobrarSaldosVencidos=this.jButtonDuplicarCobrarSaldosVencidos.isVisible();
			this.isVisibilidadCeldaCopiarCobrarSaldosVencidos=this.jButtonCopiarCobrarSaldosVencidos.isVisible();
			this.isVisibilidadCeldaVerFormCobrarSaldosVencidos=this.jButtonVerFormCobrarSaldosVencidos.isVisible();
			
			this.isVisibilidadCeldaOrdenCobrarSaldosVencidos=this.jButtonAbrirOrderByCobrarSaldosVencidos.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesCobrarSaldosVencidos=this.jButtonNuevoRelacionesCobrarSaldosVencidos.isVisible();
			this.isVisibilidadCeldaModificarCobrarSaldosVencidos=this.jButtonModificarCobrarSaldosVencidos.isVisible();
			
			if(this.jInternalFrameDetalleFormCobrarSaldosVencidos!=null) {
			this.isVisibilidadCeldaActualizarCobrarSaldosVencidos=this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtonActualizarCobrarSaldosVencidos.isVisible();
			this.isVisibilidadCeldaEliminarCobrarSaldosVencidos=this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtonEliminarCobrarSaldosVencidos.isVisible();
			this.isVisibilidadCeldaCancelarCobrarSaldosVencidos=this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtonCancelarCobrarSaldosVencidos.isVisible();
			this.isVisibilidadCeldaGuardarCobrarSaldosVencidos=this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtonGuardarCambiosCobrarSaldosVencidos.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosCobrarSaldosVencidos=this.jButtonGuardarCambiosTablaCobrarSaldosVencidos.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoCobrarSaldosVencidos=this.jButtonNuevoToolBarCobrarSaldosVencidos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCobrarSaldosVencidos=this.jButtonNuevoRelacionesToolBarCobrarSaldosVencidos.isVisible();
			
			if(this.jInternalFrameDetalleFormCobrarSaldosVencidos!=null) {
			this.isVisibilidadCeldaModificarCobrarSaldosVencidos=this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtonModificarToolBarCobrarSaldosVencidos.isVisible();
			this.isVisibilidadCeldaActualizarCobrarSaldosVencidos=this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtonActualizarToolBarCobrarSaldosVencidos.isVisible();
			this.isVisibilidadCeldaEliminarCobrarSaldosVencidos=this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtonEliminarToolBarCobrarSaldosVencidos.isVisible();
			this.isVisibilidadCeldaCancelarCobrarSaldosVencidos=this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtonCancelarToolBarCobrarSaldosVencidos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCobrarSaldosVencidos=this.jButtonGuardarCambiosToolBarCobrarSaldosVencidos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCobrarSaldosVencidos=this.jButtonGuardarCambiosTablaToolBarCobrarSaldosVencidos.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoCobrarSaldosVencidos=this.jMenuItemNuevoCobrarSaldosVencidos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCobrarSaldosVencidos=this.jMenuItemNuevoRelacionesCobrarSaldosVencidos.isVisible();
			
			if(this.jInternalFrameDetalleFormCobrarSaldosVencidos!=null) {
			this.isVisibilidadCeldaModificarCobrarSaldosVencidos=this.jInternalFrameDetalleFormCobrarSaldosVencidos.jMenuItemModificarCobrarSaldosVencidos.isVisible();
			this.isVisibilidadCeldaActualizarCobrarSaldosVencidos=this.jInternalFrameDetalleFormCobrarSaldosVencidos.jMenuItemActualizarCobrarSaldosVencidos.isVisible();
			this.isVisibilidadCeldaEliminarCobrarSaldosVencidos=this.jInternalFrameDetalleFormCobrarSaldosVencidos.jMenuItemEliminarCobrarSaldosVencidos.isVisible();
			this.isVisibilidadCeldaCancelarCobrarSaldosVencidos=this.jInternalFrameDetalleFormCobrarSaldosVencidos.jMenuItemCancelarCobrarSaldosVencidos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCobrarSaldosVencidos=this.jMenuItemGuardarCambiosCobrarSaldosVencidos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCobrarSaldosVencidos=this.jMenuItemGuardarCambiosTablaCobrarSaldosVencidos.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesCobrarSaldosVencidos(Boolean esInicializar) {
		if(CobrarSaldosVencidosJInternalFrame.ISBINDING_MANUAL) {			
			if(this.cobrarsaldosvencidosSessionBean.getConGuardarRelaciones()) {
				//if(this.cobrarsaldosvencidosSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesCobrarSaldosVencidos();
			}
			
			this.inicializarActualizarBindingBotonesManualCobrarSaldosVencidos(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualCobrarSaldosVencidos() {
		this.jButtonNuevoCobrarSaldosVencidos.setVisible(this.isPermisoNuevoCobrarSaldosVencidos);			
		this.jButtonDuplicarCobrarSaldosVencidos.setVisible(this.isPermisoDuplicarCobrarSaldosVencidos);			
		this.jButtonCopiarCobrarSaldosVencidos.setVisible(this.isPermisoCopiarCobrarSaldosVencidos);			
		this.jButtonVerFormCobrarSaldosVencidos.setVisible(this.isPermisoVerFormCobrarSaldosVencidos);			
		
		this.jButtonAbrirOrderByCobrarSaldosVencidos.setVisible(this.isPermisoOrdenCobrarSaldosVencidos);					
		
		this.jButtonNuevoRelacionesCobrarSaldosVencidos.setVisible(this.isPermisoNuevoCobrarSaldosVencidos);			
		
		if(this.jInternalFrameDetalleFormCobrarSaldosVencidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtonModificarCobrarSaldosVencidos.setVisible(this.isPermisoActualizarCobrarSaldosVencidos);	
			this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtonActualizarCobrarSaldosVencidos.setVisible(this.isPermisoActualizarCobrarSaldosVencidos);	
			this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtonEliminarCobrarSaldosVencidos.setVisible(this.isPermisoEliminarCobrarSaldosVencidos);
			this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtonCancelarCobrarSaldosVencidos.setVisible(this.isVisibilidadCeldaCancelarCobrarSaldosVencidos);						
			this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtonGuardarCambiosCobrarSaldosVencidos.setVisible(this.isPermisoGuardarCambiosCobrarSaldosVencidos);							
		}
		
		this.jButtonGuardarCambiosTablaCobrarSaldosVencidos.setVisible(this.isPermisoActualizarCobrarSaldosVencidos);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleCobrarSaldosVencidos() {
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtonModificarCobrarSaldosVencidos.setVisible(this.isPermisoActualizarCobrarSaldosVencidos);	
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtonActualizarCobrarSaldosVencidos.setVisible(this.isPermisoActualizarCobrarSaldosVencidos);	
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtonEliminarCobrarSaldosVencidos.setVisible(this.isPermisoEliminarCobrarSaldosVencidos);
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtonCancelarCobrarSaldosVencidos.setVisible(this.isVisibilidadCeldaCancelarCobrarSaldosVencidos);							
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtonGuardarCambiosCobrarSaldosVencidos.setVisible((this.isVisibilidadCeldaGuardarCobrarSaldosVencidos && this.isPermisoGuardarCambiosCobrarSaldosVencidos));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosCobrarSaldosVencidos() {
		if(CobrarSaldosVencidosJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualCobrarSaldosVencidos();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesCobrarSaldosVencidos() {
	}
	
	public void jTableDatosCobrarSaldosVencidosListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarCobrarSaldosVencidos(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidCobrarSaldosVencidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarsaldosvencidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarSaldosVencidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarSaldosVencidos(this.getcobrarsaldosvencidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarSaldosVencidos(this.cobrarsaldosvencidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarsaldosvencidos =(CobrarSaldosVencidos) this.cobrarsaldosvencidosLogic.getCobrarSaldosVencidoss().toArray()[this.jTableDatosCobrarSaldosVencidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarsaldosvencidos =(CobrarSaldosVencidos) this.cobrarsaldosvencidoss.toArray()[this.jTableDatosCobrarSaldosVencidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarsaldosvencidos==null) {
						this.cobrarsaldosvencidos = new CobrarSaldosVencidos();
					}

					this.setVariablesFormularioToObjetoActualCobrarSaldosVencidos(this.cobrarsaldosvencidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarSaldosVencidos(this.cobrarsaldosvencidos);
				}

				if(this.cobrarsaldosvencidos.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.cobrarsaldosvencidos.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarSaldosVencidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarsaldosvencidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarsaldosvencidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarsaldosvencidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_grupo_clienteCobrarSaldosVencidosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarsaldosvencidosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisogrupocliente=true;

			idTienePermisogrupocliente=this.tienePermisosUsuarioEnPaginaWebCobrarSaldosVencidos(GrupoClienteConstantesFunciones.CLASSNAME);

			if(idTienePermisogrupocliente) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarSaldosVencidos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCobrarSaldosVencidos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCobrarSaldosVencidos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarsaldosvencidos =(CobrarSaldosVencidos) this.cobrarsaldosvencidosLogic.getCobrarSaldosVencidoss().toArray()[this.jTableDatosCobrarSaldosVencidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cobrarsaldosvencidos =(CobrarSaldosVencidos) this.cobrarsaldosvencidoss.toArray()[this.jTableDatosCobrarSaldosVencidos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCobrarSaldosVencidos(this.getcobrarsaldosvencidos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCobrarSaldosVencidos(this.cobrarsaldosvencidos);

				this.grupoclienteBeanSwingJInternalFrame=new GrupoClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.grupoclienteBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.grupoclienteBeanSwingJInternalFrame.getGrupoClienteLogic().setConnexion(this.cobrarsaldosvencidosLogic.getConnexion());

				if(this.cobrarsaldosvencidos.getid_grupo_cliente()!=null) {
					this.grupoclienteBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.grupoclienteBeanSwingJInternalFrame.setIdActual(this.cobrarsaldosvencidos.getid_grupo_cliente());
					this.grupoclienteBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.grupoclienteBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.grupoclienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaGrupoCliente();
				}

				JInternalFrameBase jinternalFrame =this.grupoclienteBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCobrarSaldosVencidos=(TitledBorder)this.jScrollPanelDatosCobrarSaldosVencidos.getBorder();
				TitledBorder titledBordergrupocliente=(TitledBorder)this.grupoclienteBeanSwingJInternalFrame.jScrollPanelDatosGrupoCliente.getBorder();

				titledBordergrupocliente.setTitle(titledBorderCobrarSaldosVencidos.getTitle() + " -> Grupo Cliente");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarsaldosvencidosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarsaldosvencidosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarsaldosvencidosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_grupo_clienteCobrarSaldosVencidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarsaldosvencidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarSaldosVencidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarSaldosVencidos(this.getcobrarsaldosvencidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarSaldosVencidos(this.cobrarsaldosvencidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarsaldosvencidos =(CobrarSaldosVencidos) this.cobrarsaldosvencidosLogic.getCobrarSaldosVencidoss().toArray()[this.jTableDatosCobrarSaldosVencidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarsaldosvencidos =(CobrarSaldosVencidos) this.cobrarsaldosvencidoss.toArray()[this.jTableDatosCobrarSaldosVencidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarsaldosvencidos==null) {
						this.cobrarsaldosvencidos = new CobrarSaldosVencidos();
					}

					this.setVariablesFormularioToObjetoActualCobrarSaldosVencidos(this.cobrarsaldosvencidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarSaldosVencidos(this.cobrarsaldosvencidos);
				}

				if(this.cobrarsaldosvencidos.getid_grupo_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_grupo_cliente = "+this.cobrarsaldosvencidos.getid_grupo_cliente().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarSaldosVencidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarsaldosvencidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarsaldosvencidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarsaldosvencidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaCobrarSaldosVencidosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarsaldosvencidosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebCobrarSaldosVencidos(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarSaldosVencidos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCobrarSaldosVencidos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCobrarSaldosVencidos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarsaldosvencidos =(CobrarSaldosVencidos) this.cobrarsaldosvencidosLogic.getCobrarSaldosVencidoss().toArray()[this.jTableDatosCobrarSaldosVencidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cobrarsaldosvencidos =(CobrarSaldosVencidos) this.cobrarsaldosvencidoss.toArray()[this.jTableDatosCobrarSaldosVencidos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCobrarSaldosVencidos(this.getcobrarsaldosvencidos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCobrarSaldosVencidos(this.cobrarsaldosvencidos);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.cobrarsaldosvencidosLogic.getConnexion());

				if(this.cobrarsaldosvencidos.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.cobrarsaldosvencidos.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCobrarSaldosVencidos=(TitledBorder)this.jScrollPanelDatosCobrarSaldosVencidos.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderCobrarSaldosVencidos.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarsaldosvencidosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarsaldosvencidosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarsaldosvencidosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaCobrarSaldosVencidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarsaldosvencidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarSaldosVencidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarSaldosVencidos(this.getcobrarsaldosvencidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarSaldosVencidos(this.cobrarsaldosvencidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarsaldosvencidos =(CobrarSaldosVencidos) this.cobrarsaldosvencidosLogic.getCobrarSaldosVencidoss().toArray()[this.jTableDatosCobrarSaldosVencidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarsaldosvencidos =(CobrarSaldosVencidos) this.cobrarsaldosvencidoss.toArray()[this.jTableDatosCobrarSaldosVencidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarsaldosvencidos==null) {
						this.cobrarsaldosvencidos = new CobrarSaldosVencidos();
					}

					this.setVariablesFormularioToObjetoActualCobrarSaldosVencidos(this.cobrarsaldosvencidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarSaldosVencidos(this.cobrarsaldosvencidos);
				}

				if(this.cobrarsaldosvencidos.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.cobrarsaldosvencidos.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarSaldosVencidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarsaldosvencidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarsaldosvencidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarsaldosvencidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_facturaCobrarSaldosVencidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarsaldosvencidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarSaldosVencidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarSaldosVencidos(this.getcobrarsaldosvencidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarSaldosVencidos(this.cobrarsaldosvencidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarsaldosvencidos =(CobrarSaldosVencidos) this.cobrarsaldosvencidosLogic.getCobrarSaldosVencidoss().toArray()[this.jTableDatosCobrarSaldosVencidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarsaldosvencidos =(CobrarSaldosVencidos) this.cobrarsaldosvencidoss.toArray()[this.jTableDatosCobrarSaldosVencidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarsaldosvencidos==null) {
						this.cobrarsaldosvencidos = new CobrarSaldosVencidos();
					}

					this.setVariablesFormularioToObjetoActualCobrarSaldosVencidos(this.cobrarsaldosvencidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarSaldosVencidos(this.cobrarsaldosvencidos);
				}

				if(this.cobrarsaldosvencidos.getnumero_factura()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_factura like '%"+this.cobrarsaldosvencidos.getnumero_factura()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarSaldosVencidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarsaldosvencidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarsaldosvencidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarsaldosvencidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_grupo_clienteCobrarSaldosVencidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarsaldosvencidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarSaldosVencidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarSaldosVencidos(this.getcobrarsaldosvencidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarSaldosVencidos(this.cobrarsaldosvencidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarsaldosvencidos =(CobrarSaldosVencidos) this.cobrarsaldosvencidosLogic.getCobrarSaldosVencidoss().toArray()[this.jTableDatosCobrarSaldosVencidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarsaldosvencidos =(CobrarSaldosVencidos) this.cobrarsaldosvencidoss.toArray()[this.jTableDatosCobrarSaldosVencidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarsaldosvencidos==null) {
						this.cobrarsaldosvencidos = new CobrarSaldosVencidos();
					}

					this.setVariablesFormularioToObjetoActualCobrarSaldosVencidos(this.cobrarsaldosvencidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarSaldosVencidos(this.cobrarsaldosvencidos);
				}

				if(this.cobrarsaldosvencidos.getnombre_grupo_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_grupo_cliente like '%"+this.cobrarsaldosvencidos.getnombre_grupo_cliente()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarSaldosVencidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarsaldosvencidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarsaldosvencidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarsaldosvencidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoCobrarSaldosVencidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarsaldosvencidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarSaldosVencidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarSaldosVencidos(this.getcobrarsaldosvencidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarSaldosVencidos(this.cobrarsaldosvencidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarsaldosvencidos =(CobrarSaldosVencidos) this.cobrarsaldosvencidosLogic.getCobrarSaldosVencidoss().toArray()[this.jTableDatosCobrarSaldosVencidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarsaldosvencidos =(CobrarSaldosVencidos) this.cobrarsaldosvencidoss.toArray()[this.jTableDatosCobrarSaldosVencidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarsaldosvencidos==null) {
						this.cobrarsaldosvencidos = new CobrarSaldosVencidos();
					}

					this.setVariablesFormularioToObjetoActualCobrarSaldosVencidos(this.cobrarsaldosvencidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarSaldosVencidos(this.cobrarsaldosvencidos);
				}

				if(this.cobrarsaldosvencidos.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.cobrarsaldosvencidos.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarSaldosVencidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarsaldosvencidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarsaldosvencidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarsaldosvencidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreCobrarSaldosVencidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarsaldosvencidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarSaldosVencidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarSaldosVencidos(this.getcobrarsaldosvencidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarSaldosVencidos(this.cobrarsaldosvencidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarsaldosvencidos =(CobrarSaldosVencidos) this.cobrarsaldosvencidosLogic.getCobrarSaldosVencidoss().toArray()[this.jTableDatosCobrarSaldosVencidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarsaldosvencidos =(CobrarSaldosVencidos) this.cobrarsaldosvencidoss.toArray()[this.jTableDatosCobrarSaldosVencidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarsaldosvencidos==null) {
						this.cobrarsaldosvencidos = new CobrarSaldosVencidos();
					}

					this.setVariablesFormularioToObjetoActualCobrarSaldosVencidos(this.cobrarsaldosvencidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarSaldosVencidos(this.cobrarsaldosvencidos);
				}

				if(this.cobrarsaldosvencidos.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.cobrarsaldosvencidos.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarSaldosVencidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarsaldosvencidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarsaldosvencidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarsaldosvencidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfechaCobrarSaldosVencidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarsaldosvencidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarSaldosVencidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarSaldosVencidos(this.getcobrarsaldosvencidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarSaldosVencidos(this.cobrarsaldosvencidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarsaldosvencidos =(CobrarSaldosVencidos) this.cobrarsaldosvencidosLogic.getCobrarSaldosVencidoss().toArray()[this.jTableDatosCobrarSaldosVencidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarsaldosvencidos =(CobrarSaldosVencidos) this.cobrarsaldosvencidoss.toArray()[this.jTableDatosCobrarSaldosVencidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarsaldosvencidos==null) {
						this.cobrarsaldosvencidos = new CobrarSaldosVencidos();
					}

					this.setVariablesFormularioToObjetoActualCobrarSaldosVencidos(this.cobrarsaldosvencidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarSaldosVencidos(this.cobrarsaldosvencidos);
				}

				if(this.cobrarsaldosvencidos.getfecha()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha = '"+Funciones2.getStringPostgresDate(this.cobrarsaldosvencidos.getfecha())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarSaldosVencidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarsaldosvencidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarsaldosvencidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarsaldosvencidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_venceCobrarSaldosVencidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarsaldosvencidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarSaldosVencidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarSaldosVencidos(this.getcobrarsaldosvencidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarSaldosVencidos(this.cobrarsaldosvencidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarsaldosvencidos =(CobrarSaldosVencidos) this.cobrarsaldosvencidosLogic.getCobrarSaldosVencidoss().toArray()[this.jTableDatosCobrarSaldosVencidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarsaldosvencidos =(CobrarSaldosVencidos) this.cobrarsaldosvencidoss.toArray()[this.jTableDatosCobrarSaldosVencidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarsaldosvencidos==null) {
						this.cobrarsaldosvencidos = new CobrarSaldosVencidos();
					}

					this.setVariablesFormularioToObjetoActualCobrarSaldosVencidos(this.cobrarsaldosvencidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarSaldosVencidos(this.cobrarsaldosvencidos);
				}

				if(this.cobrarsaldosvencidos.getfecha_vence()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_vence = '"+Funciones2.getStringPostgresDate(this.cobrarsaldosvencidos.getfecha_vence())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarSaldosVencidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarsaldosvencidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarsaldosvencidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarsaldosvencidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emisionCobrarSaldosVencidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarsaldosvencidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarSaldosVencidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarSaldosVencidos(this.getcobrarsaldosvencidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarSaldosVencidos(this.cobrarsaldosvencidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarsaldosvencidos =(CobrarSaldosVencidos) this.cobrarsaldosvencidosLogic.getCobrarSaldosVencidoss().toArray()[this.jTableDatosCobrarSaldosVencidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarsaldosvencidos =(CobrarSaldosVencidos) this.cobrarsaldosvencidoss.toArray()[this.jTableDatosCobrarSaldosVencidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarsaldosvencidos==null) {
						this.cobrarsaldosvencidos = new CobrarSaldosVencidos();
					}

					this.setVariablesFormularioToObjetoActualCobrarSaldosVencidos(this.cobrarsaldosvencidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarSaldosVencidos(this.cobrarsaldosvencidos);
				}

				if(this.cobrarsaldosvencidos.getfecha_emision()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision = '"+Funciones2.getStringPostgresDate(this.cobrarsaldosvencidos.getfecha_emision())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarSaldosVencidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarsaldosvencidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarsaldosvencidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarsaldosvencidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsaldoCobrarSaldosVencidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarsaldosvencidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarSaldosVencidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarSaldosVencidos(this.getcobrarsaldosvencidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarSaldosVencidos(this.cobrarsaldosvencidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarsaldosvencidos =(CobrarSaldosVencidos) this.cobrarsaldosvencidosLogic.getCobrarSaldosVencidoss().toArray()[this.jTableDatosCobrarSaldosVencidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarsaldosvencidos =(CobrarSaldosVencidos) this.cobrarsaldosvencidoss.toArray()[this.jTableDatosCobrarSaldosVencidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarsaldosvencidos==null) {
						this.cobrarsaldosvencidos = new CobrarSaldosVencidos();
					}

					this.setVariablesFormularioToObjetoActualCobrarSaldosVencidos(this.cobrarsaldosvencidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarSaldosVencidos(this.cobrarsaldosvencidos);
				}

				if(this.cobrarsaldosvencidos.getsaldo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where saldo = "+this.cobrarsaldosvencidos.getsaldo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarSaldosVencidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarsaldosvencidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarsaldosvencidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarsaldosvencidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontelefono_telefonoCobrarSaldosVencidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarsaldosvencidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarSaldosVencidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarSaldosVencidos(this.getcobrarsaldosvencidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarSaldosVencidos(this.cobrarsaldosvencidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarsaldosvencidos =(CobrarSaldosVencidos) this.cobrarsaldosvencidosLogic.getCobrarSaldosVencidoss().toArray()[this.jTableDatosCobrarSaldosVencidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarsaldosvencidos =(CobrarSaldosVencidos) this.cobrarsaldosvencidoss.toArray()[this.jTableDatosCobrarSaldosVencidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarsaldosvencidos==null) {
						this.cobrarsaldosvencidos = new CobrarSaldosVencidos();
					}

					this.setVariablesFormularioToObjetoActualCobrarSaldosVencidos(this.cobrarsaldosvencidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarSaldosVencidos(this.cobrarsaldosvencidos);
				}

				if(this.cobrarsaldosvencidos.gettelefono_telefono()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where telefono_telefono like '%"+this.cobrarsaldosvencidos.gettelefono_telefono()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarSaldosVencidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarsaldosvencidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarsaldosvencidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarsaldosvencidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionCobrarSaldosVencidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarsaldosvencidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarSaldosVencidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarSaldosVencidos(this.getcobrarsaldosvencidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarSaldosVencidos(this.cobrarsaldosvencidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarsaldosvencidos =(CobrarSaldosVencidos) this.cobrarsaldosvencidosLogic.getCobrarSaldosVencidoss().toArray()[this.jTableDatosCobrarSaldosVencidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarsaldosvencidos =(CobrarSaldosVencidos) this.cobrarsaldosvencidoss.toArray()[this.jTableDatosCobrarSaldosVencidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarsaldosvencidos==null) {
						this.cobrarsaldosvencidos = new CobrarSaldosVencidos();
					}

					this.setVariablesFormularioToObjetoActualCobrarSaldosVencidos(this.cobrarsaldosvencidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarSaldosVencidos(this.cobrarsaldosvencidos);
				}

				if(this.cobrarsaldosvencidos.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.cobrarsaldosvencidos.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarSaldosVencidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarsaldosvencidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarsaldosvencidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarsaldosvencidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaCobrarSaldosVencidosCobrarSaldosVencidosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarsaldosvencidosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCobrarSaldosVencidos(false,false);

			this.getCobrarSaldosVencidossBusquedaCobrarSaldosVencidos();

			this.inicializarActualizarBindingCobrarSaldosVencidos(false);

			//if(CobrarSaldosVencidosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCobrarSaldosVencidos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarsaldosvencidosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarsaldosvencidosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarsaldosvencidosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaCobrarSaldosVencidosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarsaldosvencidosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCobrarSaldosVencidos(false,false);

			this.getCobrarSaldosVencidossFK_IdEmpresa();

			this.inicializarActualizarBindingCobrarSaldosVencidos(false);

			//if(CobrarSaldosVencidosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCobrarSaldosVencidos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarsaldosvencidosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarsaldosvencidosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarsaldosvencidosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdGrupoClienteCobrarSaldosVencidosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarsaldosvencidosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCobrarSaldosVencidos(false,false);

			this.getCobrarSaldosVencidossFK_IdGrupoCliente();

			this.inicializarActualizarBindingCobrarSaldosVencidos(false);

			//if(CobrarSaldosVencidosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCobrarSaldosVencidos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarsaldosvencidosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarsaldosvencidosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarsaldosvencidosLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameCobrarSaldosVencidos() {
		if(this.jInternalFrameDetalleFormCobrarSaldosVencidos!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormCobrarSaldosVencidos!=null) {
			this.jInternalFrameDetalleFormCobrarSaldosVencidos.setVisible(false);	    			
			this.jInternalFrameDetalleFormCobrarSaldosVencidos.dispose();
			this.jInternalFrameDetalleFormCobrarSaldosVencidos=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoCobrarSaldosVencidos!=null) {
			this.jInternalFrameReporteDinamicoCobrarSaldosVencidos.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoCobrarSaldosVencidos.dispose();
			this.jInternalFrameReporteDinamicoCobrarSaldosVencidos=null;
		}
		
		if(this.jInternalFrameImportacionCobrarSaldosVencidos!=null) {
			this.jInternalFrameImportacionCobrarSaldosVencidos.setVisible(false);	    			
			this.jInternalFrameImportacionCobrarSaldosVencidos.dispose();
			this.jInternalFrameImportacionCobrarSaldosVencidos=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessCobrarSaldosVencidos();
			
			CobrarSaldosVencidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarsaldosvencidos,new Object(),this.cobrarsaldosvencidosParameterGeneral,this.cobrarsaldosvencidosReturnGeneral);
			
			
			if(sTipo.equals("NuevoCobrarSaldosVencidos")) {
				jButtonNuevoCobrarSaldosVencidosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarCobrarSaldosVencidos")) {
				jButtonDuplicarCobrarSaldosVencidosActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarCobrarSaldosVencidos")) {
				jButtonCopiarCobrarSaldosVencidosActionPerformed(evt);
			} else if(sTipo.equals("VerFormCobrarSaldosVencidos")) {
				jButtonVerFormCobrarSaldosVencidosActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarCobrarSaldosVencidos")) {
				jButtonNuevoCobrarSaldosVencidosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarCobrarSaldosVencidos")) {
				jButtonDuplicarCobrarSaldosVencidosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoCobrarSaldosVencidos")) {
				jButtonNuevoCobrarSaldosVencidosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarCobrarSaldosVencidos")) {
				jButtonDuplicarCobrarSaldosVencidosActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesCobrarSaldosVencidos")) {
				jButtonNuevoCobrarSaldosVencidosActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarCobrarSaldosVencidos")) {
				jButtonNuevoCobrarSaldosVencidosActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesCobrarSaldosVencidos")) {
				jButtonNuevoCobrarSaldosVencidosActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarCobrarSaldosVencidos")) {
				jButtonModificarCobrarSaldosVencidosActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarCobrarSaldosVencidos")) {
				jButtonModificarCobrarSaldosVencidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarCobrarSaldosVencidos")) {
				jButtonModificarCobrarSaldosVencidosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarCobrarSaldosVencidos")) {
				jButtonActualizarCobrarSaldosVencidosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarCobrarSaldosVencidos")) {
				jButtonActualizarCobrarSaldosVencidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarCobrarSaldosVencidos")) {
				jButtonActualizarCobrarSaldosVencidosActionPerformed(evt);
			} else if(sTipo.equals("EliminarCobrarSaldosVencidos")) {
				jButtonEliminarCobrarSaldosVencidosActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarCobrarSaldosVencidos")) {
				jButtonEliminarCobrarSaldosVencidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarCobrarSaldosVencidos")) {
				jButtonEliminarCobrarSaldosVencidosActionPerformed(evt);
			} else if(sTipo.equals("CancelarCobrarSaldosVencidos")) {
				jButtonCancelarCobrarSaldosVencidosActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarCobrarSaldosVencidos")) {
				jButtonCancelarCobrarSaldosVencidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarCobrarSaldosVencidos")) {
				jButtonCancelarCobrarSaldosVencidosActionPerformed(evt);
			} else if(sTipo.equals("CerrarCobrarSaldosVencidos")) {
				jButtonCerrarCobrarSaldosVencidosActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarCobrarSaldosVencidos")) {
				jButtonCerrarCobrarSaldosVencidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarCobrarSaldosVencidos")) {
				jButtonCerrarCobrarSaldosVencidosActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarCobrarSaldosVencidos")) {
				jButtonMostrarOcultarCobrarSaldosVencidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarCobrarSaldosVencidos")) {
				jButtonCancelarCobrarSaldosVencidosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosCobrarSaldosVencidos")) {
				jButtonGuardarCambiosCobrarSaldosVencidosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarCobrarSaldosVencidos")) {
				jButtonGuardarCambiosCobrarSaldosVencidosActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarCobrarSaldosVencidos")) {
				jButtonCopiarCobrarSaldosVencidosActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarCobrarSaldosVencidos")) {
				jButtonVerFormCobrarSaldosVencidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosCobrarSaldosVencidos")) {
				jButtonGuardarCambiosCobrarSaldosVencidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarCobrarSaldosVencidos")) {
				jButtonCopiarCobrarSaldosVencidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormCobrarSaldosVencidos")) {
				jButtonVerFormCobrarSaldosVencidosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaCobrarSaldosVencidos")) {
				jButtonGuardarCambiosCobrarSaldosVencidosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarCobrarSaldosVencidos")) {
				jButtonGuardarCambiosCobrarSaldosVencidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaCobrarSaldosVencidos")) {
				jButtonGuardarCambiosCobrarSaldosVencidosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionCobrarSaldosVencidos")) {
				jButtonRecargarInformacionCobrarSaldosVencidosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarCobrarSaldosVencidos")) {
				jButtonRecargarInformacionCobrarSaldosVencidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionCobrarSaldosVencidos")) {
				jButtonRecargarInformacionCobrarSaldosVencidosActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresCobrarSaldosVencidos")) {
				jButtonAnterioresCobrarSaldosVencidosActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarCobrarSaldosVencidos")) {
				jButtonAnterioresCobrarSaldosVencidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreCobrarSaldosVencidos")) {
				jButtonAnterioresCobrarSaldosVencidosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesCobrarSaldosVencidos")) {
				jButtonSiguientesCobrarSaldosVencidosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarCobrarSaldosVencidos")) {
				jButtonSiguientesCobrarSaldosVencidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesCobrarSaldosVencidos")) {
				jButtonSiguientesCobrarSaldosVencidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByCobrarSaldosVencidos") || sTipo.equals("MenuItemDetalleAbrirOrderByCobrarSaldosVencidos")) {
				jButtonAbrirOrderByCobrarSaldosVencidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarCobrarSaldosVencidos") || sTipo.equals("MenuItemDetalleMostrarOcultarCobrarSaldosVencidos")) {
				jButtonMostrarOcultarCobrarSaldosVencidosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosCobrarSaldosVencidos")) {
				jButtonNuevoGuardarCambiosCobrarSaldosVencidosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarCobrarSaldosVencidos")) {
				jButtonNuevoGuardarCambiosCobrarSaldosVencidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosCobrarSaldosVencidos")) {
				jButtonNuevoGuardarCambiosCobrarSaldosVencidosActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoCobrarSaldosVencidos")) {
				jButtonCerrarReporteDinamicoCobrarSaldosVencidosActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoCobrarSaldosVencidos")) {
				jButtonGenerarReporteDinamicoCobrarSaldosVencidosActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoCobrarSaldosVencidos")) {
				
				jButtonGenerarExcelReporteDinamicoCobrarSaldosVencidosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionCobrarSaldosVencidos")) {
				jButtonCerrarImportacionCobrarSaldosVencidosActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionCobrarSaldosVencidos")) {
				
				jButtonGenerarImportacionCobrarSaldosVencidosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionCobrarSaldosVencidos")) {
				
				jButtonAbrirImportacionCobrarSaldosVencidosActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesCobrarSaldosVencidos")) {
				jComboBoxTiposAccionesCobrarSaldosVencidosActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesCobrarSaldosVencidos")) {
				jComboBoxTiposRelacionesCobrarSaldosVencidosActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioCobrarSaldosVencidos")) {
				jComboBoxTiposAccionesCobrarSaldosVencidosActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarCobrarSaldosVencidos")) {
				
				jComboBoxTiposSeleccionarCobrarSaldosVencidosActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralCobrarSaldosVencidos")) {
				jTextFieldValorCampoGeneralCobrarSaldosVencidosActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByCobrarSaldosVencidos")) {
				jButtonAbrirOrderByCobrarSaldosVencidosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarCobrarSaldosVencidos")) {
				jButtonAbrirOrderByCobrarSaldosVencidosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByCobrarSaldosVencidos")) {
				jButtonCerrarOrderByCobrarSaldosVencidosActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCobrarSaldosVencidosBusqueda")) {
				this.jButtonidCobrarSaldosVencidosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_grupo_clienteCobrarSaldosVencidosUpdate")) {
				this.jButtonid_grupo_clienteCobrarSaldosVencidosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_grupo_clienteCobrarSaldosVencidosBusqueda")) {
				this.jButtonid_grupo_clienteCobrarSaldosVencidosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaCobrarSaldosVencidosUpdate")) {
				this.jButtonid_empresaCobrarSaldosVencidosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCobrarSaldosVencidosBusqueda")) {
				this.jButtonid_empresaCobrarSaldosVencidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_facturaCobrarSaldosVencidosBusqueda")) {
				this.jButtonnumero_facturaCobrarSaldosVencidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_grupo_clienteCobrarSaldosVencidosBusqueda")) {
				this.jButtonnombre_grupo_clienteCobrarSaldosVencidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoCobrarSaldosVencidosBusqueda")) {
				this.jButtoncodigoCobrarSaldosVencidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreCobrarSaldosVencidosBusqueda")) {
				this.jButtonnombreCobrarSaldosVencidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaCobrarSaldosVencidosBusqueda")) {
				this.jButtonfechaCobrarSaldosVencidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_venceCobrarSaldosVencidosBusqueda")) {
				this.jButtonfecha_venceCobrarSaldosVencidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionCobrarSaldosVencidosBusqueda")) {
				this.jButtonfecha_emisionCobrarSaldosVencidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("saldoCobrarSaldosVencidosBusqueda")) {
				this.jButtonsaldoCobrarSaldosVencidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("telefono_telefonoCobrarSaldosVencidosBusqueda")) {
				this.jButtontelefono_telefonoCobrarSaldosVencidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionCobrarSaldosVencidosBusqueda")) {
				this.jButtondescripcionCobrarSaldosVencidosBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaCobrarSaldosVencidosCobrarSaldosVencidos")) {
				this.jButtonBusquedaCobrarSaldosVencidosCobrarSaldosVencidosActionPerformed(evt);
			}
			
			;
			
			
			CobrarSaldosVencidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarsaldosvencidos,new Object(),this.cobrarsaldosvencidosParameterGeneral,this.cobrarsaldosvencidosReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessCobrarSaldosVencidos();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarSaldosVencidosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarsaldosvencidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarsaldosvencidos);
				
				CobrarSaldosVencidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarsaldosvencidos,new Object(),this.cobrarsaldosvencidosParameterGeneral,this.cobrarsaldosvencidosReturnGeneral);
				
				


				
				CobrarSaldosVencidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarsaldosvencidos,new Object(),this.cobrarsaldosvencidosParameterGeneral,this.cobrarsaldosvencidosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarSaldosVencidos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarSaldosVencidos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			CobrarSaldosVencidos cobrarsaldosvencidosLocal=null;
			
			if(!this.getEsControlTabla()) {
				cobrarsaldosvencidosLocal=this.cobrarsaldosvencidos;
			} else {
				cobrarsaldosvencidosLocal=this.cobrarsaldosvencidosAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarsaldosvencidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarsaldosvencidos);
				
				CobrarSaldosVencidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarsaldosvencidos,new Object(),this.cobrarsaldosvencidosParameterGeneral,this.cobrarsaldosvencidosReturnGeneral);
							
				
				


				
				CobrarSaldosVencidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarsaldosvencidos,new Object(),this.cobrarsaldosvencidosParameterGeneral,this.cobrarsaldosvencidosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarSaldosVencidos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarSaldosVencidos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarSaldosVencidosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCobrarSaldosVencidos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarsaldosvencidosAnterior =(CobrarSaldosVencidos) this.cobrarsaldosvencidosLogic.getCobrarSaldosVencidoss().toArray()[this.jTableDatosCobrarSaldosVencidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarsaldosvencidosAnterior =(CobrarSaldosVencidos) this.cobrarsaldosvencidoss.toArray()[this.jTableDatosCobrarSaldosVencidos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
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
			
			CobrarSaldosVencidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarsaldosvencidos,new Object(),this.cobrarsaldosvencidosParameterGeneral,this.cobrarsaldosvencidosReturnGeneral);
			
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
			
			


			
			CobrarSaldosVencidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarsaldosvencidos,new Object(),this.cobrarsaldosvencidosParameterGeneral,this.cobrarsaldosvencidosReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarSaldosVencidosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarsaldosvencidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarsaldosvencidos);
				
				CobrarSaldosVencidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarsaldosvencidos,new Object(),this.cobrarsaldosvencidosParameterGeneral,this.cobrarsaldosvencidosReturnGeneral);
								
						
				


				
				CobrarSaldosVencidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarsaldosvencidos,new Object(),this.cobrarsaldosvencidosParameterGeneral,this.cobrarsaldosvencidosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarSaldosVencidos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarSaldosVencidos.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarsaldosvencidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarsaldosvencidos);
				
				CobrarSaldosVencidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarsaldosvencidos,new Object(),this.cobrarsaldosvencidosParameterGeneral,this.cobrarsaldosvencidosReturnGeneral);
								
				
				


				
				CobrarSaldosVencidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarsaldosvencidos,new Object(),this.cobrarsaldosvencidosParameterGeneral,this.cobrarsaldosvencidosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarSaldosVencidos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarSaldosVencidos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarSaldosVencidosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCobrarSaldosVencidos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarsaldosvencidosAnterior =(CobrarSaldosVencidos) this.cobrarsaldosvencidosLogic.getCobrarSaldosVencidoss().toArray()[this.jTableDatosCobrarSaldosVencidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarsaldosvencidosAnterior =(CobrarSaldosVencidos) this.cobrarsaldosvencidoss.toArray()[this.jTableDatosCobrarSaldosVencidos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarsaldosvencidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarsaldosvencidos);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarSaldosVencidosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCobrarSaldosVencidos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarsaldosvencidosAnterior =(CobrarSaldosVencidos) this.cobrarsaldosvencidosLogic.getCobrarSaldosVencidoss().toArray()[this.jTableDatosCobrarSaldosVencidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarsaldosvencidosAnterior =(CobrarSaldosVencidos) this.cobrarsaldosvencidoss.toArray()[this.jTableDatosCobrarSaldosVencidos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarSaldosVencidosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarsaldosvencidos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cobrarsaldosvencidos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarsaldosvencidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarsaldosvencidos);
				
				CobrarSaldosVencidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarsaldosvencidos,new Object(),this.cobrarsaldosvencidosParameterGeneral,this.cobrarsaldosvencidosReturnGeneral);
							
				
				


				
				CobrarSaldosVencidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarsaldosvencidos,new Object(),this.cobrarsaldosvencidosParameterGeneral,this.cobrarsaldosvencidosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarSaldosVencidos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarSaldosVencidos.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarSaldosVencidosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCobrarSaldosVencidos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarsaldosvencidosAnterior =(CobrarSaldosVencidos) this.cobrarsaldosvencidosLogic.getCobrarSaldosVencidoss().toArray()[this.jTableDatosCobrarSaldosVencidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.cobrarsaldosvencidosAnterior =(CobrarSaldosVencidos) this.cobrarsaldosvencidoss.toArray()[this.jTableDatosCobrarSaldosVencidos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
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
			
			CobrarSaldosVencidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarsaldosvencidos,new Object(),this.cobrarsaldosvencidosParameterGeneral,this.cobrarsaldosvencidosReturnGeneral);
			
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
			
			


			
			CobrarSaldosVencidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarsaldosvencidos,new Object(),this.cobrarsaldosvencidosParameterGeneral,this.cobrarsaldosvencidosReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarSaldosVencidosActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarsaldosvencidos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cobrarsaldosvencidos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarsaldosvencidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarsaldosvencidos);
				
				CobrarSaldosVencidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarsaldosvencidos,new Object(),this.cobrarsaldosvencidosParameterGeneral,this.cobrarsaldosvencidosReturnGeneral);
								
				
				


				
				CobrarSaldosVencidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarsaldosvencidos,new Object(),this.cobrarsaldosvencidosParameterGeneral,this.cobrarsaldosvencidosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarSaldosVencidos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarSaldosVencidos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarSaldosVencidosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCobrarSaldosVencidos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarsaldosvencidosAnterior =(CobrarSaldosVencidos) this.cobrarsaldosvencidosLogic.getCobrarSaldosVencidoss().toArray()[this.jTableDatosCobrarSaldosVencidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarsaldosvencidosAnterior =(CobrarSaldosVencidos) this.cobrarsaldosvencidoss.toArray()[this.jTableDatosCobrarSaldosVencidos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarSaldosVencidosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarsaldosvencidos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cobrarsaldosvencidos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarSaldosVencidosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarsaldosvencidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarsaldosvencidos);
				
				CobrarSaldosVencidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarsaldosvencidos,new Object(),this.cobrarsaldosvencidosParameterGeneral,this.cobrarsaldosvencidosReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosCobrarSaldosVencidos")) {
					jCheckBoxSeleccionarTodosCobrarSaldosVencidosItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosCobrarSaldosVencidos")) {
					jCheckBoxSeleccionadosCobrarSaldosVencidosItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarCobrarSaldosVencidos")) {
					
				}
				
				


				
				
				CobrarSaldosVencidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarsaldosvencidos,new Object(),this.cobrarsaldosvencidosParameterGeneral,this.cobrarsaldosvencidosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarSaldosVencidos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarSaldosVencidos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarsaldosvencidos);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.cobrarsaldosvencidos);
				
				CobrarSaldosVencidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarsaldosvencidos,new Object(),this.cobrarsaldosvencidosParameterGeneral,this.cobrarsaldosvencidosReturnGeneral);
												
				
				


				
				
				CobrarSaldosVencidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarsaldosvencidos,new Object(),this.cobrarsaldosvencidosParameterGeneral,this.cobrarsaldosvencidosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarSaldosVencidos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarSaldosVencidos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarSaldosVencidosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCobrarSaldosVencidos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarsaldosvencidosAnterior =(CobrarSaldosVencidos) this.cobrarsaldosvencidosLogic.getCobrarSaldosVencidoss().toArray()[this.jTableDatosCobrarSaldosVencidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.cobrarsaldosvencidosAnterior =(CobrarSaldosVencidos) this.cobrarsaldosvencidoss.toArray()[this.jTableDatosCobrarSaldosVencidos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarSaldosVencidosActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarsaldosvencidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarsaldosvencidos);
				
				CobrarSaldosVencidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarsaldosvencidos,new Object(),this.cobrarsaldosvencidosParameterGeneral,this.cobrarsaldosvencidosReturnGeneral);
				
				
				CobrarSaldosVencidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarsaldosvencidos,new Object(),this.cobrarsaldosvencidosParameterGeneral,this.cobrarsaldosvencidosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
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
			
			CobrarSaldosVencidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cobrarsaldosvencidos,new Object(),this.cobrarsaldosvencidosParameterGeneral,this.cobrarsaldosvencidosReturnGeneral);
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
			
			


			
			CobrarSaldosVencidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarsaldosvencidos,new Object(),this.cobrarsaldosvencidosParameterGeneral,this.cobrarsaldosvencidosReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarSaldosVencidosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarsaldosvencidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarsaldosvencidos);
				
				CobrarSaldosVencidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cobrarsaldosvencidos,new Object(),this.cobrarsaldosvencidosParameterGeneral,this.cobrarsaldosvencidosReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				CobrarSaldosVencidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarsaldosvencidos,new Object(),this.cobrarsaldosvencidosParameterGeneral,this.cobrarsaldosvencidosReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarSaldosVencidos.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarSaldosVencidos.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarsaldosvencidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarsaldosvencidos);
				
				CobrarSaldosVencidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cobrarsaldosvencidos,new Object(),this.cobrarsaldosvencidosParameterGeneral,this.cobrarsaldosvencidosReturnGeneral);
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
				
				


				
				CobrarSaldosVencidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarsaldosvencidos,new Object(),this.cobrarsaldosvencidosParameterGeneral,this.cobrarsaldosvencidosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarSaldosVencidos.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarSaldosVencidos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarSaldosVencidosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCobrarSaldosVencidos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarsaldosvencidosAnterior =(CobrarSaldosVencidos) this.cobrarsaldosvencidosLogic.getCobrarSaldosVencidoss().toArray()[this.jTableDatosCobrarSaldosVencidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarsaldosvencidosAnterior =(CobrarSaldosVencidos) this.cobrarsaldosvencidoss.toArray()[this.jTableDatosCobrarSaldosVencidos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				CobrarSaldosVencidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarsaldosvencidos,new Object(),this.cobrarsaldosvencidosParameterGeneral,this.cobrarsaldosvencidosReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarCobrarSaldosVencidos")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosCobrarSaldosVencidosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosCobrarSaldosVencidos.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.cobrarsaldosvencidos =(CobrarSaldosVencidos) this.cobrarsaldosvencidosLogic.getCobrarSaldosVencidoss().toArray()[this.jTableDatosCobrarSaldosVencidos.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.cobrarsaldosvencidos =(CobrarSaldosVencidos) this.cobrarsaldosvencidoss.toArray()[this.jTableDatosCobrarSaldosVencidos.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.cobrarsaldosvencidos);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarCobrarSaldosVencidos")) {
				
				}
				
				CobrarSaldosVencidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarsaldosvencidos,new Object(),this.cobrarsaldosvencidosParameterGeneral,this.cobrarsaldosvencidosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			CobrarSaldosVencidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.cobrarsaldosvencidos,new Object(),this.cobrarsaldosvencidosParameterGeneral,this.cobrarsaldosvencidosReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarCobrarSaldosVencidos")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosCobrarSaldosVencidos.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarCobrarSaldosVencidos")) {
			
			}
			
			CobrarSaldosVencidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.cobrarsaldosvencidos,new Object(),this.cobrarsaldosvencidosParameterGeneral,this.cobrarsaldosvencidosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessCobrarSaldosVencidos();
			
			CobrarSaldosVencidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarsaldosvencidos,new Object(),this.cobrarsaldosvencidosParameterGeneral,this.cobrarsaldosvencidosReturnGeneral);
			
			if(sTipo.equals("NuevoCobrarSaldosVencidos")) {
				jButtonNuevoCobrarSaldosVencidosActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarCobrarSaldosVencidos")) {
				jButtonDuplicarCobrarSaldosVencidosActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarCobrarSaldosVencidos")) {
				jButtonCopiarCobrarSaldosVencidosActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormCobrarSaldosVencidos")) {
				jButtonVerFormCobrarSaldosVencidosActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesCobrarSaldosVencidos")) {
				jButtonNuevoCobrarSaldosVencidosActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarCobrarSaldosVencidos")) {
				jButtonModificarCobrarSaldosVencidosActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarCobrarSaldosVencidos")) {
				jButtonActualizarCobrarSaldosVencidosActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarCobrarSaldosVencidos")) {
				jButtonEliminarCobrarSaldosVencidosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaCobrarSaldosVencidos")) {
				jButtonGuardarCambiosCobrarSaldosVencidosActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarCobrarSaldosVencidos")) {
				jButtonCancelarCobrarSaldosVencidosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarCobrarSaldosVencidos")) {
				jButtonCerrarCobrarSaldosVencidosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosCobrarSaldosVencidos")) {
				jButtonGuardarCambiosCobrarSaldosVencidosActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosCobrarSaldosVencidos")) {
				jButtonNuevoGuardarCambiosCobrarSaldosVencidosActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByCobrarSaldosVencidos")) {
				jButtonAbrirOrderByCobrarSaldosVencidosActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionCobrarSaldosVencidos")) {
				jButtonRecargarInformacionCobrarSaldosVencidosActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresCobrarSaldosVencidos")) {
				jButtonAnterioresCobrarSaldosVencidosActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesCobrarSaldosVencidos")) {
				jButtonSiguientesCobrarSaldosVencidosActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCobrarSaldosVencidosBusqueda")) {
				this.jButtonidCobrarSaldosVencidosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_grupo_clienteCobrarSaldosVencidosUpdate")) {
				this.jButtonid_grupo_clienteCobrarSaldosVencidosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_grupo_clienteCobrarSaldosVencidosBusqueda")) {
				this.jButtonid_grupo_clienteCobrarSaldosVencidosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaCobrarSaldosVencidosUpdate")) {
				this.jButtonid_empresaCobrarSaldosVencidosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCobrarSaldosVencidosBusqueda")) {
				this.jButtonid_empresaCobrarSaldosVencidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_facturaCobrarSaldosVencidosBusqueda")) {
				this.jButtonnumero_facturaCobrarSaldosVencidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_grupo_clienteCobrarSaldosVencidosBusqueda")) {
				this.jButtonnombre_grupo_clienteCobrarSaldosVencidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoCobrarSaldosVencidosBusqueda")) {
				this.jButtoncodigoCobrarSaldosVencidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreCobrarSaldosVencidosBusqueda")) {
				this.jButtonnombreCobrarSaldosVencidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaCobrarSaldosVencidosBusqueda")) {
				this.jButtonfechaCobrarSaldosVencidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_venceCobrarSaldosVencidosBusqueda")) {
				this.jButtonfecha_venceCobrarSaldosVencidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionCobrarSaldosVencidosBusqueda")) {
				this.jButtonfecha_emisionCobrarSaldosVencidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("saldoCobrarSaldosVencidosBusqueda")) {
				this.jButtonsaldoCobrarSaldosVencidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("telefono_telefonoCobrarSaldosVencidosBusqueda")) {
				this.jButtontelefono_telefonoCobrarSaldosVencidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionCobrarSaldosVencidosBusqueda")) {
				this.jButtondescripcionCobrarSaldosVencidosBusquedaActionPerformed(evt);
			}
			
			CobrarSaldosVencidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarsaldosvencidos,new Object(),this.cobrarsaldosvencidosParameterGeneral,this.cobrarsaldosvencidosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessCobrarSaldosVencidos();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			CobrarSaldosVencidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.cobrarsaldosvencidos,new Object(),this.cobrarsaldosvencidosParameterGeneral,this.cobrarsaldosvencidosReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameCobrarSaldosVencidos")) {
				closingInternalFrameCobrarSaldosVencidos();
				
			} else if(sTipo.equals("jButtonCancelarCobrarSaldosVencidos")) {
				JInternalFrameBase jInternalFrameDetalleFormCobrarSaldosVencidos = (JInternalFrameBase)evt.getSource();
	            	
	            CobrarSaldosVencidosBeanSwingJInternalFrame jInternalFrameParent=(CobrarSaldosVencidosBeanSwingJInternalFrame)jInternalFrameDetalleFormCobrarSaldosVencidos.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarCobrarSaldosVencidosActionPerformed(null);
			}
			
			CobrarSaldosVencidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.cobrarsaldosvencidos,new Object(),this.cobrarsaldosvencidosParameterGeneral,this.cobrarsaldosvencidosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormCobrarSaldosVencidos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormCobrarSaldosVencidos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormCobrarSaldosVencidos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.cobrarsaldosvencidos)) {
			if(!esControlTabla) {
				if(CobrarSaldosVencidosJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualCobrarSaldosVencidos(this.cobrarsaldosvencidos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarSaldosVencidos(this.cobrarsaldosvencidos);			
				}
				
				if(this.cobrarsaldosvencidosSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualCobrarSaldosVencidos(this.cobrarsaldosvencidos,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanCobrarSaldosVencidos(this.cobrarsaldosvencidosReturnGeneral,this.cobrarsaldosvencidosBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.cobrarsaldosvencidosSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanCobrarSaldosVencidos(classes,this.cobrarsaldosvencidosReturnGeneral,this.cobrarsaldosvencidosBean,false);
					}
						
					if(this.cobrarsaldosvencidosReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyCobrarSaldosVencidos(this.cobrarsaldosvencidosReturnGeneral.getCobrarSaldosVencidos());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioCobrarSaldosVencidos(this.cobrarsaldosvencidosReturnGeneral.getCobrarSaldosVencidos());	
					}
						
					if(this.cobrarsaldosvencidosReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioCobrarSaldosVencidos(this.cobrarsaldosvencidosReturnGeneral.getCobrarSaldosVencidos(),classes);//this.cobrarsaldosvencidosBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioCobrarSaldosVencidos(this.cobrarsaldosvencidos,classes);//this.cobrarsaldosvencidosBean);									
				}
			
				if(CobrarSaldosVencidosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualCobrarSaldosVencidos(this.cobrarsaldosvencidos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarSaldosVencidos(this.cobrarsaldosvencidos);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.cobrarsaldosvencidosAnterior!=null) {
						this.cobrarsaldosvencidos=this.cobrarsaldosvencidosAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.cobrarsaldosvencidosSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.cobrarsaldosvencidosSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.cobrarsaldosvencidosReturnGeneral.getCobrarSaldosVencidos(),cobrarsaldosvencidosLogic.getCobrarSaldosVencidoss());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.cobrarsaldosvencidosReturnGeneral.getCobrarSaldosVencidos(),this.cobrarsaldosvencidoss);
				}
				//ARCHITECTURE
				
				//this.jTableDatosCobrarSaldosVencidos.repaint();
				
				//((AbstractTableModel) this.jTableDatosCobrarSaldosVencidos.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosCobrarSaldosVencidos();
			}
		}
	}
	
	public void actualizarVisualTableDatosCobrarSaldosVencidos() throws Exception {
		
		CobrarSaldosVencidosModel cobrarsaldosvencidosModel=(CobrarSaldosVencidosModel)this.jTableDatosCobrarSaldosVencidos.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cobrarsaldosvencidosModel.cobrarsaldosvencidoss=this.cobrarsaldosvencidosLogic.getCobrarSaldosVencidoss();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			cobrarsaldosvencidosModel.cobrarsaldosvencidoss=this.cobrarsaldosvencidoss;
		}
		
		
		((CobrarSaldosVencidosModel) this.jTableDatosCobrarSaldosVencidos.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaCobrarSaldosVencidos() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getcobrarsaldosvencidosAnterior(),this.cobrarsaldosvencidosLogic.getCobrarSaldosVencidoss());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getcobrarsaldosvencidosAnterior(),this.cobrarsaldosvencidoss);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosCobrarSaldosVencidos();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioCobrarSaldosVencidos(CobrarSaldosVencidos cobrarsaldosvencidos,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
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
										
				CobrarSaldosVencidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cobrarsaldosvencidos,new Object(),generalEntityParameterGeneral,this.cobrarsaldosvencidosReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.cobrarsaldosvencidosSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=CobrarSaldosVencidosConstantesFunciones.getClassesRelationshipsOfCobrarSaldosVencidos(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=CobrarSaldosVencidosConstantesFunciones.getClassesRelationshipsFromStringsOfCobrarSaldosVencidos(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormCobrarSaldosVencidos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				CobrarSaldosVencidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cobrarsaldosvencidos,new Object(),generalEntityParameterGeneral,this.cobrarsaldosvencidosReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioCobrarSaldosVencidos(CobrarSaldosVencidosBean cobrarsaldosvencidosBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanCobrarSaldosVencidos(ArrayList<Classe> classes,CobrarSaldosVencidosReturnGeneral cobrarsaldosvencidosReturnGeneral,CobrarSaldosVencidosBean cobrarsaldosvencidosBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualCobrarSaldosVencidos(CobrarSaldosVencidos cobrarsaldosvencidos,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.cobrarsaldosvencidos)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormCobrarSaldosVencidos = new CobrarSaldosVencidosDetalleFormJInternalFrame(jDesktopPane,this.cobrarsaldosvencidosSessionBean.getConGuardarRelaciones(),this.cobrarsaldosvencidosSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormCobrarSaldosVencidos);
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.setVisible(false);
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.setSelected(false);						
		
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.cobrarsaldosvencidosLogic=this.cobrarsaldosvencidosLogic;
		
		this.cargarCombosFrameForeignKeyCobrarSaldosVencidos("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleCobrarSaldosVencidos();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCobrarSaldosVencidos();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyCobrarSaldosVencidos("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyCobrarSaldosVencidos();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCobrarSaldosVencidos"));
		
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtonModificarCobrarSaldosVencidos.addActionListener(new ButtonActionListener(this,"ModificarCobrarSaldosVencidos"));

		
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtonModificarToolBarCobrarSaldosVencidos.addActionListener(new ButtonActionListener(this,"ModificarToolBarCobrarSaldosVencidos"));
					
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jMenuItemModificarCobrarSaldosVencidos.addActionListener(new ButtonActionListener(this,"MenuItemModificarCobrarSaldosVencidos"));		
		
		
		
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtonActualizarCobrarSaldosVencidos.addActionListener (new ButtonActionListener(this,"ActualizarCobrarSaldosVencidos"));
		
		
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtonActualizarToolBarCobrarSaldosVencidos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCobrarSaldosVencidos"));
						
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jMenuItemActualizarCobrarSaldosVencidos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCobrarSaldosVencidos"));		
		
		
		
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtonEliminarCobrarSaldosVencidos.addActionListener (new ButtonActionListener(this,"EliminarCobrarSaldosVencidos"));
		
		
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtonEliminarToolBarCobrarSaldosVencidos.addActionListener (new ButtonActionListener(this,"EliminarToolBarCobrarSaldosVencidos"));
								
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jMenuItemEliminarCobrarSaldosVencidos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCobrarSaldosVencidos"));		
		
		
		
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtonCancelarCobrarSaldosVencidos.addActionListener (new ButtonActionListener(this,"CancelarCobrarSaldosVencidos"));
		
		
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtonCancelarToolBarCobrarSaldosVencidos.addActionListener (new ButtonActionListener(this,"CancelarToolBarCobrarSaldosVencidos"));
					
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jMenuItemCancelarCobrarSaldosVencidos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCobrarSaldosVencidos"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jMenuItemDetalleCerrarCobrarSaldosVencidos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCobrarSaldosVencidos"));		
		
		
		
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtonGuardarCambiosToolBarCobrarSaldosVencidos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCobrarSaldosVencidos"));
		
		
		
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtonGuardarCambiosToolBarCobrarSaldosVencidos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCobrarSaldosVencidos"));
		
		
		
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jComboBoxTiposAccionesFormularioCobrarSaldosVencidos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCobrarSaldosVencidos"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtonidCobrarSaldosVencidosBusqueda.addActionListener(new ButtonActionListener(this,"idCobrarSaldosVencidosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtonid_grupo_clienteCobrarSaldosVencidosUpdate.addActionListener(new ButtonActionListener(this,"id_grupo_clienteCobrarSaldosVencidosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtonid_grupo_clienteCobrarSaldosVencidosBusqueda.addActionListener(new ButtonActionListener(this,"id_grupo_clienteCobrarSaldosVencidosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtonid_empresaCobrarSaldosVencidosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCobrarSaldosVencidosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtonid_empresaCobrarSaldosVencidosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCobrarSaldosVencidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtonnumero_facturaCobrarSaldosVencidosBusqueda.addActionListener(new ButtonActionListener(this,"numero_facturaCobrarSaldosVencidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtonnombre_grupo_clienteCobrarSaldosVencidosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_grupo_clienteCobrarSaldosVencidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtoncodigoCobrarSaldosVencidosBusqueda.addActionListener(new ButtonActionListener(this,"codigoCobrarSaldosVencidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtonnombreCobrarSaldosVencidosBusqueda.addActionListener(new ButtonActionListener(this,"nombreCobrarSaldosVencidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtonfechaCobrarSaldosVencidosBusqueda.addActionListener(new ButtonActionListener(this,"fechaCobrarSaldosVencidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtonfecha_venceCobrarSaldosVencidosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_venceCobrarSaldosVencidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtonfecha_emisionCobrarSaldosVencidosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionCobrarSaldosVencidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtonsaldoCobrarSaldosVencidosBusqueda.addActionListener(new ButtonActionListener(this,"saldoCobrarSaldosVencidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtontelefono_telefonoCobrarSaldosVencidosBusqueda.addActionListener(new ButtonActionListener(this,"telefono_telefonoCobrarSaldosVencidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtondescripcionCobrarSaldosVencidosBusqueda.addActionListener(new ButtonActionListener(this,"descripcionCobrarSaldosVencidosBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jTabbedPaneRelacionesCobrarSaldosVencidos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCobrarSaldosVencidos"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameCobrarSaldosVencidos"));
		
		if(this.jInternalFrameDetalleFormCobrarSaldosVencidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarSaldosVencidos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCobrarSaldosVencidos"));
		}
		
		this.jTableDatosCobrarSaldosVencidos.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarCobrarSaldosVencidos"));
		
		this.jTableDatosCobrarSaldosVencidos.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarCobrarSaldosVencidos"));
		
		this.jButtonNuevoCobrarSaldosVencidos.addActionListener(new ButtonActionListener(this,"NuevoCobrarSaldosVencidos"));
		
		this.jButtonDuplicarCobrarSaldosVencidos.addActionListener(new ButtonActionListener(this,"DuplicarCobrarSaldosVencidos"));
		
		this.jButtonCopiarCobrarSaldosVencidos.addActionListener(new ButtonActionListener(this,"CopiarCobrarSaldosVencidos"));
		
		this.jButtonVerFormCobrarSaldosVencidos.addActionListener(new ButtonActionListener(this,"VerFormCobrarSaldosVencidos"));
		
		
		this.jButtonNuevoToolBarCobrarSaldosVencidos.addActionListener(new ButtonActionListener(this,"NuevoToolBarCobrarSaldosVencidos"));
			
		this.jButtonDuplicarToolBarCobrarSaldosVencidos.addActionListener(new ButtonActionListener(this,"DuplicarToolBarCobrarSaldosVencidos"));
			
		this.jMenuItemNuevoCobrarSaldosVencidos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoCobrarSaldosVencidos"));
			
		this.jMenuItemDuplicarCobrarSaldosVencidos.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarCobrarSaldosVencidos"));		
		
		
		this.jButtonNuevoRelacionesCobrarSaldosVencidos.addActionListener (new ButtonActionListener(this,"NuevoRelacionesCobrarSaldosVencidos"));
		
		
		this.jButtonNuevoRelacionesToolBarCobrarSaldosVencidos.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarCobrarSaldosVencidos"));
			
		this.jMenuItemNuevoRelacionesCobrarSaldosVencidos.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesCobrarSaldosVencidos"));		
		
		
		if(this.jInternalFrameDetalleFormCobrarSaldosVencidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtonModificarCobrarSaldosVencidos.addActionListener(new ButtonActionListener(this,"ModificarCobrarSaldosVencidos"));
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarSaldosVencidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtonModificarToolBarCobrarSaldosVencidos.addActionListener(new ButtonActionListener(this,"ModificarToolBarCobrarSaldosVencidos"));
			
			this.jInternalFrameDetalleFormCobrarSaldosVencidos.jMenuItemModificarCobrarSaldosVencidos.addActionListener(new ButtonActionListener(this,"MenuItemModificarCobrarSaldosVencidos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarSaldosVencidos!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtonActualizarCobrarSaldosVencidos.addActionListener (new ButtonActionListener(this,"ActualizarCobrarSaldosVencidos"));
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarSaldosVencidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtonActualizarToolBarCobrarSaldosVencidos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCobrarSaldosVencidos"));
				
			this.jInternalFrameDetalleFormCobrarSaldosVencidos.jMenuItemActualizarCobrarSaldosVencidos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCobrarSaldosVencidos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarSaldosVencidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtonEliminarCobrarSaldosVencidos.addActionListener (new ButtonActionListener(this,"EliminarCobrarSaldosVencidos"));
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarSaldosVencidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtonEliminarToolBarCobrarSaldosVencidos.addActionListener (new ButtonActionListener(this,"EliminarToolBarCobrarSaldosVencidos"));
						
			this.jInternalFrameDetalleFormCobrarSaldosVencidos.jMenuItemEliminarCobrarSaldosVencidos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCobrarSaldosVencidos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarSaldosVencidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtonCancelarCobrarSaldosVencidos.addActionListener (new ButtonActionListener(this,"CancelarCobrarSaldosVencidos"));
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarSaldosVencidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtonCancelarToolBarCobrarSaldosVencidos.addActionListener (new ButtonActionListener(this,"CancelarToolBarCobrarSaldosVencidos"));
			
			this.jInternalFrameDetalleFormCobrarSaldosVencidos.jMenuItemCancelarCobrarSaldosVencidos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCobrarSaldosVencidos"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarCobrarSaldosVencidos.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarCobrarSaldosVencidos"));		
		
		
		this.jButtonCerrarCobrarSaldosVencidos.addActionListener (new ButtonActionListener(this,"CerrarCobrarSaldosVencidos"));
		
		
		this.jButtonCerrarToolBarCobrarSaldosVencidos.addActionListener (new ButtonActionListener(this,"CerrarToolBarCobrarSaldosVencidos"));
			
		this.jMenuItemCerrarCobrarSaldosVencidos.addActionListener (new ButtonActionListener(this,"MenuItemCerrarCobrarSaldosVencidos"));
			
		if(this.jInternalFrameDetalleFormCobrarSaldosVencidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarSaldosVencidos.jMenuItemDetalleCerrarCobrarSaldosVencidos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCobrarSaldosVencidos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarSaldosVencidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtonGuardarCambiosCobrarSaldosVencidos.addActionListener (new ButtonActionListener(this,"GuardarCambiosCobrarSaldosVencidos"));
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarSaldosVencidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtonGuardarCambiosToolBarCobrarSaldosVencidos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCobrarSaldosVencidos"));
		}
		
		this.jButtonCopiarToolBarCobrarSaldosVencidos.addActionListener (new ButtonActionListener(this,"CopiarToolBarCobrarSaldosVencidos"));
			
		this.jButtonVerFormToolBarCobrarSaldosVencidos.addActionListener (new ButtonActionListener(this,"VerFormToolBarCobrarSaldosVencidos"));
		
		this.jMenuItemGuardarCambiosCobrarSaldosVencidos.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosCobrarSaldosVencidos"));
			
		this.jMenuItemCopiarCobrarSaldosVencidos.addActionListener (new ButtonActionListener(this,"MenuItemCopiarCobrarSaldosVencidos"));		
		
		this.jMenuItemVerFormCobrarSaldosVencidos.addActionListener (new ButtonActionListener(this,"MenuItemVerFormCobrarSaldosVencidos"));		
		
		
		this.jButtonGuardarCambiosTablaCobrarSaldosVencidos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCobrarSaldosVencidos"));
		
		
		this.jButtonGuardarCambiosTablaToolBarCobrarSaldosVencidos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarCobrarSaldosVencidos"));
			
		this.jMenuItemGuardarCambiosTablaCobrarSaldosVencidos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCobrarSaldosVencidos"));		
		
		
		
		this.jButtonRecargarInformacionCobrarSaldosVencidos.addActionListener (new ButtonActionListener(this,"RecargarInformacionCobrarSaldosVencidos"));
					
		this.jButtonRecargarInformacionToolBarCobrarSaldosVencidos.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarCobrarSaldosVencidos"));
		
		this.jMenuItemRecargarInformacionCobrarSaldosVencidos.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionCobrarSaldosVencidos"));		
		
		
		
		this.jButtonAnterioresCobrarSaldosVencidos.addActionListener (new ButtonActionListener(this,"AnterioresCobrarSaldosVencidos"));
		
		
		this.jButtonAnterioresToolBarCobrarSaldosVencidos.addActionListener (new ButtonActionListener(this,"AnterioresToolBarCobrarSaldosVencidos"));
		
		this.jMenuItemAnterioresCobrarSaldosVencidos.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresCobrarSaldosVencidos"));		
		
		
		this.jButtonSiguientesCobrarSaldosVencidos.addActionListener (new ButtonActionListener(this,"SiguientesCobrarSaldosVencidos"));
		
		
		this.jButtonSiguientesToolBarCobrarSaldosVencidos.addActionListener (new ButtonActionListener(this,"SiguientesToolBarCobrarSaldosVencidos"));
			
		this.jMenuItemSiguientesCobrarSaldosVencidos.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesCobrarSaldosVencidos"));
			
		this.jMenuItemAbrirOrderByCobrarSaldosVencidos.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByCobrarSaldosVencidos"));
			
		this.jMenuItemMostrarOcultarCobrarSaldosVencidos.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarCobrarSaldosVencidos"));
			
		this.jMenuItemDetalleAbrirOrderByCobrarSaldosVencidos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByCobrarSaldosVencidos"));
			
		this.jMenuItemDetalleMostarOcultarCobrarSaldosVencidos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarCobrarSaldosVencidos"));		
		
		
		this.jButtonNuevoGuardarCambiosCobrarSaldosVencidos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosCobrarSaldosVencidos"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarCobrarSaldosVencidos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarCobrarSaldosVencidos"));
			
		this.jMenuItemNuevoGuardarCambiosCobrarSaldosVencidos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosCobrarSaldosVencidos"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosCobrarSaldosVencidos.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosCobrarSaldosVencidos"));

		this.jCheckBoxSeleccionadosCobrarSaldosVencidos.addItemListener(new CheckBoxItemListener(this,"SeleccionadosCobrarSaldosVencidos"));
		
		if(this.jInternalFrameDetalleFormCobrarSaldosVencidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarSaldosVencidos.jComboBoxTiposAccionesFormularioCobrarSaldosVencidos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCobrarSaldosVencidos"));
		}
		
		
		this.jComboBoxTiposRelacionesCobrarSaldosVencidos.addActionListener (new ButtonActionListener(this,"TiposRelacionesCobrarSaldosVencidos"));
			
		this.jComboBoxTiposAccionesCobrarSaldosVencidos.addActionListener (new ButtonActionListener(this,"TiposAccionesCobrarSaldosVencidos"));
					
		this.jComboBoxTiposSeleccionarCobrarSaldosVencidos.addActionListener (new ButtonActionListener(this,"TiposSeleccionarCobrarSaldosVencidos"));
			
		this.jTextFieldValorCampoGeneralCobrarSaldosVencidos.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralCobrarSaldosVencidos"));		
		
		
		if(this.jInternalFrameDetalleFormCobrarSaldosVencidos!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtonidCobrarSaldosVencidosBusqueda.addActionListener(new ButtonActionListener(this,"idCobrarSaldosVencidosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtonid_grupo_clienteCobrarSaldosVencidosUpdate.addActionListener(new ButtonActionListener(this,"id_grupo_clienteCobrarSaldosVencidosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtonid_grupo_clienteCobrarSaldosVencidosBusqueda.addActionListener(new ButtonActionListener(this,"id_grupo_clienteCobrarSaldosVencidosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtonid_empresaCobrarSaldosVencidosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCobrarSaldosVencidosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtonid_empresaCobrarSaldosVencidosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCobrarSaldosVencidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtonnumero_facturaCobrarSaldosVencidosBusqueda.addActionListener(new ButtonActionListener(this,"numero_facturaCobrarSaldosVencidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtonnombre_grupo_clienteCobrarSaldosVencidosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_grupo_clienteCobrarSaldosVencidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtoncodigoCobrarSaldosVencidosBusqueda.addActionListener(new ButtonActionListener(this,"codigoCobrarSaldosVencidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtonnombreCobrarSaldosVencidosBusqueda.addActionListener(new ButtonActionListener(this,"nombreCobrarSaldosVencidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtonfechaCobrarSaldosVencidosBusqueda.addActionListener(new ButtonActionListener(this,"fechaCobrarSaldosVencidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtonfecha_venceCobrarSaldosVencidosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_venceCobrarSaldosVencidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtonfecha_emisionCobrarSaldosVencidosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionCobrarSaldosVencidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtonsaldoCobrarSaldosVencidosBusqueda.addActionListener(new ButtonActionListener(this,"saldoCobrarSaldosVencidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtontelefono_telefonoCobrarSaldosVencidosBusqueda.addActionListener(new ButtonActionListener(this,"telefono_telefonoCobrarSaldosVencidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtondescripcionCobrarSaldosVencidosBusqueda.addActionListener(new ButtonActionListener(this,"descripcionCobrarSaldosVencidosBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaCobrarSaldosVencidosCobrarSaldosVencidos.addActionListener(new ButtonActionListener(this,"BusquedaCobrarSaldosVencidosCobrarSaldosVencidos"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoCobrarSaldosVencidos!=null) {
				this.jInternalFrameReporteDinamicoCobrarSaldosVencidos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCobrarSaldosVencidos"));
				this.jInternalFrameReporteDinamicoCobrarSaldosVencidos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCobrarSaldosVencidos"));
				this.jInternalFrameReporteDinamicoCobrarSaldosVencidos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCobrarSaldosVencidos"));
			}
			
			//this.jButtonCerrarReporteDinamicoCobrarSaldosVencidos.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCobrarSaldosVencidos"));				
			//this.jButtonGenerarReporteDinamicoCobrarSaldosVencidos.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCobrarSaldosVencidos"));
			//this.jButtonGenerarExcelReporteDinamicoCobrarSaldosVencidos.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCobrarSaldosVencidos"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionCobrarSaldosVencidos!=null) {
				this.jInternalFrameImportacionCobrarSaldosVencidos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCobrarSaldosVencidos"));
				this.jInternalFrameImportacionCobrarSaldosVencidos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCobrarSaldosVencidos"));
				this.jInternalFrameImportacionCobrarSaldosVencidos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCobrarSaldosVencidos"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByCobrarSaldosVencidos.addActionListener (new ButtonActionListener(this,"AbrirOrderByCobrarSaldosVencidos"));
			
			this.jButtonAbrirOrderByToolBarCobrarSaldosVencidos.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarCobrarSaldosVencidos"));			
			
			if(this.jInternalFrameOrderByCobrarSaldosVencidos!=null) {
				this.jInternalFrameOrderByCobrarSaldosVencidos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCobrarSaldosVencidos"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormCobrarSaldosVencidos!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormCobrarSaldosVencidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarSaldosVencidos.jTabbedPaneRelacionesCobrarSaldosVencidos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCobrarSaldosVencidos"));
		
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
            		closingInternalFrameCobrarSaldosVencidos();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormCobrarSaldosVencidos = (JInternalFrameBase)event.getSource();
	            	
	            CobrarSaldosVencidosBeanSwingJInternalFrame jInternalFrameParent=(CobrarSaldosVencidosBeanSwingJInternalFrame)jInternalFrameDetalleFormCobrarSaldosVencidos.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarCobrarSaldosVencidosActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosCobrarSaldosVencidos.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosCobrarSaldosVencidosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosCobrarSaldosVencidos.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosCobrarSaldosVencidos.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoCobrarSaldosVencidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobrarSaldosVencidosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarCobrarSaldosVencidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobrarSaldosVencidosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoCobrarSaldosVencidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobrarSaldosVencidosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoCobrarSaldosVencidos";
		inputMap = this.jButtonNuevoCobrarSaldosVencidos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoCobrarSaldosVencidos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCobrarSaldosVencidosActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesCobrarSaldosVencidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobrarSaldosVencidosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarCobrarSaldosVencidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobrarSaldosVencidosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesCobrarSaldosVencidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobrarSaldosVencidosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesCobrarSaldosVencidos";
		inputMap = this.jButtonNuevoRelacionesCobrarSaldosVencidos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesCobrarSaldosVencidos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCobrarSaldosVencidosActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarCobrarSaldosVencidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCobrarSaldosVencidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarCobrarSaldosVencidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCobrarSaldosVencidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarCobrarSaldosVencidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCobrarSaldosVencidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarCobrarSaldosVencidos";
		inputMap = this.jButtonModificarCobrarSaldosVencidos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarCobrarSaldosVencidos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarCobrarSaldosVencidosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarCobrarSaldosVencidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCobrarSaldosVencidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarCobrarSaldosVencidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCobrarSaldosVencidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarCobrarSaldosVencidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCobrarSaldosVencidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarCobrarSaldosVencidos";
		inputMap = this.jButtonActualizarCobrarSaldosVencidos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarCobrarSaldosVencidos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarCobrarSaldosVencidosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarCobrarSaldosVencidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCobrarSaldosVencidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarCobrarSaldosVencidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCobrarSaldosVencidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarCobrarSaldosVencidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCobrarSaldosVencidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarCobrarSaldosVencidos";
		inputMap = this.jButtonEliminarCobrarSaldosVencidos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarCobrarSaldosVencidos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarCobrarSaldosVencidosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarCobrarSaldosVencidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCobrarSaldosVencidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarCobrarSaldosVencidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCobrarSaldosVencidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarCobrarSaldosVencidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCobrarSaldosVencidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarCobrarSaldosVencidos";
		inputMap = this.jButtonCancelarCobrarSaldosVencidos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarCobrarSaldosVencidos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarCobrarSaldosVencidosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarCobrarSaldosVencidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCobrarSaldosVencidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarCobrarSaldosVencidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCobrarSaldosVencidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarCobrarSaldosVencidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCobrarSaldosVencidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarCobrarSaldosVencidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarCobrarSaldosVencidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarCobrarSaldosVencidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarCobrarSaldosVencidos";
		inputMap = this.jButtonCerrarCobrarSaldosVencidos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarCobrarSaldosVencidos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarCobrarSaldosVencidosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtonGuardarCambiosCobrarSaldosVencidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobrarSaldosVencidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarCobrarSaldosVencidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobrarSaldosVencidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosCobrarSaldosVencidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobrarSaldosVencidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaCobrarSaldosVencidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobrarSaldosVencidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarCobrarSaldosVencidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobrarSaldosVencidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaCobrarSaldosVencidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobrarSaldosVencidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosCobrarSaldosVencidos";
		inputMap = this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtonGuardarCambiosCobrarSaldosVencidos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtonGuardarCambiosCobrarSaldosVencidos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosCobrarSaldosVencidosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionCobrarSaldosVencidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCobrarSaldosVencidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarCobrarSaldosVencidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCobrarSaldosVencidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionCobrarSaldosVencidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCobrarSaldosVencidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresCobrarSaldosVencidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCobrarSaldosVencidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarCobrarSaldosVencidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCobrarSaldosVencidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresCobrarSaldosVencidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCobrarSaldosVencidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesCobrarSaldosVencidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCobrarSaldosVencidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarCobrarSaldosVencidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCobrarSaldosVencidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesCobrarSaldosVencidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCobrarSaldosVencidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosCobrarSaldosVencidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCobrarSaldosVencidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarCobrarSaldosVencidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCobrarSaldosVencidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosCobrarSaldosVencidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCobrarSaldosVencidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosCobrarSaldosVencidos.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosCobrarSaldosVencidosItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesCobrarSaldosVencidos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesCobrarSaldosVencidosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarCobrarSaldosVencidos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarCobrarSaldosVencidosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralCobrarSaldosVencidos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralCobrarSaldosVencidosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtonidCobrarSaldosVencidosBusqueda.addActionListener(new ButtonActionListener(this,"idCobrarSaldosVencidosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtonid_grupo_clienteCobrarSaldosVencidosUpdate.addActionListener(new ButtonActionListener(this,"id_grupo_clienteCobrarSaldosVencidosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtonid_grupo_clienteCobrarSaldosVencidosBusqueda.addActionListener(new ButtonActionListener(this,"id_grupo_clienteCobrarSaldosVencidosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtonid_empresaCobrarSaldosVencidosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCobrarSaldosVencidosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtonid_empresaCobrarSaldosVencidosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCobrarSaldosVencidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtonnumero_facturaCobrarSaldosVencidosBusqueda.addActionListener(new ButtonActionListener(this,"numero_facturaCobrarSaldosVencidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtonnombre_grupo_clienteCobrarSaldosVencidosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_grupo_clienteCobrarSaldosVencidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtoncodigoCobrarSaldosVencidosBusqueda.addActionListener(new ButtonActionListener(this,"codigoCobrarSaldosVencidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtonnombreCobrarSaldosVencidosBusqueda.addActionListener(new ButtonActionListener(this,"nombreCobrarSaldosVencidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtonfechaCobrarSaldosVencidosBusqueda.addActionListener(new ButtonActionListener(this,"fechaCobrarSaldosVencidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtonfecha_venceCobrarSaldosVencidosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_venceCobrarSaldosVencidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtonfecha_emisionCobrarSaldosVencidosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionCobrarSaldosVencidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtonsaldoCobrarSaldosVencidosBusqueda.addActionListener(new ButtonActionListener(this,"saldoCobrarSaldosVencidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtontelefono_telefonoCobrarSaldosVencidosBusqueda.addActionListener(new ButtonActionListener(this,"telefono_telefonoCobrarSaldosVencidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jButtondescripcionCobrarSaldosVencidosBusqueda.addActionListener(new ButtonActionListener(this,"descripcionCobrarSaldosVencidosBusqueda"));
		
		
		this.jButtonBusquedaCobrarSaldosVencidosCobrarSaldosVencidos.addActionListener(new ButtonActionListener(this,"BusquedaCobrarSaldosVencidosCobrarSaldosVencidos"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoCobrarSaldosVencidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoCobrarSaldosVencidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoCobrarSaldosVencidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoCobrarSaldosVencidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoCobrarSaldosVencidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoCobrarSaldosVencidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionCobrarSaldosVencidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionCobrarSaldosVencidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionCobrarSaldosVencidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionCobrarSaldosVencidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionCobrarSaldosVencidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionCobrarSaldosVencidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarCobrarSaldosVencidosActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarCobrarSaldosVencidos.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosCobrarSaldosVencidos(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(CobrarSaldosVencidos cobrarsaldosvencidosAux:this.cobrarsaldosvencidosLogic.getCobrarSaldosVencidoss()) {
					cobrarsaldosvencidosAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CobrarSaldosVencidos cobrarsaldosvencidosAux:cobrarsaldosvencidoss) {
					cobrarsaldosvencidosAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosCobrarSaldosVencidosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCobrarSaldosVencidos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CobrarSaldosVencidos cobrarsaldosvencidosAux:this.cobrarsaldosvencidosLogic.getCobrarSaldosVencidoss()) {
						cobrarsaldosvencidosAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CobrarSaldosVencidos cobrarsaldosvencidosAux:cobrarsaldosvencidoss) {
						cobrarsaldosvencidosAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(CobrarSaldosVencidos cobrarsaldosvencidosAux:this.cobrarsaldosvencidosLogic.getCobrarSaldosVencidoss()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CobrarSaldosVencidos cobrarsaldosvencidosAux:cobrarsaldosvencidoss) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaCobrarSaldosVencidos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCobrarSaldosVencidos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCobrarSaldosVencidos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCobrarSaldosVencidos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosCobrarSaldosVencidosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCobrarSaldosVencidos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosCobrarSaldosVencidos.getSelectedRows();
			
			CobrarSaldosVencidos cobrarsaldosvencidosLocal=new CobrarSaldosVencidos();
			
			//this.seleccionarTodosCobrarSaldosVencidos(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cobrarsaldosvencidosLocal =(CobrarSaldosVencidos) this.cobrarsaldosvencidosLogic.getCobrarSaldosVencidoss().toArray()[this.jTableDatosCobrarSaldosVencidos.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					cobrarsaldosvencidosLocal =(CobrarSaldosVencidos) this.cobrarsaldosvencidoss.toArray()[this.jTableDatosCobrarSaldosVencidos.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				cobrarsaldosvencidosLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CobrarSaldosVencidos cobrarsaldosvencidosAux:this.cobrarsaldosvencidosLogic.getCobrarSaldosVencidoss()) {
						cobrarsaldosvencidosAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CobrarSaldosVencidos cobrarsaldosvencidosAux:cobrarsaldosvencidoss) {
						cobrarsaldosvencidosAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaCobrarSaldosVencidos(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCobrarSaldosVencidos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCobrarSaldosVencidos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCobrarSaldosVencidos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualCobrarSaldosVencidosItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarCobrarSaldosVencidosParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralCobrarSaldosVencidosActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingCobrarSaldosVencidos(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralCobrarSaldosVencidos.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CobrarSaldosVencidos cobrarsaldosvencidosAux:this.cobrarsaldosvencidosLogic.getCobrarSaldosVencidoss()) {
				
						if(sTipoSeleccionar.equals(CobrarSaldosVencidosConstantesFunciones.LABEL_NUMEROFACTURA)) {
							existe=true;
							cobrarsaldosvencidosAux.setnumero_factura(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarSaldosVencidosConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE)) {
							existe=true;
							cobrarsaldosvencidosAux.setnombre_grupo_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarSaldosVencidosConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							cobrarsaldosvencidosAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarSaldosVencidosConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							cobrarsaldosvencidosAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarSaldosVencidosConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							cobrarsaldosvencidosAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarSaldosVencidosConstantesFunciones.LABEL_FECHAVENCE)) {
							existe=true;
							cobrarsaldosvencidosAux.setfecha_vence(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarSaldosVencidosConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							cobrarsaldosvencidosAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarSaldosVencidosConstantesFunciones.LABEL_SALDO)) {
							existe=true;
							cobrarsaldosvencidosAux.setsaldo(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarSaldosVencidosConstantesFunciones.LABEL_TELEFONOTELEFONO)) {
							existe=true;
							cobrarsaldosvencidosAux.settelefono_telefono(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarSaldosVencidosConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							cobrarsaldosvencidosAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CobrarSaldosVencidos cobrarsaldosvencidosAux:cobrarsaldosvencidoss) {
					
						if(sTipoSeleccionar.equals(CobrarSaldosVencidosConstantesFunciones.LABEL_NUMEROFACTURA)) {
							existe=true;
							cobrarsaldosvencidosAux.setnumero_factura(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarSaldosVencidosConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE)) {
							existe=true;
							cobrarsaldosvencidosAux.setnombre_grupo_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarSaldosVencidosConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							cobrarsaldosvencidosAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarSaldosVencidosConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							cobrarsaldosvencidosAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarSaldosVencidosConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							cobrarsaldosvencidosAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarSaldosVencidosConstantesFunciones.LABEL_FECHAVENCE)) {
							existe=true;
							cobrarsaldosvencidosAux.setfecha_vence(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarSaldosVencidosConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							cobrarsaldosvencidosAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarSaldosVencidosConstantesFunciones.LABEL_SALDO)) {
							existe=true;
							cobrarsaldosvencidosAux.setsaldo(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarSaldosVencidosConstantesFunciones.LABEL_TELEFONOTELEFONO)) {
							existe=true;
							cobrarsaldosvencidosAux.settelefono_telefono(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarSaldosVencidosConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							cobrarsaldosvencidosAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaCobrarSaldosVencidos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesCobrarSaldosVencidosActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingCobrarSaldosVencidos(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioCobrarSaldosVencidos=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesCobrarSaldosVencidos.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormCobrarSaldosVencidos.jComboBoxTiposAccionesFormularioCobrarSaldosVencidos.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteCobrarSaldosVencidos) {				
					conSplash=true;//false;										
					
					//this.startProcessCobrarSaldosVencidos(conSplash);
				
					this.generarReporteCobrarSaldosVencidossSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCobrarSaldosVencidos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCobrarSaldosVencidos.jComboBoxTiposAccionesFormularioCobrarSaldosVencidos.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoCobrarSaldosVencidossSeleccionados();
				//this.jComboBoxTiposAccionesCobrarSaldosVencidos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCobrarSaldosVencidossSeleccionados(false);
				//this.jComboBoxTiposAccionesCobrarSaldosVencidos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCobrarSaldosVencidossSeleccionados(true);
				//this.jComboBoxTiposAccionesCobrarSaldosVencidos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCobrarSaldosVencidos();
				
				this.exportarCobrarSaldosVencidossSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCobrarSaldosVencidos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCobrarSaldosVencidos.jComboBoxTiposAccionesFormularioCobrarSaldosVencidos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionCobrarSaldosVencidoss();
				//this.importarCobrarSaldosVencidoss();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCobrarSaldosVencidos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCobrarSaldosVencidos.jComboBoxTiposAccionesFormularioCobrarSaldosVencidos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCobrarSaldosVencidos();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelCobrarSaldosVencidossSeleccionados();
				//this.jComboBoxTiposAccionesCobrarSaldosVencidos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Cobrar Saldos Vencidos", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessCobrarSaldosVencidos();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoCobrarSaldosVencidos)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyCobrarSaldosVencidos(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Cobrar Saldos Vencidos",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCobrarSaldosVencidos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCobrarSaldosVencidos.jComboBoxTiposAccionesFormularioCobrarSaldosVencidos.setSelectedIndex(0);					
				}	
			} 			
			else if(CobrarSaldosVencidosBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteCobrarSaldosVencidos) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessCobrarSaldosVencidos(conSplash);
					
						//this.actualizarParametrosGeneralCobrarSaldosVencidos();
						
						this.generarReporteProcesoAccionCobrarSaldosVencidossSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesCobrarSaldosVencidos.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormCobrarSaldosVencidos.jComboBoxTiposAccionesFormularioCobrarSaldosVencidos.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(CobrarSaldosVencidosBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Cobrar Saldos VencidosES SELECCIONADOS?", "MANTENIMIENTO DE Cobrar Saldos Vencidos", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessCobrarSaldosVencidos();
				
						this.actualizarParametrosGeneralCobrarSaldosVencidos();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.cobrarsaldosvencidosReturnGeneral=cobrarsaldosvencidosLogic.procesarAccionCobrarSaldosVencidossWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.cobrarsaldosvencidosLogic.getCobrarSaldosVencidoss(),this.cobrarsaldosvencidosParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarCobrarSaldosVencidosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCobrarSaldosVencidos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCobrarSaldosVencidos.jComboBoxTiposAccionesFormularioCobrarSaldosVencidos.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralCobrarSaldosVencidos();
					
					CobrarSaldosVencidosBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarCobrarSaldosVencidosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCobrarSaldosVencidos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCobrarSaldosVencidos.jComboBoxTiposAccionesFormularioCobrarSaldosVencidos.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessCobrarSaldosVencidos(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesCobrarSaldosVencidosActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessCobrarSaldosVencidos();
			
			if(this.jInternalFrameDetalleFormCobrarSaldosVencidos==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<CobrarSaldosVencidos> cobrarsaldosvencidossSeleccionados=new ArrayList<CobrarSaldosVencidos>();		
			CobrarSaldosVencidos cobrarsaldosvencidos=new CobrarSaldosVencidos();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingCobrarSaldosVencidos(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesCobrarSaldosVencidos.getSelectedItem();
			
			
			
			
			cobrarsaldosvencidossSeleccionados=this.getCobrarSaldosVencidossSeleccionados(true);
			//this.sTipoAccion;
			
			if(cobrarsaldosvencidossSeleccionados.size()==1) {
				for(CobrarSaldosVencidos cobrarsaldosvencidosAux:cobrarsaldosvencidossSeleccionados) {
					cobrarsaldosvencidos=cobrarsaldosvencidosAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessCobrarSaldosVencidos();
			
      		//this.finishProcessCobrarSaldosVencidos(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarCobrarSaldosVencidosReturnGeneral() throws Exception {
		if(this.cobrarsaldosvencidosReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.cobrarsaldosvencidosReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.cobrarsaldosvencidosReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.cobrarsaldosvencidosReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.cobrarsaldosvencidosReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.cobrarsaldosvencidosReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingCobrarSaldosVencidos(false);
		}
		
		if(this.cobrarsaldosvencidosReturnGeneral.getConRetornoLista() || this.cobrarsaldosvencidosReturnGeneral.getConRetornoObjeto()) {
			if(this.cobrarsaldosvencidosReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.cobrarsaldosvencidosLogic.setCobrarSaldosVencidoss(this.cobrarsaldosvencidosReturnGeneral.getCobrarSaldosVencidoss());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingCobrarSaldosVencidos(false);
		}
	}
	
	public void actualizarParametrosGeneralCobrarSaldosVencidos() throws Exception {
		
		
	}
	
	public ArrayList<CobrarSaldosVencidos> getCobrarSaldosVencidossSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<CobrarSaldosVencidos> cobrarsaldosvencidossSeleccionados=new ArrayList<CobrarSaldosVencidos>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioCobrarSaldosVencidos) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(CobrarSaldosVencidos cobrarsaldosvencidosAux:cobrarsaldosvencidosLogic.getCobrarSaldosVencidoss()) {
					if(cobrarsaldosvencidosAux.getIsSelected()) {
						cobrarsaldosvencidossSeleccionados.add(cobrarsaldosvencidosAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CobrarSaldosVencidos cobrarsaldosvencidosAux:this.cobrarsaldosvencidoss) {
					if(cobrarsaldosvencidosAux.getIsSelected()) {
						cobrarsaldosvencidossSeleccionados.add(cobrarsaldosvencidosAux);				
					}
				}
			}
			
			if(cobrarsaldosvencidossSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						cobrarsaldosvencidossSeleccionados.addAll(this.cobrarsaldosvencidosLogic.getCobrarSaldosVencidoss());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						cobrarsaldosvencidossSeleccionados.addAll(this.cobrarsaldosvencidoss);				
					}
				}
			}
		} else {
			cobrarsaldosvencidossSeleccionados.add(this.cobrarsaldosvencidos);
		}
		
		return cobrarsaldosvencidossSeleccionados;
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
	
	public void generarReporteCobrarSaldosVencidossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalCobrarSaldosVencidossSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoCobrarSaldosVencidossSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCobrarSaldosVencidossSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCobrarSaldosVencidossSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Cobrar Saldos Vencidos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesCobrarSaldosVencidossSeleccionados() throws Exception {
		ArrayList<CobrarSaldosVencidos> cobrarsaldosvencidossSeleccionados=new ArrayList<CobrarSaldosVencidos>();		
		
		cobrarsaldosvencidossSeleccionados=this.getCobrarSaldosVencidossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteCobrarSaldosVencidoss("Todos",cobrarsaldosvencidossSeleccionados);
		
	}	
	
	public void generarReporteNormalCobrarSaldosVencidossSeleccionados() throws Exception {
		ArrayList<CobrarSaldosVencidos> cobrarsaldosvencidossSeleccionados=new ArrayList<CobrarSaldosVencidos>();		
		
		cobrarsaldosvencidossSeleccionados=this.getCobrarSaldosVencidossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteCobrarSaldosVencidoss("Todos",cobrarsaldosvencidossSeleccionados);
	}		
	
	public void generarReporteProcesoAccionCobrarSaldosVencidossSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<CobrarSaldosVencidos> cobrarsaldosvencidossSeleccionados=new ArrayList<CobrarSaldosVencidos>();
		
		cobrarsaldosvencidossSeleccionados=this.getCobrarSaldosVencidossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteCobrarSaldosVencidoss("Todos",cobrarsaldosvencidossSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoCobrarSaldosVencidossSeleccionados() throws Exception {
		ArrayList<CobrarSaldosVencidos> cobrarsaldosvencidossSeleccionados=new ArrayList<CobrarSaldosVencidos>();		
		
		
		this.abrirInicializarFrameReporteDinamicoCobrarSaldosVencidos();
		
		
		cobrarsaldosvencidossSeleccionados=this.getCobrarSaldosVencidossSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoCobrarSaldosVencidos();
		
		
		//this.generarReporteCobrarSaldosVencidoss("Todos",cobrarsaldosvencidossSeleccionados ,cobrarsaldosvencidosImplementable,cobrarsaldosvencidosImplementableHome);
	}
	
	public void mostrarImportacionCobrarSaldosVencidoss() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionCobrarSaldosVencidos();
		
		this.abrirFrameImportacionCobrarSaldosVencidos();		
		
			
		//this.generarReporteCobrarSaldosVencidoss("Todos",cobrarsaldosvencidossSeleccionados ,cobrarsaldosvencidosImplementable,cobrarsaldosvencidosImplementableHome);
	}
	
	public void importarCobrarSaldosVencidoss() throws Exception {		
	
	}
	
	public void exportarCobrarSaldosVencidossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelCobrarSaldosVencidossSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoCobrarSaldosVencidossSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlCobrarSaldosVencidossSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Cobrar Saldos Vencidos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoCobrarSaldosVencidossSeleccionados() throws Exception {
		ArrayList<CobrarSaldosVencidos> cobrarsaldosvencidossSeleccionados=new ArrayList<CobrarSaldosVencidos>();		
		
		cobrarsaldosvencidossSeleccionados=this.getCobrarSaldosVencidossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrarsaldosvencidos."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarCobrarSaldosVencidos(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(CobrarSaldosVencidos cobrarsaldosvencidosAux:cobrarsaldosvencidossSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarCobrarSaldosVencidos(cobrarsaldosvencidosAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//cobrarsaldosvencidosAux.setsDetalleGeneralEntityReporte(cobrarsaldosvencidosAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarsaldosvencidosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Saldos Vencidos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarCobrarSaldosVencidos(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=CobrarSaldosVencidosConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarSaldosVencidosConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarSaldosVencidosConstantesFunciones.LABEL_IDGRUPOCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarSaldosVencidosConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarSaldosVencidosConstantesFunciones.LABEL_NUMEROFACTURA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarSaldosVencidosConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarSaldosVencidosConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarSaldosVencidosConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarSaldosVencidosConstantesFunciones.LABEL_FECHA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarSaldosVencidosConstantesFunciones.LABEL_FECHAVENCE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarSaldosVencidosConstantesFunciones.LABEL_FECHAEMISION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarSaldosVencidosConstantesFunciones.LABEL_SALDO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarSaldosVencidosConstantesFunciones.LABEL_TELEFONOTELEFONO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarSaldosVencidosConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarCobrarSaldosVencidos(CobrarSaldosVencidos cobrarsaldosvencidos,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=cobrarsaldosvencidos.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarsaldosvencidos.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarsaldosvencidos.getgrupocliente_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarsaldosvencidos.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarsaldosvencidos.getnumero_factura();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarsaldosvencidos.getnombre_grupo_cliente();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarsaldosvencidos.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarsaldosvencidos.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarsaldosvencidos.getfecha().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarsaldosvencidos.getfecha_vence().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarsaldosvencidos.getfecha_emision().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarsaldosvencidos.getsaldo().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarsaldosvencidos.gettelefono_telefono();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarsaldosvencidos.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelCobrarSaldosVencidossSeleccionados() throws Exception {
		ArrayList<CobrarSaldosVencidos> cobrarsaldosvencidossSeleccionados=new ArrayList<CobrarSaldosVencidos>();		
		
		cobrarsaldosvencidossSeleccionados=this.getCobrarSaldosVencidossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrarsaldosvencidos.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("CobrarSaldosVencidoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelCobrarSaldosVencidos(row);				
				iRow++;
			}				
			
			for(CobrarSaldosVencidos cobrarsaldosvencidosAux:cobrarsaldosvencidossSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelCobrarSaldosVencidos(cobrarsaldosvencidosAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarsaldosvencidosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Saldos Vencidos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlCobrarSaldosVencidossSeleccionados() throws Exception {
		ArrayList<CobrarSaldosVencidos> cobrarsaldosvencidossSeleccionados=new ArrayList<CobrarSaldosVencidos>();		
		
		cobrarsaldosvencidossSeleccionados=this.getCobrarSaldosVencidossSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrarsaldosvencidos.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("cobrarsaldosvencidoss");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("cobrarsaldosvencidos");
			//elementRoot.appendChild(element);
		
			for(CobrarSaldosVencidos cobrarsaldosvencidosAux:cobrarsaldosvencidossSeleccionados) {
				element = document.createElement("cobrarsaldosvencidos");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlCobrarSaldosVencidos(cobrarsaldosvencidosAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarsaldosvencidosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Saldos Vencidos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelCobrarSaldosVencidos(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarSaldosVencidosConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarSaldosVencidosConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(CobrarSaldosVencidosConstantesFunciones.LABEL_IDGRUPOCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarSaldosVencidosConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarSaldosVencidosConstantesFunciones.LABEL_NUMEROFACTURA);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarSaldosVencidosConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarSaldosVencidosConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarSaldosVencidosConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarSaldosVencidosConstantesFunciones.LABEL_FECHA);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarSaldosVencidosConstantesFunciones.LABEL_FECHAVENCE);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarSaldosVencidosConstantesFunciones.LABEL_FECHAEMISION);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarSaldosVencidosConstantesFunciones.LABEL_SALDO);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarSaldosVencidosConstantesFunciones.LABEL_TELEFONOTELEFONO);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarSaldosVencidosConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelCobrarSaldosVencidos(CobrarSaldosVencidos cobrarsaldosvencidos,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarsaldosvencidos.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarsaldosvencidos.getgrupocliente_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarsaldosvencidos.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarsaldosvencidos.getnumero_factura());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarsaldosvencidos.getnombre_grupo_cliente());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarsaldosvencidos.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarsaldosvencidos.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarsaldosvencidos.getfecha());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarsaldosvencidos.getfecha_vence());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarsaldosvencidos.getfecha_emision());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarsaldosvencidos.getsaldo());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarsaldosvencidos.gettelefono_telefono());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarsaldosvencidos.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlCobrarSaldosVencidos(CobrarSaldosVencidos cobrarsaldosvencidos,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(CobrarSaldosVencidosConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(cobrarsaldosvencidos.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(CobrarSaldosVencidosConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(cobrarsaldosvencidos.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementgrupocliente_descripcion = document.createElement(CobrarSaldosVencidosConstantesFunciones.IDGRUPOCLIENTE);
		elementgrupocliente_descripcion.appendChild(document.createTextNode(cobrarsaldosvencidos.getgrupocliente_descripcion()));
		element.appendChild(elementgrupocliente_descripcion);

		Element elementempresa_descripcion = document.createElement(CobrarSaldosVencidosConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(cobrarsaldosvencidos.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementnumero_factura = document.createElement(CobrarSaldosVencidosConstantesFunciones.NUMEROFACTURA);
		elementnumero_factura.appendChild(document.createTextNode(cobrarsaldosvencidos.getnumero_factura().trim()));
		element.appendChild(elementnumero_factura);

		Element elementnombre_grupo_cliente = document.createElement(CobrarSaldosVencidosConstantesFunciones.NOMBREGRUPOCLIENTE);
		elementnombre_grupo_cliente.appendChild(document.createTextNode(cobrarsaldosvencidos.getnombre_grupo_cliente().trim()));
		element.appendChild(elementnombre_grupo_cliente);

		Element elementcodigo = document.createElement(CobrarSaldosVencidosConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(cobrarsaldosvencidos.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(CobrarSaldosVencidosConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(cobrarsaldosvencidos.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementfecha = document.createElement(CobrarSaldosVencidosConstantesFunciones.FECHA);
		elementfecha.appendChild(document.createTextNode(cobrarsaldosvencidos.getfecha().toString().trim()));
		element.appendChild(elementfecha);

		Element elementfecha_vence = document.createElement(CobrarSaldosVencidosConstantesFunciones.FECHAVENCE);
		elementfecha_vence.appendChild(document.createTextNode(cobrarsaldosvencidos.getfecha_vence().toString().trim()));
		element.appendChild(elementfecha_vence);

		Element elementfecha_emision = document.createElement(CobrarSaldosVencidosConstantesFunciones.FECHAEMISION);
		elementfecha_emision.appendChild(document.createTextNode(cobrarsaldosvencidos.getfecha_emision().toString().trim()));
		element.appendChild(elementfecha_emision);

		Element elementsaldo = document.createElement(CobrarSaldosVencidosConstantesFunciones.SALDO);
		elementsaldo.appendChild(document.createTextNode(cobrarsaldosvencidos.getsaldo().toString().trim()));
		element.appendChild(elementsaldo);

		Element elementtelefono_telefono = document.createElement(CobrarSaldosVencidosConstantesFunciones.TELEFONOTELEFONO);
		elementtelefono_telefono.appendChild(document.createTextNode(cobrarsaldosvencidos.gettelefono_telefono().trim()));
		element.appendChild(elementtelefono_telefono);

		Element elementdescripcion = document.createElement(CobrarSaldosVencidosConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(cobrarsaldosvencidos.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoCobrarSaldosVencidossSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<CobrarSaldosVencidos> cobrarsaldosvencidossSeleccionados=new ArrayList<CobrarSaldosVencidos>();
		
		cobrarsaldosvencidossSeleccionados=this.getCobrarSaldosVencidossSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoCobrarSaldosVencidos(cobrarsaldosvencidossSeleccionados);
		
		this.generarReporteCobrarSaldosVencidoss("Todos",cobrarsaldosvencidossSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoCobrarSaldosVencidos(ArrayList<CobrarSaldosVencidos> cobrarsaldosvencidossSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(CobrarSaldosVencidos cobrarsaldosvencidosAux:cobrarsaldosvencidossSeleccionados) {
				cobrarsaldosvencidosAux.setsDetalleGeneralEntityReporte(cobrarsaldosvencidosAux.toString());
			
				if(sTipoSeleccionar.equals(CobrarSaldosVencidosConstantesFunciones.LABEL_IDGRUPOCLIENTE)) {
					existe=true;
					cobrarsaldosvencidosAux.setsDescripcionGeneralEntityReporte1(cobrarsaldosvencidosAux.getgrupocliente_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CobrarSaldosVencidosConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					cobrarsaldosvencidosAux.setsDescripcionGeneralEntityReporte1(cobrarsaldosvencidosAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CobrarSaldosVencidosConstantesFunciones.LABEL_NUMEROFACTURA)) {
					existe=true;
					cobrarsaldosvencidosAux.setsDescripcionGeneralEntityReporte1(cobrarsaldosvencidosAux.getnumero_factura());
				}
				 else if(sTipoSeleccionar.equals(CobrarSaldosVencidosConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE)) {
					existe=true;
					cobrarsaldosvencidosAux.setsDescripcionGeneralEntityReporte1(cobrarsaldosvencidosAux.getnombre_grupo_cliente());
				}
				 else if(sTipoSeleccionar.equals(CobrarSaldosVencidosConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					cobrarsaldosvencidosAux.setsDescripcionGeneralEntityReporte1(cobrarsaldosvencidosAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(CobrarSaldosVencidosConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					cobrarsaldosvencidosAux.setsDescripcionGeneralEntityReporte1(cobrarsaldosvencidosAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(CobrarSaldosVencidosConstantesFunciones.LABEL_FECHA)) {
					existe=true;
					cobrarsaldosvencidosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(cobrarsaldosvencidosAux.getfecha()));
				}
				 else if(sTipoSeleccionar.equals(CobrarSaldosVencidosConstantesFunciones.LABEL_FECHAVENCE)) {
					existe=true;
					cobrarsaldosvencidosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(cobrarsaldosvencidosAux.getfecha_vence()));
				}
				 else if(sTipoSeleccionar.equals(CobrarSaldosVencidosConstantesFunciones.LABEL_FECHAEMISION)) {
					existe=true;
					cobrarsaldosvencidosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(cobrarsaldosvencidosAux.getfecha_emision()));
				}
				 else if(sTipoSeleccionar.equals(CobrarSaldosVencidosConstantesFunciones.LABEL_TELEFONOTELEFONO)) {
					existe=true;
					cobrarsaldosvencidosAux.setsDescripcionGeneralEntityReporte1(cobrarsaldosvencidosAux.gettelefono_telefono());
				}
				 else if(sTipoSeleccionar.equals(CobrarSaldosVencidosConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					cobrarsaldosvencidosAux.setsDescripcionGeneralEntityReporte1(cobrarsaldosvencidosAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarSaldosVencidosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesCobrarSaldosVencidos(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoCobrarSaldosVencidos=true;
				this.isVisibilidadCeldaNuevoRelacionesCobrarSaldosVencidos=true;
				this.isVisibilidadCeldaGuardarCambiosCobrarSaldosVencidos=true;
			}
			
			this.isVisibilidadCeldaModificarCobrarSaldosVencidos=false;
			this.isVisibilidadCeldaActualizarCobrarSaldosVencidos=false;
			this.isVisibilidadCeldaEliminarCobrarSaldosVencidos=false;
			this.isVisibilidadCeldaCancelarCobrarSaldosVencidos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarSaldosVencidos=true;
				} else {
					this.isVisibilidadCeldaGuardarCobrarSaldosVencidos=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoCobrarSaldosVencidos=false;
			this.isVisibilidadCeldaNuevoRelacionesCobrarSaldosVencidos=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarSaldosVencidos=false;
			this.isVisibilidadCeldaModificarCobrarSaldosVencidos=false;
			this.isVisibilidadCeldaActualizarCobrarSaldosVencidos=true;
			this.isVisibilidadCeldaEliminarCobrarSaldosVencidos=false;
			this.isVisibilidadCeldaCancelarCobrarSaldosVencidos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarSaldosVencidos=true;
				} else {
					this.isVisibilidadCeldaGuardarCobrarSaldosVencidos=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoCobrarSaldosVencidos=false;
			this.isVisibilidadCeldaNuevoRelacionesCobrarSaldosVencidos=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarSaldosVencidos=false;
			this.isVisibilidadCeldaModificarCobrarSaldosVencidos=false;
			this.isVisibilidadCeldaActualizarCobrarSaldosVencidos=true;
			this.isVisibilidadCeldaEliminarCobrarSaldosVencidos=true;
			this.isVisibilidadCeldaCancelarCobrarSaldosVencidos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarSaldosVencidos=true;
				} else {
					this.isVisibilidadCeldaGuardarCobrarSaldosVencidos=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoCobrarSaldosVencidos=false;
			this.isVisibilidadCeldaNuevoRelacionesCobrarSaldosVencidos=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarSaldosVencidos=false;
			this.isVisibilidadCeldaModificarCobrarSaldosVencidos=false;
			this.isVisibilidadCeldaActualizarCobrarSaldosVencidos=true;
			this.isVisibilidadCeldaEliminarCobrarSaldosVencidos=false;
			this.isVisibilidadCeldaCancelarCobrarSaldosVencidos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarSaldosVencidos=false;
				} else {
					this.isVisibilidadCeldaGuardarCobrarSaldosVencidos=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoCobrarSaldosVencidos=true;
			this.isVisibilidadCeldaNuevoRelacionesCobrarSaldosVencidos=true;
			this.isVisibilidadCeldaGuardarCambiosCobrarSaldosVencidos=true;
			this.isVisibilidadCeldaModificarCobrarSaldosVencidos=false;
			this.isVisibilidadCeldaActualizarCobrarSaldosVencidos=false;
			this.isVisibilidadCeldaEliminarCobrarSaldosVencidos=false;
			this.isVisibilidadCeldaCancelarCobrarSaldosVencidos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarSaldosVencidos=true;
				} else {
					this.isVisibilidadCeldaGuardarCobrarSaldosVencidos=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoCobrarSaldosVencidos=false;
			this.isVisibilidadCeldaNuevoRelacionesCobrarSaldosVencidos=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarSaldosVencidos=false;
			this.isVisibilidadCeldaActualizarCobrarSaldosVencidos=false;
			this.isVisibilidadCeldaEliminarCobrarSaldosVencidos=false;
			this.isVisibilidadCeldaCancelarCobrarSaldosVencidos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarSaldosVencidos=false;
				} else {
					this.isVisibilidadCeldaGuardarCobrarSaldosVencidos=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoCobrarSaldosVencidos=false;
			this.isVisibilidadCeldaNuevoRelacionesCobrarSaldosVencidos=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarSaldosVencidos=false;
			this.isVisibilidadCeldaModificarCobrarSaldosVencidos=true;
			this.isVisibilidadCeldaActualizarCobrarSaldosVencidos=false;
			this.isVisibilidadCeldaEliminarCobrarSaldosVencidos=false;
			this.isVisibilidadCeldaCancelarCobrarSaldosVencidos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarSaldosVencidos=false;
				} else {
					this.isVisibilidadCeldaGuardarCobrarSaldosVencidos=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(CobrarSaldosVencidosJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoCobrarSaldosVencidos=true;
			this.isVisibilidadCeldaNuevoRelacionesCobrarSaldosVencidos=true;
			this.isVisibilidadCeldaGuardarCambiosCobrarSaldosVencidos=true;
		} else {
			this.actualizarEstadoPanelsCobrarSaldosVencidos(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarCobrarSaldosVencidos=false;
			//this.isVisibilidadCeldaVerFormCobrarSaldosVencidos=false;
			this.isVisibilidadCeldaDuplicarCobrarSaldosVencidos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!cobrarsaldosvencidosSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesCobrarSaldosVencidos=false;
		} else {
			this.isVisibilidadCeldaNuevoCobrarSaldosVencidos=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarSaldosVencidos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(cobrarsaldosvencidosSessionBean.getEsGuardarRelacionado()) {
			if(!cobrarsaldosvencidosSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesCobrarSaldosVencidos=false;												
			}
			
			this.jButtonCerrarCobrarSaldosVencidos.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesCobrarSaldosVencidos=false;
		}
		
		if(!this.permiteMantenimiento(this.cobrarsaldosvencidos)) {
			this.isVisibilidadCeldaActualizarCobrarSaldosVencidos=false;
			this.isVisibilidadCeldaEliminarCobrarSaldosVencidos=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoCobrarSaldosVencidos=false;
		this.isVisibilidadCeldaNuevoRelacionesCobrarSaldosVencidos=false;
		this.isVisibilidadCeldaGuardarCambiosCobrarSaldosVencidos=false;
		//this.isVisibilidadCeldaModificarCobrarSaldosVencidos=true;
		this.isVisibilidadCeldaActualizarCobrarSaldosVencidos=false;
		this.isVisibilidadCeldaEliminarCobrarSaldosVencidos=false;
		//this.isVisibilidadCeldaCancelarCobrarSaldosVencidos=true;			
		this.isVisibilidadCeldaGuardarCobrarSaldosVencidos=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesCobrarSaldosVencidos() {
	}
	
	public void actualizarEstadoPanelsCobrarSaldosVencidos(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionCobrarSaldosVencidos!=null) {
				this.jScrollPanelDatosEdicionCobrarSaldosVencidos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarSaldosVencidos!=null) {
				this.jTabbedPaneBusquedasCobrarSaldosVencidos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCobrarSaldosVencidos!=null) {
				this.jScrollPanelDatosCobrarSaldosVencidos.setVisible(true);
			}
			
			if(this.jPanelPaginacionCobrarSaldosVencidos!=null) {
				this.jPanelPaginacionCobrarSaldosVencidos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCobrarSaldosVencidos!=null) {
				this.jPanelParametrosReportesCobrarSaldosVencidos.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionCobrarSaldosVencidos!=null) {
				this.jScrollPanelDatosEdicionCobrarSaldosVencidos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarSaldosVencidos!=null) {
				this.jTabbedPaneBusquedasCobrarSaldosVencidos.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosCobrarSaldosVencidos!=null) {
				this.jScrollPanelDatosCobrarSaldosVencidos.setVisible(false);
			}
			
			if(this.jPanelPaginacionCobrarSaldosVencidos!=null) {
				this.jPanelPaginacionCobrarSaldosVencidos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCobrarSaldosVencidos!=null) {
				this.jPanelParametrosReportesCobrarSaldosVencidos.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionCobrarSaldosVencidos!=null) {
				this.jScrollPanelDatosEdicionCobrarSaldosVencidos.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarSaldosVencidos!=null) {
				this.jTabbedPaneBusquedasCobrarSaldosVencidos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCobrarSaldosVencidos!=null) {
				this.jScrollPanelDatosCobrarSaldosVencidos.setVisible(false);
			}
			
			if(this.jPanelPaginacionCobrarSaldosVencidos!=null) {
				this.jPanelPaginacionCobrarSaldosVencidos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCobrarSaldosVencidos!=null) {
				this.jPanelParametrosReportesCobrarSaldosVencidos.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionCobrarSaldosVencidos!=null) {
				this.jScrollPanelDatosEdicionCobrarSaldosVencidos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarSaldosVencidos!=null) {
				this.jTabbedPaneBusquedasCobrarSaldosVencidos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCobrarSaldosVencidos!=null) {
				this.jScrollPanelDatosCobrarSaldosVencidos.setVisible(false);
			}
			
			if(this.jPanelPaginacionCobrarSaldosVencidos!=null) {
				this.jPanelPaginacionCobrarSaldosVencidos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCobrarSaldosVencidos!=null) {
				this.jPanelParametrosReportesCobrarSaldosVencidos.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionCobrarSaldosVencidos!=null) {
				this.jScrollPanelDatosEdicionCobrarSaldosVencidos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarSaldosVencidos!=null) {
				this.jTabbedPaneBusquedasCobrarSaldosVencidos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCobrarSaldosVencidos!=null) {
				this.jScrollPanelDatosCobrarSaldosVencidos.setVisible(true);
			}
			
			if(this.jPanelPaginacionCobrarSaldosVencidos!=null) {
				this.jPanelPaginacionCobrarSaldosVencidos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCobrarSaldosVencidos!=null) {
				this.jPanelParametrosReportesCobrarSaldosVencidos.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionCobrarSaldosVencidos!=null) {
				this.jScrollPanelDatosEdicionCobrarSaldosVencidos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarSaldosVencidos!=null) {
				this.jTabbedPaneBusquedasCobrarSaldosVencidos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCobrarSaldosVencidos!=null) {
				this.jScrollPanelDatosCobrarSaldosVencidos.setVisible(true);
			}
			
			if(this.jPanelPaginacionCobrarSaldosVencidos!=null) {
				this.jPanelPaginacionCobrarSaldosVencidos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCobrarSaldosVencidos!=null) {
				this.jPanelParametrosReportesCobrarSaldosVencidos.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionCobrarSaldosVencidos!=null) {
				this.jScrollPanelDatosEdicionCobrarSaldosVencidos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarSaldosVencidos!=null) {
				this.jTabbedPaneBusquedasCobrarSaldosVencidos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCobrarSaldosVencidos!=null) {
				this.jScrollPanelDatosCobrarSaldosVencidos.setVisible(true);
			}
			
			if(this.jPanelPaginacionCobrarSaldosVencidos!=null) {
				this.jPanelPaginacionCobrarSaldosVencidos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCobrarSaldosVencidos!=null) {
				this.jPanelParametrosReportesCobrarSaldosVencidos.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.cobrarsaldosvencidosSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasCobrarSaldosVencidos!=null) {
					this.jTabbedPaneBusquedasCobrarSaldosVencidos.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesCobrarSaldosVencidos!=null) {
				this.jPanelParametrosReportesCobrarSaldosVencidos.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.cobrarsaldosvencidosSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarSaldosVencidos!=null) {
				this.jTabbedPaneBusquedasCobrarSaldosVencidos.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesCobrarSaldosVencidos!=null) {
				this.jPanelParametrosReportesCobrarSaldosVencidos.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaGrupoCliente(Boolean isParaGrupoCliente){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaGrupoClienteNegation=!isParaGrupoCliente;

			this.isVisibilidadBusquedaCobrarSaldosVencidos=isParaGrupoCliente;
			if(!this.isVisibilidadBusquedaCobrarSaldosVencidos) {this.jTabbedPaneBusquedasCobrarSaldosVencidos.remove(jPanelBusquedaCobrarSaldosVencidosCobrarSaldosVencidos);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaCobrarSaldosVencidos=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaCobrarSaldosVencidos) {this.jTabbedPaneBusquedasCobrarSaldosVencidos.remove(jPanelBusquedaCobrarSaldosVencidosCobrarSaldosVencidos);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaCobrarSaldosVencidos(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioCobrarSaldosVencidos() {
		this.updateBorderResaltarBusquedasFormularioCobrarSaldosVencidos();
		this.updateVisibilidadBusquedasFormularioCobrarSaldosVencidos();
		this.updateHabilitarBusquedasFormularioCobrarSaldosVencidos();
	}
	
	public void updateBorderResaltarBusquedasFormularioCobrarSaldosVencidos() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasCobrarSaldosVencidos.getComponents().length>0) {
	

		if(this.cobrarsaldosvencidosConstantesFunciones.resaltarBusquedaCobrarSaldosVencidosCobrarSaldosVencidos!=null) {
			index= this.jTabbedPaneBusquedasCobrarSaldosVencidos.indexOfComponent(this.jPanelBusquedaCobrarSaldosVencidosCobrarSaldosVencidos);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCobrarSaldosVencidos.getComponent(index);
				jPanel.setBorder(this.cobrarsaldosvencidosConstantesFunciones.resaltarBusquedaCobrarSaldosVencidosCobrarSaldosVencidos);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioCobrarSaldosVencidos() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasCobrarSaldosVencidos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCobrarSaldosVencidos.indexOfComponent(this.jPanelBusquedaCobrarSaldosVencidosCobrarSaldosVencidos);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCobrarSaldosVencidos.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.cobrarsaldosvencidosConstantesFunciones.mostrarBusquedaCobrarSaldosVencidosCobrarSaldosVencidos);
			if(!this.cobrarsaldosvencidosConstantesFunciones.mostrarBusquedaCobrarSaldosVencidosCobrarSaldosVencidos && index>-1) {
				this.jTabbedPaneBusquedasCobrarSaldosVencidos.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioCobrarSaldosVencidos() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasCobrarSaldosVencidos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCobrarSaldosVencidos.indexOfComponent(this.jPanelBusquedaCobrarSaldosVencidosCobrarSaldosVencidos);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCobrarSaldosVencidos.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.cobrarsaldosvencidosConstantesFunciones.activarBusquedaCobrarSaldosVencidosCobrarSaldosVencidos);
				this.jTabbedPaneBusquedasCobrarSaldosVencidos.setEnabledAt(index,this.cobrarsaldosvencidosConstantesFunciones.activarBusquedaCobrarSaldosVencidosCobrarSaldosVencidos);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaCobrarSaldosVencidos(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaCobrarSaldosVencidos")) {
			index= this.jTabbedPaneBusquedasCobrarSaldosVencidos.indexOfComponent(this.jPanelBusquedaCobrarSaldosVencidosCobrarSaldosVencidos);

			this.jTabbedPaneBusquedasCobrarSaldosVencidos.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCobrarSaldosVencidos.getComponent(index);

			this.cobrarsaldosvencidosConstantesFunciones.setResaltarBusquedaCobrarSaldosVencidosCobrarSaldosVencidos(resaltar);

			jPanel.setBorder(this.cobrarsaldosvencidosConstantesFunciones.resaltarBusquedaCobrarSaldosVencidosCobrarSaldosVencidos);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarCobrarSaldosVencidos.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioCobrarSaldosVencidos() throws Exception {

		if(this.jInternalFrameDetalleFormCobrarSaldosVencidos==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioCobrarSaldosVencidos();
		this.updateVisibilidadResaltarControlesFormularioCobrarSaldosVencidos();
		this.updateHabilitarResaltarControlesFormularioCobrarSaldosVencidos();
		
	}
	
	public void updateBorderResaltarControlesFormularioCobrarSaldosVencidos() throws Exception {
		if(this.jInternalFrameDetalleFormCobrarSaldosVencidos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.cobrarsaldosvencidosConstantesFunciones.resaltaridCobrarSaldosVencidos!=null && this.jInternalFrameDetalleFormCobrarSaldosVencidos!=null) {this.jInternalFrameDetalleFormCobrarSaldosVencidos.jLabelidCobrarSaldosVencidos.setBorder(this.cobrarsaldosvencidosConstantesFunciones.resaltaridCobrarSaldosVencidos);}
		if(this.cobrarsaldosvencidosConstantesFunciones.resaltarid_grupo_clienteCobrarSaldosVencidos!=null && this.jInternalFrameDetalleFormCobrarSaldosVencidos!=null) {this.jInternalFrameDetalleFormCobrarSaldosVencidos.jComboBoxid_grupo_clienteCobrarSaldosVencidos.setBorder(this.cobrarsaldosvencidosConstantesFunciones.resaltarid_grupo_clienteCobrarSaldosVencidos);}
		if(this.cobrarsaldosvencidosConstantesFunciones.resaltarid_empresaCobrarSaldosVencidos!=null && this.jInternalFrameDetalleFormCobrarSaldosVencidos!=null) {this.jInternalFrameDetalleFormCobrarSaldosVencidos.jComboBoxid_empresaCobrarSaldosVencidos.setBorder(this.cobrarsaldosvencidosConstantesFunciones.resaltarid_empresaCobrarSaldosVencidos);}
		if(this.cobrarsaldosvencidosConstantesFunciones.resaltarnumero_facturaCobrarSaldosVencidos!=null && this.jInternalFrameDetalleFormCobrarSaldosVencidos!=null) {this.jInternalFrameDetalleFormCobrarSaldosVencidos.jTextFieldnumero_facturaCobrarSaldosVencidos.setBorder(this.cobrarsaldosvencidosConstantesFunciones.resaltarnumero_facturaCobrarSaldosVencidos);}
		if(this.cobrarsaldosvencidosConstantesFunciones.resaltarnombre_grupo_clienteCobrarSaldosVencidos!=null && this.jInternalFrameDetalleFormCobrarSaldosVencidos!=null) {this.jInternalFrameDetalleFormCobrarSaldosVencidos.jTextAreanombre_grupo_clienteCobrarSaldosVencidos.setBorder(this.cobrarsaldosvencidosConstantesFunciones.resaltarnombre_grupo_clienteCobrarSaldosVencidos);}
		if(this.cobrarsaldosvencidosConstantesFunciones.resaltarcodigoCobrarSaldosVencidos!=null && this.jInternalFrameDetalleFormCobrarSaldosVencidos!=null) {this.jInternalFrameDetalleFormCobrarSaldosVencidos.jTextFieldcodigoCobrarSaldosVencidos.setBorder(this.cobrarsaldosvencidosConstantesFunciones.resaltarcodigoCobrarSaldosVencidos);}
		if(this.cobrarsaldosvencidosConstantesFunciones.resaltarnombreCobrarSaldosVencidos!=null && this.jInternalFrameDetalleFormCobrarSaldosVencidos!=null) {this.jInternalFrameDetalleFormCobrarSaldosVencidos.jTextAreanombreCobrarSaldosVencidos.setBorder(this.cobrarsaldosvencidosConstantesFunciones.resaltarnombreCobrarSaldosVencidos);}
		if(this.cobrarsaldosvencidosConstantesFunciones.resaltarfechaCobrarSaldosVencidos!=null && this.jInternalFrameDetalleFormCobrarSaldosVencidos!=null) {this.jInternalFrameDetalleFormCobrarSaldosVencidos.jDateChooserfechaCobrarSaldosVencidos.setBorder(this.cobrarsaldosvencidosConstantesFunciones.resaltarfechaCobrarSaldosVencidos);}
		if(this.cobrarsaldosvencidosConstantesFunciones.resaltarfecha_venceCobrarSaldosVencidos!=null && this.jInternalFrameDetalleFormCobrarSaldosVencidos!=null) {this.jInternalFrameDetalleFormCobrarSaldosVencidos.jDateChooserfecha_venceCobrarSaldosVencidos.setBorder(this.cobrarsaldosvencidosConstantesFunciones.resaltarfecha_venceCobrarSaldosVencidos);}
		if(this.cobrarsaldosvencidosConstantesFunciones.resaltarfecha_emisionCobrarSaldosVencidos!=null && this.jInternalFrameDetalleFormCobrarSaldosVencidos!=null) {this.jInternalFrameDetalleFormCobrarSaldosVencidos.jDateChooserfecha_emisionCobrarSaldosVencidos.setBorder(this.cobrarsaldosvencidosConstantesFunciones.resaltarfecha_emisionCobrarSaldosVencidos);}
		if(this.cobrarsaldosvencidosConstantesFunciones.resaltarsaldoCobrarSaldosVencidos!=null && this.jInternalFrameDetalleFormCobrarSaldosVencidos!=null) {this.jInternalFrameDetalleFormCobrarSaldosVencidos.jTextFieldsaldoCobrarSaldosVencidos.setBorder(this.cobrarsaldosvencidosConstantesFunciones.resaltarsaldoCobrarSaldosVencidos);}
		if(this.cobrarsaldosvencidosConstantesFunciones.resaltartelefono_telefonoCobrarSaldosVencidos!=null && this.jInternalFrameDetalleFormCobrarSaldosVencidos!=null) {this.jInternalFrameDetalleFormCobrarSaldosVencidos.jTextAreatelefono_telefonoCobrarSaldosVencidos.setBorder(this.cobrarsaldosvencidosConstantesFunciones.resaltartelefono_telefonoCobrarSaldosVencidos);}
		if(this.cobrarsaldosvencidosConstantesFunciones.resaltardescripcionCobrarSaldosVencidos!=null && this.jInternalFrameDetalleFormCobrarSaldosVencidos!=null) {this.jInternalFrameDetalleFormCobrarSaldosVencidos.jTextAreadescripcionCobrarSaldosVencidos.setBorder(this.cobrarsaldosvencidosConstantesFunciones.resaltardescripcionCobrarSaldosVencidos);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioCobrarSaldosVencidos() throws Exception {		
		if(this.jInternalFrameDetalleFormCobrarSaldosVencidos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCobrarSaldosVencidos!=null) {
	
		//this.jInternalFrameDetalleFormCobrarSaldosVencidos.jLabelidCobrarSaldosVencidos.setVisible(this.cobrarsaldosvencidosConstantesFunciones.mostraridCobrarSaldosVencidos);
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jPanelidCobrarSaldosVencidos.setVisible(this.cobrarsaldosvencidosConstantesFunciones.mostraridCobrarSaldosVencidos);
		//this.jInternalFrameDetalleFormCobrarSaldosVencidos.jComboBoxid_grupo_clienteCobrarSaldosVencidos.setVisible(this.cobrarsaldosvencidosConstantesFunciones.mostrarid_grupo_clienteCobrarSaldosVencidos);
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jPanelid_grupo_clienteCobrarSaldosVencidos.setVisible(this.cobrarsaldosvencidosConstantesFunciones.mostrarid_grupo_clienteCobrarSaldosVencidos);
		//this.jInternalFrameDetalleFormCobrarSaldosVencidos.jComboBoxid_empresaCobrarSaldosVencidos.setVisible(this.cobrarsaldosvencidosConstantesFunciones.mostrarid_empresaCobrarSaldosVencidos);
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jPanelid_empresaCobrarSaldosVencidos.setVisible(this.cobrarsaldosvencidosConstantesFunciones.mostrarid_empresaCobrarSaldosVencidos);
		//this.jInternalFrameDetalleFormCobrarSaldosVencidos.jTextFieldnumero_facturaCobrarSaldosVencidos.setVisible(this.cobrarsaldosvencidosConstantesFunciones.mostrarnumero_facturaCobrarSaldosVencidos);
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jPanelnumero_facturaCobrarSaldosVencidos.setVisible(this.cobrarsaldosvencidosConstantesFunciones.mostrarnumero_facturaCobrarSaldosVencidos);
		//this.jInternalFrameDetalleFormCobrarSaldosVencidos.jTextAreanombre_grupo_clienteCobrarSaldosVencidos.setVisible(this.cobrarsaldosvencidosConstantesFunciones.mostrarnombre_grupo_clienteCobrarSaldosVencidos);
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jPanelnombre_grupo_clienteCobrarSaldosVencidos.setVisible(this.cobrarsaldosvencidosConstantesFunciones.mostrarnombre_grupo_clienteCobrarSaldosVencidos);
		//this.jInternalFrameDetalleFormCobrarSaldosVencidos.jTextFieldcodigoCobrarSaldosVencidos.setVisible(this.cobrarsaldosvencidosConstantesFunciones.mostrarcodigoCobrarSaldosVencidos);
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jPanelcodigoCobrarSaldosVencidos.setVisible(this.cobrarsaldosvencidosConstantesFunciones.mostrarcodigoCobrarSaldosVencidos);
		//this.jInternalFrameDetalleFormCobrarSaldosVencidos.jTextAreanombreCobrarSaldosVencidos.setVisible(this.cobrarsaldosvencidosConstantesFunciones.mostrarnombreCobrarSaldosVencidos);
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jPanelnombreCobrarSaldosVencidos.setVisible(this.cobrarsaldosvencidosConstantesFunciones.mostrarnombreCobrarSaldosVencidos);
		//this.jInternalFrameDetalleFormCobrarSaldosVencidos.jDateChooserfechaCobrarSaldosVencidos.setVisible(this.cobrarsaldosvencidosConstantesFunciones.mostrarfechaCobrarSaldosVencidos);
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jPanelfechaCobrarSaldosVencidos.setVisible(this.cobrarsaldosvencidosConstantesFunciones.mostrarfechaCobrarSaldosVencidos);
		//this.jInternalFrameDetalleFormCobrarSaldosVencidos.jDateChooserfecha_venceCobrarSaldosVencidos.setVisible(this.cobrarsaldosvencidosConstantesFunciones.mostrarfecha_venceCobrarSaldosVencidos);
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jPanelfecha_venceCobrarSaldosVencidos.setVisible(this.cobrarsaldosvencidosConstantesFunciones.mostrarfecha_venceCobrarSaldosVencidos);
		//this.jInternalFrameDetalleFormCobrarSaldosVencidos.jDateChooserfecha_emisionCobrarSaldosVencidos.setVisible(this.cobrarsaldosvencidosConstantesFunciones.mostrarfecha_emisionCobrarSaldosVencidos);
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jPanelfecha_emisionCobrarSaldosVencidos.setVisible(this.cobrarsaldosvencidosConstantesFunciones.mostrarfecha_emisionCobrarSaldosVencidos);
		//this.jInternalFrameDetalleFormCobrarSaldosVencidos.jTextFieldsaldoCobrarSaldosVencidos.setVisible(this.cobrarsaldosvencidosConstantesFunciones.mostrarsaldoCobrarSaldosVencidos);
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jPanelsaldoCobrarSaldosVencidos.setVisible(this.cobrarsaldosvencidosConstantesFunciones.mostrarsaldoCobrarSaldosVencidos);
		//this.jInternalFrameDetalleFormCobrarSaldosVencidos.jTextAreatelefono_telefonoCobrarSaldosVencidos.setVisible(this.cobrarsaldosvencidosConstantesFunciones.mostrartelefono_telefonoCobrarSaldosVencidos);
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jPaneltelefono_telefonoCobrarSaldosVencidos.setVisible(this.cobrarsaldosvencidosConstantesFunciones.mostrartelefono_telefonoCobrarSaldosVencidos);
		//this.jInternalFrameDetalleFormCobrarSaldosVencidos.jTextAreadescripcionCobrarSaldosVencidos.setVisible(this.cobrarsaldosvencidosConstantesFunciones.mostrardescripcionCobrarSaldosVencidos);
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jPaneldescripcionCobrarSaldosVencidos.setVisible(this.cobrarsaldosvencidosConstantesFunciones.mostrardescripcionCobrarSaldosVencidos);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioCobrarSaldosVencidos() throws Exception {
		if(this.jInternalFrameDetalleFormCobrarSaldosVencidos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCobrarSaldosVencidos!=null) {
	
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jLabelidCobrarSaldosVencidos.setEnabled(this.cobrarsaldosvencidosConstantesFunciones.activaridCobrarSaldosVencidos);
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jComboBoxid_grupo_clienteCobrarSaldosVencidos.setEnabled(this.cobrarsaldosvencidosConstantesFunciones.activarid_grupo_clienteCobrarSaldosVencidos);
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jComboBoxid_empresaCobrarSaldosVencidos.setEnabled(this.cobrarsaldosvencidosConstantesFunciones.activarid_empresaCobrarSaldosVencidos);
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jTextFieldnumero_facturaCobrarSaldosVencidos.setEnabled(this.cobrarsaldosvencidosConstantesFunciones.activarnumero_facturaCobrarSaldosVencidos);
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jTextAreanombre_grupo_clienteCobrarSaldosVencidos.setEnabled(this.cobrarsaldosvencidosConstantesFunciones.activarnombre_grupo_clienteCobrarSaldosVencidos);
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jTextFieldcodigoCobrarSaldosVencidos.setEnabled(this.cobrarsaldosvencidosConstantesFunciones.activarcodigoCobrarSaldosVencidos);
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jTextAreanombreCobrarSaldosVencidos.setEnabled(this.cobrarsaldosvencidosConstantesFunciones.activarnombreCobrarSaldosVencidos);
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jDateChooserfechaCobrarSaldosVencidos.setEnabled(this.cobrarsaldosvencidosConstantesFunciones.activarfechaCobrarSaldosVencidos);
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jDateChooserfecha_venceCobrarSaldosVencidos.setEnabled(this.cobrarsaldosvencidosConstantesFunciones.activarfecha_venceCobrarSaldosVencidos);
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jDateChooserfecha_emisionCobrarSaldosVencidos.setEnabled(this.cobrarsaldosvencidosConstantesFunciones.activarfecha_emisionCobrarSaldosVencidos);
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jTextFieldsaldoCobrarSaldosVencidos.setEnabled(this.cobrarsaldosvencidosConstantesFunciones.activarsaldoCobrarSaldosVencidos);
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jTextAreatelefono_telefonoCobrarSaldosVencidos.setEnabled(this.cobrarsaldosvencidosConstantesFunciones.activartelefono_telefonoCobrarSaldosVencidos);
		this.jInternalFrameDetalleFormCobrarSaldosVencidos.jTextAreadescripcionCobrarSaldosVencidos.setEnabled(this.cobrarsaldosvencidosConstantesFunciones.activardescripcionCobrarSaldosVencidos);
		}
	}
	
		
}